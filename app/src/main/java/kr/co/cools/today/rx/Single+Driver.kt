package kr.co.cools.today.rx

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.NewThreadScheduler

fun <T> Single<T>.asDriver() : Single<T> {
    return subscribeOn(NewThreadScheduler()).observeOn(AndroidSchedulers.mainThread())
}