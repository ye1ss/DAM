-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 08-03-2023 a las 14:04:24
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tautor`
--

CREATE TABLE `tautor` (
  `nAutorid` int(11) NOT NULL,
  `cNombre` varchar(200) NOT NULL,
  `cApellidos` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tautor`
--

INSERT INTO `tautor` (`nAutorid`, `cNombre`, `cApellidos`) VALUES
(1, 'velazquez', 'mario'),
(2, 'palleco', 'suarez'),
(3, 'violin', 'cuerda'),
(4, 'flauta', 'viento'),
(5, 'luis', 'suarez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tautorpais`
--

CREATE TABLE `tautorpais` (
  `nAutorid` int(11) NOT NULL,
  `idpais` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tautorpais`
--

INSERT INTO `tautorpais` (`nAutorid`, `idpais`) VALUES
(1, 4),
(2, 1),
(2, 3),
(5, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teditorial`
--

CREATE TABLE `teditorial` (
  `nEditorialid` int(11) NOT NULL,
  `cNombre` varchar(100) NOT NULL,
  `idpais` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `teditorial`
--

INSERT INTO `teditorial` (`nEditorialid`, `cNombre`, `idpais`) VALUES
(1, 'florenzi', 3),
(2, 'valor', 1),
(3, 'hamburgo', 2),
(4, 'milanesa', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tejemplar`
--

CREATE TABLE `tejemplar` (
  `csignatura` int(11) NOT NULL,
  `nlibroid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tlibro`
--

CREATE TABLE `tlibro` (
  `nlibroid` int(11) NOT NULL,
  `ctitulo` varchar(100) NOT NULL,
  `nanyopublicacion` int(4) DEFAULT NULL,
  `nEditorialid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tlibro`
--

INSERT INTO `tlibro` (`nlibroid`, `ctitulo`, `nanyopublicacion`, `nEditorialid`) VALUES
(1, 'caperucita roja', 1980, 2),
(2, 'blancanieves', 2000, 1),
(3, 'chinatown', 2010, 2),
(4, 'blackberry', NULL, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tlibroautor`
--

CREATE TABLE `tlibroautor` (
  `nlibroid` int(11) NOT NULL,
  `nAutorid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tlibrotema`
--

CREATE TABLE `tlibrotema` (
  `nlibroid` int(11) NOT NULL,
  `ntemaid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tlibrotema`
--

INSERT INTO `tlibrotema` (`nlibroid`, `ntemaid`) VALUES
(1, 2),
(1, 3),
(1, 5),
(2, 2),
(2, 6),
(4, 1),
(4, 2),
(4, 4),
(4, 5),
(4, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tpais`
--

CREATE TABLE `tpais` (
  `idpais` int(11) NOT NULL,
  `cnombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tpais`
--

INSERT INTO `tpais` (`idpais`, `cnombre`) VALUES
(1, 'españa'),
(2, 'alemania'),
(3, 'francia'),
(4, 'reino unido'),
(5, 'argentina'),
(6, 'china');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tprestamo`
--

CREATE TABLE `tprestamo` (
  `csignatura` int(11) NOT NULL,
  `cnif` int(11) NOT NULL,
  `dprestamo` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tsocio`
--

CREATE TABLE `tsocio` (
  `cnif` int(11) NOT NULL,
  `cnombre` varchar(50) NOT NULL,
  `capellido` varchar(100) NOT NULL,
  `cdireccion` varchar(200) DEFAULT NULL,
  `ctelefono` int(9) NOT NULL,
  `dnacimiento` date NOT NULL,
  `dalta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ttema`
--

CREATE TABLE `ttema` (
  `ntemaid` int(11) NOT NULL,
  `cNombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ttema`
--

INSERT INTO `ttema` (`ntemaid`, `cNombre`) VALUES
(1, 'miedo'),
(2, 'adventura'),
(3, 'accion'),
(4, 'comedia'),
(5, 'ciencia ficcion'),
(6, 'thriller');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tautor`
--
ALTER TABLE `tautor`
  ADD PRIMARY KEY (`nAutorid`);

--
-- Indices de la tabla `tautorpais`
--
ALTER TABLE `tautorpais`
  ADD PRIMARY KEY (`nAutorid`,`idpais`),
  ADD KEY `idpais` (`idpais`);

--
-- Indices de la tabla `teditorial`
--
ALTER TABLE `teditorial`
  ADD PRIMARY KEY (`nEditorialid`),
  ADD KEY `idpais` (`idpais`);

--
-- Indices de la tabla `tejemplar`
--
ALTER TABLE `tejemplar`
  ADD PRIMARY KEY (`csignatura`),
  ADD KEY `nlibroid` (`nlibroid`);

--
-- Indices de la tabla `tlibro`
--
ALTER TABLE `tlibro`
  ADD PRIMARY KEY (`nlibroid`),
  ADD KEY `nEditorialid` (`nEditorialid`);

--
-- Indices de la tabla `tlibroautor`
--
ALTER TABLE `tlibroautor`
  ADD PRIMARY KEY (`nlibroid`,`nAutorid`),
  ADD KEY `nAutorid` (`nAutorid`);

--
-- Indices de la tabla `tlibrotema`
--
ALTER TABLE `tlibrotema`
  ADD PRIMARY KEY (`nlibroid`,`ntemaid`),
  ADD KEY `ntemaid` (`ntemaid`);

--
-- Indices de la tabla `tpais`
--
ALTER TABLE `tpais`
  ADD PRIMARY KEY (`idpais`);

--
-- Indices de la tabla `tprestamo`
--
ALTER TABLE `tprestamo`
  ADD PRIMARY KEY (`csignatura`,`cnif`,`dprestamo`),
  ADD KEY `cnif` (`cnif`);

--
-- Indices de la tabla `tsocio`
--
ALTER TABLE `tsocio`
  ADD PRIMARY KEY (`cnif`);

--
-- Indices de la tabla `ttema`
--
ALTER TABLE `ttema`
  ADD PRIMARY KEY (`ntemaid`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tautor`
--
ALTER TABLE `tautor`
  MODIFY `nAutorid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `teditorial`
--
ALTER TABLE `teditorial`
  MODIFY `nEditorialid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tejemplar`
--
ALTER TABLE `tejemplar`
  MODIFY `csignatura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tlibro`
--
ALTER TABLE `tlibro`
  MODIFY `nlibroid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tpais`
--
ALTER TABLE `tpais`
  MODIFY `idpais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tsocio`
--
ALTER TABLE `tsocio`
  MODIFY `cnif` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ttema`
--
ALTER TABLE `ttema`
  MODIFY `ntemaid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tautorpais`
--
ALTER TABLE `tautorpais`
  ADD CONSTRAINT `tautorpais_ibfk_1` FOREIGN KEY (`nAutorid`) REFERENCES `tautor` (`nAutorid`),
  ADD CONSTRAINT `tautorpais_ibfk_2` FOREIGN KEY (`idpais`) REFERENCES `tpais` (`idpais`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `teditorial`
--
ALTER TABLE `teditorial`
  ADD CONSTRAINT `teditorial_ibfk_1` FOREIGN KEY (`idpais`) REFERENCES `tpais` (`idpais`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `tejemplar`
--
ALTER TABLE `tejemplar`
  ADD CONSTRAINT `tejemplar_ibfk_1` FOREIGN KEY (`nlibroid`) REFERENCES `tlibro` (`nlibroid`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `tlibro`
--
ALTER TABLE `tlibro`
  ADD CONSTRAINT `tlibro_ibfk_1` FOREIGN KEY (`nEditorialid`) REFERENCES `teditorial` (`nEditorialid`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `tlibroautor`
--
ALTER TABLE `tlibroautor`
  ADD CONSTRAINT `tlibroautor_ibfk_1` FOREIGN KEY (`nlibroid`) REFERENCES `tlibro` (`nlibroid`),
  ADD CONSTRAINT `tlibroautor_ibfk_2` FOREIGN KEY (`nAutorid`) REFERENCES `tautor` (`nAutorid`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `tlibrotema`
--
ALTER TABLE `tlibrotema`
  ADD CONSTRAINT `tlibrotema_ibfk_1` FOREIGN KEY (`nlibroid`) REFERENCES `tlibro` (`nlibroid`),
  ADD CONSTRAINT `tlibrotema_ibfk_2` FOREIGN KEY (`ntemaid`) REFERENCES `ttema` (`ntemaid`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `tprestamo`
--
ALTER TABLE `tprestamo`
  ADD CONSTRAINT `tprestamo_ibfk_1` FOREIGN KEY (`csignatura`) REFERENCES `tejemplar` (`csignatura`),
  ADD CONSTRAINT `tprestamo_ibfk_2` FOREIGN KEY (`cnif`) REFERENCES `tsocio` (`cnif`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
