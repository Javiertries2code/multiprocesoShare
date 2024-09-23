package ejercicio1;

import java.io.IOException;

public class Ejer1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		String infoProceso = "Notepad.exe";
		
		ProcessBuilder processBuilder = new  ProcessBuilder(infoProceso);
		
		
		try {
			Process proceso = processBuilder.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
