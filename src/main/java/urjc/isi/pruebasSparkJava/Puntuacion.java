package urjc.isi.pruebasSparkJava;

import java.net.URISyntaxException;

import spark.Request;
import spark.Response;

public class Puntuacion {
	//Puntuaciones
	
		//Guardo la nueva puntuacion
		public void newScore(int score, int user, String film) {
			//Obtener el id de la pelicula
			//Llamar a la funcion para añadir. 
			System.out.println("añadida");
		}
		
		//Obtengo la nueva media 
		public int getScore (String name) {
			
			//Llamara a una funcion que me devuelva todas las puntuaciones 
			//referentes al nombre que me pasan, de ese vector saco la media
			int scores []= {1,3,4,1,5,2};
			
			int media=0;
			for (int i=0; i < scores.length; i++) {
				 media = media + scores[i];
			}
			media = media / scores.length;
			return media;
		}
		
		//Actualizo la media
		public void changeScore(int score, String name) {
			//Llamar a la función para cambiar la puntuacion de la pelicula, pedir. 
		}
		
		public static String postScore(Request request, Response response) throws ClassNotFoundException, URISyntaxException {
			String result = new String("Puntuacion");
			return result;
		}
}
