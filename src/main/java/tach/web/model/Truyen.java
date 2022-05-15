/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.model;

/**
 *
 * @author maiva
 */
public class Truyen {
    private int ID_Truyen;
    private String TenTruyen;
    private String Mota;
    private String TacGia;
    private int SoTrang;
    private String NgayDang;
    private String img;

    public Truyen() {
    }

    public Truyen(int ID_Truyen, String TenTruyen, String Mota, String TacGia, int SoTrang, String NgayDang, String img) {
        this.ID_Truyen = ID_Truyen;
        this.TenTruyen = TenTruyen;
        this.Mota = Mota;
        this.TacGia = TacGia;
        this.SoTrang = SoTrang;
        this.NgayDang = NgayDang;
        this.img = img;
    }

    public int getID_Truyen() {
        return ID_Truyen;
    }

    public void setID_Truyen(int ID_Truyen) {
        this.ID_Truyen = ID_Truyen;
    }

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String TenTruyen) {
        this.TenTruyen = TenTruyen;
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
        return "Truyen{" + "ID_Truyen=" + ID_Truyen + ", TenTruyen=" + TenTruyen + ", Mota=" + Mota + ", TacGia=" + TacGia + ", SoTrang=" + SoTrang + ", NgayDang=" + NgayDang + ", img=" + img + '}';
    }
    
}
