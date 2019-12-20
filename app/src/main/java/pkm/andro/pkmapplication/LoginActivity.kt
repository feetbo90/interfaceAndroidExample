package pkm.andro.pkmapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import pkm.andro.pkmapplication.model.Login
import pkm.andro.pkmapplication.network.RestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        daftar.setOnClickListener {
            val intent = Intent(applicationContext, DaftarActivity::class.java)
            startActivity(intent)
        }

        signin1.setOnClickListener {
            val username = editUsername.text.toString()
            val password = editPass.text.toString()

            val postService = RestClient.DataRepository.creating()

            postService.checkLogin(username, password).enqueue(object : Callback<Login> {
                override fun onFailure(call: Call<Login>, t: Throwable) {

                }

                override fun onResponse(call: Call<Login>, response: Response<Login>) {
                    val data = response.body()

                    Toast.makeText(this@LoginActivity, "$data!!.id dan ${data!!.nama}", Toast.LENGTH_LONG).show()
                }

            })

//            val intent = Intent(applicationContext, MainActivity::class.java)
//            startActivity(intent)
        }



    }
}
