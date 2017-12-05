CREATE SCHEMA IF NOT EXISTS `HuilesEssentielles` DEFAULT CHARACTER SET utf8 ;
USE `HuilesEssentielles` ;

DROP TABLE Pathologies_Huiles;
DROP TABLE Precautions_Huiles;
DROP TABLE Synergies_Huiles;
DROP TABLE Precautions;
DROP TABLE Synergies;
DROP TABLE Synonymes;
DROP TABLE Pathologies;
DROP TABLE Huiles;

-- -----------------------------------------------------
-- Table `Huiles`
-- -----------------------------------------------------
CREATE TABLE `Huiles` (
  `idHuile` INT NOT NULL,
  `numero` VARCHAR(255) NULL,
  `nom_commun` VARCHAR(255) NOT NULL,
  `nom_latin_genre` VARCHAR(255) NULL,
  `nom_latin_espece` VARCHAR(255) NULL,
  `estAAcheter` TINYINT(1) NOT NULL DEFAULT 0,
  `note` TEXT NULL,
  CONSTRAINT pk_huiles PRIMARY KEY (`idHuile`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pathologies`
-- -----------------------------------------------------
CREATE TABLE `Pathologies` (
  `idPathologie` INT NOT NULL  ,
  `nom` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  CONSTRAINT pk_pathologies PRIMARY KEY (`idPathologie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Synonymes`
-- -----------------------------------------------------
CREATE TABLE  `Synonymes` (
  `idSynonymes` INT NOT NULL ,
  `nom` VARCHAR(255) NOT NULL,
  `idPathologie` INT NOT NULL,
  CONSTRAINT pk_synonymes PRIMARY KEY (`idSynonymes`),
  INDEX `idx_idPathologies` (`idPathologie` ASC),
  CONSTRAINT fk_synonymes_pathologies
    FOREIGN KEY (`idPathologie`)
    REFERENCES `Pathologies` (`idPathologie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Synergies`
-- -----------------------------------------------------
CREATE TABLE `Synergies` (
  `idSynergie` INT NOT NULL ,
  `nom` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  CONSTRAINT pk_synergies PRIMARY KEY (`idSynergie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Precautions`
-- -----------------------------------------------------
CREATE TABLE `Precautions` (
  `idPrecaution` INT NOT NULL ,
  `libelle` VARCHAR(255) NOT NULL,
  CONSTRAINT pk_precautions PRIMARY KEY (`idPrecaution`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Synergies_Huiles`
-- -----------------------------------------------------
CREATE TABLE `Synergies_Huiles` (
  `idSynergie` INT NOT NULL,
  `idHuile` INT NOT NULL,
  CONSTRAINT pk_synergies_huiles PRIMARY KEY (`idSynergie`, `idHuile`),
  CONSTRAINT `fk_synergies_huiles_synergies`
    FOREIGN KEY (`idSynergie`)
    REFERENCES `Synergies` (`idSynergie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_synergies_huiles_huiles`
    FOREIGN KEY (`idHuile`)
    REFERENCES `Huiles` (`idHuile`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Precautions_Huiles`
-- -----------------------------------------------------
CREATE TABLE `Precautions_Huiles` (
  `idPrecaution` INT NOT NULL,
  `idHuile` INT NOT NULL,
  CONSTRAINT pk_precautions_huiles PRIMARY KEY (`idPrecaution`, `idHuile`),
  CONSTRAINT `fk_precautions_huiles_precautions`
    FOREIGN KEY (`idPrecaution`)
    REFERENCES `Precautions` (`idPrecaution`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_precautions_huiles_huiles`
    FOREIGN KEY (`idHuile`)
    REFERENCES `Huiles` (`idHuile`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pathologies_Huiles`
-- -----------------------------------------------------
CREATE TABLE `Pathologies_Huiles` (
  `idPathologie` INT NOT NULL,
  `idHuile` INT NOT NULL,
  CONSTRAINT pk_pathologies_huiles PRIMARY KEY (`idPathologie`, `idHuile`),
  CONSTRAINT `fk_pathologies_huiles_pathologies`
    FOREIGN KEY (`idPathologie`)
    REFERENCES `Pathologies` (`idPathologie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pathologies_huiles_huiles`
    FOREIGN KEY (`idHuile`)
    REFERENCES `Huiles` (`idHuile`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;