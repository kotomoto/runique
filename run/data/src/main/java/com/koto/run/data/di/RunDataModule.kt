package com.koto.run.data.di

import com.koto.core.domain.run.SyncRunScheduler
import com.koto.run.data.CreateRunWorker
import com.koto.run.data.DeleteRunWorker
import com.koto.run.data.FetchRunsWorker
import com.koto.run.data.SyncRunWorkerScheduler
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
}
