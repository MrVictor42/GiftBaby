CREATE DATABASE IF NOT EXISTS giftbaby;
USE giftbaby;

CREATE TABLE  IF NOT EXISTS Admin (
	nome VARCHAR(42) NOT NULL,
	endereco VARCHAR(42) NOT NULL,
	email VARCHAR(10) NOT NULL,
	telefone VARCHAR(14) NOT NULL ,
	senha VARCHAR(8) NOT NULL
);

CREATE TABLE IF NOT EXISTS Responsible (
	idResponsible INT UNSIGNED PRIMARY KEY NOT NULL auto_increment,
	passoword VARCHAR(10) ,
	name VARCHAR(42),
	dateOfBirth VARCHAR(10),
	registration VARCHAR(10),
	cpf VARCHAR(15),
FOREIGN KEY (registration) REFERENCES Student(registration)
)

