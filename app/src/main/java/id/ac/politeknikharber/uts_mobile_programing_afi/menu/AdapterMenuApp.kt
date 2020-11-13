package id.ac.politeknikharber.uts_mobile_programing_afi.menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.ac.politeknikharber.uts_mobile_programing_afi.R

class AdapterMenuApp(private val data:ArrayList<MenuApp>):RecyclerView.Adapter<AdapterMenuApp.MyMenuHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(menuApp:MenuApp)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    class MyMenuHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
        val gambar = itemview.findViewById<ImageView>(R.id.iv_menu)
        val nama = itemview.findViewById<TextView>(R.id.tv_nama_menu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMenuApp.MyMenuHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_menu, parent, false)
        return MyMenuHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterMenuApp.MyMenuHolder, position: Int) {
        val isiData = data[position]
        Glide.with(holder.itemView.context)
            .load(isiData.foto)
            .into(holder.gambar)
        holder.nama.text = isiData.nama

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(data[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
