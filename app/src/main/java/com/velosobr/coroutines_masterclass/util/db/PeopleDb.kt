package com.velosobr.coroutines_masterclass.util.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Person::class],
    version = 1
)
abstract class PeopleDb : RoomDatabase() {
    abstract fun peopleDao(): PeopleDao
}