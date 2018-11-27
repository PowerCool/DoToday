package kr.co.cools.today.repo

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import kr.co.cools.today.repo.dao.JobDao
import kr.co.cools.today.repo.dao.TodoDao
import kr.co.cools.today.repo.entities.JobTodo
import kr.co.cools.today.repo.entities.Todo

@Database(
    entities = [
        Todo::class,
        JobTodo::class
    ],
    version = 5
)
abstract class TodayRoomDatabase: RoomDatabase() {
    abstract fun todoDao(): TodoDao
    abstract fun jobDao(): JobDao
}