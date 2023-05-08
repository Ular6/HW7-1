package com.example.lesson7_1.data.repository

import com.example.lesson7_1.data.local.NoteDao
import com.example.lesson7_1.data.mappers.toNote
import com.example.lesson7_1.data.mappers.toNoteEntity
import com.example.lesson7_1.domain.models.Note
import com.example.lesson7_1.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map {
            it.toNote()
        }
    }

    override fun deleteNote(note: Note) {
        noteDao.delete(note.toNoteEntity())
    }

    override fun createNote(note: Note) {
        noteDao.create(note.toNoteEntity())
    }

    override fun updateNote(note: Note) {
        noteDao.update(note.toNoteEntity())
    }
}