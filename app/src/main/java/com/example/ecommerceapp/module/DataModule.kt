package com.example.ecommerceapp.module

import com.example.data.EcommerceRepositoryImpl
import com.example.domain.repository.EcommerceRepository
import org.koin.dsl.module

val dataModule = module {
    single<EcommerceRepository> { EcommerceRepositoryImpl(get()) }
}