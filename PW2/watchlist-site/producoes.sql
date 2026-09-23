-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23/09/2026 às 06:20
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `watchlist`
--

CREATE DATABASE IF NOT EXISTS `watchlist` DEFAULT CHARACTER SET utf8mb4;
USE `watchlist`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `producoes`
--

CREATE TABLE `producoes` (
  `id` int(11) NOT NULL,
  `titulo` varchar(150) NOT NULL,
  `tipo` enum('Filme','Série') NOT NULL DEFAULT 'Filme',
  `plataforma` varchar(50) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `nota_pessoal` decimal(3,1) DEFAULT NULL,
  `status` enum('assistido','assistindo','quero_ver') NOT NULL DEFAULT 'quero_ver',
  `capa` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `producoes`
--

INSERT INTO `producoes` (`id`, `titulo`, `tipo`, `plataforma`, `genero`, `nota_pessoal`, `status`, `capa`) VALUES
(1, 'Breaking Bad', 'Série', 'Netflix', 'Drama', NULL, 'quero_ver', 'capa_6ab33b67af358.jpg'),
(2, 'Dark', 'Série', 'Netflix', 'Thriller', 10.0, 'assistido', 'capa_6ab33aa3317ef.webp'),
(3, 'The Office', 'Série', 'Netflix', 'Sitcom', NULL, 'assistindo', 'capa_6ab3468e36537.webp'),
(4, 'Duna: Parte 2', 'Filme', 'Prime Video', 'Ficção Científica/Aventura', NULL, 'quero_ver', 'capa_6ab35179707ff.jpg');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `producoes`
--
ALTER TABLE `producoes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `producoes`
--
ALTER TABLE `producoes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
