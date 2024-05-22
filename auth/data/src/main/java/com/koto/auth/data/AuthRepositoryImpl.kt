package com.koto.auth.data

import com.koto.auth.domain.AuthRepository
import com.koto.core.data.networking.post
import com.koto.core.domain.util.DataError
import com.koto.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient,
) : AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(email, password),
        )
    }
}
