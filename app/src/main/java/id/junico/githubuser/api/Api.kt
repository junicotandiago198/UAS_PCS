package id.junico.githubuser.api

import id.junico.githubuser.data.model.DetailUserResponse
import id.junico.githubuser.data.model.User
import id.junico.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 8b249ad8bdf1b92f02cc4aab90e4355e90440d13")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 8b249ad8bdf1b92f02cc4aab90e4355e90440d13")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 8b249ad8bdf1b92f02cc4aab90e4355e90440d13")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 8b249ad8bdf1b92f02cc4aab90e4355e90440d13")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}