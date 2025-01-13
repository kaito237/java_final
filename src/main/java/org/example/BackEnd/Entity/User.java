package org.example.BackEnd.Entity;

public class User {
    private int id;
    private String full_name,email,password;
    private Role role;


    public User(int id, String full_name, String email, String password, Role role) {
        this.id = id;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
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

    public Role getRolee() {
        return role;
    }

    public void setRolee(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return
                id + "   "+
                        full_name + "    " +
                        email + "     " +
                        password + "              " + role +"\n";

    }
}
