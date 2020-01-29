package com.example.ecommerceapp.module

import com.example.data.ApiProvider
import com.example.data.api.EcommerceApi
import org.koin.dsl.module

val apiModule = module {
    single { ApiProvider() }
    single {
        get<ApiProvider>()
            .getRetrofit()
            .create(EcommerceApi::class.java)
    }
}