package com.example.data.repository

import com.example.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getUsers() =  apiHelper.getUsers()
}