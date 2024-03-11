package ru.stankin.labs.bekmurzaev2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")
        val productRating = intent.getStringExtra("productRating")
        val productDescription = intent.getStringExtra("productDescription")

        val nameView: TextView = findViewById(R.id.product_detail_name)
        val priceView: TextView = findViewById(R.id.product_detail_price)
        val ratingView: TextView = findViewById(R.id.product_detail_rating)
        val descriptionView: TextView = findViewById(R.id.product_detail_description)

        nameView.text = intent.getStringExtra("productName")
        priceView.text = "Price: "+intent.getStringExtra("productPrice")+"$"
        ratingView.text = "Rating: " + intent.getStringExtra("productRating")
        descriptionView.text = "Short description: " + intent.getStringExtra("productDescription")
    }
}
