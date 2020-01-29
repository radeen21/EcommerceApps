package com.example.data

import com.example.data.api.EcommerceApi
import com.example.domain.entity.EcommerceModel
import com.example.domain.repository.EcommerceRepository

class EcommerceRepositoryImpl (val ecommerceApi: EcommerceApi) : EcommerceRepository {
    override suspend fun getEcommerce(): List<EcommerceModel> = ecommerceApi.getEcommerceResponse()
}