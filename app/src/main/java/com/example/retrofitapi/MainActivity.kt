package com.example.retrofitapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.retrofitapi.navigation.NavManager
import com.example.retrofitapi.ui.theme.RetrofitapiTheme
import com.example.retrofitapi.viewmodel.GamesViewModel
import com.example.retrofitapi.views.HomeView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: GamesViewModel by viewModels()
        setContent {
            RetrofitapiTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavManager(viewModel)
                }
            }
        }
    }
}
