package ine5646.primo.servlets;

import ine5646.primo.models.Numero;
import ine5646.primo.views.NumeroView;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leandro; evandro sasse
 */
@WebServlet(name = "ServletVerificador", urlPatterns = {"/verifique"})
public class ServletVerificador extends HttpServlet {

  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
        String in = request.getParameter("numero");
        try {
           Numero numero = new Numero(Integer.parseInt(in));
           NumeroView.writeView(out, true, in, numero);
        } catch (NumberFormatException e) {
           NumeroView.writeView(out, false, in, null);
        }
    }

  }
}