package com.example.myapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Mainpage(navController: NavHostController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(50.dp , alignment = Alignment.CenterVertically)
    ) {
        Text(
            text = "Tahmin Oyunu",
            fontSize = 36.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center
        )

        Button(onClick = { navController.navigate("GuessScreen") }) {
            Text(text = "OYUNA BAŞLA")
        }
    }
}





