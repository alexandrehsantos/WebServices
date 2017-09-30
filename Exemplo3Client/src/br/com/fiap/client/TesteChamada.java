package br.com.fiap.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteChamada {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Alexandre");
		a.setTurma("29SCJ");
		a.setMedia(9.2);

		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> req_ctx = new HashMap<>();
		
		req_ctx = ((BindingProvider) port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<>();
		
		headers.put("Username", Collections.singletonList("ale"));
		headers.put("Senha", Collections.singletonList("123"));
		
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		try {
			System.out.println(port.novo(a));
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
