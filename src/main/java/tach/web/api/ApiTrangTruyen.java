package tach.web.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import tach.web.dao.TrangDao;
import tach.web.model.ServiceModel;
import tach.web.model.TheLoai;
import tach.web.model.Trang;
import tach.web.model.TrangSach;

@WebServlet(urlPatterns = {"/api/trangtruyen/*"})
public class ApiTrangTruyen extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doGet(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("application/json;charset=UTF-8");
			req.setCharacterEncoding("UTF-8");
			String params=req.getPathInfo();
			PrintWriter out=resp.getWriter();
			String tenSach=params.substring(1);
			getRequestBody requestBody=new getRequestBody();

			
			try {
				String jsonTrangSach=requestBody.getBody(req.getReader());
				TrangSach trang=new Gson().fromJson(jsonTrangSach,TrangSach.class);
				TrangDao queryTrang=new TrangDao();
				boolean stausDangTrang=queryTrang.postTrangSach(trang);
				if(stausDangTrang)
					out.print("thành công");
				else {
					out.print("Thất bại");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}

			
		}
		@Override
		protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
		}
		@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
		}
}
