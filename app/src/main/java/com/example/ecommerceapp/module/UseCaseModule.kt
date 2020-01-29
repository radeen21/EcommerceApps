package com.example.ecommerceapp.module

import com.example.domain.interactor.GetEcommerce
import org.koin.dsl.module
import org.koin.experimental.builder.factory

val useCaseModule = module {
    factory<GetEcommerce>()
}