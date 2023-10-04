CREATE DATABASE `aluno` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `professor` (
  `cpf` decimal(11,0) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `nascimento` date DEFAULT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `email` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `cpf` decimal(11,0) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cpfProfessor_idx` (`cpf`),
  CONSTRAINT `cpfProfessor` FOREIGN KEY (`cpf`) REFERENCES `professor` (`cpf`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;







-- comandos variados mostrados na aula


use aluno;

select * from professor;

insert into professor values (100, 'Adinei', null);


UPDATE `aluno`.`professor` SET `nascimento` = '1980-01-20' WHERE (`cpf` = '100');

update professor set nascimento = '1980-01-21' where cpf = 100;

select now();


INSERT INTO `aluno`.`professor` (`cpf`, `nome`, `nascimento`) VALUES ('200', 'Lili', '2008-01-25');

select * from email;

insert into email (email, cpf) values ('prof@uni.com', 100);

select cpf from professor where nome like 'Li%'

select email from email where cpf = 200

select p.nome, email.email from professor tb_pacientep join email on p.cpf = email.cpf








