package bootcamp.dio.apprepositoriosgithub

import android.app.Application
import bootcamp.dio.apprepositoriosgithub.data.di.DataModule
import bootcamp.dio.apprepositoriosgithub.domain.di.DomainModule
import bootcamp.dio.apprepositoriosgithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}