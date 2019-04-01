/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import busquedas.Busquedas;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Ismael1
 */
@WebService(serviceName = "ProveedorWS")
public class ProveedorWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "comprar")
    public String comprar(@WebParam(name = "isbn") String isbn,@WebParam(name = "cantidad") int cantidad) {
        if (cantidad >= 30) 
            return "";
        
        Busquedas a = new Busquedas();
        String libros = a.getJson("isbn", isbn, "0");
        if (new JSONObject(libros).get("books").toString().length() <= 2) {
            return "";
        }
        return libros;
        
    }
}
