package kr.co.cools.today.ui.main.di

import android.content.Context
import dagger.Module
import dagger.Provides
import kr.co.cools.today.repo.TodayRepository
import kr.co.cools.today.ui.main.MainInteractor
import kr.co.cools.today.ui.main.MainViewModelFactory

@Module
class MainActivityModule {
    @Provides
    fun mainViewModelFactory(context: Context, mainInteractor: MainInteractor) : MainViewModelFactory {
        return MainViewModelFactory(context, mainInteractor)
    }

    @Provides
    fun mainInteractor(context: Context, repository: TodayRepository) : MainInteractor {
        return MainInteractor(context, repository)
    }
}