package com.example.firebasejetpackcompose.FirebaseRealtimeDB.Repository

import com.example.firebasejetpackcompose.FirebaseRealtimeDB.RealtimeModelResponse
import com.example.firebasejetpackcompose.utils.ResultState
import kotlinx.coroutines.flow.Flow

interface RealtimeRepository {

    fun insert(
        item:RealtimeModelResponse.RealtimeItems
    ) : Flow<ResultState<String>>

    fun getItems() : Flow<ResultState<List<RealtimeModelResponse>>>

    fun delete(
        key: String
    ) : Flow<ResultState<String>>

    fun update(
        res: RealtimeModelResponse
    ) : Flow<ResultState<String>>
}