package org.example.BackEnd.Respo;

import org.example.BackEnd.Entity.Role;
import org.example.BackEnd.Entity.User;
import org.example.BackEnd.Untils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserResponsitory implements IUserResponsitory {
    public List<User> getAllUserById(int id) {
        List<User> ds = new ArrayList<>();
        String query = "SELECT * FROM User WHERE project_id = ?";

        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int userid = resultSet.getInt("id");
                String fullName = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("pass");
                Role role = Role.fromValue(resultSet.getString("rolee"));

                // Tạo đối tượng User
                User user = new User(userid, fullName, email, password,role);
                ds.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ds;
    }


    public boolean login_admin(String email, String pass) {
        String sql = "SELECT * FROM User WHERE email = ? AND pass = ?";
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {


            preparedStatement.setString(1, email);
            preparedStatement.setString(2, pass);


            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi", e);
        }

        return false;
    }

    public boolean addUser(String mail, String fullname) {
        String sql = "INSERT INTO User (email, pass, full_name) VALUES (?, ?, ?)";

        String defaultPass = "123456";

        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, defaultPass);
            preparedStatement.setString(3, fullname);

            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi", e);
        }

        return false;
    }
}
