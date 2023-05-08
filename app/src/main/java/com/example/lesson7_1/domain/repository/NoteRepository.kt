package com.example.lesson7_1.domain.repository

import com.example.lesson7_1.domain.models.Note

interface NoteRepository {

    fun getAllNotes() : List<Note>
    fun deleteNote(note: Note)
    fun createNote(note: Note)
    fun updateNote(note: Note)
}