package org.example.aidemy

import android.app.Application
import org.example.aidemy.core.database.DatabaseDriverFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class AidemyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val platformModule = module {
            single { DatabaseDriverFactory(context = get()) }
        }

        initKoin(platformModule) {
            androidContext(this@AidemyApplication)
        }
    }
}
