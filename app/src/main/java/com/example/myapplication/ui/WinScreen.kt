package com.example.myapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun WinScreen(navHostController: NavHostController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(50.dp , alignment = Alignment.CenterVertically)
    ) {
        Text(text = "Kazandınız")
        Icon(imageVector = Icons.Default.Face, contentDescription = "Kazandınız")

        Button(
            onClick = {
                navHostController.navigate("GuessScreen")
            }
        ) {
            Text(text = "Tekrar Dene")
        }
    }
}


