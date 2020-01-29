package com.example.domain.interactor

import com.example.domain.BaseUseCase
import com.example.domain.entity.EcommerceModel
import com.example.domain.repository.EcommerceRepository

class GetEcommerce(private val ecommerceRepository: EcommerceRepository)
    : BaseUseCase<List<EcommerceModel>, Void>() {
    override suspend fun build(params: Void): List<EcommerceModel> = ecommerceRepository.getEcommerce()
}