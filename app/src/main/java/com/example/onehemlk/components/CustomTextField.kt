package com.example.onehemlk.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    label: String = "Enter text",          // Label for the TextField
    placeholder: String = "",              // Placeholder text
    initialText: String = "",              // Initial text in the TextField
    imeAction: ImeAction = ImeAction.Done,
    singleLine: Boolean = true,            // Single line or multi-line
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType,
    isPasswordField: Boolean = false       // New parameter to determine if it's a password field
) {
    var text by remember { mutableStateOf(initialText) }
    var passwordVisible by remember { mutableStateOf(false) } // State for password visibility
    val focusManager: FocusManager = LocalFocusManager.current
    val focusRequester = remember { FocusRequester() }

    val visualTransformation = when {
        isPasswordField && !passwordVisible -> PasswordVisualTransformation() // Hide password
        else -> VisualTransformation.None  // Show text normally
    }

    OutlinedTextField(
        value = text,  // Text input state
        onValueChange = { newValue ->
            text = newValue  // Update the text state
            onValueChange(newValue)  // Notify the parent composable about the new value
        },
//        label = { Text(text = label) },  // Label for the TextField
        placeholder = { Text(text = placeholder) },  // Placeholder text
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),  // Add padding to the TextField
        singleLine = singleLine,
        colors = TextFieldDefaults.outlinedTextFieldColors(  // Use default TextField colors
            focusedBorderColor = Color.White,  // Customize specific colors if needed
            focusedLabelColor = Color.White,
            unfocusedTextColor = Color.White,
            focusedTextColor = Color.White,
            cursorColor= Color.White
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = imeAction,
            keyboardType = keyboardType
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                focusManager.clearFocus()  // Clear focus when "Done" is pressed
            }
        ),
        visualTransformation = visualTransformation,
        trailingIcon = {
            if (isPasswordField) {
                // Toggle password visibility when the image is clicked
                Image(
                    painter = if (passwordVisible) painterResource( com.example.onehemlk.R.drawable.visibility) else painterResource(com.example.onehemlk.R.drawable.visiblity_off),
                    contentDescription = if (passwordVisible) "Hide password" else "Show password",
                    modifier = Modifier.height(30.dp).clickable { passwordVisible = !passwordVisible },
                    contentScale = ContentScale.Fit
                )
            }
        }
    )
}
