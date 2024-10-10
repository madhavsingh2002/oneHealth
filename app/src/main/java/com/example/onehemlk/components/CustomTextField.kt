import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
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
    keyboardType: KeyboardType = KeyboardType.Text,
) {
    var text by remember { mutableStateOf(initialText) }
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
            .padding(16.dp),  // Add padding to the TextField
        singleLine = singleLine,
        colors = TextFieldDefaults.outlinedTextFieldColors(  // Use default TextField colors
            focusedBorderColor = Color.White,  // Customize specific colors if needed
            focusedLabelColor = Color.White,
            focusedTextColor = Color.White
        ),
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction, keyboardType = keyboardType)  // Add IME action
    )
}
