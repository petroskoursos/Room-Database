package com.example.roomdatabase

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.roomdatabase.Navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListUser(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "List")},
                colors =topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ) )
        },
        floatingActionButton = {
            IconButton(onClick = {
                navController.navigate(route = Screen.Add.route){
                    popUpTo(route = Screen.Add.route){
                        inclusive=true
                    }
                }
            }) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Add")
            }
        }
    ){
        Column(modifier = Modifier.fillMaxSize()){

        }

    }
}






@Composable
@Preview(showBackground = true)
fun ListUSerPreview(){
    ListUser(rememberNavController())
}