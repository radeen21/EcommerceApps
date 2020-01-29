package com.example.ecommerceapp.module

import com.example.ecommerceapp.feature.EcommerceViewModel
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<EcommerceViewModel>()
//    viewModel<SampleFrViewModel>()
//    viewModel<RepositoryViewModel>()
}