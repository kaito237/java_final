package org.example.BackEnd.Entity;

public class Manager extends User {
    private int exp_in_year;
    private int project_id;

    public Manager(int id, String full_name, String email, String password, Role role, int exp_in_year, int project_id) {
        super(id, full_name, email, password, role);
        this.exp_in_year = exp_in_year;
        this.project_id = project_id;
    }

    public Manager(int exp_in_year, int project_id) {
        this.exp_in_year = exp_in_year;
        this.project_id = project_id;
    }

    public Manager() {
    }

    public int getExp_in_year() {
        return exp_in_year;
    }

    public void setExp_in_year(int exp_in_year) {
        this.exp_in_year = exp_in_year;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    @Override
    public String toString() {
        return super.toString() + "              " + exp_in_year + "                   " + project_id;
    }
}
