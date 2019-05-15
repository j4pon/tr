package pe.ripley.app;

import static spark.Spark.get;
import static spark.Spark.staticFiles;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.servlet.SparkApplication;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import spark.template.velocity.VelocityTemplateEngine;

public class server implements SparkApplication{
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		staticFiles.location("/public");
		
		get("/hello", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("message", "Hello Velocity");
			return new ModelAndView(model, "hello.vm"); // located in the
														// resources directory
		}, new VelocityTemplateEngine());
		
		get("/xxx", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("message", "Hello Thymeleaf!");
            return new ModelAndView(model, "index"); // located in resources/templates
        }, new ThymeleafTemplateEngine());		
		
	}
}
