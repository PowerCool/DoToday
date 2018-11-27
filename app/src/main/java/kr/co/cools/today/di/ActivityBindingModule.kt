package kr.co.cools.today.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kr.co.cools.today.ui.main.MainActivity

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}