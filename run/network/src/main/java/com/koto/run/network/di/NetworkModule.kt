package com.koto.run.network.di

import com.koto.core.domain.run.RemoteRunDataSource
import com.koto.run.network.KtorRemoteDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {
    singleOf(::KtorRemoteDataSource).bind<RemoteRunDataSource>()
}
