DROP DATABASE IF EXISTS Exam;
CREATE DATABASE Exam;
USE Exam;

CREATE TABLE User(
	id 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	full_name 	VARCHAR(50) NOT NULL,
    email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    pass 	VARCHAR(50) NOT NULL,
    exp_in_year	TINYINT,
    pro_skill	VARCHAR(50),
    project_id 	TINYINT,
	role		ENUM('manager', 'employee', 'admin')
);

/*============================== INSERT DATABASE =======================================*/

INSERT INTO User (full_name, email, pass, exp_in_year, pro_skill, project_id, rolee)
VALUES
('Hoang Thi An', 'hoang.an@vti.com.vn', 'pass12345', 6, 'Java, Spring Framework', 1, 'manager'),
('Nguyen Van Binh', 'nguyen.binh@vti.com.vn', 'secure456', 2, 'HTML, CSS, JavaScript', 2, 'employee'),
('Pham Van Cuong', 'pham.cuong@vti.com.vn', 'mypassword789', 8, 'Python, Flask', 3, 'admin'),
('Tran Thi Dao', 'tran.dao@vti.com.vn', 'hello2023', 1, 'ReactJS, Redux', 1, 'employee'),
('Le Thi Hong', 'le.hong@vti.com.vn', 'password2022', NULL, 'DevOps, AWS', NULL, 'employee');
