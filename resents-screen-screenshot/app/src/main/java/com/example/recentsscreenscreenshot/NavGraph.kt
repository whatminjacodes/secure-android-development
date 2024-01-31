package com.example.recentsscreenscreenshot

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recentsscreenscreenshot.Destinations.MAIN_SCREEN_ROUTE
import com.example.recentsscreenscreenshot.Destinations.START_SCREEN_ROUTE
import com.example.recentsscreenscreenshot.main.MainScreenRoute
import com.example.recentsscreenscreenshot.insecure.StartScreenRoute

object Destinations {
    const val MAIN_SCREEN_ROUTE = "main"
    const val START_SCREEN_ROUTE = "start"
}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = MAIN_SCREEN_ROUTE) {
        composable(MAIN_SCREEN_ROUTE) {
            MainScreenRoute(OnOpenInsecureActivityClicked = {
                navController.navigate(START_SCREEN_ROUTE)
            })
        }

        composable(START_SCREEN_ROUTE){
            val message  = "message from start screen"
            StartScreenRoute(messageFromStart = message!!)
        }
    }
}