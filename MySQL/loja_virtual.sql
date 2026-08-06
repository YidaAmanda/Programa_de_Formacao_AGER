drop schema if exists loja_virtual;
create schema loja_virtual;
use loja_virtual;

create table Categoria(
	id int auto_increment primary key,
    nome varchar(50) not null
)engine = InnoDB;

insert into Categoria (nome) values
('Eletrônico'),
('Eletrodoméstico'),
('Móvel');

create table Produto(
	id int auto_increment primary key,
    nome varchar(50) not null,
    descricao varchar(255),
    categoria_id int,
    constraint fk_categoria foreign key(categoria_id) references Categoria(id)
)engine = InnoDB;

insert into Produto (nome, descricao, categoria_id) values
('Notebook', 'Samsumg', 1),
('Tablet', 'iPhone', 1),
('Teclado', 'Redragon', 1),
('Geladeira', 'Eletrolux', 2),
('Micro-ondas', 'Philco', 2),
('Freezer', 'Consul', 2),
('Fogão', 'Brastemp', 2),
('Cama', 'Emma', 3),
('Colchão', 'Luuna', 3);

SELECT c.id, c.nome, p.id, p.nome, p.descricao FROM Categoria c INNER JOIN Produto p ON c.id = p.categoria_id;

show processlist;