/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.model;

/**
 *
 * @author maiva
 */
public class User {
    private int ID_User;
    private String Username;
    private String Password;
    private String HoTen;
    private String Email;
    private String img;
    private int Role;

    public User() {
    }

    public User(int ID_User, String Username, String Password, String HoTen, String Email, String img, int Role) {
        this.ID_User = ID_User;
        this.Username = Username;
        this.Password = Password;
        this.HoTen = HoTen;
        this.Email = Email;
        this.img = img;
        this.Role = Role;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "User{" + "ID_User=" + ID_User + ", Username=" + Username + ", Password=" + Password + ", HoTen=" + HoTen + ", Email=" + Email + ", img=" + img + ", Role=" + Role + '}';
    }
    

    
}
