package com.example.notemakingapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notemakingapp.Screens.InsertNotesScreen
import com.example.notemakingapp.Screens.NotesScreen
import com.example.notemakingapp.Screens.SplashScreen

@Composable
fun NotesNavigation(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = "splash")
    {
        composable(NotesNavigationItem.SplashScreen.route)
        {
            SplashScreen(navHostController)
        }
        composable(NotesNavigationItem.HomeScreen.route){
            NotesScreen(navHostController)
        }
        composable(NotesNavigationItem.InsertNotesScreen.route+"/{id}"){
            val id=it.arguments?.getString("id")
            InsertNotesScreen(navHostController,id)
        }
    }
}