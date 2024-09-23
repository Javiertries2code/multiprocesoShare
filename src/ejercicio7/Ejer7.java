package ejercicio7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer7 {

	public static void main(String[] args) {

		ProcessBuilder pb = new ProcessBuilder("CMD", "/C",
				" C:\\Users\\Javier\\eclipse-workspace\\Multiproceso\\bin\\ejercicio7\\EjemploLectura.class blablabla");

		try {
			Process p = pb.start();

			InputStream er = p.getInputStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));

			String line = null;

			while ((line = brer.readLine()) != null)
				System.out.println(line);

			InputStream iS = p.getErrorStream();
			System.out.println();

			int c;
			boolean user_fail = false;
			while ((c = iS.read()) != -1) {
				System.out.print((char) c);
				user_fail = true;
			}
			if (user_fail)
				System.out.println(
						"SI TIRA FALLO PUEDE SER PORQUE EL USUARIO DE LA MAQUINA DONDE SE EJECUTA EL PROGRAMA, NO COINCIDE CON EL PROPORCIAONADO EN PROCESSBUILDER ");

			iS.close();
		} catch (Exception e) {
		}
	}
}
