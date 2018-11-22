package kr.co.cools.today.ui.main

import android.content.Context
import io.reactivex.disposables.CompositeDisposable
import kr.co.cools.today.repo.TodayRepository
import kr.co.cools.today.rx.asDriver
import kr.co.cools.today.rx.disposableBag
import timber.log.Timber
import javax.inject.Inject

class MainInteractor @Inject constructor(val context: Context, var repo: TodayRepository) {

    private val compositeDisposable = CompositeDisposable()

    fun update() {
        repo.getAll()
            .asDriver()
            .subscribe(
                {
                    Timber.v("scribe")
                },
                {
                    Timber.v("error")
                }
            ).disposableBag(compositeDisposable)
    }

    fun release() {
        compositeDisposable.clear()
    }
}

