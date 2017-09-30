
package br.com.fiap.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlunoWeb", targetNamespace = "http://ws.exemplos.fiap.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlunoWeb {


    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "autenticado", targetNamespace = "http://ws.exemplos.fiap.com/", className = "br.com.fiap.client.Autenticado")
    @ResponseWrapper(localName = "autenticadoResponse", targetNamespace = "http://ws.exemplos.fiap.com/", className = "br.com.fiap.client.AutenticadoResponse")
    @Action(input = "http://ws.exemplos.fiap.com/AlunoWeb/autenticadoRequest", output = "http://ws.exemplos.fiap.com/AlunoWeb/autenticadoResponse")
    public Boolean autenticado();

    /**
     * 
     * @return
     *     returns java.util.List<br.com.fiap.client.Aluno>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://ws.exemplos.fiap.com/", className = "br.com.fiap.client.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://ws.exemplos.fiap.com/", className = "br.com.fiap.client.ListarResponse")
    @Action(input = "http://ws.exemplos.fiap.com/AlunoWeb/listarRequest", output = "http://ws.exemplos.fiap.com/AlunoWeb/listarResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ws.exemplos.fiap.com/AlunoWeb/listar/Fault/Exception")
    })
    public List<Aluno> listar()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "novo", targetNamespace = "http://ws.exemplos.fiap.com/", className = "br.com.fiap.client.Novo")
    @ResponseWrapper(localName = "novoResponse", targetNamespace = "http://ws.exemplos.fiap.com/", className = "br.com.fiap.client.NovoResponse")
    @Action(input = "http://ws.exemplos.fiap.com/AlunoWeb/novoRequest", output = "http://ws.exemplos.fiap.com/AlunoWeb/novoResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ws.exemplos.fiap.com/AlunoWeb/novo/Fault/Exception")
    })
    public String novo(
        @WebParam(name = "arg0", targetNamespace = "")
        Aluno arg0)
        throws Exception_Exception
    ;

}
