package tach.web.model;

public class TrangSach {
	private String tenSachChuanHoa;
	private int ID_Trang;
	private String noiDung;
	public TrangSach() {
		// TODO Auto-generated constructor stub
	}
	public TrangSach(String tenSachChuanHoa, int iD_Trang, String noiDung) {
	
		this.tenSachChuanHoa = tenSachChuanHoa;
		ID_Trang = iD_Trang;
		this.noiDung = noiDung;
	}
	public String getTenSachChuanHoa() {
		return tenSachChuanHoa;
	}
	public void setTenSachChuanHoa(String tenSachChuanHoa) {
		this.tenSachChuanHoa = tenSachChuanHoa;
	}
	public int getID_Trang() {
		return ID_Trang;
	}
	public void setID_Trang(int iD_Trang) {
		ID_Trang = iD_Trang;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	@Override
	public String toString() {
		return "TrangSach [tenSachChuanHoa=" + tenSachChuanHoa + ", ID_Trang=" + ID_Trang + ", noiDung="
				+ noiDung + "]";
	}
	
	
}
