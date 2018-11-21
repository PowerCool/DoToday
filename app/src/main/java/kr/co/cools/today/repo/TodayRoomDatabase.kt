package kr.co.cools.today.repo

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import kr.co.cools.today.repo.dao.TodoDao
import kr.co.cools.today.repo.entities.Todo

@Database(
    entities = [
        Todo::class
    ],
    version = 1
)
abstract class TodayRoomDatabase: RoomDatabase() {
    abstract fun todoDao(): TodoDao
}