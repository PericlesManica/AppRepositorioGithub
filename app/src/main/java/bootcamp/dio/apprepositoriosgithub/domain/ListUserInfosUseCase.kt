package bootcamp.dio.apprepositoriosgithub.domain

import bootcamp.dio.apprepositoriosgithub.core.UseCase
import bootcamp.dio.apprepositoriosgithub.data.model.Owner
import bootcamp.dio.apprepositoriosgithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserInfosUseCase(
    private val repository: RepoRepository
) : UseCase<String, Owner>() {

    override suspend fun execute(param: String): Flow<Owner> {
        return repository.listUserInfos(param)
    }
}