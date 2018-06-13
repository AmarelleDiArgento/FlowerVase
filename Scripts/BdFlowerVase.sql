-- --------------------------------------------------------------------------------------------------------------------------------
-- Schema LotusProyect
-- CREATE USER 'lotusproyect'@'localhost' IDENTIFIED BY '1311138C72A04BB7D228AFB9D574ED2D00DFD264C67161A958AD62E32672DEFF';
-- GRANT ALL PRIVILEGES ON * . * TO 'lotusproyect'@'localhost';
-- FLUSH PRIVILEGES;
-- --------------------------------------------------------------------------------------------------------------------------------

-- -----------------------------------------------------
-- Schema FlowerVase
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS FlowerVase DEFAULT CHARACTER SET utf8 ;
USE FlowerVase ;
-- -----------------------------------------------------
-- Table FlowerVase.tipoEvaluacion
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.tipoEvaluacion (
  id Long NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL unique,
  nomenclatura VARCHAR(2) NOT NULL unique,
  PRIMARY KEY (id))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table FlowerVase.Usuario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.Usuario (
  codigo VARCHAR(7) NOT NULL,
  nombre VARCHAR(60) NOT NULL,
  usuario VARCHAR(15) NOT NULL,
  password VARCHAR(255) NULL,
  avatar VARCHAR(255) NULL,
  estado TINYINT NULL,
  PRIMARY KEY (codigo),
  UNIQUE INDEX id_UNIQUE (codigo ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.evaluacion
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.evaluacion (
  id VARCHAR(12) NOT NULL,
  nombre VARCHAR(60) NOT NULL,
  detalle MEDIUMTEXT NOT NULL,
  protocolo VARCHAR(45) NULL,
  tipoEnsayo_id INT NOT NULL,
  solicitante VARCHAR(60) NOT NULL,
  Usuario_codigo VARCHAR(7) NOT NULL,
  PRIMARY KEY (id, Usuario_codigo),
  UNIQUE INDEX id_UNIQUE (id ASC),
  INDEX fk_Ensayo_tipoEnsayo1_idx (tipoEnsayo_id ASC),
  INDEX fk_Ensayo_Usuario1_idx (Usuario_codigo ASC),
  CONSTRAINT fk_Ensayo_tipoEnsayo1
    FOREIGN KEY (tipoEnsayo_id)
    REFERENCES FlowerVase.tipoEvaluacion (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Ensayo_Usuario1
    FOREIGN KEY (Usuario_codigo)
    REFERENCES FlowerVase.Usuario (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.simulacion
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.simulacion (
  id INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  dias INT NULL,
  detalles MEDIUMTEXT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX nombre_UNIQUE (nombre ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.Etapa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.Etapa (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  Ensayo_id VARCHAR(12) NOT NULL,
  simulacion_id INT NOT NULL,
  fechaFlorero DATE NULL,
  fechaCorte DATE NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC),
  INDEX fk_Etapa_Ensayo_idx (Ensayo_id ASC),
  INDEX fk_Etapa_simulacion1_idx (simulacion_id ASC),
  CONSTRAINT fk_Etapa_Ensayo
    FOREIGN KEY (Ensayo_id)
    REFERENCES FlowerVase.evaluacion (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Etapa_simulacion1
    FOREIGN KEY (simulacion_id)
    REFERENCES FlowerVase.simulacion (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.tratamiento
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.tratamiento (
  id INT NOT NULL,
  nombre VARCHAR(60) NOT NULL,
  detalle MEDIUMTEXT NOT NULL,
  nomenclatura VARCHAR(5) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.producto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.producto (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  meta INT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.variedad
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.variedad (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  color VARCHAR(45) NOT NULL,
  producto_id INT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC),
  INDEX fk_variedad_producto1_idx (producto_id ASC),
  CONSTRAINT fk_variedad_producto1
    FOREIGN KEY (producto_id)
    REFERENCES FlowerVase.producto (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.tipoProveedor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.tipoProveedor (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.proveedor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.proveedor (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  bloque VARCHAR(6) NULL,
  tipoProveedor INT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC),
  INDEX fk_proveedor_tipoProveedor1_idx (tipoProveedor ASC),
  CONSTRAINT fk_proveedor_tipoProveedor1
    FOREIGN KEY (tipoProveedor)
    REFERENCES FlowerVase.tipoProveedor (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.causa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.causa (
  id INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  detalle VARCHAR(45) NOT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.partes
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.partes (
  id INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  detalle MEDIUMTEXT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.conformado
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.conformado (
  parId INT NOT NULL,
  proId INT NOT NULL,
  PRIMARY KEY (parId, proId),
  INDEX fk_partes_has_producto_producto1_idx (proId ASC),
  INDEX fk_partes_has_producto_partes1_idx (parId ASC),
  CONSTRAINT fk_partes_has_producto_partes1
    FOREIGN KEY (parId)
    REFERENCES FlowerVase.partes (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_partes_has_producto_producto1
    FOREIGN KEY (proId)
    REFERENCES FlowerVase.producto (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.ramo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.ramo (
  id INT NOT NULL AUTO_INCREMENT,
  EtaId INT NOT NULL,
  traId INT NOT NULL,
  observacion MEDIUMTEXT NULL,
  PRIMARY KEY (id, EtaId, traId),
  UNIQUE INDEX idramo_UNIQUE (id ASC),
  INDEX fk_ramo_Etapa1_idx (EtaId ASC),
  INDEX fk_ramo_tratamiento1_idx (traId ASC),
  CONSTRAINT fk_ramo_Etapa1
    FOREIGN KEY (EtaId)
    REFERENCES FlowerVase.Etapa (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ramo_tratamiento1
    FOREIGN KEY (traId)
    REFERENCES FlowerVase.tratamiento (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.lectura
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.lectura (
  id INT NOT NULL,
  ramId INT NOT NULL,
  numTallos INT NOT NULL,
  fecha DATE NOT NULL,
  PRIMARY KEY (id, ramId),
  INDEX fk_eliminacion_ramo1_idx (ramId ASC),
  CONSTRAINT fk_eliminacion_ramo1
    FOREIGN KEY (ramId)
    REFERENCES FlowerVase.ramo (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.evaluables
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.evaluables (
  id INT NOT NULL AUTO_INCREMENT,
  proId INT NOT NULL,
  varId INT NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_evaluables_proveedor1_idx (proId ASC),
  INDEX fk_evaluables_variedad1_idx (varId ASC),
  CONSTRAINT fk_evaluables_proveedor1
    FOREIGN KEY (proId)
    REFERENCES FlowerVase.proveedor (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_evaluables_variedad1
    FOREIGN KEY (varId)
    REFERENCES FlowerVase.variedad (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.afecta
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.afecta (
  id INT NOT NULL AUTO_INCREMENT,
  parId INT NOT NULL,
  cauId INT NOT NULL,
  PRIMARY KEY (id, parId, cauId),
  INDEX fk_afecta_partes1_idx (parId ASC),
  INDEX fk_afecta_causa1_idx (cauId ASC),
  CONSTRAINT fk_afecta_partes1
    FOREIGN KEY (parId)
    REFERENCES FlowerVase.partes (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_afecta_causa1
    FOREIGN KEY (cauId)
    REFERENCES FlowerVase.causa (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.areaAfectada
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.areaAfectada (
  lecId INT NOT NULL,
  afeId INT NOT NULL,
  PRIMARY KEY (lecId, afeId),
  INDEX fk_eliminacion_has_afecta_afecta1_idx (afeId ASC),
  INDEX fk_eliminacion_has_afecta_eliminacion1_idx (lecId ASC),
  CONSTRAINT fk_eliminacion_has_afecta_eliminacion1
    FOREIGN KEY (lecId)
    REFERENCES FlowerVase.lectura (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_eliminacion_has_afecta_afecta1
    FOREIGN KEY (afeId)
    REFERENCES FlowerVase.afecta (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.imagen
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.imagen (
  id INT NOT NULL AUTO_INCREMENT,
  lecId INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  url VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC),
  INDEX fk_imagen_eliminacion1_idx (lecId ASC),
  CONSTRAINT fk_imagen_eliminacion1
    FOREIGN KEY (lecId)
    REFERENCES FlowerVase.lectura (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.Rol
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.Rol (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  descripcion MEDIUMTEXT NOT NULL,
  estado TINYINT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX nombre_UNIQUE (nombre ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.asignaRol
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.asignaRol (
  rolId INT NOT NULL,
  usuCod VARCHAR(7) NOT NULL,
  PRIMARY KEY (rolId, usuCod),
  INDEX fk_Rol_has_Usuario_Usuario1_idx (usuCod ASC),
  INDEX fk_Rol_has_Usuario_Rol1_idx (rolId ASC),
  CONSTRAINT fk_Rol_has_Usuario_Rol1
    FOREIGN KEY (rolId)
    REFERENCES FlowerVase.Rol (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Rol_has_Usuario_Usuario1
    FOREIGN KEY (usuCod)
    REFERENCES FlowerVase.Usuario (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.permiso
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.permiso (
  id INT NOT NULL AUTO_INCREMENT,
  modulo VARCHAR(45) NOT NULL,
  permiso VARCHAR(45) NOT NULL,
  url VARCHAR(255) NOT NULL,
  estado TINYINT NOT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.asignaPer
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.asignaPer (
  rolId INT NOT NULL,
  perId INT NOT NULL,
  leer TINYINT NOT NULL,
  nuevo TINYINT NOT NULL,
  modificar TINYINT NOT NULL,
  eliminar TINYINT NOT NULL,
  PRIMARY KEY (rolId, perId),
  INDEX fk_Rol_has_permiso_permiso1_idx (perId ASC),
  INDEX fk_Rol_has_permiso_Rol1_idx (rolId ASC),
  CONSTRAINT fk_Rol_has_permiso_Rol1
    FOREIGN KEY (rolId)
    REFERENCES FlowerVase.Rol (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Rol_has_permiso_permiso1
    FOREIGN KEY (perId)
    REFERENCES FlowerVase.permiso (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.caracteristica
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.caracteristica (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  descripcion MEDIUMTEXT NOT NULL,
  unidad VARCHAR(45) NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC),
  UNIQUE INDEX nombre_UNIQUE (nombre ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.asignaCar
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.asignaCar (
  etaId INT NOT NULL,
  carId INT NOT NULL,
  PRIMARY KEY (etaId, carId),
  INDEX fk_Etapa_has_caracteristica_caracteristica1_idx (carId ASC),
  INDEX fk_Etapa_has_caracteristica_Etapa1_idx (etaId ASC),
  CONSTRAINT fk_Etapa_has_caracteristica_Etapa1
    FOREIGN KEY (etaId)
    REFERENCES FlowerVase.Etapa (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Etapa_has_caracteristica_caracteristica1
    FOREIGN KEY (carId)
    REFERENCES FlowerVase.caracteristica (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.adicionales
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.adicionales (
  carId INT NOT NULL,
  lecId INT NOT NULL,
  dato MEDIUMTEXT NOT NULL,
  PRIMARY KEY (carId, lecId),
  INDEX fk_caracteristica_has_lectura_lectura1_idx (lecId ASC),
  INDEX fk_caracteristica_has_lectura_caracteristica1_idx (carId ASC),
  CONSTRAINT fk_caracteristica_has_lectura_caracteristica1
    FOREIGN KEY (carId)
    REFERENCES FlowerVase.caracteristica (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_caracteristica_has_lectura_lectura1
    FOREIGN KEY (lecId)
    REFERENCES FlowerVase.lectura (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.asignaEva
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.asignaEva (
  ramId INT NOT NULL,
  evaId INT NOT NULL,
  tallos INT NOT NULL,
  PRIMARY KEY (ramId, evaId),
  INDEX fk_ramo_has_evaluables_evaluables1_idx (evaId ASC),
  INDEX fk_ramo_has_evaluables_ramo1_idx (ramId ASC),
  CONSTRAINT fk_ramo_has_evaluables_ramo1
    FOREIGN KEY (ramId)
    REFERENCES FlowerVase.ramo (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ramo_has_evaluables_evaluables1
    FOREIGN KEY (evaId)
    REFERENCES FlowerVase.evaluables (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.asignaTra
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.asignaTra (
  etaId INT NOT NULL,
  tratId INT NOT NULL,
  PRIMARY KEY (etaId, tratId),
  INDEX fk_Etapa_has_tratamiento_tratamiento1_idx (tratId ASC),
  INDEX fk_Etapa_has_tratamiento_Etapa1_idx (etaId ASC),
  CONSTRAINT fk_Etapa_has_tratamiento_Etapa1
    FOREIGN KEY (etaId)
    REFERENCES FlowerVase.Etapa (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Etapa_has_tratamiento_tratamiento1
    FOREIGN KEY (tratId)
    REFERENCES FlowerVase.tratamiento (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table FlowerVase.Notas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FlowerVase.Notas (
  id INT NOT NULL,
  tipo TINYINT NOT NULL,
  detalles LONGTEXT NOT NULL,
  etaId INT NULL,
  evaId VARCHAR(12) NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_Notas_Etapa1_idx (etaId ASC),
  INDEX fk_Notas_evaluacion1_idx (evaId ASC),
  CONSTRAINT fk_Notas_Etapa1
    FOREIGN KEY (etaId)
    REFERENCES FlowerVase.Etapa (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Notas_evaluacion1
    FOREIGN KEY (evaId)
    REFERENCES FlowerVase.evaluacion (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
