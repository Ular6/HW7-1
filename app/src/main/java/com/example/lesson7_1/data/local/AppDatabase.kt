package com.example.lesson7_1.data.local

import androidx.room.Database
import com.example.lesson7_1.data.models.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class AppDatabase {
    abstract fun noteDao(): NoteDao
}