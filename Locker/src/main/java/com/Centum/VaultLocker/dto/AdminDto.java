package com.Centum.VaultLocker.dto;

public class AdminDto {
    private int adminid;
    private String adminname;
    private String email;
    private String password;

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminDto() {
    }

    public AdminDto(int adminid, String adminname, String email, String password) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.email = email;
        this.password = password;
    }

    public int Adminid() {
        return 0;
    }
}
