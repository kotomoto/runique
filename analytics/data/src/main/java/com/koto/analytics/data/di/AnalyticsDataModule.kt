package com.koto.analytics.data.di

import com.koto.analytics.data.RoomAnalyticsRepository
import com.koto.analytics.domain.AnalyticsRepository
import com.koto.core.database.RunDatabase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val analyticsModule = module {
    singleOf(::RoomAnalyticsRepository).bind<AnalyticsRepository>()
    single {
        get<RunDatabase>().analyticsDao
    }
}
