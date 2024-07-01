package com.koto.run.data.di

import com.koto.run.data.CreateRunWorker
import com.koto.run.data.DeleteRunWorker
import com.koto.run.data.FetchRunsWorker
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)
}
