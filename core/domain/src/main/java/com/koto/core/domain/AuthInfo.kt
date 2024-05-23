package com.koto.core.domain

data class AuthInfo(
    val accessToken: String,
    val refreshToken: String,
    val userId: String,
)
