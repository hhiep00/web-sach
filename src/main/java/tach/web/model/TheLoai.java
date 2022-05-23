package tach.web.model;

public class TheLoai {
	private String ID_TheLoai;
	private String TenTheLoai;
	
//	public TheLoai(String id_TheLoai, String tenTheLoai) {
//
//		ID_TheLoai = id_TheLoai;
//		TenTheLoai = tenTheLoai;
//	}
	
	public String getID_TheLoai() {
		return ID_TheLoai;
	}
	public void setID_TheLoai(String iD_TheLoai) {
		ID_TheLoai = iD_TheLoai;
	}
	public String getTenTheLoai() {
		return TenTheLoai;
	}
	public void setTenTheLoai(String tenTheLoai) {
		TenTheLoai = tenTheLoai;
	}
	@Override
	public String toString() {
		return "TheLoai [ID_TheLoai=" + ID_TheLoai + ", TenTheLoai=" + TenTheLoai + "]";
	}

	

	
	
}
