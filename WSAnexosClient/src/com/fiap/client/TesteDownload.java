package com.fiap.client;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteDownload {
	public static void main(String[] args) {
		ArquivoWebService service = new ArquivoWebService();
		ArquivoWeb port = new ArquivoWebService().getArquivoWebPort();
		
		try {
			byte[] fileBytes = port.download("Apontamento de Horas-2017-09-Alexandre Henrique dos Santos.xlsx");
			FileOutputStream fos = new FileOutputStream("d:/temp/teste.xlsx");
			BufferedOutputStream outputStream = new BufferedOutputStream(fos);
			outputStream.write(fileBytes);
			outputStream.close();
			
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
