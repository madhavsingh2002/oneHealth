package com.example.onehemlk.Pages

import CustomTextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onehemlk.R
import com.example.onehemlk.components.ButtonComp
@Composable
fun LoginPage(){
    var userInput by remember { mutableStateOf("") }
    Scaffold(
        modifier = Modifier.fillMaxSize(), // Scaffold modifier
        content = { paddingValues ->  // Content block of the Scaffold
            Column(
                horizontalAlignment = Alignment.Start,
//                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(paddingValues)
            ) {
                Text(text = "Log in to your account!", fontWeight = FontWeight.Bold, fontSize = 22.sp, color = MaterialTheme.colorScheme.onPrimary)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Welcome back! Please enter your details", fontSize = 16.sp, color = Color(0xFFD3D3D3))
                Text(text = "Email", fontSize = 14.sp, color = MaterialTheme.colorScheme.onPrimary)
                CustomTextField(
                    placeholder = "Enter your email",
                    initialText = "",
                    keyboardType = KeyboardType.Email,
                    onValueChange = {
                        userInput = it  // Store the value of the text field in a state variable
                    }
                )
                Text(text = "Password", fontSize = 14.sp, color = MaterialTheme.colorScheme.onPrimary)
                CustomTextField(
                    placeholder = "Enter your password",
                    initialText = "",
                    keyboardType = KeyboardType.Password,
                    onValueChange = {
                        userInput = it  // Store the value of the text field in a state variable
                    }
                )
                Spacer(modifier = Modifier.height(8.dp))
                ButtonComp(label = "Login", isborder = false)
            }
        }
    )
}