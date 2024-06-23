package com.example.retrofitapi.repository

import com.example.retrofitapi.data.ApiGames
import com.example.retrofitapi.model.GameList
import com.example.retrofitapi.model.SingleGameModel
import javax.inject.Inject

class GamesRepository @Inject constructor(private val apiGames: ApiGames) {
    suspend fun getGames(): List<GameList>? {
        val response = apiGames.getGames()
        if(response.isSuccessful) {
            return response.body()?.results
        }
        return null
    }

    suspend fun getGameById(id: Int): SingleGameModel? {
        val response = apiGames.getGameById(id)
        if(response.isSuccessful) {
            return response.body()
        }
        return null
    }
}