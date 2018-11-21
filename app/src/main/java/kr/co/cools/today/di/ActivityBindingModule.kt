package kr.co.cools.today.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kr.co.cools.today.ui.main.MainActivity
import kr.co.cools.today.ui.main.di.MainActivityModule

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(
        modules = [ MainActivityModule::class ]
    )
    abstract fun mainActivity(): MainActivity
}