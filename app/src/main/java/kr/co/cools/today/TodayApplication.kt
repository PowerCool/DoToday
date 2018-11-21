package kr.co.cools.today

import android.arch.persistence.room.RoomDatabase
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import kr.co.cools.today.di.DaggerTodayComponent
import kr.co.cools.today.logger.TimberDebugTree
import timber.log.Timber


class TodayApplication: DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerTodayComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(TimberDebugTree())
    }
}