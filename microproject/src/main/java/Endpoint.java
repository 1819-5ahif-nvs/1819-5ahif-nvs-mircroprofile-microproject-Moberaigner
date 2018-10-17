import com.google.gson.Gson;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("zoo")
public class Endpoint {

    @PersistenceContext
    private EntityManager em;

    @GET
    @Path("/pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPets() {
        List<Pet> pets = em.createNamedQuery("Pet.findAll").getResultList();
        return Response.ok()
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity(pets != null ? new Gson().toJson(pets) : "keine Tiere in der DB")
                .build();
    }

    @GET
    @Path("/zookeeper")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllZooKeeper() {
        List<ZooKeeper> res = em.createNamedQuery("Zookeeper.findAll").getResultList();
        return Response.ok()
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity(res != null ? new Gson().toJson(res) : "keine ZooKeeper in der DB")
                .build();
    }
}