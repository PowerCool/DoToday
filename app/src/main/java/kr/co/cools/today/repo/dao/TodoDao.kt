package kr.co.cools.today.repo.dao

import android.arch.persistence.room.*
import io.reactivex.Single
import kr.co.cools.today.repo.entities.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAll(): Single<List<Todo>>

    @Query("SELECT * FROM todo WHERE dayOfWeek IN (:dayOfWeek)")
    fun getAll(dayOfWeek: String): Single<List<Todo>>

    @Insert
    fun insert(vararg todo: Todo): LongArray

    @Update
    fun update(todo: Todo)

    @Delete
    fun delete(todo: Todo)

    @Query("DELETE FROM Todo")
    fun deleteAll()
}