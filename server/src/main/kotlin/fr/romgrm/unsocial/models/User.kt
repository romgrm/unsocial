package fr.romgrm.unsocial.models

import kotlinx.serialization.Serializable

@Serializable
data class User(val firstName: String, val lastName: String)

val userStorage = listOf<User>(User("Romain", "Gréaume"))
