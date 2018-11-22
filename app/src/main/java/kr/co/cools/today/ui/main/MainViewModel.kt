package kr.co.cools.today.ui.main

import android.arch.lifecycle.ViewModel
import android.content.Context
import timber.log.Timber
import javax.inject.Inject

class MainViewModel @Inject constructor(val context: Context, val interactor: MainInteractor): ViewModel() {

    fun updateToday() {
        interactor.update()
    }

    override fun onCleared() {
        super.onCleared()
        Timber.v("onCleared.")
        interactor.release()
    }
}