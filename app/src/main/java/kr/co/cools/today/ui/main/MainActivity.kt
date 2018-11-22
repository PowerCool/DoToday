package kr.co.cools.today.ui.main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import kr.co.cools.today.R
import kr.co.cools.today.repo.TodayRepository
import kr.co.cools.today.repo.TodayRoomDatabase
import kr.co.cools.today.repo.dao.TodoDao
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.updateToday()

    }
}
