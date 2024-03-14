package com.example.roomdatabase.Data

import androidx.lifecycle.LiveData

class UserRepository(private  val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user:User){
        userDao.addUSer(user)
    }
}