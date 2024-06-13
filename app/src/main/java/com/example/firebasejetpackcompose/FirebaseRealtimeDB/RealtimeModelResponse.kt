package com.example.firebasejetpackcompose.FirebaseRealtimeDB

data class RealtimeModelResponse(
    val item: RealtimeItems?,
    val key: String? = ""
)
{
    data class RealtimeItems(
        val title : String? = "",
        val description : String ? = ""
    )
}
