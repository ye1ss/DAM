create database if not exists Garaje;
use Garaje;

CREATE TABLE Coches (
    Numero_Coche INT PRIMARY KEY auto_increment,
    Marca VARCHAR(50),
    Modelo VARCHAR(50),
    Año INT
);

-- Inserción de datos en la tabla Coches
INSERT INTO Coches (Numero_Coche, Marca, Modelo, Año) VALUES
(1, 'Seat', 'Ibiza', 2007),
(2, 'Toyota', 'Corola', 1999),
(3, 'Volkswagen', 'Golf', 2011),
(4, 'Audi', 'A3', 2023),
(5, 'Mercedes', 'Carota', 2008),
(6, 'Renolt', 'Clio', 2020),
(7, 'Honda', 'Civic', 2007),
(8, 'Ford', 'Focus', 2022);

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
    Numero_Usuario INT PRIMARY KEY auto_increment,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    Fecha_Nacimiento DATE,
    Numero_Coche INT,
    FOREIGN KEY (Numero_Coche) REFERENCES Coches(Numero_Coche)
);

-- Inserción de datos en la tabla Usuarios
INSERT INTO Usuarios (Numero_Usuario, Nombre, Apellidos, Fecha_Nacimiento, Numero_Coche) VALUES
(10001, 'Alex', 'Perez Sanchez', '1943-08-28', 1),
(10002, 'Arvid', 'Sharma Garcia', '1954-08-28', 2),
(10003, 'Gonzalo', 'Piña', '2002-10-19', 3),
(10004, 'Rolando', 'Ureña', '1954-08-28', 4),
(10005, 'Natalia', 'Gaitan', '2003-09-25', 5),
(10006, 'Ana', 'Sbd', '2004-10-12', 6),
(10007, 'Eduar', 'Estarlin Sánchez', '2003-10-09', 7),
(10008, 'Andrei', 'Zaraga Sevilla', '2003-03-17', 8);

CREATE TABLE Plazas_Garaje (
	Numero_Plaza INT PRIMARY KEY auto_increment,
    Tipo_Plaza CHAR(20) CHECK (Tipo_Plaza IN ('libre', 'reservada', 'ocupada', 'desactivada', 'movilidad_reducida')),
    Numero_Coche INT,
    FOREIGN KEY (Numero_Coche) REFERENCES Coches (Numero_Coche)
);

-- Cambia 'disabled' a 'desactivada'
UPDATE Plazas_Garaje SET Tipo_Plaza = 'desactivada' WHERE Numero_Plaza IN (5, 6);

INSERT INTO Plazas_Garaje (Numero_Plaza, Tipo_Plaza, Numero_Coche)
VALUES
    (1, 'reservada', NULL),
    (2, 'libre', NULL),
    (3, 'ocupada', 5),
    (4, 'libre', NULL),
    (5, 'desactivada', NULL),
    (6, 'desactivada', NULL),
    (7, 'ocupada', 6),
    (8, 'ocupada', 3),
    (9, 'libre', NULL),
    (10, 'libre', NULL),
    (11, 'movilidad_reducida', NULL),
    (12, 'movilidad_reducida', NULL),
    (13, 'reservada', NULL),
    (14, 'libre', NULL),
    (15, 'ocupada', 7),
    (16, 'libre', NULL),
    (17, 'reservada', NULL),
    (18, 'ocupada', 4),
    (19, 'libre', NULL),
    (20, 'reservada', NULL);



