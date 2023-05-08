package com.example.lesson7_1.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.lesson7_1.data.models.NoteEntity

@Dao
interface NoteDao {

    @Delete
    fun delete(noteEntity: NoteEntity)

    @Insert
    fun create(noteEntity: NoteEntity)

    @Update
    fun update(noteEntity: NoteEntity)

    @Query("SELECT * FROM note_entity")
    fun getAllNotes(): List<NoteEntity>

}