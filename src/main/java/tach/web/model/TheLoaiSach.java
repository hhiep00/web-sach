package tach.web.model;

public class TheLoaiSach {
    private int ID_Sach;
    private int ID_TheLoai;

    public TheLoaiSach() {
    }

    public TheLoaiSach(int ID_Sach, int ID_TheLoai) {
        this.ID_Sach = ID_Sach;
        this.ID_TheLoai = ID_TheLoai;
    }

    public int getID_Sach() {
        return ID_Sach;
    }

    public void setID_Sach(int ID_Sach) {
        this.ID_Sach = ID_Sach;
    }

    public int getID_TheLoai() {
        return ID_TheLoai;
    }

    public void setID_TheLoai(int ID_TheLoai) {
        this.ID_TheLoai = ID_TheLoai;
    }

    @Override
    public String toString() {
        return "TheLoaiSach{" + "ID_Sach=" + ID_Sach + ", ID_TheLoai=" + ID_TheLoai + '}';
    }

   

   
    
}
