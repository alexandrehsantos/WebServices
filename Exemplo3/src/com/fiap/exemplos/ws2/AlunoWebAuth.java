package com.fiap.exemplos.ws2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService
public class AlunoWebAuth {

	@Resource
	WebServiceContext wsctx;
	private List<Aluno> alunos;

	public AlunoWebAuth() {
		alunos = new ArrayList<Aluno>();
	}

	@WebMethod
	public String novo(@WebParam(name = "Aluno", header = false) Aluno a,
			@WebParam(name = "Usuario", header = true) String usuario,
			@WebParam(name = "Senha", header = true) String senha) throws Exception {
		if (this.autenticado(usuario, senha)) {
			alunos.add(a);
			return "Sucesso";
		} else {

			throw new Exception("Usu�rio ou senha inv�lida");
		}

	}

	@WebMethod
	public List<Aluno> listar(@WebParam(name = "Usuario", header = true) String usuario,
			@WebParam(name = "Senha", header = true) String senha

	) throws Exception {
		if (this.autenticado(usuario, senha))
			return this.alunos;
		else
			throw new Exception("Usu�rio ou senha inv�lida");
	}

	public Boolean autenticado(String usuario, String senha) {
		if (usuario.equals("ale") && senha.equals("123"))
			return true;
		else
			return false;
	}
}
