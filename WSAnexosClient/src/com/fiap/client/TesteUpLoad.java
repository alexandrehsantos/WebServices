//package com.fiap.client;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class TesteUpLoad {
//	public static void main(String[] args) throws FileNotFoundException {
//		ArquivoWeb port = new ArquivoWebService().getArquivoWebPort();
//		File file = new File("C:/Users/logonrm/Downloads/7ab0d841e5be.jpg");
//		
//		FileInputStream fis = new FileInputStream(file);
//		BufferedInputStream inStream = new BufferedInputStream(fis);
//		byte[] fileBytes =  new byte[(int) file.length()];
//		inStream.read(fileBytes);
//		
//		port.upload("", arg1);
//		
//	}
//}
