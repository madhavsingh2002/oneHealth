package com.example.onehemlk

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.onehemlk.Pages.MyApp
import com.example.onehemlk.Pages.RegisterPage
import com.example.onehemlk.ui.theme.OneHeMLKTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OneHeMLKTheme {
                Scaffold(modifier = Modifier.fillMaxSize().statusBarsPadding()) {
                    MyApp()
                //GetStartedPage()
                    //LoginPage()
//                    RegisterPage()
                }
            }
        }
    }
}
