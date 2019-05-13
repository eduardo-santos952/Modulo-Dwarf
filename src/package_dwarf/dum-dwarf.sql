-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Maio-2019 às 10:16
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dwarf`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_ferramenta`
--

CREATE TABLE `tb_ferramenta` (
  `ID` int(11) NOT NULL,
  `tb_nome` char(255) NOT NULL,
  `tb_quantidade` int(11) NOT NULL,
  `tb_peso` int(255) NOT NULL,
  `tb_dano` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_ferramenta`
--

INSERT INTO `tb_ferramenta` (`ID`, `tb_nome`, `tb_quantidade`, `tb_peso`, `tb_dano`) VALUES
(4, 'Martelo Flamejante', 7, 15, 35),
(5, 'Martelo Flamejante', 5, 15, 35),
(6, 'Martelo Flamejante', 4, 15, 35),
(7, 'Berrante Temeriano', 3, 10, 15),
(8, 'Laço Divino', 4, 1, 5),
(9, 'Martelo Flamejante', 5, 15, 35),
(10, 'Martelo Flamejante', 5, 15, 35),
(11, 'Martelo Flamejante', 4, 15, 35);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_ferramenta`
--
ALTER TABLE `tb_ferramenta`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_ferramenta`
--
ALTER TABLE `tb_ferramenta`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
