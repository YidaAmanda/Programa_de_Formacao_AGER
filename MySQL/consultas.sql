USE Sucos;

-- SELECT * FROM tbcliente;
-- SELECT CPF, NOME, DATA_NASCIMENTO FROM tbcliente;
-- SELECT CPF AS CPF_CLIENT, NOME AS NOME_CLIENTE FROM tbcliente;
-- SELECT * FROM tbproduto ORDER BY PRECO_LISTA DESC LIMIT 10;
-- SELECT * FROM tbproduto WHERE NOME LIKE '%FESTIVAL%';
-- SELECT * FROM tbproduto WHERE REGEXP_LIKE(NOME, 'FESTIVAL');
-- SELECT * FROM tbcliente WHERE CIDADE = 'Rio de Janeiro';
-- SELECT * FROM tbcliente WHERE IDADE <> 22;
-- SELECT * FROM tbcliente WHERE NOME > 'Fernando Cavalcante';
-- SELECT * FROM tbcliente WHERE NOME <> 'Fernando Cavalcante';

# Ponto flutuante não consegue fazer consultas com =, <>, <=, >=
-- SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;
-- SELECT * FROM tbproduto WHERE PRECO_LISTA >= 16.007 AND PRECO_LISTA <= 16.009;

-- SELECT * FROM tbcliente WHERE DATA_NASCIMENTO <= ‘1995-01-13’;
-- SELECT * FROM tbcliente WHERE YEAR(DATA_NASCIMENTO) = 1995;
-- SELECT * FROM tbcliente WHERE MONTH(DATA_NASCIMENTO) = 10;
-- SELECT * FROM tbcliente WHERE IDADE >= 18 AND IDADE <= 22;
-- SELECT * FROM tbcliente WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M') OR (cidade = 'Rio de Janeiro' OR BAIRRO = 'Jardins');
