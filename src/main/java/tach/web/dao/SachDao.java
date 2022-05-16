package tach.web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tach.web.connect.ConnectDatabase;
import tach.web.model.Sach;


public class SachDao extends ConnectDatabase{
        private PreparedStatement ppst=null;
        private ResultSet rs=null;

     
        
        public List<Sach> getAllSach(){
            try {
                ppst =this.conn.prepareStatement("select * from Sach");
                rs=ppst.executeQuery();
                List<Sach> listSach=new ArrayList<>();
                while(rs.next()){
                    
                Sach sach=new Sach(rs.getInt("id_sach"),rs.getString("ten_sach"),rs.getString("mo_ta"),
                                    rs.getString("tac_gia"),rs.getInt("so_trang"),
                                    rs.getDate("ngay_dang").toString(),rs.getString("img"));
                listSach.add(sach);
                }
                return listSach;
            } catch (Exception e) {
                
                System.out.println(e);
                return null;
            }
           
        }
                public Sach getSachByID(int ID_Sach){
            try {
                ppst =this.conn.prepareStatement("select * from Sach Where id_sach=?");
                ppst.setString(1, ID_Sach+"");
                rs=ppst.executeQuery();
                Sach sach=new Sach();
                while(rs.next()){
                 sach=new Sach(rs.getInt("id_sach"),rs.getString("ten_sach"),rs.getString("mo_ta"),
                                    rs.getString("tac_gia"),rs.getInt("so_trang"),
                                    rs.getDate("ngay_dang").toString(),rs.getString("img"));
            }
                return sach;
            } catch (Exception e) {
                
                System.out.println(e);
                return null;
            }
           
        }
//         public static void main(String[] args) {
//                SachDao s=new SachDao();
//                Sach ss=s.getSachByID(1);
//                System.out.println(ss);
//    }
}
