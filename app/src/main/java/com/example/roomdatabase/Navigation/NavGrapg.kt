package com.example.roomdatabase.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.roomdatabase.AddUser
import com.example.roomdatabase.ListUser

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.List.route
    ){
        composable(route=Screen.List.route){
           ListUser(navController=navController)
        }
        composable(route=Screen.Add.route){
           AddUser(navController=navController)
        }
    }

}

