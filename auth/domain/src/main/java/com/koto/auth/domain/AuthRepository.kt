package com.koto.auth.domain

import com.koto.core.domain.util.DataError
import com.koto.core.domain.util.EmptyResult

interface AuthRepository {

    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}