package id.ac.politeknikharber.uts_mobile_programing_afi.pendidikan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import id.ac.politeknikharber.uts_mobile_programing_afi.R

class Pendidikan : AppCompatActivity() {

    private lateinit var rvPendidikan:RecyclerView
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    val isi:ArrayList<DataPendidikan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendidikan)
        supportActionBar?.title = "Pendidikan"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvPendidikan = findViewById(R.id.rv_pendidikan)
        viewManager = LinearLayoutManager(this)
        isi.addAll(IsiPendidikan.dataPendidikan)
        viewAdapter = AdapterPendidikan(isi)

        rvPendidikan.apply {
            layoutManager = viewManager
            adapter = viewAdapter
            (viewAdapter as AdapterPendidikan).setOnItemClickCallback(object:AdapterPendidikan.OnItemClickCallback{
                override fun onItemClick(data: DataPendidikan) {
                    val intent = Intent(this@Pendidikan, DetailPendidikan::class.java)
                    intent.apply{
                        intent.putExtra("foto", data.foto)
                        intent.putExtra("judul", data.judul)
                        intent.putExtra("deskripsi", data.des)
                    }
                    startActivity(intent)
                }
            })
        }
    }
}