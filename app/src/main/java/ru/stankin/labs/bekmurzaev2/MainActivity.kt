package ru.stankin.labs.bekmurzaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list: RecyclerView = findViewById(R.id.list)
        val adapter = productsAdapter(products(), this, this::onproductItemClicked)
        list.adapter = adapter
    }

    private fun onproductItemClicked(item: productItem) {
        val intent = Intent(this, ProductDetailActivity::class.java).apply {
            putExtra("productName", item.name)
            //putExtra("productStatus", if (item.isOnline) "Online" else "Offline")
        }
        startActivity(intent)
    }
}
