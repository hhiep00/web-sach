package tach.web.model;

public class YeuThich {
    private int ID_User;
    private int ID_Sach;

    public YeuThich() {
    }

    public YeuThich(int ID_User, int ID_Sach) {
        this.ID_User = ID_User;
        this.ID_Sach = ID_Sach;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public int getID_Sach() {
        return ID_Sach;
    }

    public void setID_Sach(int ID_Sach) {
        this.ID_Sach = ID_Sach;
    }

    @Override
    public String toString() {
        return "YeuThich{" + "ID_User=" + ID_User + ", ID_Sach=" + ID_Sach + '}';
    }

    
    
}
