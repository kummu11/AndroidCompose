package com.example.firstcompose

import com.example.firstcompose.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcompose.ui.theme.FirstcomposeTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.ColorFilter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                previewFunction()




        }
    }
}


@Preview(showBackground = true , name = "greeting", showSystemUi = true )
@Composable
 private fun previewFunction() {
    var showDescription by remember { mutableStateOf(false) }
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.KUMMU),
                contentDescription = "kummu",
                colorFilter = ColorFilter.lighting(
                    multiply = Color(1.2f, 1.2f, 1.2f), // Makes the image 20% brighter
                    add = Color.Black
                )
            )
            Button(onClick = { showDescription = true }) {
                Text(text = "press me to know about image")
            }

            if(showDescription){
                Text(text = "kummu is a girl in her 20s and she has a beautiful mom , hardworking father and the best brother . ",
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center,
                     )
            }
        }


    }
}

