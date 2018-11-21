package kr.co.cools.today.repo.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import io.reactivex.Single
import kr.co.cools.today.repo.entities.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAll(): Single<List<Todo>>

    @Query("SELECT * FROM todo WHERE dayOfWeek IN (:dayOfWeek)")
    fun getAll(dayOfWeek: String): Single<List<Todo>>

    @Insert
    fun insert(vararg todo: Todo)

    @Delete
    fun delete(todo: Todo)
}