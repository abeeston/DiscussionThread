/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
 * @author Amy
 */
@WebServlet(urlPatterns = {"/CreatePost"})
public class CreatePost extends HttpServlet {

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

        String filename = "discussion.txt";

        // Gets the name, timestamp and content
        String username = request.getParameter("username");
        
        Date date = new Date();
        String time = date.toString();
        
        time = "test date";////////////////////////////////////////////
        
        String content = request.getParameter("content");
        
        //String test = "testing Date!!"; ////////////////////////////
        //request.getSession().setAttribute("username", username);
        //request.getSession().setAttribute("test", test);
        //request.getSession().setAttribute("content", content);
        
        // write to the file
        //String path = getServletContext().getRealPath("/") + filename;
        
        String dataDirectory = System.getenv("OPENSHIFT_DATA_DIR");
        String path = dataDirectory + "\\discussion.txt";
        
        FileWriter fw = new FileWriter(path, true);
        String text = username + ":" + /*time + ":" + */content + "\n";
        fw.write(text);
        
        // forward the request
        request.getRequestDispatcher("LoadPosts").forward(request, response);//////////////////////////////////////
        //request.getRequestDispatcher("ViewPosts.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
