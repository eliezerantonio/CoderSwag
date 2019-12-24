package astros.eliezer.coderswag.Servicos

import astros.eliezer.coderswag.Modelo.Categoria
import astros.eliezer.coderswag.Modelo.Produto

object DataService {
    val categories = listOf(
        Categoria("T-SHIRTS", "shirtimage"),
        Categoria("CASACOS", "hoodieimage"),
        Categoria("CHAPEUS", "hatimage"),
        Categoria("DIGITAL", "digitalgoodsimage") ,
        Categoria("T-SHIRTS", "shirtimage"),
        Categoria("CASACOS", "hoodieimage"),
        Categoria("CHAPEUS", "hatimage"),
        Categoria("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Produto("Devslopes Graphic Beanie", "$18", "hat1"),
        Produto("Devslopes Hat Black", "$20", "hat2"),
        Produto("Devslopes Hat White", "$18", "hat3"),
        Produto("Devslopes Hat Snapback", "$22", "hat4"),
        Produto("Devslopes Graphic Beanie", "$18", "hat1"),
        Produto("Devslopes Graphic Beanie", "$18", "hat1"),
        Produto("Devslopes Hat Black", "$20", "hat2"),
        Produto("Devslopes Hat White", "$18", "hat3"),
        Produto("Devslopes Hat Snapback", "$22", "hat4"),
        Produto("Devslopes Graphic Beanie", "$18", "hat1")

    )

    val hoodies = listOf(
        Produto("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Produto("Devslopes Hoodie Red", "$32", "hoodie2"),
        Produto("Devslopes Gray Hoodie", "$28", "hoodie3"),
        Produto("Devslopes Black Hoodie", "$32", "hoodie4"),
        Produto("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Produto("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Produto("Devslopes Hoodie Red", "$32", "hoodie2"),
        Produto("Devslopes Gray Hoodie", "$28", "hoodie3"),
        Produto("Devslopes Black Hoodie", "$32", "hoodie4"),
        Produto("Devslopes Hoodie Gray", "$28", "hoodie1")

    )

    val shirts = listOf(
        Produto("Devslopes Shirt Black", "$18", "shirt1"),
        Produto("Devslopes Badge Light Gray", "$20", "shirt2"),
        Produto("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Produto("Devslopes Hustle", "$22", "shirt4"),
        Produto("Kickflip Studios", "18", "shirt5"),
        Produto("Devslopes Shirt Black", "$18", "shirt1"),
        Produto("Devslopes Badge Light Gray", "$20", "shirt2"),
        Produto("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Produto("Devslopes Hustle", "$22", "shirt4"),
        Produto("Kickflip Studios", "18", "shirt5")

    )

    val digitalGood = listOf<Produto>()

    fun getProductos(category: String): List<Produto> {
        return when (category) {
            "T-SHIRTS" -> shirts
            "CHAPEUS" -> hats
            "CASACOS" -> hoodies
            else -> digitalGood
        }
    }
}