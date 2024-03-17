package com.example.roomdatabase

import android.annotation.SuppressLint
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.roomdatabase.Navigation.Screen


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AddUser(navController: NavController){
    var firstNameVal=""
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Add User")},
                navigationIcon = ({
                    IconButton(onClick = {
                        navController.navigate(Screen.List.route) {
                            popUpTo(Screen.List.route){
                                inclusive=true
                            }
                        }
                    }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ))
        }
    ) {
        Column(modifier= Modifier

            .fillMaxSize()
            .padding(top = 100.dp)
        ) {
            Column(modifier = Modifier
                .weight(4f)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally){
                TextField(value =firstNameVal ,
                    onValueChange = {firstNameVal=it}
                    , label = {Text(text = "First Name")}
                )
                Spacer(modifier = Modifier.padding(10.dp))
                TextField(value =firstNameVal ,
                    onValueChange = {firstNameVal=it}
                    , label = {Text(text = "Last Name")}
                )
                Spacer(modifier = Modifier.padding(10.dp))
                TextField(value =firstNameVal ,
                    onValueChange = {firstNameVal=it}
                    , label = {Text(text = "Age")}
                )
                Spacer(modifier = Modifier.padding(10.dp))
                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Add")

                }
            }
//            Column(modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth(), horizontalAlignment = Alignment.End) {
//                ElevatedButton(onClick = { /*TODO*/ }) {
//                    Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
//                }
//
//            }
        }

    }


}

@Composable
@Preview(showBackground = true)
fun addUserPreview(){
    AddUser(rememberNavController())
}