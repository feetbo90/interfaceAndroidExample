package pkm.andro.pkmapplication.network

import pkm.andro.pkmapplication.model.Login
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiClient {

    @GET("/columbia_asia/login.php")
    fun checkLogin(@Query("username") usename:String, @Query("password") password: String): Call<Login>

}