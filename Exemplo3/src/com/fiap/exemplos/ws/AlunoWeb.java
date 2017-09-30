package com.fiap.exemplos.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.fiap.exemplos.ws2.Aluno;

@WebService
public class AlunoWeb {

	@Resource
	WebServiceContext wsctx;
	private List<Aluno> alunos;

	public AlunoWeb() {
		alunos = new ArrayList<Aluno>();
	}

	@WebMethod
	public String novo(Aluno a) throws Exception {
		if (this.autenticado()) {
			alunos.add(a);
			return "Sucesso";
		} else{
			
			 throw new Exception("Usuário ou senha inválida");
		}
		
	}

	@WebMethod
	public List<Aluno> listar() throws Exception {
		if(this.autenticado())return this.alunos;
		else throw new Exception("Usuário ou senha inválida");
	}

	public Boolean autenticado() {
		javax.xml.ws.handler.MessageContext messageContext = wsctx.getMessageContext();
		Map http_headers = (Map) messageContext.get(javax.xml.ws.handler.MessageContext.HTTP_REQUEST_HEADERS);

		List usuarios = (List) http_headers.get("Username");
		List senhas = (List) http_headers.get("Senha");

		if (usuarios == null || senhas == null)
			return false;
		String usuario = usuarios.get(0).toString();
		String senha = senhas.get(0).toString();

		if (usuario.equals("ale") && senha.equals("123"))
			return true;
		else
			return false;
	}
}
