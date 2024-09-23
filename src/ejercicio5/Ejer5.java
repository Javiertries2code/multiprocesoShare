package ejercicio5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;

public class Ejer5 {
	

	public static void main(String[] args) {
		String processName = "Notepad.exe";
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "tasklist");


		try {
			Process p = pb.start();
			
		
			
		
		
		InputStream er = p.getInputStream();
		BufferedReader brer = new BufferedReader(new InputStreamReader(er));
		
		String line = "whats wrong";
		
		while ((line = brer.readLine()) != null)
		{
					if(line.contains(processName.toLowerCase()))
					{System.out.println("encontrado");
					    try {
					        
					        Process process = Runtime.getRuntime().exec("taskkill /F /IM " + processName);
					        process.waitFor();  // Esperamos a que el comando termine
					        System.out.println("Proceso " + processName + " terminado.");
					    } catch (Exception e) {
					    	System.out.println("No encontrado");
					        e.printStackTrace();
					    }
					}
		}	
		
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