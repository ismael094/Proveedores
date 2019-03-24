/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ismael1
 */
@WebService(serviceName = "proveedor")
public class proveedor {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comprar")
    public Boolean comprar(@WebParam(name = "isbn") String isbn, @WebParam(name = "cantidad") int cantidad) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "novedades")
    public String novedades() {
        //TODO write your implementation code here:
        //Preguntar a la profe si se puede hacer una string y asi devolver un json
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ofertas")
    public String ofertas() {
        //TODO write your implementation code here:
        return null;
    }
    
    
}
