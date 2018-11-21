package kr.co.cools.today.ui.main

import android.arch.lifecycle.ViewModel
import android.content.Context

class MainViewModel(val context: Context, val interactor: MainInteractor): ViewModel() {

    fun updateToday() {
        interactor.update()
    }
}