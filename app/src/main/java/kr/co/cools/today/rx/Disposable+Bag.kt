package kr.co.cools.today.rx

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

fun Disposable.disposableBag(compositeDisposable: CompositeDisposable) : Disposable {
    compositeDisposable.add(this)
    return this
}