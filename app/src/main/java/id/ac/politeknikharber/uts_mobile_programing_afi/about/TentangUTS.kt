package id.ac.politeknikharber.uts_mobile_programing_afi.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.politeknikharber.uts_mobile_programing_afi.R

class TentangUTS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_u_t_s)
        supportActionBar?.title = "About ME"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}