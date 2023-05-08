package com.example.lesson7_1.domain.usecase

import com.example.lesson7_1.domain.models.Note
import com.example.lesson7_1.domain.repository.NoteRepository

class UpdateNoteUseCase(private val repository: NoteRepository) {

    fun update(note: Note) = repository.updateNote(note)
}