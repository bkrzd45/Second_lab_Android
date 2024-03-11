package ru.stankin.labs.bekmurzaev2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
/**
 * Адаптер для RecyclerView.
 * Конструктор принимает список контактов.
 * Наследуемся от RecyclerView.Adapter и переопределяем
 * необходимые методы.
 */
class productsAdapter(
    private val contracts: List<productItem>,
    private val context: Context,
    private val onItemClicked: (item: productItem) -> Unit,
): RecyclerView.Adapter<productViewHolder>() {
    private fun onViewHolderClicked(position: Int) {
        onItemClicked(contracts[position])
    }
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): productViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return productViewHolder(view, this::onViewHolderClicked)
    }
    override fun getItemCount(): Int {
        return contracts.size
    }
    override fun onBindViewHolder(
        holder: productViewHolder, position: Int
    ) {
        holder.bind(contracts[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, ProductDetailActivity::class.java).apply {
                putExtra("productName", contracts[position].name)
                putExtra("productPrice", contracts[position].price.toString())
                putExtra("productRating", contracts[position].rating.toString())
                putExtra("productDescription", contracts[position].description)
            }
            context.startActivity(intent)
        }
    }
}

/**
 * ViewHolder элемента списка.
 * Наследуемся от RecyclerView.ViewHolder
 */
class productViewHolder(
    itemView: View,
    private val onItemClicked: (position: Int) -> Unit
): RecyclerView.ViewHolder(itemView) {
    private val nameView: TextView = itemView.findViewById(R.id.product_name)
    private val priceView: TextView = itemView.findViewById(R.id.product_price)
    //private val descriptionView: TextView = itemView.findViewById(R.id.product_description)
    private val ratingView: TextView = itemView.findViewById(R.id.product_rating)


    init {
        itemView.setOnClickListener { onItemClicked(adapterPosition) }
    }

    /**
     * Метод для связывания данных с ViewHolder
     */
    fun bind(item: productItem) {
        // Bind data to views
        nameView.text = item.name
        priceView.text = "$${item.price}"
        //descriptionView.text = item.description
        ratingView.text = "Rating: ${item.rating}"

        itemView.setOnClickListener {
            onItemClicked(adapterPosition)
        }
    }
}