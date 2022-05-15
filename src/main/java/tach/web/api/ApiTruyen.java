/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.api;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tach.web.model.User;

/**
 *
 * @author maiva
 */
@WebServlet(urlPatterns = "/api/user/")
public class ApiTruyen extends  HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.print("TRI MAI");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("application/json");
            req.setCharacterEncoding("UTF-8");
            PrintWriter o=resp.getWriter();
            try {
                BufferedReader reader = req.getReader();
                 getRequestBody request=new getRequestBody();
                 String jsonString=request.getBody(reader);
                 User  user=new Gson().fromJson(jsonString,User.class);
                 System.out.println(user);
                o.print(user);

            } catch(Exception e) {
            }
    }


    
    
    
    
}
