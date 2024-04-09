package com.charity.mvvm.navigation

import AboutScreen
import HomeScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.charity.mvvm.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(modifier : Modifier= Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH){
    NavHost(navController = navController,
        startDestination= startDestination ,
        modifier= modifier){
        composable( ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController )
        }

    }

}