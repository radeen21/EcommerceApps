package com.example.ecommerceapp

import android.app.Application
import com.example.ecommerceapp.module.apiModule
import com.example.ecommerceapp.module.dataModule
import com.example.ecommerceapp.module.useCaseModule
import com.example.ecommerceapp.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AndroidApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AndroidApp)
            modules(
                listOf(
                    dataModule,
                    apiModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}