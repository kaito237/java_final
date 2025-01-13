package org.example.BackEnd.Controller;

import org.example.BackEnd.Entity.User;
import org.example.BackEnd.Service.UserService;

import java.util.List;

public class UserController {
    private UserService userService = new UserService();
    public List<User> getAllUserById(int id) {
        return userService.getAllUserById(id);
    }
    public boolean login_admin(String email, String pass) {
        return userService.login_admin(email,pass);
    }
    public boolean addUser(String mail, String fullname) {
        return userService.addUser(mail,fullname);
    }
}
