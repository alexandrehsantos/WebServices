package br.com.fiap.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteChamada2 {
	public static void main(String[] args) {

		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> req_ctx = new HashMap<>();
		
		req_ctx = ((BindingProvider) port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<>();
		
		headers.put("Username", Collections.singletonList("ale"));
		headers.put("Senha", Collections.singletonList("123"));
		
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try {
			alunos = port.listar();
			
			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Turma: " + aluno.getTurma());
				System.out.println("Média: " + aluno.getMedia());
			}
			
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
