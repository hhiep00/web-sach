package tach.web.model;

public class TheLoai {
    private String ID_Theloai;
    private String TenTheLoai;

    public TheLoai() {
    }

    public TheLoai(String ID_Theloai, String TenTheLoai) {
        this.ID_Theloai = ID_Theloai;
        this.TenTheLoai = TenTheLoai;
    }

    public String getID_Theloai() {
        return ID_Theloai;
    }

    public void setID_Theloai(String ID_Theloai) {
        this.ID_Theloai = ID_Theloai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }

    @Override
    public String toString() {
        return "TheLoai{" + "ID_Theloai=" + ID_Theloai + ", TenTheLoai=" + TenTheLoai + '}';
    }
    
}
