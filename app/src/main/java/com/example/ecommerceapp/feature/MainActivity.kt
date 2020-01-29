package com.example.ecommerceapp.feature

import com.example.ecommerceapp.R
import com.example.ecommerceapp.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.Observer

class MainActivity : BaseActivity<EcommerceViewModel>() {

    override val resourceLayout: Int? = R.layout.activity_main
    override val viewModel by viewModel<EcommerceViewModel>()

    override fun onInitViews() {
        viewModel.getEcommerce()
    }

    override fun onInitObservers() {
       viewModel.getDetailData.observe(this,
           androidx.lifecycle.Observer { print("MainActivitytest ${it[0].data!!.category!![0].id }")})
    }

}
