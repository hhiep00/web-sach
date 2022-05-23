package tach.web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import tach.web.connect.ConnectDatabase;
import tach.web.model.Trang;
import tach.web.model.TrangSach;

public class TrangDao extends ConnectDatabase{
	
	
	
	
	
	public boolean postTrangSach(TrangSach trangSach) {
		
		try {
			PreparedStatement ppst=this.conn.prepareStatement("select * from Sach Where tenKhongDau=?");
			ppst.setString(1, trangSach.getTenSachChuanHoa());
			ResultSet rs=ppst.executeQuery();
			int id_sach=0;
			if(rs.next()) {
				id_sach=rs.getInt("id_sach");
				ppst=this.conn.prepareStatement("insert into TrangSach values (?,1,?)");
				ppst.setInt(1,id_sach);
				ppst.setString(2, trangSach.getNoiDung());
				ppst.executeUpdate();
				return true;
			}

			return false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	public boolean suaTrangSach(TrangSach trangSach) {
		
		try {
			
			PreparedStatement ppst=this.conn.prepareStatement("select * from Sach Where tenKhongDau=?");
			ppst.setString(1, trangSach.getTenSachChuanHoa());
			ResultSet rs=ppst.executeQuery();
			int id_sach=0;
			if(rs.next()) {
				ppst=this.conn.prepareStatement("update TrangSach set noi_dung=? where trang=? and id_sach=?");

				ppst.setString(1, trangSach.getNoiDung());
				ppst.setInt(2,trangSach.getID_Trang());
				ppst.setInt(3, id_sach);
				ppst.executeUpdate();
				return true;
			
			}
			return false;
		} catch (Exception e) {
			
			return false;
		}
		
	}
	

}
