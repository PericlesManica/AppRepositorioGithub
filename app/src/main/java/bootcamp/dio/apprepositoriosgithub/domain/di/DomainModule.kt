package bootcamp.dio.apprepositoriosgithub.domain.di

import bootcamp.dio.apprepositoriosgithub.domain.ListUserInfosUseCase
import bootcamp.dio.apprepositoriosgithub.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module {
        return module {
            factory {
                ListUserRepositoriesUseCase(get())
            }
            factory {
                ListUserInfosUseCase(get())
            }
        }
    }
}