package com.example.lesson7_1.domain.usecase

import com.example.lesson7_1.domain.repository.NoteRepository

class GetAllNotesUseCase(private val repository: NoteRepository) {

    fun getAllNotes() = repository.getAllNotes()

}