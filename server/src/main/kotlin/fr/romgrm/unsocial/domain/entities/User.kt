// Ici c'est l'entité dont on va se servir pour travailler avec au sein du server uniquement.
// Le DTO sera pour la requete/réponse et le DAO pour la db , donc le reste du temps c'est avec l'entité que ça se passe
package fr.romgrm.unsocial.domain.entities

import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class User(val id: Int,
    val firstName: String, val lastName: String,)

val userStorage = listOf<User>(User(1,"Romain", "Gréaume"))
