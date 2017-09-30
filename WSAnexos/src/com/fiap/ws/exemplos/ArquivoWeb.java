package com.fiap.ws.exemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class ArquivoWeb {
	
	@WebMethod
	public void upload(String filename, byte[] imageBytes) throws Exception{
		String filepath = "D:/upload/" + filename;

			FileOutputStream fos = new FileOutputStream(filepath);
			BufferedOutputStream outputStream = new BufferedOutputStream(fos);
			outputStream.write(imageBytes);
			outputStream.close();

	}
	
	@WebMethod
	public byte[] download(String filename) throws Exception {
		String filepath = "d:/download/" + filename;
		File file = new File(filepath);

		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

		byte[] fileBytes = new byte[(int) file.length()];

		bufferedInputStream.read(fileBytes);
		bufferedInputStream.close();

		return fileBytes;

	}

}
