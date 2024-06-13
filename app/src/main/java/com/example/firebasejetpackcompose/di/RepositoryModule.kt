package com.example.firebasejetpackcompose.di

import com.example.firebasejetpackcompose.FirebaseRealtimeDB.Repository.RealtimeDbRepository
import com.example.firebasejetpackcompose.FirebaseRealtimeDB.Repository.RealtimeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRealtimeRepository(
        repo:RealtimeDbRepository
    ): RealtimeRepository
}