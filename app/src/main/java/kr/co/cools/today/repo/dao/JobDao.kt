package kr.co.cools.today.repo.dao

import android.arch.persistence.room.*
import io.reactivex.Single
import kr.co.cools.today.repo.entities.JobTodo

@Dao
interface JobDao{
    @Query("SELECT * FROM jobtodo")
    fun getAll() : Single<List<JobTodo>>

    @Query("SELECT * FROM jobtodo WHERE dayOfWeek IN (:dayOfWeek)")
    fun getAll(dayOfWeek: String) : Single<List<JobTodo>>

    @Insert
    fun insert(vararg jobTodo: JobTodo): LongArray

    @Delete
    fun delete(jobTodo: JobTodo)

    @Query("DELETE FROM JobTodo")
    fun deleteAll()

    @Update
    fun update(jobTodo: JobTodo)
}