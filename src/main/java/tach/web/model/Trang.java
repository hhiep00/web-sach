package tach.web.model;

public class Trang {
    private int ID_Sach;
    private int ID_Trang;
    private String noidung;

    public Trang() {
    }

    public Trang(int ID_Sach, int ID_Trang, String noidung) {
        this.ID_Sach = ID_Sach;
        this.ID_Trang = ID_Trang;
        this.noidung = noidung;
    }

    public int getID_Sach() {
        return ID_Sach;
    }

    public void setID_Sach(int ID_Sach) {
        this.ID_Sach = ID_Sach;
    }

    public int getID_Trang() {
        return ID_Trang;
    }

    public void setID_Trang(int ID_Trang) {
        this.ID_Trang = ID_Trang;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Override
    public String toString() {
        return "Trang{" + "ID_Sach=" + ID_Sach + ", ID_Trang=" + ID_Trang + ", noidung=" + noidung + '}';
    }
    
}
