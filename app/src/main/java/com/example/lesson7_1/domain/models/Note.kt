package com.example.lesson7_1.domain.models

data class Note(
    val id: Int,
    val title: String,
    val description: String,
    val createdAt: Long
)
