package com.example.onehemlk.Pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onehemlk.R
import com.example.onehemlk.components.ButtonComp

@Composable
fun GetStartedPage() {
    Scaffold(
        modifier = Modifier.fillMaxSize(), // Scaffold modifier
        content = { paddingValues ->  // Content block of the Scaffold
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(paddingValues)  // Apply scaffold's padding
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mainlogo),
                    contentDescription = "Main Logo",
                    modifier = Modifier
                        .width(170.dp)
                )
                Spacer(modifier = Modifier.height(42.dp))
                Text(text = "Let's get started!", fontWeight = FontWeight.Bold, fontSize = 22.sp, color = MaterialTheme.colorScheme.onPrimary)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Log in to enjoy the features we've \n provided and be well", fontSize = 16.sp, color = Color(0xFFE8E9EB), textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(52.dp))
                ButtonComp(label = "Login", isborder = false)
                ButtonComp(label = "Sign Up", isborder = true)
            }
        }
    )
}
