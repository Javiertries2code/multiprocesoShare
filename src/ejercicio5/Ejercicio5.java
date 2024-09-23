package ejercicio5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio5 {
public static void main(String[] args) {
	
	String processName = "Notepad.exe";	
	
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "tasklist");


		try {
			Process p = pb.start();
			
			InputStream iS = p.getInputStream();
			System.out.println();
		
			int c;
			while((c = iS.read()) != -1)
				System.out.print((char) c);
		
			iS.close();
			
		
		
		InputStream er = p.getInputStream();
		BufferedReader brer = new BufferedReader(new InputStreamReader(er));
		
		String line = null;
		
		while ((line = brer.readLine()) != null)
			if(line.contains(processName.toLowerCase()))
			{System.out.println("encontrado\n\n");		
			System.out.println(line);
			return;
					}
			else
					System.out.println("No encontrado");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
