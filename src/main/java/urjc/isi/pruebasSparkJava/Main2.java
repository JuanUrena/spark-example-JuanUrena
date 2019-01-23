package urjc.isi.pruebasSparkJava;

import java.net.URISyntaxException;

import spark.Request;
import spark.Response;

public class Main2 {
	
	public static String doLast(Request request, Response response) throws ClassNotFoundException, URISyntaxException {
	String result = new String("Adios Mundo");
	return result;
	
    }

}
