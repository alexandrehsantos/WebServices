package com.fiap.exemplos.ws2;

import java.util.List;

public class ChamadaObjeto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AlunoWebAuth port = new AlunoWebAuthService().getAlunoWebAuthPort();
		List<Aluno> alunos;

		try {
			ListarResponse resposta = port.listar(new Listar(), "ale", "123");
			alunos = resposta.getReturn();

			for (Aluno aluno : alunos) {

				System.out.println(aluno.getNome());
			}
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
	}
}
