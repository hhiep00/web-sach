/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.api;

import Model.User;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tach.web.dao.SachDao;
import tach.web.model.Sach;
import tach.web.model.TheLoaiSach;



/**
 *
 * @author maiva
 */
@WebServlet(urlPatterns = {"/api/user/*"})
public class ApiTruyen extends  HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
                    resp.setContentType("application/json");
                   SachDao querySach=new SachDao();
                    String params=req.getPathInfo().substring(1);
                    int id_sach=Integer.parseInt(params);
                   Sach sach =querySach.getSachByID(id_sach);
                   System.out.println(sach);
                   if(sach.getID_Sach()!=0){
                    String jsonString=new Gson().toJson(sach);
                    PrintWriter out=resp.getWriter();
                    out.print(jsonString);
                   }
        } catch (Exception e) {
                System.out.println(e);
        }

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
                 TheLoaiSach  theLoaiSach=new Gson().fromJson(jsonString,TheLoaiSach.class);
                 System.out.println(jsonString);
                o.print(jsonString);

            } catch(Exception e) {
            }
    }


    
    
    
    
}
