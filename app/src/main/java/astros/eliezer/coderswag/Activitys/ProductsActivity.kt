package astros.eliezer.coderswag.Activitys

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import astros.eliezer.coderswag.Adapters.ProductsAdapter
import astros.eliezer.coderswag.Helpers.EXTRA_CATEGORY
import astros.eliezer.coderswag.R
import astros.eliezer.coderswag.Servicos.DataService
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProductos(categoryType))
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }

        val screenSize= resources.configuration.screenWidthDp
        if(screenSize>720){
            spanCount=3
        }
        val layoutManager = GridLayoutManager(this, spanCount)

        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
