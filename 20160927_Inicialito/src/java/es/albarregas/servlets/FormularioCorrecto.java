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
 * @author Daw2
 */
@WebServlet(name = "FormularioCorrecto", urlPatterns = {"/FormCorrecto"})
public class FormularioCorrecto extends HttpServlet {

    protected void escribirCabecera(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
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

        }
    }

    protected void escribirPie(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("es.albarregas.servlets.FormularioCorrecto.escribirPie()");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void escribirPrimera(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<form method=\"post\" action=\"../FormCorrecto\">\n");
            out.println("<div class=\"form-group\">");
            out.println("<label for=\"usuarioPrueba\">Nombre</label>");
            out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<label for=\"pwd\" >Password:</label>");
            out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"\">\n");
            out.println("</div>");
            out.println("<button type=\"submit\" class=\"btn-primary\">Enviar</button>");

            out.println("<button type=\"submit\" class=\"btn-primary\">Limpiar</button>");
            out.println("</form>");
        }
    }

    protected void escribirSegunda(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("es.albarregas.servlets.FormularioCorrecto.escribirSegunda()");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("es.albarregas.servlets.FormularioCorrecto.escribirSegunda()");

            out.println("<h2>Segunda</h2>");
            System.out.println("es.albarregas.servlets.FormularioCorrecto.escribirSegunda()");

        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, int numero)
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
            out.println("<h1>Servlet FormularioCorrecto at " + request.getContextPath() + "</h1>");
            //Primer formulario
            switch (numero) {
                case 1:
                    out.println("<form method=\"post\" action=\"FormCorrecto\">\n");
                    out.println("<div class=\"form-group\">");
                    out.println("<label for=\"usuarioPrueba\">Nombre</label>");
                    out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"\">");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<label for=\"pwd\" >Password:</label>");
                    out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"\">\n");
                    out.println("</div>");
                    out.println("<button type=\"submit\" class=\"btn-primary\">Enviar</button>");
                    break;
                case 2:
                    out.println("<form method=\"post\" action=\"FormCorrecto\">\n");
                    out.println("<div class=\"form-group\">");
                    out.println("<label for=\"usuarioPrueba\">Nombre</label>");
                    out.println("<input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"Nombre\" value=\"" + request.getParameter("usuario") + "\">");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<label for=\"pwd\" >Password:</label>");
                    out.println("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"Password\" value=\"" + request.getParameter("Password") + "\">\n");
                    out.println("</div>");
                    out.println("<button type=\"submit\" class=\"btn-primary\">Confirmar Datos</button>");
                    out.println("<button type=\"\" class=\"btn-primary\" onclick=\"window.location.href='FormCorrecto'\">Volver</button>");
                    break;
                case 3:
                    out.println("<p>sa guardado datos</p>");
                    break;
                default:
                    break;
            }

            //Pieeeeeeeeeeeeeeeeeeeeee
            out.println("</form>");
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
        //escribirCabecera(request, response);
        //escribirSegunda(request, response);
        // escribirPie(request, response);
        processRequest(request, response, 1);
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
        processRequest(request, response, 2);
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
