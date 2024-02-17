// Ici on créer nos DTOs qui seront envoyés à notre front
// Il ne faut pas hésiter à créer plusieurs type de Dto par exemple UserDto / CreateUserDto / UpdateUserDto
// On se servira de ces DTOs dans nos routes
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(val id: Int,
    val firstName: String, val lastName: String,)
