package com.example.domain.entity

class EcommerceModel ( val data: Data? = null
) {
    data class Data(
        val category: MutableList<Category>? = null,
        val productPromo: MutableList<ProductPromo>? = null
    ) {
        data class Category(
            val imageUrl: String? = null,
            val id: Int? = null,
            val name: String? = null
        )

        data class ProductPromo(
            val id: String? = null,
            val imageUrl: String? = null,
            val title: String? = null,
            val description: String? = null,
            val price: String? = null,
            val loved: Int? = null
        )
    }
}