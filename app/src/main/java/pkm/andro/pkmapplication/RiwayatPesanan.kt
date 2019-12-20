package pkm.andro.pkmapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar

class RiwayatPesanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pesanan)
        val toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Riwayat Pesanan"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
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
