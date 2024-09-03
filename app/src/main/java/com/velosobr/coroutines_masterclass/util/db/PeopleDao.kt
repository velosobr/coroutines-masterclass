package com.velosobr.coroutines_masterclass.util.db

interface PeopleDao {
    fun getPeople(): List<Person>
    fun insertPerson(person: Person)
    fun deletePerson(person: Person)
    fun updatePerson(person: Person)
}