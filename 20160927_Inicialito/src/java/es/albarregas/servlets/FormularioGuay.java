/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafa
 */
@WebServlet(name = "FormularioGuay", urlPatterns = {"/FormularioGuay"})
public class FormularioGuay extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormularioGuay</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormularioGuay at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
            /* TODO output your page here. You may use following sample code. */
            //Cabecera
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormularioCorrecto</title>");
            out.println("<link rel=\"stylesheet\" href=\"cosascss/estilos.css\" media=\"screen\" title=\"no title\">\n");
            out.println("<script src=\"js/jquery-3.1.1.js\"></script>");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" media=\"screen\" title=\"no title\">\n");
            out.println("<script src=\"js/bootstrap.min.js\"></script>\n");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormularioGuay at " + request.getContextPath() + "</h1>");
            out.println("<form method=\"post\" action=\"FormularioGuay\">\n");
            out.println("<div class=\"form-group\">");
            out.println("<label for=\"usuarioPrueba\">Nombre</label>");
            out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<label for=\"pwd\" >Password:</label>");
            out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"\">\n");
            out.println("</div>");
            out.println(" <input type=\"checkbox\" name=\"deporte\" value=\"deporte\"> Deporte<br>");
            out.println("<input type=\"checkbox\" name=\"lectura\" value=\"lectura\"> Lectura<br>");
            out.println(" <input type=\"checkbox\" name=\"vagear\" value=\"vagear\"> Vagear<br>");
            out.println("<input type='submit' name=\"Bdos\" value='Bvalidar'/>");
            out.println("<input type='submit' name=\"Bdos\" value='Blimpiar'/>");

            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //Cabecera
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormularioCorrecto</title>");
            out.println("<link rel=\"stylesheet\" href=\"cosascss/estilos.css\" media=\"screen\" title=\"no title\">\n");
            out.println("<script src=\"js/jquery-3.1.1.js\"></script>");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" media=\"screen\" title=\"no title\">\n");
            out.println("<script src=\"js/bootstrap.min.js\"></script>\n");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormularioCorrecto at " + request.getContextPath() + "</h1>");
            /*
                Metodo en si
             */
            System.out.println(request.getParameter("Bdos"));
            if (null != request.getParameter("Bdos")) {
                switch (request.getParameter("Bdos")) {
                    case "Bvalidar":
                        out.println(request.getParameter("Bdos"));

                        out.println("<form method=\"post\" action=\"FormularioGuay\">\n");
                        out.println("<fieldset disabled=\"disabled\">");
                        out.println("<div class=\"form-group\">");
                        out.println("<label for=\"usuarioPrueba\">Nombre</label>");
                        out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"" + request.getParameter("usuario") + "\">");
                        out.println("</div>");
                        out.println("<div class=\"form-group\">");
                        out.println("<label for=\"pwd\" >Password:</label>");
                        out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"" + request.getParameter("Password") + "\">\n");
                        out.println("</div>");
                        out.println(" </fieldset>");
                        out.println("<input type=\"hidden\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"" + request.getParameter("usuario") + "\">");
                        out.println("<input type=\"hidden\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"" + request.getParameter("Password") + "\">\n");

                        if (request.getParameter("deporte") != null) {
                            out.println(" <input type=\"checkbox\" name=\"deporte\" value=\"deporte\" checked> Deporte<br>");
                        } else {
                            out.println(" <input type=\"checkbox\" name=\"deporte\" value=\"deporte\"> Deporte<br>");

                        }
                        if (request.getParameter("lectura") != null) {
                            out.println(" <input type=\"checkbox\" name=\"lectura\" value=\"lectura\" checked> lectura<br>");
                        } else {
                            out.println(" <input type=\"checkbox\" name=\"lectura\" value=\"lectura\"> lectura<br>");

                        }
                        if (request.getParameter("vagear") != null) {
                            out.println(" <input type=\"checkbox\" name=\"vagear\" value=\"vagear\" checked> Vagear<br>");
                        } else {
                            out.println(" <input type=\"checkbox\" name=\"vagear\" value=\"vagear\"> Vagear<br>");

                        }

                        out.println("<input type='submit' name=\"Bdos\" value='Bconfirmar'/>");
                        out.println("<input type='submit' name=\"Bdos\" value='Bvolver'/>");
                        break;
                    case "Bvolver":

                        out.println("<form method=\"post\" action=\"FormularioGuay\">\n");
                        out.println("<div class=\"form-group\">");
                        out.println("<label for=\"usuarioPrueba\">Nombre</label>");
                        out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"" + request.getParameter("usuario") + "\">");
                        out.println("</div>");
                        out.println("<div class=\"form-group\">");
                        out.println("<label for=\"pwd\" >Password:</label>");
                        out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"" + request.getParameter("Password") + "\">\n");
                        out.println("</div>");
                        if (request.getParameter("deporte") != null) {
                            out.println(" <input type=\"checkbox\" name=\"deporte\" value=\"deporte\" checked> Deporte<br>");
                        } else {
                            out.println(" <input type=\"checkbox\" name=\"deporte\" value=\"deporte\"> Deporte<br>");

                        }

                        if (request.getParameter("lectura") != null) {
                            out.println(" <input type=\"checkbox\" name=\"lectura\" value=\"lectura\" checked> lectura<br>");
                        } else {
                            out.println(" <input type=\"checkbox\" name=\"lectura\" value=\"lectura\"> lectura<br>");

                        }
                        if (request.getParameter("vagear") != null) {
                            out.println(" <input type=\"checkbox\" name=\"vagear\" value=\"vagear\" checked> Vagear<br>");
                        } else {
                            out.println(" <input type=\"checkbox\" name=\"vagear\" value=\"vagear\"> Vagear<br>");

                        }

                        out.println("<input type='submit' name=\"Bdos\" value='Bvalidar'/>");
                        out.println("<input type='submit' name=\"Bdos\" value='Blimpiar'/>");

                        break;
                    case "Bconfirmar":
                        out.println("<p>datos metidos</p>");
                        break;
                    case "Blimpiar":
                        out.println("<form method=\"post\" action=\"FormularioGuay\">\n");
                        out.println("<div class=\"form-group\">");
                        out.println("<label for=\"usuarioPrueba\">Nombre</label>");
                        out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"\">");
                        out.println("</div>");
                        out.println("<div class=\"form-group\">");
                        out.println("<label for=\"pwd\" >Password:</label>");
                        out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"\">\n");
                        out.println("</div>");
                        out.println(" <input type=\"checkbox\" name=\"preferencia\" value=\"deporte\"> Deporte<br>");
                        out.println("<input type=\"checkbox\" name=\"preferencia\" value=\"lectura\"> Lectura<br>");
                        out.println(" <input type=\"checkbox\" name=\"preferencia\" value=\"vagear\"> Vagear<br>");
                        out.println("<input type='submit' name=\"Bdos\" value='Bvalidar'/>");
                        out.println("<input type='submit' name=\"Bdos\" value='Blimpiar'/>");
                        break;
                    default:
                        break;
                }
            }
            //Pieeeeeeeeeeeeeeeeeeeeee
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
