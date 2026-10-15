-- ==========================================================
-- BASE DE DATOS: Asistente HelpDesk
-- Compatible con MySQL Workbench / MySQL Server
-- ==========================================================

CREATE DATABASE IF NOT EXISTS helpdesk_hospital CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE helpdesk_hospital;

-- Eliminar tablas previas si existen (respetando dependencias)
DROP TABLE IF EXISTS incidencia;
DROP TABLE IF EXISTS estado;
DROP TABLE IF EXISTS categoria;
DROP TABLE IF EXISTS tecnico;
DROP TABLE IF EXISTS usuario;

-- 1. TABLA: usuario
CREATE TABLE usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 2. TABLA: tecnico
CREATE TABLE tecnico (
    id_tecnico INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 3. TABLA: categoria
CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 4. TABLA: estado
CREATE TABLE estado (
    id_estado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 5. TABLA: incidencia
CREATE TABLE incidencia (
    id_incidencia INT AUTO_INCREMENT PRIMARY KEY,
    ticket VARCHAR(20) NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    prioridad VARCHAR(50) NOT NULL,
    usuario_id INT NOT NULL,
    tecnico_id INT NULL,
    categoria_id INT NOT NULL,
    estado_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id_usuario) ON DELETE CASCADE,
    FOREIGN KEY (tecnico_id) REFERENCES tecnico(id_tecnico) ON DELETE SET NULL,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id_categoria) ON DELETE CASCADE,
    FOREIGN KEY (estado_id) REFERENCES estado(id_estado) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ==========================================================
-- DATOS INICIALES (Correspondientes al reporte del sistema)
-- ==========================================================

-- Estados
INSERT INTO estado (id_estado, nombre) VALUES
(1, 'Pendiente'),
(2, 'Asignada'),
(3, 'En Proceso'),
(4, 'Resuelta');

-- Categorías
INSERT INTO categoria (id_categoria, nombre) VALUES
(1, 'Hardware'),
(2, 'Software Hospitalario'),
(3, 'Red'),
(4, 'Impresoras'),
(5, 'Correo Institucional'),
(6, 'Base de Datos'),
(7, 'Equipos Biomédicos'),
(8, 'Sistema HIS');

-- Usuarios
INSERT INTO usuario (id_usuario, nombres, apellidos) VALUES
(1, 'Ana', 'Rojas'),
(2, 'Sandra', 'Flores'),
(3, 'Miguel', 'Pérez'),
(4, 'Carla', 'Mamani'),
(5, 'Diego', 'Vargas'),
(6, 'José', 'López');

-- Técnicos
INSERT INTO tecnico (id_tecnico, nombres, apellidos) VALUES
(1, 'María', 'Gutiérrez'),
(2, 'Carlos', 'Mendoza'),
(3, 'Luis', 'Fernández'),
(4, 'Patricia', 'Suárez'),
(5, 'Jorge', 'Rivera');

-- Incidencias (Exactamente como en el reporte HelpDesk del PDF)
INSERT INTO incidencia (ticket, fecha, hora, titulo, prioridad, usuario_id, tecnico_id, categoria_id, estado_id) VALUES
('HSP-0001', '2026-07-20', '08:15:00', 'El sistema HIS no inicia', 'Alta', 1, 1, 8, 4),
('HSP-0002', '2026-07-27', '08:40:00', 'Impresora de laboratorio sin conexión', 'Media', 2, 2, 4, 1),
('HSP-0003', '2026-07-27', '09:20:00', 'Sin acceso a Internet', 'Alta', 3, 3, 3, 3),
('HSP-0004', '2026-07-27', '10:00:00', 'Error en base de datos', 'Critica', 3, 4, 6, 2),
('HSP-0005', '2026-07-27', '10:30:00', 'Monitor del ECG sin imagen', 'Critica', 1, 5, 7, 3),
('HSP-0006', '2026-07-27', '11:10:00', 'No funciona el correo institucional', 'Media', 4, 1, 5, 2),
('HSP-0007', '2026-07-27', '12:00:00', 'Computadora muy lenta', 'Media', 5, 2, 1, 1),
('HSP-0008', '2026-07-27', '13:40:00', 'No imprime recetas', 'Alta', 5, 2, 4, 2),
('HSP-0009', '2026-07-27', '14:15:00', 'Error al registrar pacientes', 'Alta', 4, 1, 2, 3),
('HSP-0010', '2026-07-27', '15:20:00', 'Equipo de Rayos X sin comunicación', 'Critica', 6, 5, 7, 1);
