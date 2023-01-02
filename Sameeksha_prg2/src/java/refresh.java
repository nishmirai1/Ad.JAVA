/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mcacnj
 */
@WebServlet(urlPatterns = {"/refresh"})
public class refresh extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void performTask(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            out.println("TestServlet says hai at"+new Date());
            try
            {
                String Accname=request.getParameter("Accname");
                String Accnum=request.getParameter("Accnum");
                String branch=request.getParameter("branch");
                String place=request.getParameter("place");
                String date=request.getParameter("date");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Program refresh</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>CUSTOMER ACCOUNT DATAILS</h2>");
            //out.println("<h1>Servlet refresh at " + request.getContextPath() + "</h1>");
            out.println("<font face=6>Dear User<br>");
            out.println("YOUR INFORMATION <br><br>");
            out.println("Account Name:"+Accname+"<br>");
            out.println("Account Number:"+Accnum+"<br>");
            out.println("Branch:"+branch+"<br>");
            out.println("Place:"+place+"<br>");
            out.println("Date:"+date+"<br></font>");
            out.println("</body>");
            out.println("</html>");
        }
    
    finally
    {
        out.close();
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
        performTask(request, response);
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
        performTask(request, response);
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
