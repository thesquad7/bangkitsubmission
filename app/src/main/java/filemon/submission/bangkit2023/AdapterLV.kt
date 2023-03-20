package filemon.submission.bangkit2023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterLV(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<AdapterLV.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_recycler_place)
        val Title: TextView= itemView.findViewById(R.id.item_title)
        val Subtitle: TextView = itemView.findViewById(R.id.item_subtitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_manager,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val(name,description, photo) = listHero[position]
        holder.imgPhoto.setImageResource(photo)
        holder.Title.text = name
        holder.Subtitle.text = description
    }
}