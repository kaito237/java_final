package org.example.BackEnd.Service;

import java.sql.SQLException;

public interface IUserService {
    boolean login_admin(String email, String pass) throws ClassNotFoundException, SQLException;
    boolean addUser(String mail, String fullname) throws ClassNotFoundException, SQLException;
}
