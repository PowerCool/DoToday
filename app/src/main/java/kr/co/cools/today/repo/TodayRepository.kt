package kr.co.cools.today.repo

import android.content.Context
import io.reactivex.Single
import kr.co.cools.today.repo.dao.TodoDao
import kr.co.cools.today.repo.entities.Todo
import javax.inject.Inject

class TodayRepository @Inject constructor(var context: Context, var todoDao: TodoDao) {

    fun getAll() : Single<List<Todo>>{
        return todoDao.getAll()
    }
}

