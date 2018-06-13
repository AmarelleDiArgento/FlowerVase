-- -----------------------------------------------------
-- Procedimientos LotusProyect Tabla tipoEvaluacion
-- Insertar
-- -----------------------------------------------------

  
delimiter $$
create procedure tipoEvaluacionIn (in teNombre VARCHAR(50), in teNomenclatura VARCHAR(2))
begin
insert into tipoEvaluacion (nombre,nomenclatura) values (teNombre,teNomenclatura);
end $$
delimiter $$

-- -----------------------------------------------------
-- Modificar
-- -----------------------------------------------------

delimiter $$
create procedure tipoEvaluacionMo (in teId INT , in teNombre VARCHAR(50), in teNomenclatura VARCHAR(2))
begin
update tipoEvaluacion SET id=teId, nombre=teNombre, nomenclatura=teNomenclatura where id=teId;
end $$
delimiter $$

-- -----------------------------------------------------
-- Eliminar
-- -----------------------------------------------------

delimiter $$
create procedure tipoEvaluacionEl (in teId INT)
begin
delete from tipoEvaluacion where id=teId;
end $$
delimiter $$

-- -----------------------------------------------------
-- Listar todos
-- -----------------------------------------------------

delimiter $$
create procedure tipoEvaluacionLi ()
begin
select id,nombre,nomenclatura from tipoEvaluacion;
end $$
delimiter $$

-- -----------------------------------------------------
-- Consultar x id
-- -----------------------------------------------------

delimiter $$
create procedure tipoEvaluacionCo (in teId INT)
begin
select id,nombre,nomenclatura from tipoEvaluacion where id=teId;
end $$
delimiter $$


  codigo VARCHAR(7), in nombre VARCHAR(60), in usuario VARCHAR(15), in password VARCHAR(255), avatar VARCHAR(255), estado TINYINT

-- -----------------------------------------------------
-- Procedimientos LotusProyect Tabla Usuario
-- Insertar
-- -----------------------------------------------------

  
delimiter $$
create procedure UsuarioIn (in teNombre VARCHAR(50), in teNomenclatura VARCHAR(2))
begin
insert into Usuario (nombre,nomenclatura) values (teNombre,teNomenclatura);
end $$
delimiter $$

-- -----------------------------------------------------
-- Modificar
-- -----------------------------------------------------

delimiter $$
create procedure UsuarioMo (in teId INT , in teNombre VARCHAR(50), in teNomenclatura VARCHAR(2))
begin
update tipoEvaluacion SET id=teId, nombre=teNombre, nomenclatura=teNomenclatura where id=teId;
end $$
delimiter $$

-- -----------------------------------------------------
-- Eliminar
-- -----------------------------------------------------

delimiter $$
create procedure UsuarioEl (in teId INT)
begin
delete from tipoEvaluacion where id=teId;
end $$
delimiter $$

-- -----------------------------------------------------
-- Listar todos
-- -----------------------------------------------------

delimiter $$
create procedure tipoEvaluacionLi ()
begin
select id,nombre,nomenclatura from tipoEvaluacion;
end $$
delimiter $$

-- -----------------------------------------------------
-- Consultar x id
-- -----------------------------------------------------

delimiter $$
create procedure tipoEvaluacionCo (in teId INT)
begin
select id,nombre,nomenclatura from tipoEvaluacion where id=teId;
end $$
delimiter $$
