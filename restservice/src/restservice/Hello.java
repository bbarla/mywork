package restservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class Hello {
 
	@GET
	@Path("/getMsg")
 
	public Response getMsg( String msg) {
 
		String output = "Jersey say : hello default" ;
 
		return Response.status(200).entity(output).build();
 
	}

	
	@GET
	@Path("/sayHello")
 
	public Response sayHello(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

}