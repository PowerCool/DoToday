package kr.co.cools.today.repo.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true) var index: Int = 0,
    @ColumnInfo(name = "dayOfWeek") var dayOfWeek: String = "",
    @ColumnInfo(name = "title") var title: String = "",
    @ColumnInfo(name = "point") var point: Int = 0
)