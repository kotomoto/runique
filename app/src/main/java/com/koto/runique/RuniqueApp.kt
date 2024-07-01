package com.koto.runique

import android.app.Application
import com.koto.auth.data.di.authDataModule
import com.koto.auth.presentation.di.authViewModelModule
import com.koto.core.data.di.coreDataModule
import com.koto.core.database.di.databaseModule
import com.koto.run.data.di.runDataModule
import com.koto.run.location.di.locationModule
import com.koto.run.network.di.networkModule
import com.koto.run.presentation.di.runPresentationModule
import com.koto.runique.di.appModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            workManagerFactory()
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule,
                databaseModule,
                networkModule,
                runDataModule,
            )
        }
    }
}