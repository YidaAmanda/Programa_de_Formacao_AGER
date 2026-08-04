DROP SCHEMA IF EXISTS Sucos;
CREATE SCHEMA IF NOT EXISTS Sucos DEFAULT CHARACTER SET utf8 ;
USE Sucos;

CREATE TABLE Cliente(
	cpf CHAR(11) PRIMARY KEY,
	nome VARCHAR(100),
    logradouro VARCHAR(150),
    bairro VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(50),
    cep VARCHAR(8),
    data_nascimento DATE,
    idade SMALLINT,
    sigla_sexo CHAR(1),
    limite_credito FLOAT,
    volume_compra FLOAT,
    primeira_compra BIT(1)
);

CREATE TABLE Vendedor(
	matricula CHAR(5) PRIMARY KEY,
    nome VARCHAR(100),
    percentual_comissao FLOAT,
    data_admissao DATE,
    ferias BIT
);

CREATE TABLE Produto(
	codigo VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(150),
    embalagem VARCHAR(50),
    tamanho VARCHAR(50),
    sabor VARCHAR(50),
    preco_lista FLOAT
);

-- ALTER TABLE Produto ADD PRIMARY KEY (codigo);
-- ALTER TABLE Cliente ADD COLUMN (DATA_NASCIMENTO DATE);

INSERT INTO Cliente(cpf, nome, logradouro, bairro, cidade, estado, cep, data_nascimento, idade,
sigla_sexo, limite_credito, volume_compra, primeira_compra) VALUES
  ('00388934505', 'João da Silva', 'Rua projetada A número 10', 'Vila Roman', 'CARATINGA', 
   'AMAZONAS', '2222222', '1989-10-05', 30, 'M', 10000.00, 2000, 0);

INSERT INTO Produto(codigo, nome, embalagem, tamanho, sabor, preco_lista) VALUES
  ('1040107', 'Light - 350 ml - Melância', 'Lata', '350 ml', 'Melância', 4.56),
  ('1037797', 'Clean - 2 Litros - Laranja', 'PET', '2 Litros', 'Laranja', 16.01),
  ('1000889', 'Sabor da Montanha - 700 ml - Uva', 'Garrafa', '700 ml', 'Uva', 6.31),
  ('1004327', 'Videira do Campo - 1,5 Litros - Melancia', 'PET', '1,5 Litros', 'Melancia', 19.51),
  
  ('544931', 'Frescor do Verão - 350 ml - Limão', 'PET', '350 ml','Limão',3.20),
  ('1078680', 'Frescor do Verão - 470 ml - Manga', 'Lata', '470 ml','Manga',5.18);
  
INSERT INTO Vendedor(matricula, nome, data_admissao, percentual_comissao, ferias) VALUES
  ('00233', 'João Geraldo da Fonseca', '2013-09-17', 0.1, 0),
  ('00235', 'Márcio Almeida Silva', '2017-03-18', 0.08, 0),
  ('00238','Pericles Alves', '2016-08-21', 0.11, 0),
  ('00236', 'Cláudia Morais', '2013-09-17', 0.08, 1),
  ('00237', 'Roberta Martins','2017-03-18', 0.11, 1);
  
UPDATE Produto SET embalagem = 'Lata', preco_lista = 2.46 WHERE codigo = '544931';
UPDATE Produto SET embalagem = 'Garrafa' WHERE codigo = '1078680';

UPDATE Vendedor SET percentual_comissao = 0.11 WHERE matricula = '00236';
UPDATE Vendedor SET nome = 'José Geraldo da Fonseca Junior' WHERE matricula = '00233';

DELETE FROM Produto WHERE codigo = '1078680';
DELETE FROM Vendedor WHERE matricula = '00233';