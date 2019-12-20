package pkm.andro.pkmapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.check

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        check.setOnClickListener {
            val intent = Intent(applicationContext, MyProfile::class.java)
            startActivity(intent)
        }

        checkData.setOnClickListener {
            val intent = Intent(applicationContext, RiwayatPesanan::class.java)
            startActivity(intent)
        }

        check2.setOnClickListener {
            val intent = Intent(applicationContext, MapsActivity::class.java)
            startActivity(intent)
        }

        checkData2.setOnClickListener {
            val intent = Intent(applicationContext, FaqActivity::class.java)
            startActivity(intent)
        }

        relative.setOnClickListener {
            val intent = Intent(applicationContext, PesanActivity::class.java)
            startActivity(intent)
        }
    }
}
