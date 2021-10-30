package com.vinay.colourmemory.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.vinay.colourmemory.vo.Player

/**
 * Created by VINAY'S on 30/10/21.
 */
@Dao
interface PlayerDao {

    @Query("SELECT * FROM player")
    suspend fun getAllUsers(): List<Player>

    @Insert
    suspend fun insert(user: Player): Long
}