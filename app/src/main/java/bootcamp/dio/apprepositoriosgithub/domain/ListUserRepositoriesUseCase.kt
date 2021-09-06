package bootcamp.dio.apprepositoriosgithub.domain

import bootcamp.dio.apprepositoriosgithub.core.UseCase
import bootcamp.dio.apprepositoriosgithub.data.model.Repo
import bootcamp.dio.apprepositoriosgithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}