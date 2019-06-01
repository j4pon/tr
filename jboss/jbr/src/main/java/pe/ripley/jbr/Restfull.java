
package pe.ripley.jbr;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;

import pe.ripley.model.Matriz;
import pe.ripley.model.Response;

public class Restfull {

	public static Response getData(spark.Request request, spark.Response response) {
		response.type("application/json");
		String json = request.body();
		Response res = null;
		try {
			System.out.println(Objects.isNull(request.queryParams("id")));
			if (!Objects.isNull(request.queryParams("id"))) {
				List<Matriz> obj = new ArrayList<Matriz>();
				obj.add(new Matriz("01", "PERU"));
				obj.add(new Matriz("02", "ECUADOR"));
				obj.add(new Matriz("03", "ARGENTINA"));
				obj.add(new Matriz("04", "BOLIVIA"));
				res = new Response("0", "OK", obj);
			} else {
				throw new Exception("No se encontro identificador");
			}

		} catch (Exception e) {
			res = new Response(e);
		}
		return res;

	}



}
