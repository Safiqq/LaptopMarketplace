package com.example.laptopmarketplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class LaptopActivity : AppCompatActivity() {
	private var position: Int = 0
	private var listLaptop: ArrayList<Laptop> = arrayListOf()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_laptop)

		listLaptop.addAll(LaptopsData.listData)
		position = this.intent.getIntExtra("position", 0)
		val laptop = listLaptop[position]

		val laptopName: TextView = findViewById(R.id.laptop_name)
		val laptopDetail: TextView = findViewById(R.id.laptop_detail)
		val laptopCpu: TextView = findViewById(R.id.laptop_cpu)
		val laptopGpu: TextView = findViewById(R.id.laptop_gpu)
		val laptopRam: TextView = findViewById(R.id.laptop_ram)
		val laptopScreen = findViewById<TextView>(R.id.laptop_screen)
		val laptopStorage: TextView = findViewById(R.id.laptop_storage)
		val laptopBattery: TextView = findViewById(R.id.laptop_battery)
		val laptopDimensions: TextView = findViewById(R.id.laptop_dimensions)
		val laptopWeight: TextView = findViewById(R.id.laptop_weight)
		val laptopPrice: TextView = findViewById(R.id.laptop_price)
		val laptopPhoto: ImageView = findViewById(R.id.laptop_image)

		laptopName.text = laptop.name
		laptopDetail.text = laptop.detail
		laptopCpu.text = laptop.cpu
		laptopGpu.text = laptop.gpu
		laptopRam.text = laptop.ram
		laptopScreen.text = laptop.screen
		laptopStorage.text = laptop.storage
		laptopBattery.text = laptop.battery
		laptopDimensions.text = laptop.dimensions
		laptopWeight.text = laptop.weight
		laptopPrice.text = laptop.price
		laptopPhoto.setImageResource(laptop.photo)


		val btnBuy: Button = findViewById(R.id.btn_buy)
		btnBuy.setOnClickListener { Toast.makeText(this, "Buy " + listLaptop[position].name, Toast.LENGTH_SHORT).show() }
		val btnWishlist: Button = findViewById(R.id.btn_wishlist)
		btnWishlist.setOnClickListener { Toast.makeText(this, "Add " + listLaptop[position].name + " to wishlist", Toast.LENGTH_SHORT).show() }

		this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			android.R.id.home -> finish()
		}
		return super.onOptionsItemSelected(item)
	}
}