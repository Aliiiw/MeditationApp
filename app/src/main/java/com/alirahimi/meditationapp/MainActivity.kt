package com.alirahimi.meditationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.alirahimi.meditationapp.ui.theme.Grey
import com.alirahimi.meditationapp.ui.theme.MeditationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationAppTheme {
                Column(
                    modifier = Modifier
                        .background(Grey)
                        .fillMaxSize()
                ) {

                    HeaderProfile()
                    SearchBar()
                    FilterOptions()

                }
            }
        }
    }
}