package com.example.myapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun GuessScreen(navController: NavHostController){
    var kalanhak by rememberSaveable { mutableIntStateOf(5) }
    var tahmin by rememberSaveable { mutableStateOf("") }

    val i : Int = (1..10).random()


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(50.dp , alignment = Alignment.CenterVertically)
    ) {
        Text(
            text="Kalan Hak : $kalanhak",
            color = Color.Red,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = tahmin,
            onValueChange = {
                tahmin = it
            },
            label = { Text(text = "Tahmin") },
            placeholder = { Text(text = "Tahmini Giriniz") }
        )

        Button(
            onClick = {
                if (tahmin == i.toString()){
                    navController.navigate("WinScreen")
                }
                else{
                    kalanhak--
                    if (kalanhak == 0){
                        navController.navigate("LoseScreen")
                    }
                }
            }
        ) {
            Text(text = "Tahmin Et")
        }
    }
}