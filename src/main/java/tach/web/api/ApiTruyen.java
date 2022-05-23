/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import tach.web.dao.SachDao;
import tach.web.model.Sach;
import tach.web.model.TheLoai;
import tach.web.model.TheLoaiSach;



/**
 *
 * @author maiva
 */
@WebServlet(urlPatterns = {"/api/sach/*"})
public class ApiTruyen extends  HttpServlet{

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
                    resp.setContentType("application/json;charset=UTF-8");
                    SachDao querySach=new SachDao();
                    String params=req.getPathInfo();
                    PrintWriter out=resp.getWriter();
                    System.out.println(params.length());
                    if(params.length()>1){
                    	String ten=params.substring(1);

                       if(ten.matches("\\d+")) {
                           int id_sach=Integer.parseInt(params.substring(1));
                           Sach sach =querySach.getSachByID(id_sach);
                           System.out.println(sach);
                           if(sach.getID_Sach()!=0){
                                String jsonString=new Gson().toJson(sach);

                                out.print(jsonString);
                           }
                       }
                       else {
                    	   Sach sach=querySach.getSachByTenKhongDau(ten);
                           String jsonString=new Gson().toJson(sach);
                           out.print(jsonString);
					}

                    }
                    else{
                        List<Sach> listSach=querySach.getAllSach();
                        String jsonString=new Gson().toJson(listSach);
                        out.print(jsonString);
                    }
                    
        } catch (Exception e) {
                System.out.println(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("application/json;charset=UTF-8");
            req.setCharacterEncoding("UTF-8");
            PrintWriter o=resp.getWriter();
            try {
                 BufferedReader reader = req.getReader();
                 getRequestBody request=new getRequestBody();
                 String jsonString=request.getBody(reader);
                 int indexTL=jsonString.indexOf("TenTheLoai");
                 String jsonSach=jsonString.substring(0, indexTL-1);
                 jsonSach=jsonSach.substring(0,jsonSach.lastIndexOf(","))+"}";
                 String jsonTheLoai= jsonString.substring(indexTL-1, jsonString.length()-2).substring(13);
                 Sach sach= new Gson().fromJson(jsonSach,Sach.class);
                 ObjectMapper mapper=new ObjectMapper();
                 List<TheLoai> listTheLoai=Arrays.asList(mapper.readValue(jsonTheLoai,TheLoai[].class));
                 SachDao querySach=new SachDao();
                 boolean statusDangTruyen=querySach.dangSach(sach, listTheLoai);
                 if(statusDangTruyen)
                	 o.print("Đăng Thành Công");
                 else {
                	 o.print("Đăng Thất Bại");
    			}

            } catch(Exception e) {
                System.out.println(e);
            }
}
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("application/json;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter o=resp.getWriter();
        try {
             BufferedReader reader = req.getReader();
             getRequestBody request=new getRequestBody();
             String jsonString=request.getBody(reader);
             int indexTL=jsonString.indexOf("TenTheLoai");
             String jsonSach=jsonString.substring(0, indexTL-1);
             jsonSach=jsonSach.substring(0,jsonSach.lastIndexOf(","))+"}";
             String jsonTheLoai= jsonString.substring(indexTL-1, jsonString.length()-2).substring(13);
             Sach sach= new Gson().fromJson(jsonSach,Sach.class);
             ObjectMapper mapper=new ObjectMapper();
            List<TheLoai> listTheLoai=Arrays.asList(mapper.readValue(jsonTheLoai,TheLoai[].class));           
             SachDao querySach=new SachDao();
             boolean statusSuaTruyen= querySach.suaTruyen(sach, listTheLoai);
             if(statusSuaTruyen)
            	 o.print("Sửa Thành Công");
             else {
            	 o.print("Sửa Thất Bại");
			}

        } catch(Exception e) {
            System.out.println(e);
        }
    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("application/json;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
    	try {
    		PrintWriter out=resp.getWriter();
    	  	int id_sach=Integer.parseInt(req.getPathInfo().substring(1)); 
    	  	SachDao querySach=new SachDao();
    	  	boolean statusXoaTruyen = querySach.xoaTruyen(id_sach);
    	  	if(statusXoaTruyen)
    	  		out.print("Xóa Thành Công");
    	  	else {
        	  	out.print("Xóa Thất bại");
			}
		} catch (Exception e) {
			System.out.println(e);
    		PrintWriter out=resp.getWriter();
    	  	out.print("Xóa Thất bại");
		}
  
    }
}