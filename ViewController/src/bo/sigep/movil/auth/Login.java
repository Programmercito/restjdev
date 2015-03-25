package bo.sigep.movil.auth;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/login")
public class Login {
    public Login() {
        super();
    }


    @POST
    @Produces("application/json")
    public JSONObject login(@FormParam("usuario") @DefaultValue("admin") String usuario,
                            @FormParam("clave") @DefaultValue("admin") String clave) {
        JSONObject resultado;
        resultado = new JSONObject();
        if ("admin".equals(usuario) && "admin".equals(clave)) {
            resultado.put("RESULTADO", "OK");
        } else {
            resultado.put("RESULTADO", "ERROR");
        }
        System.out.println("IMPRIMIENDO JSON9!!!!!"+resultado.toString());
        return resultado;    }

}
