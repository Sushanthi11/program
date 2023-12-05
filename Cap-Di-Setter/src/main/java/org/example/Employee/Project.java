package org.example.Employee;

public class Project {
    public int projectid;
    public String projectname;
    public String projectcode;
    public String projectmanager;

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public String getProjectmanager() {
        return projectmanager;
    }

    public void setProjectmanager(String projectmanager) {

        this.projectmanager = projectmanager;
    }
    public void display(){
        System.out.println("project detals are with id:"+projectid+
                        "and name of the project is"+projectname+
                        "and description"+projectcode+
                        "and managername is"+projectmanager);
    }
}
