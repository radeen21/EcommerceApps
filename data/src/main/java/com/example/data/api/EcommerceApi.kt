package com.example.data.api

import com.example.domain.entity.EcommerceModel
import retrofit2.http.GET

interface EcommerceApi {

    @GET("home")
    suspend fun getEcommerceResponse(): List<EcommerceModel>
}