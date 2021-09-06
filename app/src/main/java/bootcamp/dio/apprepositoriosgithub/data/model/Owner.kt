package bootcamp.dio.apprepositoriosgithub.data.model

import com.google.gson.annotations.SerializedName

data class Owner(
    val name: String,
    @SerializedName("avatar_url")
    val avatarURL: String,
    @SerializedName("html_url")
    val htmlURL: String
)