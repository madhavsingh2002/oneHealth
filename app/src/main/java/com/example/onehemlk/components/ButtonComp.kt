package com.example.onehemlk.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComp(
    label: String,
    isborder: Boolean
) {
    Button(
        onClick = {
            println("Custom Button clicked!")
        },
        modifier = Modifier
//            .padding(16.dp)
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isborder) Color.Transparent else MaterialTheme.colorScheme.tertiary,
            contentColor =  if (isborder) MaterialTheme.colorScheme.tertiary else MaterialTheme.colorScheme.secondary,
        ),
        shape = RoundedCornerShape(12.dp) ,
        border = if (isborder) BorderStroke(2.dp, MaterialTheme.colorScheme.tertiary) else null
    ) {
        Text(text = label)
    }
}
