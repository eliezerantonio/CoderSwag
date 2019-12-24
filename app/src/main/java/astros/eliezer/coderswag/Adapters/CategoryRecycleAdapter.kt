package astros.eliezer.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import astros.eliezer.coderswag.Modelo.Categoria
import astros.eliezer.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Categoria>, val itemClick: (Categoria) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryRecycleAdapter.Holder {

        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)
    }



    override fun getItemCount(): Int {


        return categories.count()
    }


    override fun onBindViewHolder(Holder: CategoryRecycleAdapter.Holder, position: Int) {
        Holder?.bindCategory(categories[position], context)
    }

    inner class Holder(itemView: View, val itemClick: (Categoria) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Categoria, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title

            itemView.setOnClickListener { itemClick(category) }
        }
    }


}