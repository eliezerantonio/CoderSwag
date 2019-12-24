package astros.eliezer.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import astros.eliezer.coderswag.Modelo.Produto
import astros.eliezer.coderswag.R

class  ProductsAdapter(val context: Context, val products: List<Produto>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.products_item_list, parent, false)
        return ProductHolder(view)
    }


    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Produto, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
        }

    }
}