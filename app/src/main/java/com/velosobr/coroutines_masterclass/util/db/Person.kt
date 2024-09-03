package com.velosobr.coroutines_masterclass.util.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Person(
    val name: String, @PrimaryKey val id: Int
)