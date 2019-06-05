package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/DemoService")
public class DemoService {

	@GET
	@Path("/{msg}")
	@Produces(MediaType.TEXT_HTML)
	public String printMsg(@PathParam("msg") String msg) {
		return "<h1>Your message: " +msg+ "</h1>";
	}
}
