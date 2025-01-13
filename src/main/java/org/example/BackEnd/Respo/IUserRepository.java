package org.example.BackEnd.Respo;

import java.sql.SQLException;

public interface IUserRepository {
    boolean login_admin(String email, String pass) throws ClassNotFoundException, SQLException;
    boolean addUser(String mail, String fullname) throws ClassNotFoundException, SQLException;
}
