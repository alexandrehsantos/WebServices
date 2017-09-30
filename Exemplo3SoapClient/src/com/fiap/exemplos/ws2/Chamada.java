package com.fiap.exemplos.ws2;

public class Chamada {

	public static void main(String[] args) {
		AlunoWebAuth  port = new AlunoWebAuthService().getAlunoWebAuthPort();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ale");
		aluno.setMedia(4.4);
		aluno.setTurma("29SCJ");
		
		
		Novo parametros = new Novo();
		parametros.setAluno(aluno);
		
		try {
			System.out.println(port.novo(parametros, "ale", "123").getReturn());
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
