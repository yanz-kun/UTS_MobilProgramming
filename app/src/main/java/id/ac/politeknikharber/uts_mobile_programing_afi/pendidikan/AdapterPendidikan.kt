package id.ac.politeknikharber.uts_mobile_programing_afi.pendidikan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.politeknikharber.uts_mobile_programing_afi.R
import id.ac.politeknikharber.uts_mobile_programing_afi.menu.AdapterMenuApp

class AdapterPendidikan(private val data:ArrayList<DataPendidikan>) :RecyclerView.Adapter<AdapterPendidikan.PendidikanHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClick(data:DataPendidikan)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    class PendidikanHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        val judul = itemview.findViewById<TextView>(R.id.tv_judul_list_pendidikan)
        val des = itemview.findViewById<TextView>(R.id.tv_des_list_pendidikan)
        val foto = itemview.findViewById<ImageView>(R.id.iv_gambar_list_pendidikan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPendidikan.PendidikanHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_pendidikan, parent, false)
        return PendidikanHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterPendidikan.PendidikanHolder, position: Int) {
        val isi = data[position]
        holder.judul.text = isi.judul
        holder.des.text = isi.des
        Glide.with(holder.itemView.context)
            .load(isi.foto)
            .apply(RequestOptions.overrideOf(100,100))
            .into(holder.foto)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClick(data[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
