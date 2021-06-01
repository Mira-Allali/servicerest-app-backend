-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Server: 127.0.0.1
-- Server version: 10.4.6-MariaDB
-- PHP version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- DATA BASE : `info`
--

-- --------------------------------------------------------

--
-- Creation of table`person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Insert data into table `person`
--

INSERT INTO `person` (`id`, `firstname`, `lastname`) VALUES
(76, 'Mira', 'ALLALI');

-- --------------------------------------------------------

--
-- Creation of table `provider`
--

CREATE TABLE `provider` (
  `idprovider` int(11) NOT NULL,
  `provider` varchar(50) NOT NULL,
  `ruc` varchar(50) NOT NULL,
  `direction` varchar(90) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `status` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Insert data in table `provider`
--

INSERT INTO `provider` (`idprovider`, `provider`, `ruc`, `direction`, `tel`, `status`) VALUES
(1, 'uuuuu uuuu uuuuu', '12345678', 'xxxxxxxxxx', '23444444', '3');

--
-- Índices of tables
--

--
-- Indices of table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Indices of table `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`idprovider`);

--
-- AUTO_INCREMENTATION
--

--
-- AUTO_INCREMENT in table `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT in table `provider`
--
ALTER TABLE `provider`
  MODIFY `idprovider` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
