package astros.eliezer.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import astros.eliezer.coderswag.Modelo.Categoria
import astros.eliezer.coderswag.R

class CategoryAdapter(val context: Context, val categories: List<Categoria>) : BaseAdapter() {

    override fun getView(position: Int, converterView: View?, parente: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (converterView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for first time")
            categoryView.tag = holder
        } else {
            holder = converterView.tag as ViewHolder
            categoryView = converterView
            println("Go green, recycle!")
        }



        println("Heavy Computing")
        val category = categories[position]


        val resourceId =
            context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        println(resourceId)

        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {

        return categories[position]
    }


    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }
}