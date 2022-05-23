/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.model;

/**
 *
 * @author maiva
 */
public class Sach {
    private int ID_Sach;
    private String TenSach;
    private String tenKhongDau;
    private String Mota;
    private String TacGia;
    private int SoTrang;
    private String NgayDang;
    private String img;

    public Sach() {
    }

	public Sach(int iD_Sach, String tenSach, String tenKhongDau, String mota, String tacGia, int soTrang,
			String ngayDang, String img) {
		super();
		ID_Sach = iD_Sach;
		TenSach = tenSach;
		this.tenKhongDau = tenKhongDau;
		Mota = mota;
		TacGia = tacGia;
		SoTrang = soTrang;
		NgayDang = ngayDang;
		this.img = img;
	}

	public int getID_Sach() {
		return ID_Sach;
	}

	public void setID_Sach(int iD_Sach) {
		ID_Sach = iD_Sach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public String getTenKhongDau() {
		return tenKhongDau;
	}

	public void setTenKhongDauString(String tenKhongDauString) {
		this.tenKhongDau = tenKhongDau;
	}

	public String getMota() {
		return Mota;
	}

	public void setMota(String mota) {
		Mota = mota;
	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public int getSoTrang() {
		return SoTrang;
	}

	public void setSoTrang(int soTrang) {
		SoTrang = soTrang;
	}

	public String getNgayDang() {
		return NgayDang;
	}

	public void setNgayDang(String ngayDang) {
		NgayDang = ngayDang;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Sach [ID_Sach=" + ID_Sach + ", TenSach=" + TenSach + ", tenKhongDau=" + tenKhongDau
				+ ", Mota=" + Mota + ", TacGia=" + TacGia + ", SoTrang=" + SoTrang + ", NgayDang=" + NgayDang + ", img="
				+ img + "]";
	}

    
    
}
