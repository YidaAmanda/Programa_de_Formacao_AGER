# 🚀 Programa de Formação AGER

Minha jornada no **Programa de Formação AGER**.

> Este README é um resumo do programa e do que aprendi. As anotações completas de estudo, com todos os conceitos explicados e exemplos de código, estão em [ANOTACOES.md](./ANOTACOES.md).

---

## Índice

- [Sobre o programa](#sobre-o-programa)
- [Progresso da trilha](#progresso-da-trilha)
- [O que aprendi?](#o-que-aprendi)
- [Projetos práticos](#projetos-práticos)
- [Tecnologias](#tecnologias)
- [Como executar os projetos](#como-executar-os-projetos-web)

---

## Sobre o programa

O **Programa de Formação AGER** é o programa de formação em tecnologia da AGE Technology, empresa da Baixada Santista que desenvolve o SOC, software líder no segmento de Saúde e Segurança no Trabalho. A proposta é impulsionar quem está começando na área: são 8 semanas com uma trilha de estudos online, mentorias com profissionais da AGE e desafios práticos.

---

## Progresso da trilha

### Passo a passo - Conteúdo da Trilha

| # | Conteúdo | Tipo | Carga Horária | Status |
|---|----------|:------:|:------:|:------:|
| 1 | Como escolher minha carreira em TI? | Artigo | - | Concluído |
| 2 | 5 passos para aprender a programar | Artigo | - | Concluído |
| 3 | Iniciante em programação | Trilha Alura | 29h | Concluído |
| 4 | Aprenda a programar em Java com Orientação a Objetos | Trilha Alura | 36h | Concluído |
| 5 | Java Web: crie aplicações usando Spring Boot | Trilha Alura | 40h | Em andamento |
| 6 | Boas práticas de programação: automatizando testes com Java | Curso | 10h | A fazer |
| 7 | JavaScript: programando na linguagem da web | Curso | 20h | A fazer |
| 8 | React: desenvolvendo com JavaScript | Curso | 14h | A fazer |
| 9 | React JS: crie testes com Jest e Testing Library e garanta o funcionamento do Front-end | Curso | 8h | A fazer |
| 10 | SQL com MySQL: manipule e consulte dados | Curso | 12h | A fazer |
| 11 | Consultas SQL: avançando no SQL com MySQL | Curso | 14h | A fazer |
| 12 | Java e JDBC: trabalhando com um banco de dados | Curso | 12h | A fazer |
| 13 | Engenharia de software na era da IA: como usar IA no fluxo real de desenvolvimento | Curso | 10h | A fazer |
| 14 | O que é Metodologia Ágil? Entenda Metodologias Ágeis no desenvolvimento de software e projetos | Artigo | - | A fazer |

### Sub-trilha: Iniciante em programação

| # | Módulo / Curso | Status |
|---|----------------|:------:|
| 1 | Primeiros passos em programação | Concluído |
| 2 | Entendendo a lógica de programação (2 cursos) | Concluído |
| 3 | Ferramentas essenciais para programar e compartilhar projetos | Concluído |
| 4 | Praticando lógica de programação com desafios | Concluído |



### Sub-trilha: Aprenda a programar em Java com Orientação a Objetos

| # | Módulo / Curso | Status |
|---|----------------|:------:|
| 1 | Entender a linguagem Java | Concluído |
| 2 | Orientação a objetos | Concluído |
| 3 | Manipule listas, consuma uma API e lide com exceções (2 cursos) | Concluído |

### Sub-trilha: Java Web: crie aplicações usando Spring Boot

| # | Módulo / Curso | Status |
|---|----------------|:------:|
| 1 | Criando uma aplicação Web em Java | Concluído |
| 2 | PostgreSQL e Spring Data JPA | Concluído |
| 3 | Conectando uma API Rest ao Front | A fazer |

---

## O que aprendi?

### 1 e 2. Artigos de boas-vindas

Panorama das áreas de atuação em TI, pontos a considerar antes de escolher a carreira e um roteiro prático de 5 passos para aprender a programar, com destaque para a constância e a prática.

### 3. Trilha: Iniciante em programação

Fundamentos de **lógica de programação com JavaScript**, construindo o **Jogo do Número Secreto** e mais **5 mini-aplicações web** (AluGames, carrinho de compras, sorteador de números, e-Ticket e amigo secreto). A trilha também cobriu **versionamento com Git e GitHub**: fluxo de commits, sincronização com o repositório remoto, como desfazer alterações com segurança e boas práticas de documentação.

**Principais tópicos:** variáveis · condicionais · laços · funções · arrays · manipulação do DOM · `git add/commit/push/pull` · `git reset/revert` · README e `.gitignore`

➡️ [Anotações completas desta trilha](./ANOTACOES.md#trilha-iniciante-em-programação)

### 4. Trilha: Aprenda a programar em Java com orientação a objetos

Do "Alô Mundo!" à construção do **Screen Match**, um catálogo de filmes e séries orientado a objetos que evoluiu até consumir a **API do OMDb** e gravar arquivos JSON. De desafios, os projetos **Sounds** (músicas e podcasts), **compras** (lista ordenada com cartão de crédito) e **busca CEP** (integração com a API do ViaCEP).

**Principais tópicos:** tipos e controle de fluxo · classes e encapsulamento · herança e polimorfismo · interfaces · `ArrayList`, `List` e `Map` · ordenação com `Comparable`/`Comparator` · HTTP e JSON · `HttpClient` · Gson · `record` · exceções · arquivos (`java.io`)

➡️ [Anotações completas desta trilha](./ANOTACOES.md#trilha-aprenda-a-programar-em-java-com-orientação-a-objetos)

### 5. Trilha: Java Web: crie aplicações usando Spring Boot (em andamento)

**Curso concluído:** Java: trabalhando com lambdas, streams e Spring Framework

O Screen Match renasceu como **projeto Spring Boot**: dependências gerenciadas pelo **Maven**, desserialização do JSON com a biblioteca **Jackson** e análise das avaliações dos episódios com **funções lambda e streams**, filtros, transformações, agrupamentos e estatísticas. De desafio, a **Tabela FIPE**: uma aplicação que consulta o valor médio de veículos direto da API.

**Principais tópicos:** Spring Boot e `CommandLineRunner` · Maven e `pom.xml` · Jackson (`@JsonAlias`, `@JsonIgnoreProperties`) · interfaces com Generics · lambdas · streams (`filter`, `map`, `flatMap`, `collect`) · `Optional` · datas com `java.time` · estatísticas com `DoubleSummaryStatistics`

**Curso concluído:** Java: persistência de dados e consultas com Spring Data JPA

Os dados do Screen Match saíram da memória e foram para o **PostgreSQL**. As classes viraram **entidades mapeadas com JPA/Hibernate**, o relacionamento entre séries e episódios ganhou chave estrangeira, `cascade` e carregamento configurável, e as buscas migraram dos streams para o banco: **derived queries** escritas no nome do método e consultas personalizadas em **JPQL**. No caminho, os gêneros viraram um **enum com métodos próprios**, as credenciais foram para **variáveis de ambiente** e a sinopse passou a ser traduzida por uma **API de IA**. De desafios, o **ScreenSound** (artistas e músicas) e o **Gerenciador de Pedidos** (produtos, categorias, fornecedores e pedidos).

**Principais tópicos:** PostgreSQL · JPA, Hibernate e ORM · `@Entity`, `@Table`, `@Id`, `@Column`, `@Enumerated` · `@OneToMany`/`@ManyToOne`/`@ManyToMany` · `cascade` e `fetch` · `JpaRepository` · injeção de dependências (`@Autowired`) · derived queries · JPQL e `@Query` · native queries · enums com atributos e métodos · variáveis de ambiente

➡️ [Anotações completas desta trilha](./ANOTACOES.md#trilha-java-web-crie-aplicações-usando-spring-boot)

---

## Projetos práticos

| Projeto | Descrição | O que usei |
|---------|-----------|------------|
| [`logica-js-projeto_inicial`](./logica-js-projeto_inicial) | Jogo do Número Secreto (versão console, com `alert`/`prompt`) | variáveis, `while`, `if/else`, ternário |
| [`js-curso-2-aula1`](./js-curso-2-aula1) | Jogo do Número Secreto (versão web, integrada à página) | funções, arrays, DOM, Web Speech API |
| [`sorteador-numeros`](./3411-praticando-logica-projeto_inicial/sorteador-numeros) | Sorteador de N números únicos num intervalo | `for`, arrays, `push`/`includes`, `classList`, `innerHTML` |
| [`alugames`](./3411-praticando-logica-projeto_inicial/alugames) | Alugar e devolver jogos de tabuleiro | `querySelector`, `classList`, `textContent`, `if/else` |
| [`ingresso`](./3411-praticando-logica-projeto_inicial/ingresso) | Compra de ingressos (e-Ticket) por setor | funções separadas, `switch`, `parseInt` |
| [`amigo-secreto`](./3411-praticando-logica-projeto_inicial/amigo-secreto) | Lista de participantes e sorteio de pares | validações, `return`, `length`, `includes` |
| [`carrinho-compras`](./3411-praticando-logica-projeto_inicial/carrinho-compras) | Somar produtos e valor total do carrinho | condicionais, `split`, `innerHTML` |
| [`primeiroprojeto`](./primeiroprojeto) | Primeiros exercícios em Java (loops, condicionais, leitura, adivinhação) | `Scanner`, `for`/`while`, `if/else`, casting |
| [`screenmatch`](./screenmatch) | Catálogo de filmes e séries (Screen Match), com listas, busca na API do OMDb e gravação em arquivo | classes, herança, `Comparable`, `HttpClient`, Gson, `record`, exceções |
| [`sounds`](./sounds) | Sistema de músicas e podcasts | herança (`Audio`), `@Override`, polimorfismo |
| [`compras`](./compras) | Sistema de compras com cartão de crédito e lista ordenada (desafio de listas) | `ArrayList`, `Collections.sort`, `Comparable`, `toString()` |
| [`buscador`](./buscador) | Busca CEP integrada à API do ViaCEP, gerando arquivo JSON | `HttpClient`, Gson, `record`, `FileWriter` |
| [`buscacep`](./buscacep) | Busca CEP com validações e exceções personalizadas (desafio) | `try/catch`, exceções personalizadas, `java.net.http`, Gson |
| [`spring sem web/screenmatch`](./spring%20sem%20web/screenmatch) | Screen Match reconstruído com Spring Boot: episódios de séries via API do OMDb e estatísticas de avaliações | Spring Boot, Maven, Jackson, lambdas, streams, `Optional` |
| [`spring sem web/tabelafipe`](./spring%20sem%20web/tabelafipe) | Consulta do valor médio de veículos na API da Tabela FIPE (desafio) | Spring Boot, Jackson, Generics, streams, `Comparator` |
| [`spring sem web/screenmatch-jpa`](./spring%20sem%20web/screenmatch-jpa) | Screen Match com os dados salvos no PostgreSQL: séries e episódios persistidos, buscas no banco e sinopse traduzida por IA | Spring Data JPA, Hibernate, PostgreSQL, derived queries, JPQL, enums, API de tradução |
| [`spring sem web/screensounds`](./spring%20sem%20web/screensounds) | Cadastro de artistas e músicas com busca por artista (desafio) | Spring Data JPA, PostgreSQL, `@OneToMany`/`@ManyToOne`, `@Enumerated`, `@Query` |
| [`spring sem web/gerenciador-pedidos`](./spring%20sem%20web/gerenciador-pedidos) | Menu de gestão de produtos, categorias, fornecedores e pedidos, com camada de serviços e relatórios | Spring Data JPA, PostgreSQL, `@ManyToMany` com `@JoinTable`, `@Service`, derived queries, JPQL, native query |

---

## Tecnologias

![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat&logo=postgresql&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat&logo=intellijidea&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=flat&logo=postman&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=flat&logo=visualstudiocode&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)

---

## Como executar os projetos web

1. Clone este repositório:
   ```bash
   git clone https://github.com/YidaAmanda/Programa_de_Formacao_AGER.git
   ```
2. Entre na pasta do projeto que quer testar (ex.: `js-curso-2-aula1`).
3. Abra o arquivo `index.html` no navegador (duplo clique já funciona).

## Como executar os projetos Java

1. Clone este repositório:
   ```bash
   git clone https://github.com/YidaAmanda/Programa_de_Formacao_AGER.git
   ```
2. Tenha a **JDK 17** (ou superior) instalada.
3. Abra a pasta do projeto que quer testar (ex.: `screenmatch`) no **IntelliJ IDEA**.
4. Rode a classe que contém o método `main` (ex.: `Principal` / `Main`) pelo botão ▶ da IDE.
5. Nos projetos Spring (pasta `spring sem web`), a classe a rodar é a `...Application` (ex.: `ScreenmatchApplication`) - o Spring sobe e executa o método `run` no console.

### Projetos que usam banco de dados

Os projetos `screenmatch-jpa`, `screensounds` e `gerenciador-pedidos` precisam de um **PostgreSQL** rodando. Antes de executá-los:

1. Crie o banco no PostgreSQL (ex.: `screenmatch`, `screensounds`, `pedidos`).
2. Defina as variáveis de ambiente que o `application.properties` espera (nas *run configurations* da IDE ou no sistema):

   | Variável | Exemplo |
   |----------|---------|
   | `DB_HOST` | `localhost` |
   | `DB_NAME` | `screenmatch` |
   | `DB_USER` | `postgres` |
   | `DB_PASSWORD` | *sua senha* |

3. Rode a classe `...Application` com `spring.jpa.hibernate.ddl-auto=update`, o Hibernate cria as tabelas automaticamente na primeira execução.
