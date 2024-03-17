package com.example.roomdatabase.Navigation


sealed class Screen(val route:String){
    object List: Screen(route = "List _Screen")

    object Add: Screen(route = "Add_Screen")
}