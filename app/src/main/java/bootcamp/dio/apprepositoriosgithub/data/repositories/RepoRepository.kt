package bootcamp.dio.apprepositoriosgithub.data.repositories

import bootcamp.dio.apprepositoriosgithub.data.model.Owner
import bootcamp.dio.apprepositoriosgithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
    suspend fun listUserInfos(user: String): Flow<Owner>
}