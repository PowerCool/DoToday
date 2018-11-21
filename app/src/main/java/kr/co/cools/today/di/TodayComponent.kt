package kr.co.cools.today.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import kr.co.cools.today.TodayApplication
import kr.co.cools.today.ui.main.di.MainActivityModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        TodayAppModule::class,
        ActivityBindingModule::class
    ]
)
interface TodayComponent: AndroidInjector<TodayApplication> {

    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<TodayApplication>()

}