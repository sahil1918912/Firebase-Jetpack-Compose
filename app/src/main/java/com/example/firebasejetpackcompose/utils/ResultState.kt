package com.example.firebasejetpackcompose.utils

import android.provider.ContactsContract.RawContacts.Data

sealed class ResultState<out T> {
    data class Success<out R>(val data : R) : ResultState<R>()
    data class Failure(val msg: Throwable) : ResultState<Nothing>()
    object Loading : ResultState<Nothing>()
}