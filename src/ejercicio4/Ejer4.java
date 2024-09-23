package ejercicio4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer4 {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "tasklist");


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
		while((c = iS.read()) != -1)
			System.out.print((char) c);
	
		iS.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}

	

