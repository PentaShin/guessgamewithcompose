package com.example.myapplication.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationComponent(navcontroller: NavHostController){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = "mainpage"){
        composable("Mainpage"){
            Mainpage(navController)
        }
        composable("GuessScreen"){
            GuessScreen(navController)
        }
        composable("WinScreen") {
            WinScreen(navController)
        }
        composable("LoseScreen") {
            LoseScreen(navController)
        }
    }
}



