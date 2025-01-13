package org.example.BackEnd.Service;

import org.example.BackEnd.Entity.User;
import org.example.BackEnd.Respo.UserResponsitory;

import java.util.List;

public class UserService {
    private UserResponsitory userResponsitory = new UserResponsitory();
    public List<User> getAllUserById(int id) {
        return userResponsitory.getAllUserById(id);
    }


    public boolean login_admin(String email, String pass) {
        return userResponsitory.login_admin(email,pass);
    }

    public boolean addUser(String mail, String fullname) {
        return userResponsitory.addUser(mail,fullname);
    }
}
