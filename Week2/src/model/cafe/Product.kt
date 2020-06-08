package model.cafe

data class Product(
        val id: Int,
        val price: Double,
        var quantity: Int = 0
){
        val productsList = mutableListOf<Product>()
}