package kr.co.cools.today.repo

import android.content.Context
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.NewThreadScheduler
import kr.co.cools.today.repo.dao.TodoDao
import kr.co.cools.today.repo.entities.Todo

class TodayRepository(var context: Context, var todoDao: TodoDao) {

    fun getAll() : Single<List<Todo>>{
        return todoDao.getAll()
    }
}

