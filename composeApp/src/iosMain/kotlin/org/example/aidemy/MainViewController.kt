package org.example.aidemy

import androidx.compose.ui.window.ComposeUIViewController
import org.example.aidemy.core.database.DatabaseDriverFactory
import org.koin.dsl.module
import platform.UIKit.UIViewController

private var koinStarted = false

fun MainViewController(): UIViewController {
    if (!koinStarted) {
        val platformModule = module {
            single { DatabaseDriverFactory() }
        }
        initKoin(platformModule)
        koinStarted = true
    }

    return ComposeUIViewController { App() }
}
