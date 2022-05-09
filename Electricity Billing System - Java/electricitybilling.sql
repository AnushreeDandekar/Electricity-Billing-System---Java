-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2020 at 07:21 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electricitybilling`
--

-- --------------------------------------------------------

--
-- Table structure for table `commercial`
--

CREATE TABLE `commercial` (
  `ID` int(2) NOT NULL,
  `company_name` varchar(20) NOT NULL,
  `owner_name` varchar(20) NOT NULL,
  `comp_number` varchar(10) NOT NULL,
  `owner_number` varchar(10) NOT NULL,
  `meter_number` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `units` varchar(10) DEFAULT NULL,
  `month` varchar(20) DEFAULT NULL,
  `amount` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `commercial`
--

INSERT INTO `commercial` (`ID`, `company_name`, `owner_name`, `comp_number`, `owner_number`, `meter_number`, `email`, `city`, `units`, `month`, `amount`) VALUES
(1, 'OpenTech', 'Raghav Sahgal', '23445432', '9898767898', 'MC101', 'opentech@gmail.com', 'Mumbai', '555', 'august', '6105.0'),
(2, 'TreeQuote', 'Esha Murthy', '24567898', '8987898767', 'MC102', 'quote@gmail.com', 'Pune', '444', 'march', '4884.0'),
(7, 'CodeHow', 'Ahana Sathe', '23456543', '9890987876', 'MC103', 'code@gmail.com', 'delhi', NULL, NULL, NULL),
(8, 'Streethex', 'mihir tagore', '24567654', '9098909876', 'MC104', 'street@123', 'kolkata', NULL, NULL, NULL),
(10, 'Newex', 'Falguni Chopra', '23456789', '9890987654', 'MC105', 'new@gmail.com', 'Patna', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE `profile` (
  `u_usernameID` int(3) NOT NULL,
  `fn` varchar(50) NOT NULL,
  `ln` varchar(50) NOT NULL,
  `meter_no` varchar(10) NOT NULL,
  `phone_no` varchar(10) NOT NULL,
  `city` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `Res_Units` varchar(20) DEFAULT NULL,
  `Month` varchar(20) DEFAULT NULL,
  `Amount` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `profile`
--

INSERT INTO `profile` (`u_usernameID`, `fn`, `ln`, `meter_no`, `phone_no`, `city`, `email`, `Res_Units`, `Month`, `Amount`) VALUES
(1, 'Aarav', 'Batra', 'M101', '9856748596', 'panji', 'aarav@gmail.com', '555', 'july', '6105.0'),
(2, 'Sanika', 'Chavan', 'M102', '9857648965', 'pune', 'sanika.248@gmail.com', '699', 'july', '7689.0'),
(3, 'Aarohi', 'Desai', 'M103', '8697584895', 'patna', 'aarohid@gmail.com', '555', 'july', '6105.0'),
(4, 'Tanvi', 'Gupta', 'M104', '921478596', 'banglore', 'tanvigore@gmail.com', '555', 'gggg', '6105.0'),
(5, 'Rahul', 'Singh', 'M105', '9857996584', 'kolkata', 'rahul395@gmail.com', '500', 'july', '5500.0'),
(6, 'Gita', 'Shah', 'M101', '8909878909', 'surat', 'g@gmail.com', '555', 'july', '6105.0'),
(10, 'Pallavi', 'patil', 'M107', '8789876787', 'Delhi', 'pp@gmail.com', '555', 'june', '6105.0'),
(11, 'Gaurav', 'joshi', 'M108', '7878987654', 'gj@gmail.com', 'kolkata', '444', 'January', '4884.0'),
(17, 'Janvi', 'patil', 'M109', '9890987654', 'patil@gmail.com', 'darjeeling', NULL, NULL, NULL),
(18, 'Nischay', 'Malhan', 'M110', '8989098765', 'nischay@gmail.com', 'Delhi', '555', 'july', '6105.0'),
(19, 'Geeta ', 'Singh', 'M111', '8989098765', 'GS@gmail.com', 'Patna', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `residential_reg2`
--

CREATE TABLE `residential_reg2` (
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `residential_reg2`
--

INSERT INTO `residential_reg2` (`u_username`, `u_password`) VALUES
('Aarav', 'Aarav@123'),
('Aarohi', 'Aarohi@456'),
('Dipti', 'DiptiJ@0701'),
('Gaurav', 'Gau.Chitnis@56'),
('Aarohi', 'Aarohi@03'),
('Rahul', 'Rahul@0234'),
('sakshi', 'sakshi@345'),
('OpenTech', 'OpenTech@25'),
('janvi', 'janvi@123'),
('nischay', 'nischay@14'),
('sarah', 'sarah@12345'),
('', ''),
('codehow', 'code@123'),
('stark', 'stark@123'),
('streethex', 'streethex@123'),
('streethex', 'streethex@123'),
('Geeta', 'Geeta@123'),
('Newex', 'Newex@123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `commercial`
--
ALTER TABLE `commercial`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`u_usernameID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `commercial`
--
ALTER TABLE `commercial`
  MODIFY `ID` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `profile`
--
ALTER TABLE `profile`
  MODIFY `u_usernameID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
