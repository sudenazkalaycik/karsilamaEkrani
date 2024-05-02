package com.example.karsilamaekrani

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.karsilamaekrani.ui.theme.KarsilamaEkraniTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KarsilamaEkraniTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    welcomeScreen()
                }
            }
        }
    }
}

@Composable
fun welcomeScreen(){
    Box {
        Image(
            painter = painterResource(id = R.drawable.sahil),
            modifier = Modifier
                .fillMaxSize(),
            contentDescription ="Açıklama Kısmı",
            contentScale = ContentScale.FillBounds // Resmi ekran boyutuna sığdırmak için ContentScale.FillBounds kullanıyoruuuuzz!!
        )
        Text(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp),
            text = "Travearth",
            style = TextStyle(
                fontSize = 55.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(start = 25.dp, end = 25.dp, bottom = 25.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.50f))
        ) {
            Column (modifier = Modifier.fillMaxWidth(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Spacer(modifier = Modifier)
                Text(
                    text = "Explore the world here",
                    style = TextStyle(
                        fontSize = 25.sp, // yazı büyüklüğü
                        fontWeight = FontWeight.Bold// yazı kalınlığı
                    ),
                    color = Color.White // yazı rengi
                )
                Text(
                    text = "We invite you places you've never \n   been visit, Let's explore with us!",
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    color = Color.White
                )
                Button(
                    modifier = Modifier
                        .size(width = 160.dp, height = 60.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black.copy(alpha = 0.25f), // buton rengi
                        contentColor = Color.White, // buton içi yazı rengi
                    ),

                    )
                {
                    Text(text = "Get Started")
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Already have an account?", color = Color.White)
                }
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KarsilamaEkraniTheme {
        welcomeScreen()
    }
}