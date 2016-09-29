/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daw2
 */
@WebServlet(name = "CicloVida", urlPatterns = {"/ciclo"})
public class CicloVida extends HttpServlet {
    public Enumeration<String> servletParams ;

    /**
     *
     * @param config
     */
    @Override
    public void init(ServletConfig config){
        servletParams=config.getInitParameterNames();

            }

    /**
     *
     */
    @Override
    public void destroy(){
        System.out.println("destroy()");
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("service()");
         while(servletParams.hasMoreElements()){
           System.out.println(servletParams.nextElement());
           System.out.println(request.getParameter(servletParams.nextElement()));

         }
            
        }
      
    
    

}