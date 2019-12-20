package pkm.andro.pkmapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_pesan.*

class PesanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        val toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Pesan"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        lanjut.setOnClickListener {
            val intent = Intent(applicationContext, LanjutActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {

        // tampilkan notif untuk mencancel booking (navigasi)
        val d = AlertDialog.Builder(this)
        d.setTitle(R.string.confirm)
        d.setMessage(R.string.out)
        d.setPositiveButton("Ya") { _, _ ->
            // clear, kembalikan ke awal

            this.finish()
        }
        d.setNegativeButton(R.string.no, null)
        d.show()


    }
}
