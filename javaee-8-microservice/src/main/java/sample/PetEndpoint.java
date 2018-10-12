package sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("pets")
public class PetEndpoint {

	@Inject
	private PetFacade petFacade;

	@GET
	public Response message() {
		return Response.ok(petFacade.findAll()).build();
	}

}
