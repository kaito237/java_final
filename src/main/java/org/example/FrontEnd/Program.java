package org.example.FrontEnd;

import org.example.BackEnd.Controller.UserController;
import org.example.BackEnd.Entity.User;
import org.example.BackEnd.Untils.ScannerUtils;

import java.util.List;
import java.util.Scanner;

public class Program {
    // tao scanner de nhap thong tin
    private static Scanner scanner = new Scanner(System.in);
    private static UserController userController = new UserController();


    // tra loi cau hoi
    public static void main(String[] args) {
        cau2();
        cau3();
        cau4();
    }

    public static void cau2()
    {
        System.out.println("Nhập vào id : ");
        int id = ScannerUtils.inputInt();
        System.out.println("ID     Full Name      Email                        PassWord           Role  ");
        List<User> ds =  userController.getAllUserById(id);
        for( int i = 0 ; i < ds.size(); i++)
        {
            User user = ds.get(i);
            System.out.println(user.toString());

        }
    }

    public static void cau3()
    {
        System.out.println("Nhâp Email : ");
        String email = ScannerUtils.inputEmail();
        System.out.println("Nhâp Pass : ");
        String pass = ScannerUtils.inputPassword();
        if(userController.login_admin(email,pass)==true)
        {
            System.out.println("Đăng nhập thành công ");
        }
        else
        {
            System.out.println("Đăng  nhập thất bại ");
        }
    }

    public static void cau4()
    {
        System.out.println("Nhập  email để thêm user  :");
        String mail = ScannerUtils.inputEmail();
        System.out.println("Nhập full name : ");
        String  fullname = ScannerUtils.inputFullName();
        if(userController.addUser(mail,fullname))
        {
            System.out.println("Thêm thành công");
        }
        else
        {
            System.out.println("Thêm thất bại ");
        }
    }


}

