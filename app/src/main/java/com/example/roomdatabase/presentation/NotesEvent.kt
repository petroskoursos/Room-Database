package com.example.roomdatabase.presentation

import com.example.roomdatabase.Data.Note

sealed interface NotesEvent {
    object SortNotes:NotesEvent

    data class DeleteNote(val note:Note):NotesEvent

    data class SaveNote(
        var title:String,
        val description:String
    ):NotesEvent
}