package com.dicoding.project.Activities.data.retrofit
import com.dicoding.project.Activities.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("search/users")
    fun searchUser(
        @Query("q") login: String
    ): Call<UserResponse>
}