package com.koto.core.data.di

import com.koto.core.data.auth.EncryptedSessionStorage
import com.koto.core.data.networking.HttpClientFactory
import com.koto.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}