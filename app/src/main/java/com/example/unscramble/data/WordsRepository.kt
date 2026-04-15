package com.example.unscramble.data

import kotlinx.coroutines.flow.Flow

class WordsRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<WordEntity>> = wordDao.getAllWords()

    suspend fun insert(word: WordEntity) {
        wordDao.insertWord(word)
    }
}
