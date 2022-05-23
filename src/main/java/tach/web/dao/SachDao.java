package tach.web.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tach.web.api.coDauSangKoDau;
import tach.web.connect.ConnectDatabase;
import tach.web.model.Sach;
import tach.web.model.TheLoai;


public class SachDao extends ConnectDatabase{
        private PreparedStatement ppst=null;
        private ResultSet rs=null;

     
        
        public List<Sach> getAllSach(){
            try {
                ppst =this.conn.prepareStatement("select * from Sach");
                rs=ppst.executeQuery();
                List<Sach> listSach=new ArrayList<>();
                while(rs.next()){
                    
                Sach sach=new Sach(rs.getInt("id_sach"),rs.getString("ten_sach"),rs.getString("tenKhongDau"),rs.getString("mo_ta"),
                                    rs.getString("tac_gia"),rs.getInt("so_trang"),
                                    rs.getDate("ngay_dang").toString(),rs.getString("img"));
                listSach.add(sach);
                }
       		 	ppst.close();
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
                 sach=new Sach(rs.getInt("id_sach"),rs.getString("ten_sach"),rs.getString("tenKhongDau"),rs.getString("mo_ta"),
                                    rs.getString("tac_gia"),rs.getInt("so_trang"),
                                    rs.getDate("ngay_dang").toString(),rs.getString("img"));
            }
       		 	ppst.close();
                return sach;
            } catch (Exception e) {
                
                System.out.println(e);
                return null;
            }
           
        }
                
                public Sach getSachByTenKhongDau(String tenKhongDau){
            try {
                ppst =this.conn.prepareStatement("select * from Sach Where tenKhongDau=?");
                ppst.setString(1, tenKhongDau);
                rs=ppst.executeQuery();
                Sach sach=new Sach();
                while(rs.next()){
                 sach=new Sach(rs.getInt("id_sach"),rs.getString("ten_sach"),rs.getString("tenKhongDau"),rs.getString("mo_ta"),
                                    rs.getString("tac_gia"),rs.getInt("so_trang"),
                                    rs.getDate("ngay_dang").toString(),rs.getString("img"));
            }
       		 	ppst.close();
                return sach;
            } catch (Exception e) {
                
                System.out.println(e);
                return null;
            }
           
        }
         public boolean dangSach(Sach sach,List<TheLoai> listTheLoai) {
        	 try {

        		 ppst=this.conn.prepareStatement("insert into Sach values (?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        		 ppst.setString(1,sach.getTenSach());
        		 ppst.setString(2,new coDauSangKoDau().ChuanHoa(sach.getTenSach()));
        		 ppst.setString(3, sach.getMota());
        		 ppst.setInt(4, sach.getSoTrang());
        		 ppst.setString(5, sach.getTacGia());
        		 ppst.setDate(6, Date.valueOf("2020-2-12"));
        		 ppst.setString(7, sach.getImg());
        		 ppst.executeUpdate();
        		 ResultSet resultSet=ppst.getGeneratedKeys();

        		 if(resultSet.next()) {
        			 System.out.println(resultSet.getLong(1));
        			 int id_sach=resultSet.getInt(1);
        			 dangTheLoaiSach(id_sach,listTheLoai);
        		 }
        		 System.out.println("Thanh Cong");
        		 return true;
			} catch (Exception e) {
				System.out.println(e);
				return false;
			}
        	 
        	 
         }
         public void dangTheLoaiSach(int id_sach,List<TheLoai> listTheLoai) {
        	 try {
        		 ppst=this.conn.prepareStatement("delete TheLoaiSach where id_sach=?");
        		 ppst.setInt(1, id_sach);
        		 ppst.executeUpdate();
        		 ppst.close();
        		 ppst=this.conn.prepareStatement("insert into TheLoaiSach values (?,?)");
        		 for(TheLoai tl:listTheLoai ) {
        			 ppst.setInt(1, id_sach);
        			 ppst.setInt(2,Integer.parseInt(tl.getID_TheLoai()));
        			 ppst.addBatch();
        		 };
        		 ppst.executeBatch();
        		 ppst.close();
			} catch (Exception e) {
					System.out.println(e);
				// TODO: handle exception
			}
        	 
         }
         public boolean suaTruyen(Sach sach,List<TheLoai> listTheLoai) {
        	 try {
        		 
				 ppst=this.conn.prepareStatement("update Sach set ten_sach=?,tenKhongDau=?,mo_ta=?,so_trang=?,tac_gia=?,ngay_dang=?,img=? where id_sach=?");
	       		 ppst.setString(1,sach.getTenSach());
	       		 ppst.setString(2,new coDauSangKoDau().ChuanHoa(sach.getTenSach()));
	       		 ppst.setString(3, sach.getMota());
	       		 ppst.setInt(4, sach.getSoTrang());
	       		 ppst.setString(5, sach.getTacGia());
	       		 ppst.setDate(6, Date.valueOf("2020-2-12"));
	       		 ppst.setString(7, sach.getImg());
	       		 ppst.setInt(8, sach.getID_Sach());
	       		 ppst.executeUpdate();
    			 dangTheLoaiSach(sach.getID_Sach(),listTheLoai);
    			 System.out.println("Thanh Cong");
    			 return true;
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
        	 
         }
         public boolean xoaTruyen(int id_sach) {
        	 try {
				ppst=this.conn.prepareStatement("delete Sach where id_sach=?");
				ppst.setInt(1, id_sach);
				ppst.executeUpdate();
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println();
				return false;
			}
        	 
         }
         public static void main(String[] args) {
                SachDao s=new SachDao();
                Sach ss=s.getSachByTenKhongDau("ngoc");
                System.out.println(ss);
    }
	
}
