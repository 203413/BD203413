
DROP TABLE IF EXISTS Mascota;

CREATE TABLE Mascota (
    idMascota int PRIMARY KEY NOT NULL ,
    tipo varchar(50) DEFAULT NULL,
    caracterizticas varchar(50) DEFAULT NULL,
    idDuenio int DEFAULT NULL,
    nombre varchar(50) DEFAULT NULL,
    primerServicio varchar(50) DEFAULT NULL
);

INSERT INTO Mascota(idMascota, Tipo, Caracterizticas, idDuenio, Nombre, primerServicio) VALUES (1,'perro','Color Cafe',1,'Sparky','05 mayo 2020');
INSERT INTO Mascota(idMascota, Tipo, Caracterizticas, idDuenio, Nombre, primerServicio) VALUES (2,'perro','Color gris',2,'Zeus','20 febrero 2020');
INSERT INTO Mascota(idMascota, Tipo, Caracterizticas, idDuenio, Nombre, primerServicio) VALUES (3,'gato','Color blanco con negro',2,'Luna','30 marzo 2020');

DROP TABLE IF EXISTS Medicamento;

CREATE TABLE Medicamento (
    Codigo int PRIMARY KEY NOT NULL ,
    Nombre varchar(50) NOT NULL,
    Sustancia varchar(50) DEFAULT NULL,
    Caducidad varchar (50) DEFAULT NULL
);

INSERT INTO Medicamento (Codigo, Nombre, Sustancia, Caducidad) values (23,'Paracetamol','Paracetamol','20 octubre 2022');
INSERT INTO Medicamento (Codigo, Nombre, Sustancia, Caducidad) values (11,'Eutanax','Pentobarbital','15 septiembre 2024');
INSERT INTO Medicamento (Codigo, Nombre, Sustancia, Caducidad) values (43,'Nexgard','Ofoxolander','01 enero 2023');







DROP TABLE IF EXISTS Duenio;



CREATE TABLE Duenio (
    idDuenio int PRIMARY KEY NOT NULL,
    Nombre varchar(50) NOT NULL,
    Direccion varchar(50) DEFAULT NULL,
    Telefono int DEFAULT NULL
);

INSERT INTO Duenio(idDuenio, Nombre, Direccion, Telefono) VALUES  (1, 'Roberto Antonio Citarrosa', 'Calle 3 colonia Mariposas', 123);
INSERT INTO Duenio(idDuenio, Nombre, Direccion, Telefono) VALUES  (2, 'Silvia Derbez Gonzales', 'Calle N fraccionamiento Rios', 534);
INSERT INTO Duenio(idDuenio, Nombre, Direccion, Telefono) VALUES  (3, 'Pedro Fernandez Medina', 'Calle 29 colonia Versalles', 512);






DROP table if exists Cita;

CREATE TABLE Cita(
    idCita int PRIMARY KEY NOT NULL  ,
    idMascota int NOT NULL ,
    Fecha varchar(50) DEFAULT NULL,
    Hora varchar(50) DEFAULT NULL,
    Servicio varchar(50) DEFAULT NULL
);

INSERT INTO Cita(idCita,idMascota,Fecha,Hora,Servicio) VALUES (1,1,'29 octubre 2021','17:00','Consulta');
INSERT INTO Cita(idCita,idMascota,Fecha,Hora,Servicio) VALUES (2,2,'1 noviembre 2021','13:00','Operacion');
INSERT INTO Cita(idCita,idMascota,Fecha,Hora,Servicio) VALUES (3,2,'30 noviembre 2021','10:00','Corte de pelo');
