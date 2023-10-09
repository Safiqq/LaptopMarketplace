package com.example.laptopmarketplace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
	private lateinit var rvLaptops: RecyclerView
	private var list: ArrayList<Laptop> = arrayListOf()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		rvLaptops = findViewById(R.id.rv_laptops)
		rvLaptops.setHasFixedSize(true)

		list.addAll(LaptopsData.listData)
		showRecyclerListView()
	}

	private fun showRecyclerListView() {
		rvLaptops.layoutManager = LinearLayoutManager(this)
		val listHeroAdapter = ListLaptopAdapter(list)
		rvLaptops.adapter = listHeroAdapter
	}

	override fun onCreateOptionsMenu(menu: Menu): Boolean {
		menuInflater.inflate(R.menu.main_menu, menu)
		return super.onCreateOptionsMenu(menu)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		when(item.itemId) {
			R.id.about -> {
				val intentAbout = Intent(this, AboutMeActivity::class.java)
				startActivity(intentAbout)
			}
		}
		return super.onOptionsItemSelected(item)
	}
}