package org.example.BackEnd.Service;

import org.example.BackEnd.Entity.User;
import org.example.BackEnd.Respo.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    public List<User> getAllUserById(int id) {
        return userRepository.getAllUserById(id);
    }


    public boolean login_admin(String email, String pass) {
        return userRepository.login_admin(email,pass);
    }

    public boolean addUser(String mail, String fullname) {
        return userRepository.addUser(mail,fullname);
    }
}
