-- MySQL Script generated by MySQL Workbench
-- Thu Dec 12 20:25:54 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema amt_21
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `amt_21` ;

-- -----------------------------------------------------
-- Schema amt_21
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `amt_21` DEFAULT CHARACTER SET utf8 ;
USE `amt_21` ;

-- -----------------------------------------------------
-- Table `amt_21`.`user_entity`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `amt_21`.`user_entity` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `date` VARCHAR(45) NULL,
  PRIMARY KEY (`id`, `email`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `amt_21`.`trail_entity`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `amt_21`.`trail_entity` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `length` INT NOT NULL,
  `description` VARCHAR(200) NOT NULL,
  `date` VARCHAR(45) NOT NULL,
  `up_and_down` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `amt_21`.`registration_entity`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `amt_21`.`registration_entity` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_trail` INT NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_trail_idx` (`id_trail` ASC),
  INDEX `id_user_idx` (`id_user` ASC),
  CONSTRAINT `id_trail`
    FOREIGN KEY (`id_trail`)
    REFERENCES `amt_21`.`trail_entity` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `id_user`
    FOREIGN KEY (`id_user`)
    REFERENCES `amt_21`.`user_entity` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;