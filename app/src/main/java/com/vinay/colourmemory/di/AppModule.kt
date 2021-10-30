package com.vinay.colourmemory.di

import android.app.Application
import androidx.room.Room
import com.vinay.colourmemory.db.AppDatabase
import com.vinay.colourmemory.repository.Repository
import com.vinay.colourmemory.utils.createCardsData
import com.vinay.colourmemory.vo.Card
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by VINAY'S on 30/10/21.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        application: Application
    ): AppDatabase {
        return Room
            .databaseBuilder(application, AppDatabase::class.java, "vinay.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideCards(): List<Card> = createCardsData


    @Provides
    fun providePlayerRepository(database: AppDatabase) =
        Repository(database)
}