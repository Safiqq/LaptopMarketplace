package com.example.laptopmarketplace

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListLaptopAdapter (private val listLaptop: ArrayList<Laptop>) : RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>() {
	inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
		var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
		var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
		val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_laptop, parent, false)
		return ListViewHolder(view)
	}

	override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
		val laptop = listLaptop[position]
		Glide.with(holder.itemView.context)
			.load(laptop.photo)
			.apply(RequestOptions().override(55, 55))
			.into(holder.imgPhoto)
		holder.tvName.text = laptop.name
		holder.tvDetail.text = laptop.detail

		holder.itemView.setOnClickListener { onItemClicked(holder, position) }
	}

	override fun getItemCount(): Int {
		return listLaptop.size
	}

	fun onItemClicked(holder: ListViewHolder, position: Int) {
		val intentLaptop = Intent(holder.itemView.context, LaptopActivity::class.java)
		intentLaptop.putExtra("position", position)
		holder.itemView.context.startActivity(intentLaptop)
	}
}