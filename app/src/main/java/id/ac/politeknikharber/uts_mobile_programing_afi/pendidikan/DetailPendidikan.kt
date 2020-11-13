package id.ac.politeknikharber.uts_mobile_programing_afi.pendidikan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import id.ac.politeknikharber.uts_mobile_programing_afi.R
import kotlinx.android.synthetic.main.activity_detail_pendidikan.*

class DetailPendidikan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pendidikan)

        supportActionBar?.title = "Detail pendidikan"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tv_detail_judul_pendidikan.setText(intent.getStringExtra("judul"))
        tv_des_detail_pendidikan.setText(intent.getStringExtra("deskripsi"))
        Glide.with(this)
            .load(intent.getIntExtra("foto", 0))
            .into(iv_detail_pendidikan)
    }
}