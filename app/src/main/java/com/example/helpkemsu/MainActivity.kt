package com.example.helpkemsu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.helpkemsu.botton_navigation.MainScreen
import com.example.helpkemsu.screens.SocialNetwork
import com.example.helpkemsu.screens.WindowBaseTraining
import com.example.helpkemsu.screens.WindowInfoProgram
import com.example.helpkemsu.ui.theme.HelpKemSUTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            HelpKemSUTheme {
                MainScreen()
            }
        }
    }
}
