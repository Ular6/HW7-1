package com.example.lesson7_1.domain.usecase

import com.example.lesson7_1.domain.models.Note
import com.example.lesson7_1.domain.repository.NoteRepository

class CreateNoteUseCase(private val repository: NoteRepository) {

    fun create(note: Note) = repository.createNote(note)

}