package com.koto.runique

import android.app.Application
import com.koto.auth.data.di.authDataModule
import com.koto.auth.presentation.di.authViewModelModule
import com.koto.core.data.di.coreDataModule
import com.koto.run.presentation.di.runViewModelModule
import com.koto.runique.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runViewModelModule,
            )
        }
    }
}