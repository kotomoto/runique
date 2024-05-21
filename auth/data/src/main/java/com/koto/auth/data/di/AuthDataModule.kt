package com.koto.auth.data.di

import com.koto.auth.data.EmailPatternValidator
import com.koto.auth.domain.PatternValidator
import com.koto.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }

    singleOf(::UserDataValidator)
}