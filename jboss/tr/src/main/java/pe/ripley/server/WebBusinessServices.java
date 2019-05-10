package pe.ripley.server;

import static spark.Spark.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import spark.Request;
import spark.Response;

import spark.servlet.SparkApplication;


public class WebBusinessServices implements SparkApplication{
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		staticFiles.location("/public");
		
		get("/", (req, res) -> "<!DOCTYPE html><html lang=en><head><meta charset=utf-8><meta http-equiv=X-UA-Compatible content=\"IE=edge\"><meta name=viewport content=\"width=device-width,initial-scale=1\"><link rel=icon href=/favicon.ico><title>uripley</title><link href=/css/app.fd6c0c57.css rel=preload as=style><link href=/css/chunk-vendors.cb1be328.css rel=preload as=style><link href=/js/app.6bd0ccc0.js rel=preload as=script><link href=/js/chunk-vendors.8d80e117.js rel=preload as=script><link href=/css/chunk-vendors.cb1be328.css rel=stylesheet><link href=/css/app.fd6c0c57.css rel=stylesheet></head><body><noscript><strong>We're sorry but uripley doesn't work properly without JavaScript enabled. Please enable it to continue.</strong></noscript><div id=app></div><script src=/js/chunk-vendors.8d80e117.js></script><script src=/js/app.6bd0ccc0.js></script></body></html>");
	
	}

	
}


