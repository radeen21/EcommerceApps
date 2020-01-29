package com.example.domain.repository

import com.example.domain.entity.EcommerceModel

interface EcommerceRepository {
    suspend fun getEcommerce(): List<EcommerceModel>
}