package com.example.roomdatabase.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data  class Note (

    val title:String,
    val description:String,
    val dateAdded:Long,

    @PrimaryKey(autoGenerate = true)
    val id:Int=0
)