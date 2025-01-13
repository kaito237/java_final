package org.example.FrontEnd;

import org.example.BackEnd.Controller.UserController;
import org.example.BackEnd.Entity.User;
import org.example.BackEnd.Untils.ScannerUtils;

import java.util.List;
import java.util.Scanner;

public class Program {
    // Khởi tạo Scanner và UserController
    private static final UserController userController = new UserController();

    public static void main(String[] args) {
        cau2();
        cau3();
        cau4();
    }

    // Câu 2: Lấy thông tin user theo ID
    public static void cau2() {
        System.out.println("Nhập vào ID: ");
        int id = ScannerUtils.inputInt();
        System.out.println("ID     Full Name      Email                        PassWord           Role");
        List<User> ds = userController.getAllUserById(id);

        // Kiểm tra nếu ds rỗng hoặc null
        if (ds == null || ds.isEmpty()) {
            System.out.println("Không tìm thấy người dùng với ID: " + id);
        } else {
            for (User user : ds) {
                System.out.println(user.toString());
            }
        }
    }

    // Câu 3: Đăng nhập admin
    public static void cau3() {
        System.out.println("Nhập Email: ");
        String email = ScannerUtils.inputEmail();
        System.out.println("Nhập Pass: ");
        String pass = ScannerUtils.inputPassword();

        // Kiểm tra đăng nhập
        if (userController.login_admin(email, pass)) {
            System.out.println("Đăng nhập thành công.");
        } else {
            System.out.println("Đăng nhập thất bại.");
        }
    }

    // Câu 4: Thêm người dùng mới
    public static void cau4() {
        System.out.println("Nhập Email để thêm user: ");
        String mail = ScannerUtils.inputEmail();
        System.out.println("Nhập Full Name: ");
        String fullname = ScannerUtils.inputFullName();

        // Thêm user mới
        if (userController.addUser(mail, fullname)) {
            System.out.println("Thêm thành công!");
        } else {
            System.out.println("Thêm thất bại.");
        }
    }


}

