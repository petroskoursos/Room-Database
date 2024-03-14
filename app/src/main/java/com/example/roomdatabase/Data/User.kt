package com.example.roomdatabase.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val FirstName:String,
    val LastName:String,
    val age:Int
)