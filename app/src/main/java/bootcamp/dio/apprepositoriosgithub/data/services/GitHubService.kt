package bootcamp.dio.apprepositoriosgithub.data.services

import bootcamp.dio.apprepositoriosgithub.data.model.Owner
import bootcamp.dio.apprepositoriosgithub.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>

    @GET("users/{user}")
    suspend fun listUserInfos(@Path("user") user: String): Owner
}