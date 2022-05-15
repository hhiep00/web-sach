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
    private String Mota;
    private String TacGia;
    private int SoTrang;
    private String NgayDang;
    private String img;

    public Sach() {
    }

    public Sach(int ID_Sach, String TenSach, String Mota, String TacGia, int SoTrang, String NgayDang, String img) {
        this.ID_Sach = ID_Sach;
        this.TenSach = TenSach;
        this.Mota = Mota;
        this.TacGia = TacGia;
        this.SoTrang = SoTrang;
        this.NgayDang = NgayDang;
        this.img = img;
    }

    public int getID_Sach() {
        return ID_Sach;
    }

    public void setID_Sach(int ID_Sach) {
        this.ID_Sach = ID_Sach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    public String getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(String NgayDang) {
        this.NgayDang = NgayDang;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Sach{" + "ID_Sach=" + ID_Sach + ", TenSach=" + TenSach + ", Mota=" + Mota + ", TacGia=" + TacGia + ", SoTrang=" + SoTrang + ", NgayDang=" + NgayDang + ", img=" + img + '}';
    }
    
}
