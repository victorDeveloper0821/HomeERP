drop table if exists Employee;

CREATE TABLE Employee (
  `empId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `empName` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'new one',
  `empTitle` int DEFAULT NULL,
  `userId` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'new',
  `password` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'passwd',
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists Titles;

CREATE TABLE Titles (
  `empTitle` int NOT NULL,
  `titleCode` varchar(5) NOT NULL,
  `titleName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `level` int DEFAULT NULL,
  PRIMARY KEY (`empTitle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;