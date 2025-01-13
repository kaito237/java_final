package org.example.BackEnd.Entity;

public enum Role{
        MANAGER("manager"),
        EMPLOYEE("employee"),
        ADMIN("admin");

        private final String value;  //

        // Constructor để khởi tạo value cho từng vai trò
        Role(String value) {
            this.value = value;
        }

        // Getter để lấy giá trị của vai trò
        public String getValue() {
            return value;
        }

        // Phương thức static giúp chuyển đổi từ chuỗi (String) thành một giá trị enum.
        public static Role fromValue(String value) {
            for (Role role : Role.values()) {
                if (role.value.equalsIgnoreCase(value)) {
                    return role;
                }
            }
            throw new IllegalArgumentException("Unknown role: " + value);
        }
    }

