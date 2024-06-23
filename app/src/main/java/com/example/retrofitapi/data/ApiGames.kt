package com.example.retrofitapi.data

import com.example.retrofitapi.model.GamesModel
import com.example.retrofitapi.model.SingleGameModel
import com.example.retrofitapi.util.Constants.Companion.API_KEY
import com.example.retrofitapi.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiGames {
    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>

    @GET("${ENDPOINT}/{id}${API_KEY}")
    suspend fun getGameById(@Path(value = "id")id:Int): Response<SingleGameModel>

}