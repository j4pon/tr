
package pe.ripley.jbr;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import pe.ripley.model.Filtro;
import pe.ripley.model.Matriz;
import pe.ripley.model.Response;

public class Restfull {
    
    
    public static Response getData(spark.Request request, spark.Response response){
        response.type("application/json");
        String json = request.body();
        Filtro data = new Gson().fromJson(json, Filtro.class);

        
        List<Matriz> obj = new ArrayList<Matriz>();
        obj.add(new Matriz("01", "PERU"));
        obj.add(new Matriz("02", "ECUADOR"));
        obj.add(new Matriz("03", "ARGENTINA"));
        obj.add(new Matriz("04", "BOLIVIA"));
        return new Response("0", "OK", obj);
    }
    
}
