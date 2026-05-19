package com.example.greetingcard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Dummy data structure
data class Artwork(val title: String, val artist: String)

@Composable
fun ArtSpaceScreen() {
    // State to hold the current artwork index
    var currentIndex by remember { mutableIntStateOf(0) }

    // Mock list of artworks
    val artworks = listOf(
        Artwork("Starry Night", "Vincent van Gogh"),
        Artwork("Mona Lisa", "Leonardo da Vinci")
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // UI Element 1: Image (Using an icon or placeholder for testing)
            Box(
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Image Placeholder for: ${artworks[currentIndex].title}")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // UI Element 2: Text (Title)
            Text(
                text = artworks[currentIndex].title,
                style = MaterialTheme.typography.headlineMedium
            )

            // UI Element 3: Text (Artist)
            Text(
                text = artworks[currentIndex].artist,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(32.dp))

            // UI Element 4: Button
            Button(onClick = {
                // Logic: Loop back to 0 if at the end of the list
                currentIndex = (currentIndex + 1) % artworks.size
            }) {
                Text("Next Artwork")
            }
        }
    }
}

@Preview(showBackground = true, name = "Art Space Preview")
@Composable
fun ArtSpaceScreenPreview() {
    RaktaVahiniTheme(darkTheme = false) {
        ArtSpaceScreen()
    }
}