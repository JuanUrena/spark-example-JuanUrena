package urjc.isi.pruebasSparkJava;

import java.net.URISyntaxException;

import spark.Request;
import spark.Response;

public class Comentarios {
	//Comentarios
	
	//Guardo un nuevo comentario de un usuario hacia una pelicula
	public static String postComent(Request request, Response response) throws ClassNotFoundException, URISyntaxException {
		String result = new String("Comentario");
		return result;
	}
	
	public static String newComment(String text, int user, String film) {
		//Obtengo id de la pelicula
		//Almaceno el nuevo comentario
		return "comentario almacenado";
	}
	
	//Devuelvo todos los comentarios que han hecho sobre una pelicula, con su usuario, para mostrar User: comment
	public String [][] commentsFilm(String name){
		//Obtener el id con la función basica
		//Una funcion que me devuelva Un array de dos por dos con la info user, comen. 
		
		String respuesta [][]= new String[1][1];
		return respuesta;
	}

}
