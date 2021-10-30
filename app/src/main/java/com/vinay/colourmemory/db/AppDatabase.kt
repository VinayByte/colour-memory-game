package com.vinay.colourmemory.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vinay.colourmemory.vo.Player

/**
 * Created by VINAY'S on 30/10/21.
 */
@Database(entities = [Player::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pokemonDao(): PlayerDao
}