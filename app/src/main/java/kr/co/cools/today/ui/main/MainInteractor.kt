package kr.co.cools.today.ui.main

import android.content.Context
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kr.co.cools.today.repo.TodayRepository
import kr.co.cools.today.rx.asDriver
import kr.co.cools.today.rx.disposableBag
import timber.log.Timber

class MainInteractor(val context: Context, var repo: TodayRepository) {

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
}

