package com.example.onehemlk.Pages
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onehemlk.components.ButtonComp
import com.example.onehemlk.components.CustomTextField

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RegisterPage(){
    var userInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    Scaffold(
        modifier = Modifier.fillMaxSize(), // Scaffold modifier
        content = {
            LazyColumn(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(16.dp)
                    .imePadding()
            ) {
                item{
                    Text(text = "Create an account", fontWeight = FontWeight.Bold, fontSize = 22.sp, color = MaterialTheme.colorScheme.onPrimary)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Welcome! Please enter your details", fontSize = 16.sp, color = Color(0xFFBEBEBE))
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(text = "Name", fontSize = 14.sp, color = MaterialTheme.colorScheme.onPrimary)
                    Spacer(modifier = Modifier.height(4.dp))
                    CustomTextField(
                        placeholder = "Enter your name",
                        initialText = "",
                        keyboardType = KeyboardType.Email,
                        onValueChange = {
                            userInput = it
                        }
                    )
                    Text(text = "Email", fontSize = 14.sp, color = MaterialTheme.colorScheme.onPrimary)
                    Spacer(modifier = Modifier.height(4.dp))
                    CustomTextField(
                        placeholder = "Enter your email",
                        initialText = "",
                        keyboardType = KeyboardType.Email,
                        onValueChange = {
                            userInput = it
                        }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Password", fontSize = 14.sp, color = MaterialTheme.colorScheme.onPrimary)
                    Spacer(modifier = Modifier.height(4.dp))
                    CustomTextField(
                        placeholder = "Enter your password",
                        initialText = passwordInput,
                        keyboardType = KeyboardType.Password,
                        onValueChange = {
                            passwordInput = it
                        },
                        isPasswordField = true
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    ButtonComp(label = "Sign Up", isborder = false)
                    Spacer(modifier = Modifier.height(16.dp))
                    ButtonComp(label = "Sign up with Google", isborder = true)
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Already have an account?", fontSize = 14.sp, color = Color(0xFFA9A9A9))
                        Text(text = " Log in", fontSize = 14.sp, color = MaterialTheme.colorScheme.secondary)
                    }
                }
            }
        }
    )
}