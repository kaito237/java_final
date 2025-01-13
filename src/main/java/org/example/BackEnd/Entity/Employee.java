package org.example.BackEnd.Entity;

public class Employee extends User {
    private int project_id;
    private String pro_skill;


    public Employee(int id, String full_name, String email, String password, Role role, int project_id, String pro_skill) {
        super(id, full_name, email, password, role);
        this.project_id = project_id;
        this.pro_skill = pro_skill;
    }

    public Employee(int project_id, String pro_skill) {
        this.project_id = project_id;
        this.pro_skill = pro_skill;
    }

    public Employee() {
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getPro_skill() {
        return pro_skill;
    }

    public void setPro_skill(String pro_skill) {
        this.pro_skill = pro_skill;
    }

    @Override
    public String toString() {
        return super.toString() + "      " + project_id + "    " + pro_skill;
    }
}
