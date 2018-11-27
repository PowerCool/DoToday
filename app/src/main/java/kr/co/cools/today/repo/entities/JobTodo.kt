package kr.co.cools.today.repo.entities

import android.arch.persistence.room.*


@Entity
data class JobTodo(
    @PrimaryKey(autoGenerate = true)
    var jobIndex: Int = 0,

    @ColumnInfo(name = "completed")
    var completed: Boolean = false,

    @ColumnInfo(name = "date")
    var date: String = "",

    @Embedded
    var todo: Todo? = null
)