create database biblioteca;

use biblioteca;

CREATE TABLE usuario(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL
);

CREATE TABLE livro(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(200) NOT NULL
);

CREATE TABLE nota(
	id_usuario INT,
	id_livro INT,
	nota DECIMAL(4,2) NOT NULL,
 	PRIMARY KEY (id_usuario, id_livro),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
	FOREIGN KEY (id_livro) REFERENCES livro(id)
);

insert into usuario(nome) values ('Lili');
insert into usuario(nome) values ('Astrogildo');

insert into livro(nome) values ('Fundação');
insert into livro(nome) values ('Eu Robô');

insert into nota(id_usuario, id_livro, nota) values (1,1,8);
insert into nota(id_usuario, id_livro, nota) values (2,1,9);
insert into nota(id_usuario, id_livro, nota) values (1,2,10);

select nome, avg(nota)
    from livro l join nota n on l.id = n.id_livro 
    group by (n.id_livro);

