CREATE TABLE cliente(
    id INT AUTO_INCREMENT  PRIMARY KEY,
    nombre varchar(50),
    apellido varchar(50),
    edad integer,
    fecha_nacimiento date
);

INSERT INTO cliente (nombre, apellido, edad, fecha_nacimiento) VALUES
  ('Martin', 'Champarini', 36, PARSEDATETIME('20-11-1984', 'dd-MM-yyyy'))
;