package pe.ripley.jbr;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;
import pe.ripley.resources.JsonTransformer;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		staticFiles.location("/public");
        post("/drop", Restfull::getData, new JsonTransformer());
        
		get("/hello", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("message", "Hello Velocity");
			return new ModelAndView(model, "hello.vm"); // located in the
														// resources directory
		}, new VelocityTemplateEngine());

		init();

	}
}
