package com.example.unscramble.data

import kotlinx.coroutines.flow.Flow

class WordsRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<Word>> = wordDao.getAllWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
