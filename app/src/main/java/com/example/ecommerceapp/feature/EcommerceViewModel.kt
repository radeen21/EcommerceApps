package com.example.ecommerceapp.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.EcommerceModel
import com.example.domain.interactor.GetEcommerce

class EcommerceViewModel (private val getEcommerce: GetEcommerce) : ViewModel() {
    private val getDetailMutable = MutableLiveData<List<EcommerceModel>>()
    internal val getDetailData: LiveData<List<EcommerceModel>>
        get() = getDetailMutable

    fun getEcommerce() {
        getEcommerce.addParams(null).onSuccess(getDetailMutable::postValue).execute(viewModelScope)
    }
}