import fr.romgrm.unsocial.models.userStorage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getUser() {
    get("/user") {
        if (userStorage.isNotEmpty()) {
            call.respond(userStorage)
        }
    }
}
