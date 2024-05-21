package com.koto.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}
