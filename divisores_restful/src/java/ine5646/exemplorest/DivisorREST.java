/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646.exemplorest;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author Sasse
 */

@Path("divisores/{numero}")
public class DivisorREST {
  @GET
  @Produces("application/json")
  public String divisores(@PathParam("numero") int numero) {
      List<Integer> listaDivisores;
      listaDivisores = new ArrayList<>();
      
      for(int i = 1; i <= numero; i++){
          if(numero % i == 0){
              listaDivisores.add(i);
          }
      }
  
     return new Gson().toJson(listaDivisores);
  }
}