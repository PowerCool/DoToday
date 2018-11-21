package kr.co.cools.today.ui.main

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context

class MainViewModelFactory(val context: Context, val interactor: MainInteractor): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if( modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(context, interactor) as T
        }
        throw IllegalArgumentException("unknown view model")
    }
}