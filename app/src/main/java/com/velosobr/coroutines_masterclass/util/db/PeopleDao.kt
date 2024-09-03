package com.velosobr.coroutines_masterclass.util.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PeopleDao {
    @Insert
    fun insertPerson(person: Person)

    @Query("SELECT * FROM Person")
    fun getPeople(): List<Person>

    @Delete
    fun deletePerson(person: Person)

}