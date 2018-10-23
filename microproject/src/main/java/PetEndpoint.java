import com.google.gson.Gson;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("zoo")
public class PetEndpoint {

@Inject
private PetFacade petFacade;

    @GET
    @Path("/pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPets() {
        return Response.ok()
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity(new Gson().toJson(petFacade.findAll()))
                .build();
    }
}