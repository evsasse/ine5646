/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646.primo.views;

import ine5646.primo.models.Numero;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

/**
 *
 * @author Sasse
 */
public class NumeroView {
    public static void writeView(PrintWriter out, boolean valido, String in, Numero numero)
            throws ServletException, IOException {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>INE5646 - primo</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>INE5646 - primo</h1>");
      if (valido){
          if (numero.ehPrimo()){
            out.println("<h2 style='color: green'>'"+in+"' É primo!</h2>");
          } else {
            out.println("<h2 style='color: orange'>'"+in+"' Não é primo!</h2>");
          }
      } else {
          out.println("<h2 style='color: red'>'"+in+"' Não é um número inteiro!</h2>");
      }
      out.println("</body>");
      out.println("</html>");
    }
}
