package ejercicio2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer2 {
	
	public static void main(String[] args) {
	ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");

	try {
		Process p = pb.start();
		
		InputStream iS = p.getErrorStream();
		System.out.println();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c;
		while((c = iS.read()) != -1)
			System.out.print((char) c);
	
		iS.close();
		
	
	
	InputStream er = p.getInputStream();
	BufferedReader brer = new BufferedReader(new InputStreamReader(er));
	
	String line = null;
	
	while ((line = brer.readLine()) != null)
				System.out.println(line);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
