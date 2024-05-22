package com.koto.auth.data.di

import com.koto.auth.data.AuthRepositoryImpl
import com.koto.auth.data.EmailPatternValidator
import com.koto.auth.domain.AuthRepository
import com.koto.auth.domain.PatternValidator
import com.koto.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }

    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}