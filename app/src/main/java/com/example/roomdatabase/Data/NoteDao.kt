package com.example.roomdatabase.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Upsert// it can insert and update the notes
    suspend fun addNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
    @Query("SELECT * FROM note ORDER BY dateAdded")
    fun getNoteOrderByDateAdded(): Flow<List<Note>>

    @Query("SELECT * FROM note ORDER BY title ASC")
    fun getNoteOrderByDateTitle():Flow<List<Note>>

}

