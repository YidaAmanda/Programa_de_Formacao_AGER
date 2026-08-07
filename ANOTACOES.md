# 📚 Anotações de estudo

> Estas anotações funcionam como uma **apostila de revisão**: cada conceito estudado no Programa de Formação AGER explicado. Para uma visão geral do programa, do progresso e dos projetos práticos, veja o [README](./README.md).

---

## Índice

- [Artigos](#artigos)
- [Trilha: Iniciante em programação](#trilha-iniciante-em-programação)
  - [O que é programação?](#o-que-é-programação)
  - [Lógica de programação com JavaScript](#lógica-de-programação-com-javascript)
  - [JavaScript no navegador: o DOM](#javascript-no-navegador-o-dom)
  - [Git e GitHub](#git-e-github)
- [Trilha: Aprenda a programar em Java com orientação a objetos](#trilha-aprenda-a-programar-em-java-com-orientação-a-objetos)
  - [A plataforma Java](#a-plataforma-java)
  - [Fundamentos da linguagem](#fundamentos-da-linguagem)
  - [Orientação a objetos](#orientação-a-objetos)
  - [Listas e coleções](#listas-e-coleções)
  - [APIs, HTTP e JSON](#apis-http-e-json)
  - [Bibliotecas, Gson e records](#bibliotecas-gson-e-records)
  - [Exceções](#exceções)
  - [Arquivos (java.io)](#arquivos-javaio)
- [Trilha: Java Web: crie aplicações usando Spring Boot](#trilha-java-web-crie-aplicações-usando-spring-boot)
  - [Spring e Spring Boot](#spring-e-spring-boot)
  - [Maven: build e dependências](#maven-build-e-dependências)
  - [Inferência de tipos com var](#inferência-de-tipos-com-var)
  - [Modularização: classes de serviço](#modularização-classes-de-serviço)
  - [Jackson: JSON e objetos Java](#jackson-json-e-objetos-java)
  - [Generics](#generics)
  - [Funções lambda](#funções-lambda)
  - [Streams](#streams)
  - [Optional](#optional)
  - [Datas com java.time](#datas-com-javatime)
  - [Estatísticas com streams](#estatísticas-com-streams)
  - [Enums: um tipo com valores fixos](#enums-um-tipo-com-valores-fixos)
  - [Do record da API para a classe de domínio](#do-record-da-api-para-a-classe-de-domínio)
  - [Traduzindo dados com uma API de IA](#traduzindo-dados-com-uma-api-de-ia)
  - [Bancos de dados relacionais e PostgreSQL](#bancos-de-dados-relacionais-e-postgresql)
  - [JPA, Hibernate e ORM](#jpa-hibernate-e-orm)
  - [Anotações de mapeamento](#anotações-de-mapeamento)
  - [Configurando a persistência no projeto](#configurando-a-persistência-no-projeto)
  - [Repositories e injeção de dependências](#repositories-e-injeção-de-dependências)
  - [Relacionamentos entre entidades](#relacionamentos-entre-entidades)
  - [Derived queries](#derived-queries)
  - [JPQL e consultas personalizadas](#jpql-e-consultas-personalizadas)
  - [Do console para a web](#do-console-para-a-web)
  - [MVC e a organização em camadas](#mvc-e-a-organização-em-camadas)
  - [Controllers: as rotas da API](#controllers-as-rotas-da-api)
  - [A camada de serviço com @Service](#a-camada-de-serviço-com-service)
  - [DTOs e serialização](#dtos-e-serialização)
  - [CORS: a resposta que o navegador bloqueia](#cors-a-resposta-que-o-navegador-bloqueia)
  - [DevTools e Live Reload](#devtools-e-live-reload)
  - [O caminho completo de uma requisição](#o-caminho-completo-de-uma-requisição)
- [Curso: Boas práticas de programação: automatizando testes com Java](#curso-boas-práticas-de-programação-automatizando-testes-com-java)
  - [Por que escrever testes automatizados](#por-que-escrever-testes-automatizados)
  - [JUnit: a anatomia de um teste](#junit-a-anatomia-de-um-teste)
  - [Nomes descritivos com @DisplayName](#nomes-descritivos-com-displayname)
  - [AAA e GWT: organizando o cenário](#aaa-e-gwt-organizando-o-cenário)
  - [Mocks: testando código com dependências](#mocks-testando-código-com-dependências)
  - [A camada de serviço: ArgumentCaptor e spy](#a-camada-de-serviço-argumentcaptor-e-spy)
  - [Testando o controller com MockMvc](#testando-o-controller-com-mockmvc)
  - [O que vale a pena testar?](#o-que-vale-a-pena-testar)
  - [Teste de mutação com Pitest](#teste-de-mutação-com-pitest)
  - [As anotações de teste mais usadas](#as-anotações-de-teste-mais-usadas)
- [Curso: JavaScript: programando na linguagem da web](#curso-javascript-programando-na-linguagem-da-web)
  - [JavaScript além do navegador](#javascript-além-do-navegador)
  - [O código em arquivos e a variável document](#o-código-em-arquivos-e-a-variável-document)
  - [Eventos: addEventListener e o objeto event](#eventos-addeventlistener-e-o-objeto-event)
  - [Criando elementos e lendo o formulário](#criando-elementos-e-lendo-o-formulário)
  - [Objetos e funções com uma responsabilidade](#objetos-e-funções-com-uma-responsabilidade)
  - [Validando o formulário](#validando-o-formulário)
  - [Delegação de eventos e remoção animada](#delegação-de-eventos-e-remoção-animada)
  - [Busca em tempo real com expressões regulares](#busca-em-tempo-real-com-expressões-regulares)
  - [AJAX: requisições assíncronas com XMLHttpRequest e JSON](#ajax-requisições-assíncronas-com-xmlhttprequest-e-json)
- [Curso: React: desenvolvendo com JavaScript](#curso-react-desenvolvendo-com-javascript)
  - [O que é React (e o Node por trás dele)](#o-que-é-react-e-o-node-por-trás-dele)
  - [Criando o projeto com Create React App](#criando-o-projeto-com-create-react-app)
  - [Componentes funcionais e JSX](#componentes-funcionais-e-jsx)
  - [Estilização: CSS por componente e estilos inline](#estilização-css-por-componente-e-estilos-inline)
  - [Props: passando dados de pai para filho](#props-passando-dados-de-pai-para-filho)
  - [Renderizando listas com map e a prop key](#renderizando-listas-com-map-e-a-prop-key)
  - [A prop children](#a-prop-children)
  - [Eventos e o envio do formulário](#eventos-e-o-envio-do-formulário)
  - [Estado com useState e componentes controlados](#estado-com-usestate-e-componentes-controlados)
  - [Funções como props: a comunicação de filho para pai](#funções-como-props-a-comunicação-de-filho-para-pai)
  - [Transformando arrays: filter e renderização condicional](#transformando-arrays-filter-e-renderização-condicional)
  - [Depurando: mensagens de erro e o debugger](#depurando-mensagens-de-erro-e-o-debugger)
  - [O ecossistema React: bibliotecas e próximos passos](#o-ecossistema-react-bibliotecas-e-próximos-passos)
- [Curso: React JS: crie testes com Jest e Testing Library e garanta o funcionamento do Front-end](#curso-react-js-crie-testes-com-jest-e-testing-library-e-garanta-o-funcionamento-do-front-end)
  - [Por que testar o Front-end e a pirâmide de testes](#por-que-testar-o-front-end-e-a-pirâmide-de-testes)
  - [Análise estática: ESLint e Prettier](#análise-estática-eslint-e-prettier)
  - [Jest e o primeiro teste](#jest-e-o-primeiro-teste)
  - [Renderizando e consultando: render, screen e as queries](#renderizando-e-consultando-render-screen-e-as-queries)
  - [Asserções e testes de snapshot](#asserções-e-testes-de-snapshot)
  - [Simulando o usuário com o userEvent](#simulando-o-usuário-com-o-userevent)
  - [Organizando testes e testando props](#organizando-testes-e-testando-props)
  - [Mock de funções com jest.fn()](#mock-de-funções-com-jestfn)
  - [TDD: desenvolvimento orientado a testes](#tdd-desenvolvimento-orientado-a-testes)
  - [Integração contínua: CI/CD e GitHub Actions](#integração-contínua-cicd-e-github-actions)
- [Curso: SQL com MySQL: manipule e consulte dados](#curso-sql-com-mysql-manipule-e-consulte-dados)
  - [SQL e o MySQL: história e a família de comandos](#sql-e-o-mysql-história-e-a-família-de-comandos)
  - [Instalando e acessando: Workbench e linha de comando](#instalando-e-acessando-workbench-e-linha-de-comando)
  - [Criando e apagando bancos de dados](#criando-e-apagando-bancos-de-dados)
  - [Os tipos de dados de uma coluna](#os-tipos-de-dados-de-uma-coluna)
  - [Criando e apagando tabelas (DDL)](#criando-e-apagando-tabelas-ddl)
  - [Chaves primárias](#chaves-primárias)
  - [Inserindo dados: o INSERT](#inserindo-dados-o-insert)
  - [Alterando e apagando: UPDATE e DELETE](#alterando-e-apagando-update-e-delete)
  - [Consultando dados: o SELECT](#consultando-dados-o-select)
- [Curso: Consultas SQL: avançando no SQL com MySQL](#curso-consultas-sql-avançando-no-sql-com-mysql)
  - [Conhecendo a base antes de consultar](#conhecendo-a-base-antes-de-consultar)
  - [Filtrando com o WHERE e os operadores de comparação](#filtrando-com-o-where-e-os-operadores-de-comparação)
  - [Filtros compostos: AND, OR e parênteses](#filtros-compostos-and-or-e-parênteses)
  - [Buscando texto: LIKE e expressões regulares](#buscando-texto-like-e-expressões-regulares)
  - [Listas e faixas: IN, NOT IN e BETWEEN](#listas-e-faixas-in-not-in-e-between)
  - [Filtrando por datas](#filtrando-por-datas)
  - [Linhas distintas: o DISTINCT](#linhas-distintas-o-distinct)
  - [Ordenando e limitando: ORDER BY e LIMIT](#ordenando-e-limitando-order-by-e-limit)
  - [Agrupando dados: GROUP BY e funções de agregação](#agrupando-dados-group-by-e-funções-de-agregação)
  - [Filtrando grupos: o HAVING](#filtrando-grupos-o-having)
  - [Classificando com o CASE](#classificando-com-o-case)
  - [Juntando tabelas: os JOINs](#juntando-tabelas-os-joins)
  - [Combinando seleções: UNION e UNION ALL](#combinando-seleções-union-e-union-all)
  - [Subconsultas (subqueries)](#subconsultas-subqueries)
  - [Visões (Views)](#visões-views)
  - [Funções: texto, números, datas e conversão](#funções-texto-números-datas-e-conversão)
  - [Colocando em prática: dois relatórios](#colocando-em-prática-dois-relatórios)
- [Curso: Java e JDBC: trabalhando com um banco de dados](#curso-java-e-jdbc-trabalhando-com-um-banco-de-dados)
  - [JDBC: a ponte entre o Java e o banco](#jdbc-a-ponte-entre-o-java-e-o-banco)
  - [A ConnectionFactory e o Factory Method](#a-connectionfactory-e-o-factory-method)
  - [Executando comandos: o Statement](#executando-comandos-o-statement)
  - [SQL Injection e o PreparedStatement](#sql-injection-e-o-preparedstatement)
  - [Transações: commit, rollback e o try-with-resources](#transações-commit-rollback-e-o-try-with-resources)
  - [Pool de conexões e o DataSource](#pool-de-conexões-e-o-datasource)
  - [Classes de domínio e o padrão DAO](#classes-de-domínio-e-o-padrão-dao)
  - [O problema das queries N + 1](#o-problema-das-queries-n--1)
  - [Uma aplicação em camadas](#uma-aplicação-em-camadas)
- [Curso: Engenharia de software na era da IA: como usar IA no fluxo real de desenvolvimento](#curso-engenharia-de-software-na-era-da-ia-como-usar-ia-no-fluxo-real-de-desenvolvimento)
  - [A IA mudou o que significa programar](#a-ia-mudou-o-que-significa-programar)
  - [O que a IA faz bem e o que faz mal hoje](#o-que-a-ia-faz-bem-e-o-que-faz-mal-hoje)
  - [Tendências: o que ganha e o que perde fama](#tendências-o-que-ganha-e-o-que-perde-fama)
  - [Os riscos de colocar a IA no fluxo](#os-riscos-de-colocar-a-ia-no-fluxo)
  - [Escolhendo o modelo: os quatro critérios](#escolhendo-o-modelo-os-quatro-critérios)
  - [As famílias de modelos: Claude, GPT e Gemini](#as-famílias-de-modelos-claude-gpt-e-gemini)
  - [As ferramentas: do editor ao terminal](#as-ferramentas-do-editor-ao-terminal)
  - [Context engineering: o contexto vale mais que o prompt](#context-engineering-o-contexto-vale-mais-que-o-prompt)
  - [Preparando o ambiente e criando o monorepo](#preparando-o-ambiente-e-criando-o-monorepo)
  - [O CLAUDE.md e as guidelines do projeto](#o-claudemd-e-as-guidelines-do-projeto)
  - [Planejar antes de executar: modos e modelos](#planejar-antes-de-executar-modos-e-modelos)
  - [MCP: o protocolo que conecta o agente a serviços](#mcp-o-protocolo-que-conecta-o-agente-a-serviços)
  - [O MCP do GitHub na prática](#o-mcp-do-github-na-prática)
  - [O MCP do Figma: do design ao código](#o-mcp-do-figma-do-design-ao-código)
  - [Spec-driven development: a especificação como contrato](#spec-driven-development-a-especificação-como-contrato)
  - [Do front ao back: acessibilidade, API e persistência](#do-front-ao-back-acessibilidade-api-e-persistência)
  - [O "slop dev" e a dívida técnica na velocidade da IA](#o-slop-dev-e-a-dívida-técnica-na-velocidade-da-ia)
  - [O agente fora do terminal: CI/CD, Slack e agendamento](#o-agente-fora-do-terminal-cicd-slack-e-agendamento)
  - [O dev à prova de futuro: os 3 Os](#o-dev-à-prova-de-futuro-os-3-os)
- [Artigo: O que é metodologia ágil?](#artigo-o-que-é-metodologia-ágil)
  - [O que é metodologia ágil](#o-que-é-metodologia-ágil)
  - [O Manifesto Ágil e seus valores](#o-manifesto-ágil-e-seus-valores)
  - [Os principais frameworks e metodologias](#os-principais-frameworks-e-metodologias)
  - [Ágil ou cascata: duas formas de conduzir um projeto](#ágil-ou-cascata-duas-formas-de-conduzir-um-projeto)
  - [Quando faz sentido ser ágil: o modelo Cynefin](#quando-faz-sentido-ser-ágil-o-modelo-cynefin)
  - [Papéis e prática: quem faz o quê e o que se ganha](#papéis-e-prática-quem-faz-o-quê-e-o-que-se-ganha)

---

## Artigos

### Como escolher minha carreira em TI?

A área de tecnologia não é uma coisa só: existem várias frentes de atuação (desenvolvimento front-end, back-end, mobile, dados, infraestrutura, segurança...), cada uma com rotinas e habilidades diferentes. O artigo apresenta esse panorama e sugere pontos a considerar antes de escolher um caminho: afinidade com o tipo de problema que cada área resolve, demanda do mercado e a possibilidade de migrar depois, a base de programação serve para todas.

### 5 passos para aprender a programar

Um roteiro para quem está começando: definir um objetivo, escolher uma primeira linguagem, praticar com projetos pequenos, buscar comunidade e manter constância. O recado principal: **aprender a programar é treino, não talento**, errar, ler mensagens de erro e tentar de novo faz parte do processo, e estudar um pouco todo dia rende mais do que maratonar de vez em quando.

---

## Trilha: Iniciante em programação

**Cursos:** Começando em Programação: carreira e primeiros passos · Lógica de programação: mergulhe em programação com JavaScript · Lógica de programação: explore funções e listas · Git e GitHub: compartilhando e colaborando em projetos · Lógica de programação: praticando com desafios

### O que é programação?

Programar é **escrever instruções que o computador consegue executar**. O computador não interpreta ambiguidade: cada passo precisa estar descrito de forma exata e na ordem certa, e é isso que chamamos de **lógica de programação**. A linguagem de programação (JavaScript, Java, Python...) é a ponte entre o que queremos dizer e o que a máquina entende.

A trilha começou com JavaScript por um motivo prático: ele roda direto no navegador, então dá para programar sem instalar quase nada e **ver o resultado na tela imediatamente**.

### Lógica de programação com JavaScript

#### Variáveis e tipos de dados

Uma **variável** é um espaço na memória com um nome, onde guardamos um valor para usar depois. Em JavaScript, declaramos com `let`:

```javascript
let numeroSecreto = 42;        // número
let mensagem = 'Acertou!';     // string (texto)
let acertou = false;           // booleano (true/false)
```

O JavaScript é **dinamicamente tipado**: a variável não tem tipo fixo, o valor que tem. Por isso é importante dar **nomes descritivos** (`numeroLimite` em vez de `n`), o código é lido muito mais vezes do que é escrito.

#### Entrada e saída

No navegador, as formas mais simples de conversar com quem usa o programa são:

- **`alert(texto)`** - exibe uma caixa de mensagem;
- **`prompt(pergunta)`** - exibe uma caixa com campo de digitação e **devolve o que foi digitado**.

Detalhe que pega muita gente: o `prompt` **sempre devolve string**, mesmo que a pessoa digite um número. Para fazer contas, é preciso converter com `parseInt(texto)` (inteiro) ou `parseFloat(texto)` (decimal).

#### Operadores e condicionais

Condicionais permitem que o programa **tome decisões**: execute um bloco se uma condição for verdadeira e outro se não for.

##### `if` / `else if` / `else`

```javascript
if (chute == numeroSecreto) {
    alert('Você acertou!');
} else if (chute > numeroSecreto) {
    alert('O número secreto é menor.');
} else {
    alert('O número secreto é maior.');
}
```

##### Operadores usados nas condições

- **Comparação:** `>`, `<`, `>=`, `<=`, `==`, `!=`
- **Lógicos:** `&&`, `||`

##### Operador ternário

Um `if / else` de uma linha só, útil para escolher entre **dois valores**:

```javascript
let palavra = tentativas == 1 ? 'tentativa' : 'tentativas';
```

##### `switch` / `case`

Quando a decisão é comparar **um mesmo valor** com várias possibilidades, uma escada de `if / else if / else if...` funciona, mas fica repetitiva e difícil de ler. O `switch` expressa esse caso específico de forma mais direta: ele avalia o valor entre parênteses e pula direto para o `case` correspondente.

```javascript
switch (tipoIngresso) {
    case 'pista':
        comprarPista();
        break;      // sem o break, a execução "vaza" para o próximo case
    case 'superior':
        comprarSuperior();
        break;
    default:        // executa quando nenhum case bate
        alert('Tipo inválido');
}
```

Dois detalhes que costumam pegar quem está começando:

- **`break`** - obrigatório ao final de cada caso. Sem ele, o JavaScript continua executando os `case` seguintes (o chamado *fall-through*), mesmo os que não batem com o valor.
- **`default`** - opcional; faz o papel do `else`, cobrindo qualquer valor que não tenha um `case` próprio.

O `switch` também combina bem com **uma função para cada caso**: ele só decide *qual* função chamar, e cada função cuida do seu próprio trabalho.

##### Quando usar cada um

- **`switch`** - comparar uma variável com **valores fixos e exatos** (um número de menu, um tipo, um estado).
- **`if / else if`** - **faixas ou condições compostas**, como `nota >= 7 && presente`.

#### Laços de repetição

Um **laço (loop)** repete um bloco de código enquanto uma condição for verdadeira. É o que evita copiar e colar a mesma linha várias vezes.

- **`while`** - repete *enquanto* a condição valer. Bom quando **não sabemos quantas vezes** vai repetir (ex.: repetir até o usuário acertar):

```javascript
while (chute != numeroSecreto) {
    chute = parseInt(prompt('Escolha um número'));
}
```

- **`do while`** - parente do `while`, com uma diferença que muda tudo: ele **testa a condição no final**, e não no começo. Por isso o bloco **executa pelo menos uma vez**, mesmo que a condição já nasça falsa. É o formato natural para menus e para pedir uma entrada ao usuário: a pergunta precisa acontecer antes de haver o que validar.

```javascript
let chute;
do {
    chute = parseInt(prompt('Escolha um número de 1 a 10'));
} while (chute < 1 || chute > 10);   // repete enquanto o valor for inválido
```

- **`for`** - reúne contador, condição e incremento em uma linha. Bom quando **sabemos a quantidade** de repetições:

```javascript
for (let i = 1; i <= 10; i++) {
    console.log(i); // imprime de 1 a 10
}
```

Comparando os três: use **`for`** quando souber a quantidade de repetições, **`while`** quando a repetição depender de uma condição que pode nem ser verdadeira no início, e **`do while`** quando o bloco precisar rodar ao menos uma vez antes do primeiro teste.

#### Funções

Uma **função** é um bloco de código com nome, que pode ser executado quantas vezes quisermos. Elas existem para **organizar** o programa em partes com propósito claro e **reaproveitar** lógica sem duplicar código.

```javascript
function exibirMensagem(texto) {   // "texto" é um parâmetro
    alert(texto);
}

function somar(a, b) {
    return a + b;                  // "return" devolve um resultado
}

exibirMensagem('Bem-vinda!');      // chamando a função
let total = somar(2, 3);           // total = 5
```

Dois detalhes importantes:

- **`return` encerra a função na hora**. Isso é muito usado em validações: se a entrada é inválida, mostramos o erro e saímos com `return`, sem executar o resto (padrão conhecido como *early return*).
- Uma função pode **receber dados** (parâmetros) e **devolver dados** (retorno), ou nenhum dos dois.

#### Listas (arrays)

Um **array** guarda vários valores em uma única variável, em ordem, cada um com um **índice que começa em 0**.

```javascript
let sorteados = [];              // array vazio
sorteados.push(7);               // adiciona ao final → [7]
sorteados.push(15);              // → [7, 15]
sorteados[0];                    // 7 (primeiro elemento)
sorteados.length;                // 2 (quantidade de elementos)
sorteados.includes(7);           // true (existe na lista?)
```

A dupla `push` + `includes` resolve um problema clássico: **evitar valores repetidos**, antes de adicionar verificamos se o valor já está na lista.

#### Números aleatórios

`Math.random()` devolve um decimal entre 0 e 1 (exclusivo). Para transformar isso em um inteiro dentro de um intervalo, multiplicamos e truncamos:

```javascript
// inteiro de 1 a 10:
let sorteado = parseInt(Math.random() * 10) + 1;
```

#### Template strings

Em vez de concatenar com `+`, dá para **interpolar variáveis dentro do texto** usando crases e `${}`:

```javascript
alert(`Você acertou em ${tentativas} tentativas!`);
```

Mais legível, principalmente quando há várias variáveis no meio da frase.

### JavaScript no navegador: o DOM

#### O que é o DOM

Quando o navegador carrega uma página, ele monta uma representação dela em memória: o **DOM** (*Document Object Model*), uma árvore de objetos onde cada tag do HTML vira um nó. O JavaScript não altera o arquivo HTML; ele altera o DOM, e **o navegador redesenha a tela na hora**. É assim que uma página "reage" sem recarregar.

Por isso, o primeiro passo de qualquer funcionalidade é **ler o HTML da página** e entender a estrutura: quais elementos existem, quais ids e classes eles têm.

#### Selecionando e alterando elementos

```javascript
// selecionar
let titulo = document.querySelector('h1');                     // por seletor CSS (tag, .classe, #id)
let botao = document.getElementById('reiniciar');              // por id

// alterar conteúdo
titulo.innerHTML = 'Novo <em>título</em>';                     // interpreta HTML
botao.textContent = 'Devolver';                                // texto puro, sem interpretar tags

// ler campos de formulário
let quantidade = document.getElementById('quantidade').value;  // sempre string!

// atributos
botao.disabled = true;                                         // desabilita o botão
```

A diferença entre **`innerHTML`** e **`textContent`**: o primeiro interpreta as tags que estiverem no texto (serve para montar pedaços de página); o segundo trata tudo como texto literal (mais seguro quando é só texto).

#### Estilo com classList

A forma organizada de mudar a aparência de um elemento é **trocar suas classes CSS** em vez de mexer no estilo direto. A propriedade `classList` tem os métodos:

```javascript
elemento.classList.contains('dashboard__item--rented'); // tem essa classe? (true/false)
elemento.classList.add('dashboard__item--rented');      // adiciona
elemento.classList.remove('dashboard__item--rented');   // remove
```

Combinando com `if/else`, dá para alternar estados visuais (disponível/indisponível, ativo/inativo), o CSS define como cada estado aparece, e o JavaScript só troca a etiqueta.

#### Web Speech API

O navegador tem APIs prontas além do DOM. A **Web Speech API**, por exemplo, sintetiza voz, fazendo a página "falar" um texto, o que deixa a aplicação mais acessível:

```javascript
let utterance = new SpeechSynthesisUtterance('Bem-vinda ao jogo!');
utterance.lang = 'pt-BR';
window.speechSynthesis.speak(utterance);
```

### Git e GitHub

#### Por que versionar código?

Sem controle de versão, "versionar" vira `projeto-final-v2-AGORA-VAI.zip`. O **Git** resolve isso registrando **fotografias do projeto ao longo do tempo** (os *commits*): dá para ver o que mudou, quando, por quem; e voltar atrás com segurança. O **GitHub** é um serviço que hospeda repositórios Git na nuvem, servindo de backup e de ponto de encontro para trabalho em equipe.

Vale separar os papéis: **Git** é a ferramenta (roda na sua máquina); **GitHub** é a plataforma (remoto).

#### As três áreas do Git

O fluxo do Git passa por três "lugares", e entender isso explica quase todos os comandos:

1. **Diretório de trabalho** - os arquivos como estão agora, com suas edições;
2. **Stage (área de preparação)** - a lista do que vai entrar no próximo commit (`git add` move para cá);
3. **Repositório** - o histórico permanente de commits (`git commit` grava aqui).

Ou seja: editar → `add` (escolher o que entra) → `commit` (fotografar).

#### Configuração e primeiros passos

Antes do primeiro commit, o Git precisa saber **quem você é**. Cada commit carrega autor e e-mail:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
```

Para começar um projeto:

```bash
git init                                  # transforma a pasta em repositório Git
git remote add origin <url-do-github>     # conecta ao repositório remoto
git push -u origin main                   # envia os commits para o GitHub
```

E para trabalhar em um projeto que já existe no GitHub: `git clone <url>` baixa o repositório inteiro, já configurado e com todo o histórico.

#### O fluxo do dia a dia

```bash
git status                                            # o que mudou? o que está no stage?
git add arquivo.js                                    # prepara o arquivo (ou "git add ." para tudo)
git commit -m "mensagem descritiva do que foi feito"
git push                                              # envia os commits locais para o remoto
git pull                                              # traz os commits novos do remoto
```

Para inspecionar o histórico, `git log` mostra autor, data e mensagem de cada commit. Variações úteis: `git log --oneline` (uma linha por commit), `git log --graph` (desenha as ramificações) e `git log -p` (mostra o diff de cada commit). Já `git remote -v` lista os remotos configurados.

> Commits pequenos e com mensagens claras são um presente para o seu "eu" do futuro: o histórico vira uma narrativa legível do projeto.

#### Colaboração

Em repositórios privados, é preciso **adicionar colaboradores** (que recebem e aceitam um convite) para que outras pessoas possam contribuir.

Quando duas pessoas trabalham juntas no mesmo commit, dá para **creditar a co-autoria** com um trailer na mensagem, o GitHub reconhece o e-mail e exibe os dois avatares:

```
git commit -m "texto do commit
>
>
Co-authored-by: Nome <email@exemplo.com>"
```

#### Desfazendo alterações

Errar faz parte, e o Git tem uma ferramenta para cada tipo de "voltar atrás". A pergunta-chave antes de escolher: **isso reescreve o histórico?** Reescrever histórico já publicado exige `push --force` e pode quebrar o trabalho de outras pessoas.

| Comando | O que faz | Reescreve histórico? |
|---------|-----------|:--------------------:|
| `git commit --amend` | Corrige o **último** commit (mensagem ou conteúdo) | Sim |
| `git revert <hash>` | Cria um **novo** commit que desfaz o commit apontado | Não |
| `git reset --soft <hash>` | Move o HEAD; mantém as alterações no *stage* | Sim |
| `git reset --mixed <hash>` | Move o HEAD; mantém as alterações no diretório de trabalho (padrão) | Sim |
| `git reset --hard <hash>` | Move o HEAD e **descarta** todas as alterações | Sim |

Na prática:

- **`revert`** é a opção segura em branches compartilhadas: em vez de apagar o passado, registra um commit novo que o anula.
- **`reset`** move o ponteiro do histórico para um commit anterior; o sufixo (`--soft`/`--mixed`/`--hard`) define o que acontece com as alterações que ficaram "no caminho".
- **`reset --hard` é destrutivo**: tudo que não estava commitado é perdido, sem lixeira.
- **`--amend`** serve para o clássico "commitei e esqueci um arquivo" (ou errei a mensagem), desde que o commit ainda não tenha sido enviado.

#### .gitignore e README

Nem tudo deve ir para o repositório: dependências baixadas, arquivos de build, segredos (`.env`), configurações da IDE. O arquivo oculto **`.gitignore`** lista o que o Git deve fingir que não existe.

> ⚠️ O `.gitignore` só vale para arquivos **ainda não rastreados**. Se o arquivo já foi commitado antes, é preciso tirá-lo do índice com `git rm --cached <arquivo>`, senão o Git continua acompanhando as mudanças dele.

Já o **`README.md`** é o cartão de visitas do repositório: o GitHub o exibe na página inicial, e é ali que se explica o que o projeto é, como executar e o que ele demonstra.

#### Gist

Para compartilhar um **trecho isolado** de código (um snippet, uma configuração), não precisa criar um repositório inteiro: o **Gist** do GitHub hospeda arquivos avulsos, públicos ou secretos, e também mantém histórico de versões.

---

## Trilha: Aprenda a programar em Java com orientação a objetos

**Cursos:** Java: criando a sua primeira aplicação · Java: aplicando a Orientação a Objetos · Java: trabalhando com listas e coleções de dados · Java: consumindo API, gravando arquivos e lidando com erros

### A plataforma Java

O Java tem uma proposta famosa: *"escreva uma vez, rode em qualquer lugar"*. Isso funciona porque o código-fonte **não é compilado direto para a máquina**, e sim para um formato intermediário chamado **bytecode**, que roda dentro de uma máquina virtual. Os três nomes que sempre aparecem:

- **JVM** (*Java Virtual Machine*) - a máquina virtual que executa o bytecode. Existe uma JVM para cada sistema operacional, e é ela que faz o mesmo programa rodar em Windows, Linux ou Mac.
- **JRE** (*Java Runtime Environment*) - a JVM + as bibliotecas padrão. É o necessário para **executar** programas Java.
- **JDK** (*Java Development Kit*) - o JRE + o compilador e as ferramentas. É o necessário para **desenvolver** em Java.

O ambiente usado nos cursos: **JDK 17** com a IDE **IntelliJ IDEA**, que compila e executa o programa pelo botão run.

### Fundamentos da linguagem

#### Tipagem estática

A diferença mais visível em relação ao JavaScript: em Java, **toda variável tem um tipo fixo, declarado no código**, e o compilador barra qualquer mistura inválida antes mesmo de o programa rodar.

```java
String nome = "Joao";
int ano = 2026;
double nota = 9.5;
boolean aprovada = true;
```

Isso muda a experiência de programar: muitos erros que em JS só apareceriam em execução, em Java aparecem na hora.

#### Entrada, saída e formatação

```java
System.out.println("Olá, mundo!");                            // imprime com quebra de linha

Scanner scanner = new Scanner(System.in);                     // lê da entrada padrão
String nome = scanner.nextLine();                             // lê uma linha de texto
int idade = acanner.nextInt();                                // lê um inteiro

String frase = String.format("%s tem %d anos", nome, idade);
String frase2 = "Nota: %.2f".formatted(nota);                 // 2 casas decimais
```

Os marcadores de formatação: `%s` para texto, `%d` para inteiros, `%f` para decimais (`%.2f` limita as casas).

#### Casting: conversão entre tipos numéricos

- **Implícito** (automático): do tipo menor para o maior, sem perda, `int` cabe dentro de `double`.
- **Explícito**: do maior para o menor, com risco de perda, é preciso "assinar o termo de responsabilidade" indicando o tipo entre parênteses:

```java
int inteiro = 10;
double decimal = inteiro;        // implícito: 10.0

double preco = 9.99;
int arredondado = (int) preco;   // explícito: 9 (a parte decimal é descartada!)
```

#### Condicionais e comparações

`if / else if / else`, `switch case` e o operador ternário funcionam como no JavaScript. A pegadinha específica do Java é a **comparação de Strings**:

```java
String resposta = scanner.nextLine();

resposta == "sim";           // X compara as REFERÊNCIAS (se é o mesmo objeto)
resposta.equals("sim");      // O compara o CONTEÚDO
```

`==` em objetos verifica se as duas variáveis apontam para o mesmo lugar da memória; para saber se dois textos são iguais, sempre `.equals()` (ou `.equalsIgnoreCase()` para ignorar maiúsculas).

#### Laços de repetição

Os três formatos, e quando cada um faz sentido:

- **`for`** - quantidade de repetições conhecida (percorrer de 1 a N);
- **`while`** - repetir enquanto uma condição vale (pode nem executar, se a condição já nasce falsa);
- **`do while`** - igual ao `while`, mas **executa pelo menos uma vez** (testa a condição no final), útil para menus que devem aparecer ao menos uma vez.

#### Text blocks

Para textos de várias linhas (menus, mensagens grandes), o Java 15+ tem os **text blocks**, delimitados por aspas triplas, sem precisar concatenar `\n`:

```java
String menu = """
        ------ Opções ------
        1. Cadastrar
        2. Listar
        3. Sair
        """;
```

#### Convenções de código

O Java é rigoroso com convenções de nomenclatura, seguir isso faz o código "parecer Java":

- Classes em **PascalCase**: `ContaBancaria`;
- Variáveis e métodos em **camelCase**: `saldoAtual`, `calculaJuros()`;
- Constantes em **Screaming Snake Case**: `URL_BASE`.

### Orientação a objetos

#### A ideia do paradigma

Em programas pequenos, dá para pensar só em "passos" (lógica procedural). Conforme o programa cresce, isso vira um emaranhado: dados soltos de um lado, funções soltas do outro. A **orientação a objetos** organiza o código em **objetos que juntam dados (atributos) e comportamentos (métodos)**, do mesmo jeito que pensamos no mundo real: um filme *tem* nome e duração, e *sabe* exibir sua ficha técnica.

Os ganhos: código mais fácil de **entender** (cada coisa no seu lugar), de **manter** (mudanças ficam localizadas) e de **reaproveitar** (herança, polimorfismo).

#### Classes e objetos

A **classe** é o molde; o **objeto** é uma instância criada a partir dele com a palavra-chave `new`:

```java
public class Filme {
    private String nome;
    private int anoDeLancamento;

    public void exibeFichaTecnica() {
        System.out.println("Filme: " + nome + " (" + anoDeLancamento + ")");
    }
}

Filme meuFilme = new Filme();   // objeto criado a partir do molde
```

#### Construtores

Um **construtor** é um método especial, com o nome da classe, executado no momento do `new`. Ele serve para **garantir que o objeto já nasça com os dados necessários**, em vez de nascer vazio e ser preenchido aos poucos:

```java
public class Filme {
    private String nome;

    public Filme(String nome) {     // construtor
        this.nome = nome;
    }
}

Filme filme = new Filme("Matrix");  // já nasce com nome
```

#### Encapsulamento

**Encapsular** é proteger o estado interno do objeto: os atributos ficam `private` (só a própria classe acessa) e o acesso externo passa por métodos públicos; **getters** (ler) e **setters** (alterar).

Por que dar essa volta em vez de deixar tudo público? Porque o método é um **ponto de controle**: um setter pode validar o valor antes de aceitar (`avaliacao` entre 0 e 10, por exemplo), e a classe pode mudar sua estrutura interna sem quebrar quem a usa.

```java
public class Filme {
    private double avaliacao;                    // protegido

    public double getAvaliacao() {               // leitura controlada
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) { // escrita controlada
        if (avaliacao >= 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
        }
    }
}
```

O **`this`** que aparece resolve uma ambiguidade: dentro do método, `avaliacao` é o parâmetro; `this.avaliacao` é o atributo do objeto.

#### Pacotes e import

Classes são organizadas em **pacotes**, pastas com nomes hierárquicos, pela convenção do domínio invertido: `br.com.amanda.screenmatch`. Para usar uma classe de outro pacote, é preciso importá-la com **`import`**. Além de organizar, os pacotes evitam conflito entre classes com o mesmo nome.

#### Herança

Quando duas classes compartilham atributos e comportamentos (um filme e uma série têm nome, ano, avaliação...), a duplicação pode ser eliminada com **herança**: extraímos o que é comum para uma superclasse, e as subclasses herdam tudo com `extends`:

```java
public class Titulo {              // superclasse: o que é comum
    private String nome;
    private int anoDeLancamento;
}

public class Serie extends Titulo { // subclasse: herda e acrescenta
    private int temporadas;
}
```

Uma subclasse também pode **redefinir** um comportamento herdado, usando a anotação **`@Override`**, por exemplo, uma série calcula a duração total de forma diferente de um filme (episódios × temporadas × minutos). A anotação pede ao compilador que confira se o método realmente existe na superclasse, evitando erros silenciosos de digitação.

> ⚠️ Java só permite herdar de **uma** classe. Quando é preciso "assinar vários contratos", a resposta são as interfaces.

#### Interfaces

Uma **interface** define um **contrato**: um conjunto de métodos que quem implementá-la se compromete a ter. Ela não diz *como* fazer, só *o que* deve existir; e os métodos são públicos por padrão.

```java
public interface Classificavel {
    double getClassificacao();
}

public class Filme extends Titulo implements Classificavel {
    @Override
    public double getClassificacao() {
        return getAvaliacao() / 2;
    }
}
```

Diferente da herança, uma classe pode implementar **várias** interfaces ao mesmo tempo.

#### Polimorfismo

**Polimorfismo** ("muitas formas") é a consequência poderosa de herança e interfaces: um método pode trabalhar com **qualquer objeto que cumpra o contrato**, sem conhecer a classe concreta.

```java
public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {   // aceita QUALQUER Classificavel
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos!");
        }
    }
}
```

Esse método funciona para filmes, séries, episódios; e para qualquer classe futura que implemente `Classificavel`, **sem mudar uma linha do filtro**. É o que torna o código extensível.

### Listas e coleções

#### ArrayList: a lista que cresce

Arrays em Java têm tamanho fixo. Para coleções que crescem e encolhem, a classe do dia a dia é a **`ArrayList`**:

```java
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Ana");                             // adiciona
nomes.get(0);                                 // "Ana" — acessa pelo índice
nomes.size();                                 // 1 — quantidade
```

O `<String>` entre colchetes angulares é o **tipo dos elementos**, a lista só aceita Strings, e o compilador garante isso (é o mesmo mecanismo de Generics que aparece mais adiante).

#### toString, Object e instanceof

Ao imprimir um objeto (ou uma lista de objetos), o Java chama o método **`toString()`** dele. O padrão, herdado da classe **`Object`** (a mãe de todas as classes em Java), é pouco útil, algo como `Filme@6f75e721`. Sobrescrevendo `toString()`, definimos a representação em texto:

```java
@Override
public String toString() {
    return "Filme: " + nome + " (" + anoDeLancamento + ")";
}
```

Já o operador **`instanceof`** pergunta se um objeto é de determinado tipo, útil quando uma lista de `Titulo` mistura filmes e séries e precisamos saber com qual estamos lidando.

#### Ordenação: Comparable e Comparator

`Collections.sort(lista)` ordena a lista, mas para isso o Java precisa saber **o que significa "vir antes"** para aquele tipo. Números e Strings já sabem; classes nossas, não. A solução é implementar a interface **`Comparable`** e definir o critério natural no método `compareTo`:

```java
public class Titulo implements Comparable<Titulo> {
    @Override
    public int compareTo(Titulo outro) {
        return this.getNome().compareTo(outro.getNome()); // ordem alfabética por nome
    }
}
```

Quando o critério varia (às vezes por nome, às vezes por ano), em vez de fixar um único `compareTo`, passamos o critério na hora com um **`Comparator`**, usando o `sort` da própria interface `List`:

```java
lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
```

Resumindo: **`Comparable`** = a classe tem *um* jeito natural de se ordenar; **`Comparator`** = o critério é definido por fora, e pode haver vários.

#### A interface List e suas implementações

A `ArrayList` implementa a interface **`List`**. Declarar a variável pelo tipo da interface é aplicar polimorfismo às coleções: o resto do código só conhece o contrato, e a implementação pode ser trocada sem quebrar nada.

```java
List<Titulo> lista = new ArrayList<>();  // amanhã pode virar LinkedList sem afetar o resto
```

| Classe | Característica |
|--------|----------------|
| `ArrayList` | Baseada em **array dinâmico**, que cresce e encolhe conforme os elementos entram e saem; eficiente e a mais usada |
| `LinkedList` | **Lista encadeada** (cada elemento referencia o próximo); boa para inserir/remover em qualquer posição, pior para busca |
| `Vector` | Semelhante à `ArrayList`, mas **sincronizada** (segura entre threads, com custo de desempenho) |
| `Stack` | **Pilha LIFO** (*last-in, first-out*): o último elemento adicionado é o primeiro a ser removido |

#### Map e HashMap

Enquanto a `List` guarda elementos em sequência, o **`Map`** associa **chaves a valores**, como um dicionário. A implementação mais comum é a **`HashMap`**, baseada em tabela hash: inserção, busca e remoção em tempo praticamente constante, **O(1)**, com o porém de **não garantir a ordem** dos elementos.

```java
Map<String, Double> precos = new HashMap<>();
precos.put("café", 8.50);                       // associa chave → valor
precos.get("café");                             // 8.50 — busca direta pela chave
```

#### Padrões de projeto (design patterns)

Com o tempo, a comunidade percebeu que certos problemas de organização de código se repetem e catalogou **soluções reutilizáveis** para eles. São os *design patterns*, divididos em três categorias:

- **Criação** - como criar objetos de forma flexível: *Factory Method*, *Builder*, *Singleton*;
- **Estrutura** - como compor classes e objetos: *Adapter*, *Facade*, *Composite*;
- **Comportamento** - como objetos interagem e dividem responsabilidades: *Observer*, *Command*, *Strategy*.

Não é preciso decorar todos: o valor está em reconhecer o problema e saber que existe uma solução com nome.

### APIs, HTTP e JSON

#### O que é uma API

**API** (*Application Programming Interface*) é um contrato que permite que **programas conversem entre si**. Uma API web expõe endereços (URLs) que, ao serem consultados, devolvem dados; geralmente em JSON. Antes de escrever qualquer código, dá para explorar uma API com o **Postman**, montando as requisições e vendo as respostas.

#### HTTP e códigos de status

Toda conversa na web segue o protocolo **HTTP**: o cliente envia uma **requisição** para uma URL e o servidor devolve uma **resposta**, que sempre carrega um **código de status** de três dígitos dizendo como foi:

| Classe | Significado |
|:------:|-------------|
| `1xx` | Informações |
| `2xx` | **Sucesso** (o famoso `200 OK`) |
| `3xx` | Redirecionamento |
| `4xx` | **Erro do cliente** (ex.: `404`, não encontrado; a URL ou os parâmetros estão errados) |
| `5xx` | **Erro do servidor** (o problema é do outro lado) |

#### JSON

**JSON** (*JavaScript Object Notation*) é o formato de texto padrão para trocar dados entre sistemas. Toda a estrutura se resume a duas peças:

- **Objetos** - coleções de pares chave-valor, entre `{ }`;
- **Arrays** - listas ordenadas, entre `[ ]`.

Os valores podem ser strings, números, booleanos, objetos ou arrays, e a combinação dessas peças descreve qualquer estrutura:

```json
{
  "titulo": "Dark",
  "temporadas": 3,
  "generos": ["ficção científica", "suspense"]
}
```

#### Consumindo uma API em Java

O pacote `java.net.http` traz o trio que faz a consulta, cada um com um papel:

```java
HttpClient client = HttpClient.newHttpClient();               // quem envia (o "navegador" do código)
HttpRequest request = HttpRequest.newBuilder()                // a requisição: qual URL consultar
        .uri(URI.create(endereco))
        .build();
HttpResponse<String> response = client
        .send(request, HttpResponse.BodyHandlers.ofString()); // envia e espera a resposta

String json = response.body();                                // o corpo da resposta (o JSON)
```

### Bibliotecas, Gson e records

#### Bibliotecas

**Biblioteca** é código pronto, escrito por outras pessoas, que resolve um problema comum. Neste módulo a instalação ainda foi manual: baixar o arquivo **`.jar`** e configurá-lo no projeto pela IDE. (Mais adiante, o Maven automatiza exatamente isso.)

#### Serialização e desserialização

Dois nomes para os dois sentidos da conversão:

- **Desserializar** - transformar o texto JSON em **objeto Java**, para trabalhar com tipos e métodos;
- **Serializar** - transformar um objeto Java em **texto JSON**, para gravar ou enviar.

A biblioteca **Gson** (do Google) faz os dois caminhos, com conversão flexível configurável conforme a documentação.

#### Records

Um **record** (Java 16+) é uma estrutura pensada para uma coisa só: **carregar dados imutáveis**. Em uma linha, o compilador gera construtor, getters, `equals`, `hashCode` e `toString`:

```java
public record TituloOmdb(String title, String year, String runtime) {}
```

É o alvo perfeito para desserialização: o JSON vira um record, e ninguém consegue alterar os valores depois.

#### Imutabilidade

Um objeto **imutável** não muda depois de criado; como o record e como a própria `String` do Java: "alterar" uma String na verdade **cria um novo objeto**, e a variável passa a apontar para ele. Os ganhos de projetar assim:

- **Concorrência** - várias threads podem ler o mesmo objeto sem sincronização, pois ninguém o altera;
- **Segurança** - o valor não muda por baixo dos panos depois de validado;
- **Desempenho** - valores imutáveis podem ser reaproveitados em cache.

### Exceções

#### O que são e por que tratar

Uma **exceção** é um evento que interrompe o fluxo normal do programa: o arquivo não existe, o texto não é um número, a rede caiu. Sem tratamento, o programa simplesmente quebra. **Tratar** a exceção é decidir o que fazer quando o problema acontecer; avisar, tentar de novo, usar um valor padrão; com o bloco **`try/catch`**:

```java
try {
    int numero = Integer.parseInt(texto);     // pode lançar NumberFormatException
} catch (NumberFormatException e) {
    System.out.println("Digite um número válido!");
}
```

O `try` envolve o código arriscado; cada `catch` captura um tipo de problema e reage.

#### A hierarquia

Todas as exceções descendem de **`Throwable`**, que se divide em dois ramos:

- **`Error`** - problemas irrecuperáveis da JVM (como `OutOfMemoryError`); não se trata, se evita;
- **`Exception`** - problemas do programa, que podem e devem ser tratados.

Dentro de `Exception`, a divisão que importa no dia a dia:

- **Verificadas** (*checked*) - herdam de `Exception` diretamente (ex.: `IOException`). O compilador **obriga** a tratar com `try/catch` ou a declarar na assinatura com `throws`;
- **Não verificadas** (*unchecked*) - herdam de `RuntimeException` (ex.: `NullPointerException`, `NumberFormatException`). O compilador não cobra, porque normalmente indicam **erro de lógica** que deveria ser corrigido no código.

#### Ordem dos catch

Quando há vários `catch`, a regra é tratar primeiro as exceções **filhas** (mais específicas) e depois as **mães** (mais genéricas). O motivo: um `catch (IOException e)` também captura `FileNotFoundException` (que é filha dela), se vier primeiro, o tratamento específico nunca executa.

#### Exceções personalizadas

Quando a regra violada é **do seu domínio** (um CEP com letras, uma avaliação negativa), nenhuma exceção pronta descreve bem o problema. A solução é criar a sua:

```java
public class ErroDeConversaoDeAnoException extends RuntimeException {
    public ErroDeConversaoDeAnoException(String mensagem) {
        super(mensagem);
    }
}

// e lançá-la na validação:
if (ano.length() != 4) {
    throw new ErroDeConversaoDeAnoException("O ano deve ter 4 dígitos");
}
```

O nome da exceção passa a documentar o erro, quem lê o stack trace entende na hora o que aconteceu.

### Arquivos (java.io)

Para persistir dados entre execuções, o pacote **`java.io`** oferece classes de escrita e leitura. A dupla básica:

```java
FileWriter escrita = new FileWriter("dados.json");
escrita.write(json);
escrita.close();     // sempre fechar — libera o arquivo para o sistema
```

E a leitura pode ser feita com a mesma `Scanner` usada para o teclado, apontando para um `File`.

Combinando com a serialização: um objeto vira JSON (Gson) e o JSON vai para o arquivo (`FileWriter`). Para o arquivo sair legível para humanos, com indentação, a Gson tem o **`setPrettyPrinting()`**.

Outras classes do pacote, para outros cenários:

- `BufferedReader` / `BufferedWriter` - texto com *buffer*, lendo e escrevendo linha a linha com eficiência;
- `FileInputStream` / `FileOutputStream` - dados **binários** (imagens, áudio);
- `ObjectInputStream` / `ObjectOutputStream` - gravar objetos Java inteiros em arquivo.

---

## Trilha: Java Web: crie aplicações usando Spring Boot

**Cursos:** Java: trabalhando com lambdas, streams e Spring Framework · Java: persistência de dados e consultas com Spring Data JPA · Java: criando a sua primeira API e conectando ao front-end

É a trilha mais longa até aqui, e o foco é sempre o mesmo projeto, o Screen Match, atravessando três estágios: primeiro ele ganha a estrutura de um framework e os recursos modernos da linguagem (lambdas, streams, Optional), depois troca a memória por um **banco de dados** e, por fim, sai do console e vira uma **API consumida por um front-end**.

### Spring e Spring Boot

#### O que é um framework

Uma biblioteca é uma ferramenta que **você chama** quando precisa. Um **framework** inverte essa relação: ele fornece o esqueleto da aplicação e **chama o seu código** nos pontos certos. Você preenche as lacunas; ele cuida da infraestrutura.

O **Spring** é o framework mais usado do ecossistema Java, cuida de configuração, injeção de dependências, acesso a banco, web e muito mais. O **Spring Boot** é a forma moderna de usá-lo: um conjunto de convenções e dependências pré-configuradas (*starters*) que elimina quase toda a configuração manual e deixa a aplicação rodando em minutos.

#### Nascendo no Spring Initializr

Um projeto Spring nasce no **Spring Initializr** ([start.spring.io](https://start.spring.io)): escolhe-se o gerenciador de dependências (**Maven**), a linguagem, a versão do Spring Boot e os metadados (grupo, nome do artefato), e ele gera o projeto pronto para abrir na IDE. A estrutura gerada:

```
projeto/
├── src/main/java/        → código-fonte, organizado em pacotes (model, service...)
├── src/main/resources/   → configurações (application.properties)
├── src/test/java/        → testes
└── pom.xml               → configuração do Maven
```

#### A classe principal e o método run

A classe principal carrega a anotação **`@SpringBootApplication`**, que liga a autoconfiguração do Spring. O `main` chama `SpringApplication.run(...)`, que sobe o **contexto** do framework.

Para uma aplicação **de console** (sem web), a classe implementa a interface **`CommandLineRunner`**: o contrato diz que o Spring executará o método **`run`** logo depois que a aplicação subir, é ali que o fluxo do programa começa.

```java
@SpringBootApplication
public class MinhaAplicacao implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MinhaAplicacao.class, args); // sobe o Spring
    }

    @Override
    public void run(String... args) throws Exception {
        // ponto de partida da aplicação — executa após o Spring subir
    }
}
```

### Maven: build e dependências

#### O problema que ele resolve

No módulo anterior, adicionar a Gson significou baixar um `.jar` na mão e configurá-lo na IDE, e cada biblioteca pode depender de outras, que dependem de outras... O **Maven** automatiza tudo isso: você **declara** o que precisa em um arquivo, e ele baixa a biblioteca **e as dependências dela** (as *transitivas*), na versão certa. Além disso, padroniza o *build* (compilação, testes, empacotamento).

#### O pom.xml

O coração do Maven é o **`pom.xml`** (*Project Object Model*). As partes principais:

- **`<parent>`** - em projetos Spring Boot, aponta para o `spring-boot-starter-parent`, que centraliza as versões compatíveis de todo o ecossistema Spring (por isso as dependências do Spring não precisam declarar versão);
- **`<properties>`** - configurações como a versão do Java;
- **`<dependencies>`** - a lista de bibliotecas do projeto.

Para adicionar uma biblioteca: buscar no [mvnrepository.com](https://mvnrepository.com), copiar o bloco `<dependency>` e colar dentro de `<dependencies>`, a IDE recarrega o Maven e a biblioteca aparece no projeto:

```xml
<dependency>
    <groupId>tools.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>3.2.1</version>
</dependency>
```

As três coordenadas identificam qualquer biblioteca no mundo Maven: **groupId** (a organização), **artifactId** (o projeto) e **version**.

### Inferência de tipos com var

O **`var`** (Java 10+) permite omitir o tipo na declaração quando ele é óbvio pelo valor atribuído, o **compilador infere**:

```java
var leitura = new Scanner(System.in);   // o compilador sabe: é um Scanner
var nome = "Amanda";                    // é uma String
```

Duas regras e um esclarecimento:

- Só funciona em **variáveis locais** (dentro de métodos);
- A variável precisa ser **inicializada na declaração** (senão não há de onde inferir);
- O tipo **continua estático**: `var` não é tipo dinâmico como no JavaScript; depois de inferido, o tipo é fixo como se tivesse sido escrito. É só menos repetição na escrita.

### Modularização: classes de serviço

Um princípio de organização que muda a qualidade do código: **cada classe deve ter uma única responsabilidade**. Em vez de uma classe gigante que faz tudo, o projeto se divide em camadas:

- **`model`** - as classes que representam os **dados** (records e entidades);
- **`service`** - as classes que executam **tarefas**.

Uma classe de serviço típica encapsula o consumo de API: o trio `HttpClient`/`HttpRequest`/`HttpResponse` fica escondido dentro de um método `obterDados(String endereco)` que recebe a URL e devolve o JSON como `String`. Quem chama não precisa saber *como* a consulta é feita, só pede os dados.

Os ganhos são concretos:

- **Manutenção** - se a forma de consumir a API mudar, só uma classe muda;
- **Reúso** - o mesmo serviço atende qualquer parte do programa (e pode ser copiado para outros projetos);
- **Testabilidade** - classes pequenas com um propósito são fáceis de testar isoladamente.

#### Métodos privados: encapsulamento de comportamento

A mesma ideia vale dentro de uma classe. A `Principal` expõe **um** método público, o `exibeMenu()`; tudo o que ele coordena (`buscarSerieWeb()`, `listarSeriesBuscadas()`, `buscarSeriePorTitulo()`...) é **`private`**. Encapsulamento não vale só para atributos: métodos que são passos internos de um fluxo não fazem parte do contrato da classe, e mantê-los privados deixa claro o que é serviço oferecido e o que é interno.

O menu em si roda dentro de um `do/while` com `switch`, o que permite **buscar várias séries seguidas** sem reiniciar o programa: o laço só termina quando a opção digitada é `0`.

### Jackson: JSON e objetos Java

#### ObjectMapper

O **Jackson** é a biblioteca de serialização/desserialização mais usada no ecossistema Spring (o papel que a Gson cumpria antes). A classe central é o **`ObjectMapper`**:

```java
ObjectMapper mapper = new ObjectMapper();
DadosSerie dados = mapper.readValue(json, DadosSerie.class);  // JSON → objeto
```

O `readValue` recebe o texto JSON e a classe de destino, e devolve o objeto preenchido.

#### Mapeando o JSON com anotações

O JSON de uma API raramente usa os nomes que queremos no código (vem `Title`, queremos `titulo`; vem em inglês, queremos português). As anotações do Jackson resolvem o mapeamento sem renomear nada:

- **`@JsonAlias`** - aceita nomes **alternativos** na hora de **ler** o JSON (mais de um vai entre chaves: `@JsonAlias({"Title", "Titulo"})`);
- **`@JsonProperty`** - define o nome do campo **tanto na leitura quanto na escrita** do JSON;
- **`@JsonIgnoreProperties(ignoreUnknown = true)`** - instrui o Jackson a **ignorar os campos do JSON que não foram mapeados**. Sem ela, qualquer campo desconhecido derruba a conversão com exceção, e APIs costumam devolver dezenas de campos que não nos interessam.

```java
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
```

Records e Jackson formam um par natural: o JSON entra, vira um pacote de dados imutável e com nomes do nosso domínio.

### Generics

#### O problema

Imagine um método que converte JSON para `DadosSerie`. Amanhã precisamos converter para `DadosTemporada`. Depois, `DadosEpisodio`. Sem Generics, seriam três métodos praticamente idênticos, só o tipo muda. Copiar e colar código é sempre um sinal de alerta.

#### A solução: parâmetro de tipo

**Generics** permitem escrever código que funciona **para qualquer tipo, mantendo a segurança de tipos**. O `<T>` é um *parâmetro de tipo*: uma lacuna que só é preenchida na hora do uso. Nós já usávamos isso como consumidores: `List<String>`, `ArrayList<Titulo>`; agora passamos a escrever os nossos:

```java
public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
```

Lendo a assinatura por partes:

- **`<T>`** - declara "este método é genérico, e T é o nome do tipo";
- **`T`** (o retorno) - o método devolve um objeto do tipo que for pedido;
- **`Class<T> classe`** - o *token* do tipo: como o Java apaga os Generics em tempo de execução (*type erasure*), o Jackson precisa receber a classe como argumento para saber o que construir.

A implementação é uma só, e cada chamada define o tipo:

```java
DadosSerie serie = conversor.obterDados(json, DadosSerie.class);         // T = DadosSerie
DadosTemporada temp = conversor.obterDados(json, DadosTemporada.class);  // T = DadosTemporada
```

**Um único método, zero redundância**, e se alguém tentar atribuir o resultado ao tipo errado, o erro aparece em compilação, não em produção.

#### Generics com listas

Quando o JSON é um **array** (`[ {...}, {...} ]`), o destino é uma `List<T>`, e aí o token `Class<T>` sozinho não basta. O Jackson resolve com o `CollectionType`, que descreve "uma lista de T":

```java
public <T> List<T> obterLista(String json, Class<T> classe) {
    CollectionType lista = mapper.getTypeFactory()
            .constructCollectionType(List.class, classe);
    return mapper.readValue(json, lista);
}
```

### Funções lambda

#### A ideia

Uma **lambda** é uma **função anônima**: um comportamento escrito direto no lugar onde será usado, sem nome, sem classe, sem cerimônia. A sintaxe:

```java
(parametros) -> expressao

n -> n * 2                          // um parâmetro: parênteses opcionais
(a, b) -> a + b                     // dois parâmetros
n -> { System.out.println(n); }     // corpo com várias linhas: chaves e, se preciso, return
```

Por trás, uma lambda sempre implementa uma **interface funcional**; uma interface com um único método abstrato. É por isso que dá para passá-la como argumento: `forEach` espera um `Consumer` (recebe um valor, não devolve nada), `filter` espera um `Predicate` (recebe um valor, devolve `true`/`false`), `map` espera uma `Function` (recebe um valor, devolve outro). A lambda é a implementação instantânea desses contratos.

#### O antes e depois

O ganho de concisão fica óbvio ao percorrer estruturas aninhadas (uma lista de temporadas, cada uma com sua lista de episódios):

```java
// jeito tradicional: dois for aninhados, índices, verbosidade
for (int i = 0; i < temporadas.size(); i++) {
    List<DadosEpisodio> episodios = temporadas.get(i).episodios();
    for (int j = 0; j < episodios.size(); j++) {
        System.out.println(episodios.get(j).titulo());
    }
}

// com lambdas: a intenção fica visível
temporadas.forEach(t -> t.episodios()
        .forEach(e -> System.out.println(e.titulo())));
```

#### Method references

Quando a lambda **só repassa a chamada para um método que já existe**, há um atalho ainda mais curto, a *method reference*, com `::`:

```java
n -> System.out.println(n)    →    System.out::println
e -> e.getAvaliacao()         →    Episodio::getAvaliacao
n -> n.toUpperCase()          →    String::toUpperCase
```

Sempre que a lambda for só um "encaminhamento", a method reference diz o mesmo com menos ruído.

### Streams

#### A ideia

Uma **stream** é um **fluxo de dados** criado a partir de uma coleção, sobre o qual encadeamos operações. A diferença de mentalidade em relação aos loops: com `for`, descrevemos **como** fazer (índices, variáveis acumuladoras, condições); com streams, declaramos **o que** queremos (filtre isso, transforme naquilo, pegue os 5 primeiros). O código fica mais próximo da frase que o descreve.

> A stream **não altera a coleção original**, ela produz novos resultados a partir dela.

#### Anatomia do pipeline

Todo pipeline de stream tem três partes:

1. **Fonte** - de onde os dados vêm: `lista.stream()`;
2. **Operações intermediárias** - recebem uma stream e devolvem outra, por isso podem ser **encadeadas** à vontade;
3. **Operação final** - encerra o fluxo e materializa o resultado.

| Operações intermediárias | O que fazem |
|--------------------------|-------------|
| `filter(predicado)` | Deixa passar só os elementos que satisfazem a condição |
| `map(função)` | **Transforma** cada elemento em outra coisa |
| `sorted()` / `sorted(comparator)` | Ordena o fluxo |
| `limit(n)` | Corta o fluxo nos *n* primeiros |
| `distinct()` | Remove duplicados |
| `flatMap(função)` | "Achata" streams aninhadas em uma só |
| `peek(ação)` | Espia cada elemento sem alterar o fluxo (debug) |

| Operações finais | O que produzem |
|------------------|----------------|
| `forEach(ação)` | Executa uma ação para cada elemento |
| `collect(coletor)` | Reúne o resultado em uma coleção (lista, mapa...) |
| `count()` | Quantidade de elementos |
| `reduce(inicial, função)` | Reduz o fluxo a um único valor (soma, produto...) |
| `findFirst()` | O primeiro elemento, embrulhado em um `Optional` |

Um detalhe elegante do design: as operações intermediárias são **preguiçosas** (*lazy*), nada executa até existir uma operação final no pipeline. É ela que "puxa a descarga" do fluxo.

#### A ordem importa

Cada operação atua sobre **o resultado da anterior**, então trocar a ordem muda o resultado:

```java
List<String> nomes = Arrays.asList("Joao", "Amanda", "Maria", "JoaoMaria");

nomes.stream()
        .sorted()                       // ordena: Amanda, Joao, JoaoMaria, Maria
        .limit(2)                       // corta: Amanda, Joao
        .filter(n -> n.startsWith("J")) // filtra os 2 restantes: Joao
        .map(String::toUpperCase)       // transforma: JOAO
        .forEach(System.out::println);  // imprime
```

Se o `filter` viesse antes do `limit`, o resultado seria outro. Ao montar um pipeline, vale se perguntar a cada passo: *o que resta no fluxo neste ponto?*

#### flatMap: achatando estruturas aninhadas

O `map` transforma um elemento em **outro elemento**. Mas e quando cada elemento contém **uma lista** (cada temporada tem seus episódios) e queremos uma stream única com tudo dentro? `map` geraria uma "stream de listas". O **`flatMap`** resolve: transforma cada elemento em uma stream e **funde todas em um fluxo só**:

```java
List<Episodio> episodios = temporadas.stream()
        .flatMap(t -> t.dadosEpisodios().stream()          // cada temporada vira uma stream de episódios
                .map(d -> new Episodio(t.numero(), d)))    // e cada dado cru vira um objeto rico
        .collect(Collectors.toList());                     // tudo reunido em UMA lista
```

Repare no bônus: dentro do `flatMap` ainda dá para usar `map`, aproveitando dados do elemento externo (o número da temporada) na construção de cada item interno.

#### collect e reduce

O **`collect`** materializa o fluxo em uma coleção. Duas formas de obter uma lista, com uma diferença que importa:

- `collect(Collectors.toList())` - devolve uma lista **mutável**;
- `.toList()` (atalho do Java 16+) - devolve uma lista **imutável** (tentar adicionar depois lança exceção).

Já o **`reduce`** condensa o fluxo inteiro em **um único valor**, aplicando uma função acumuladora:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
int soma = numeros.stream()
        .reduce(0, (total, numero) -> total + numero);  // começa em 0 e vai somando → 15
```

#### peek: enxergando cada etapa

Pipeline não tem "linha para colocar breakpoint"; quando o resultado vem errado, como descobrir em qual etapa? O **`peek`** é uma operação intermediária que **não altera o fluxo**: só executa uma ação (tipicamente um print) em cada elemento que passa por aquele ponto. Intercalado entre as operações, ele revela o estado do fluxo etapa por etapa:

```java
dadosEpisodios.stream()
        .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
        .peek(e -> System.out.println("Após o filtro: " + e))
        .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
        .peek(e -> System.out.println("Após a ordenação: " + e))
        .limit(10)
        .map(e -> e.titulo().toUpperCase())
        .peek(e -> System.out.println("Após o map: " + e))
        .forEach(System.out::println);
```

Terminado o debug, os `peek` saem e o pipeline volta ao limpo. (No exemplo, note o `Comparator.comparing(...).reversed()`, ordenação **decrescente** pela avaliação.)

### Optional

Buscas podem não encontrar nada. A abordagem antiga, devolver `null`, é uma armadilha: quem esquece de checar toma um `NullPointerException` em tempo de execução. O **`Optional`** torna a possibilidade de ausência **explícita no tipo**: é um *container* que pode ter um valor dentro, ou estar vazio.

É por isso que `findFirst()` devolve `Optional<T>`, o compilador te lembra de que talvez não haja resultado:

```java
Optional<Episodio> buscado = episodios.stream()
        .filter(e -> e.getTitulo().toUpperCase().contains(trecho.toUpperCase()))
        .findFirst();

if (buscado.isPresent()) {                  // tem algo dentro?
    System.out.println("Temporada: " + buscado.get().getTemporada());
} else {
    System.out.println("Episódio não encontrado :(");
}
```

A diferença filosófica: com `null`, esquecer a checagem é um erro silencioso; com `Optional`, a assinatura do método já grita "posso vir vazio, decida o que fazer".

### Datas com java.time

#### LocalDate: datas como tipo, não como texto

Data guardada como `String` não serve para nada além de exibir: não dá para comparar, ordenar nem calcular. O pacote **`java.time`** dá às datas um tipo de verdade, o **`LocalDate`** (só data, sem hora):

```java
LocalDate data = LocalDate.parse("2011-04-17");   // texto ISO (ano-mês-dia) → LocalDate
data.isAfter(LocalDate.of(2010, 1, 1));           // true — comparações de verdade
```

Com o tipo certo, comparações (`isAfter`, `isBefore`), ordenações e filtros por período viram chamadas de método.

#### Exibindo em outro formato

O `parse` padrão espera o formato ISO (`2011-04-17`), mas exibir para o usuário pede o formato brasileiro. Quem faz a ponte é o **`DateTimeFormatter`**:

```java
DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println(data.format(formatador));      // 17/04/2011
```

#### Quando a conversão falha

Dados vindos de fora **falham**, uma API pode mandar `"N/A"` onde deveria haver uma data ou um número. Cada conversão arriscada merece seu próprio `try/catch`, com um **valor padrão consciente** para o caso de erro:

```java
try {
    this.dataLancamento = LocalDate.parse(texto);
} catch (DateTimeParseException e) {   // texto não é uma data válida
    this.dataLancamento = null;
}

try {
    this.avaliacao = Double.valueOf(textoAvaliacao);
} catch (NumberFormatException e) {    // texto não é um número
    this.avaliacao = 0.0;
}
```

Capturar a exceção **específica** (e não `Exception` genérica) mantém o tratamento honesto: só o erro esperado é absorvido; qualquer outro problema continua aparecendo.

### Estatísticas com streams

#### Agrupando com groupingBy

Perguntas do tipo "média de X **por** Y" (média de avaliação por temporada, total de vendas por mês) pedem duas coisas: **agrupar** e **calcular por grupo**. O coletor **`Collectors.groupingBy`** faz os dois de uma vez, recebendo a chave do grupo e um coletor *downstream* com o cálculo, e devolve um `Map`:

```java
Map<Integer, Double> mediaPorTemporada = episodios.stream()
        .filter(e -> e.getAvaliacao() > 0.0)
        .collect(Collectors.groupingBy(Episodio::getTemporada,          // chave do grupo
                Collectors.averagingDouble(Episodio::getAvaliacao)));   // cálculo por grupo
// → {1=8.3, 2=8.7, 3=9.1}
```

#### DoubleSummaryStatistics: várias estatísticas de uma vez

Quando queremos média, máximo, mínimo **e** contagem, percorrer a lista quatro vezes seria desperdício. O coletor `Collectors.summarizingDouble` percorre **uma vez** e devolve um objeto **`DoubleSummaryStatistics`** com tudo calculado:

```java
DoubleSummaryStatistics est = episodios.stream()
        .filter(e -> e.getAvaliacao() > 0.0)
        .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));

est.getAverage();   // média
est.getMax();       // maior avaliação
est.getMin();       // menor avaliação
est.getCount();     // quantidade considerada
```

#### Higiene dos dados antes da análise

Repare no `filter` presente nos dois exemplos: elementos sem avaliação real (convertidos para `0.0` no tratamento de exceção) **distorceriam a média** se entrassem no cálculo. A lição vale para qualquer análise: **defina o que é dado válido e filtre antes de calcular**; estatística sobre dado sujo produz conclusão errada com cara de certa.

### Enums: um tipo com valores fixos

Alguns dados só podem assumir um conjunto **conhecido e limitado** de valores: o gênero de uma série, o tipo de um artista, o status de um pedido. Guardar isso em uma `String` deixa a porta aberta para erro de digitação e valor inválido, e o compilador não ajuda em nada. O **enum** cria um tipo próprio cujos valores possíveis são fixos:

```java
public enum Categoria {
    ACAO, ROMANCE, COMEDIA, DRAMA, CRIME;
}
```

A partir daí, `Categoria.DRAMA` é um valor válido e `"drma"` sequer compila.

#### Enums com atributos e construtor

Em Java, cada valor de um enum é um **objeto**, e pode carregar atributos próprios. Isso resolve um problema concreto do Screen Match: a API do OMDb devolve `"Action"`, mas o menu precisa entender `"Ação"`. O enum guarda as duas formas:

```java
public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime");

    private String categoriaOmdb;
    private String categoriaPtbr;

    Categoria(String categoriaOmdb, String categoriaPtbr) {  // recebe o que está entre parênteses acima
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPtbr = categoriaPtbr;
    }
}
```

O construtor de um enum é sempre privado (nem precisa escrever `private`): os únicos objetos que existem são os declarados no topo.

#### Métodos personalizados: convertendo texto em enum

Enum também tem métodos, inclusive estáticos. O método `values()` (que o Java gera de graça) devolve todos os valores, e um `for` sobre ele faz a correspondência entre o texto recebido e a constante certa:

```java
public static Categoria fromString(String text) {
    for (Categoria categoria : Categoria.values()) {
        if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
            return categoria;
        }
    }
    throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
}
```

`fromString` converte o texto recebido da API (inglês) na constante correspondente. Note a escolha de lançar `IllegalArgumentException` em vez de retornar `null`: um dado que não bate com nenhuma categoria é um erro, e erro deve aparecer imediatamente, não se esconder como `null` para causar um `NullPointerException` inexplicável lá na frente.

Quando o texto já é idêntico ao nome da constante, nem isso é preciso: o `valueOf` já vem pronto no enum.

```java
this.tipo = TipoArtista.valueOf(tipo.toUpperCase());   // "banda" → TipoArtista.BANDA
```

### Do record da API para a classe de domínio

O caminho completo do dado no projeto tem três estágios: **JSON → record → classe de domínio**. O record carrega os dados crus, com o vocabulário da API; a classe de domínio (`Serie`) carrega o vocabulário do projeto, os comportamentos e, quando entra a JPA, o mapeamento para o banco. Um construtor faz a ponte:

```java
public Serie(DadosSerie dadosSerie) {
    this.titulo = dadosSerie.titulo();
    this.totalTemporadas = dadosSerie.totalTemporadas();
    this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
    this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
    this.atores = dadosSerie.atores();
    this.poster = dadosSerie.poster();
    this.sinopse = ConsultaMyMemory.obterTraducao(dadosSerie.sinopse()).trim();
}
```

Dois detalhes valem atenção:

- **`genero().split(",")[0].trim()`** - a API manda `"Drama, Crime, Thriller"` em um único campo; separamos por vírgula, ficamos com o primeiro e tiramos os espaços das pontas;
- **`OptionalDouble.of(...).orElse(0)`** - o *"if reduzido"*: em vez de escrever um `if` para o caso de não haver valor, o `OptionalDouble` embrulha o número e o `orElse` já entrega o padrão. Vale lembrar que `OptionalDouble.of` sempre recebe um valor de fato, quando a origem pode ser nula ou o texto pode não ser numérico, quem protege de verdade é o `Optional.ofNullable(...)` ou o `try/catch` em volta da conversão (foi o caminho usado em `Episodio`).

Ampliar o que se busca é só ampliar o record: mapeando mais campos do JSON (`Genre`, `Actors`, `Poster`, `Plot`) com `@JsonAlias`, eles passam a existir no record e, na sequência, na entidade.

### Traduzindo dados com uma API de IA

A sinopse chega em inglês, e traduzi-la é trabalho para um modelo de linguagem. Com a dependência `com.theokanning.openai-gpt3-java` no `pom.xml`, uma classe de serviço encapsula a chamada:

```java
public static String obterTraducao(String texto) {
    OpenAiService service = new OpenAiService(System.getenv("OPENAI_APIKEY"));

    CompletionRequest requisicao = CompletionRequest.builder()
            .model("gpt-3.5-turbo-instruct")
            .prompt("traduza para o português o texto: " + texto)
            .maxTokens(1000)
            .temperature(0.7)
            .build();

    return service.createCompletion(requisicao).getChoices().get(0).getText();
}
```

Os parâmetros da requisição:

- **`model`** - qual modelo responde;
- **`prompt`** - a instrução em linguagem natural, é o "código" que se escreve para uma IA;
- **`maxTokens`** - teto de tamanho da resposta (e, na prática, do custo);
- **`temperature`** - o quanto a resposta pode variar: perto de `0` é mais previsível, mais alto é mais criativo.

Como a API da OpenAI é paga, o projeto usa por padrão a alternativa gratuita **MyMemory**, consumida com o mesmo `ConsumoApi` de sempre. O detalhe novo é o **`URLEncoder`**: texto com espaços, acentos ou `|` não pode ir cru numa URL, ele precisa ser codificado antes.

```java
String texto = URLEncoder.encode(text);
String langpair = URLEncoder.encode("en|pt-br");
String url = "https://api.mymemory.translated.net/get?q=" + texto + "&langpair=" + langpair;
```

E a regra que vale para as duas: **chave de API não fica no código-fonte**, e sim em variável de ambiente.

### Bancos de dados relacionais e PostgreSQL

#### Por que sair da memória?

Até aqui, tudo o que a aplicação buscava vivia em uma `List` na memória: fechou o programa, os dados sumiram. Gravar em arquivo JSON resolvia metade do problema (persistia), mas não a outra metade: buscar, filtrar, ordenar e relacionar dados em arquivo é lento e manual. Isso é trabalho de **banco de dados**.

#### Relacional x não relacional

Um banco **relacional** organiza os dados em **tabelas** (linhas e colunas), com esquema definido e relacionamentos explícitos entre elas. É a escolha natural quando os dados têm estrutura estável e as relações importam, o próprio banco garante a consistência (tipos, campos obrigatórios, valores únicos, integridade das relações), e a linguagem de consulta é o **SQL**.

Os **não relacionais** (NoSQL) abrem mão de parte disso em troca de flexibilidade: documentos (MongoDB), chave-valor (Redis), grafos (Neo4j). Sem esquema rígido, cada registro pode ter uma forma diferente.

O vocabulário mínimo do mundo relacional:

- **Tabela** - o conjunto de registros de um tipo (`series`, `episodios`);
- **Coluna** - um atributo, com tipo definido (`titulo` é texto, `avaliacao` é numérico);
- **Linha / registro** - uma ocorrência (uma série específica);
- **Chave primária (PK)** - a coluna que identifica cada linha de forma única (o `id`);
- **Chave estrangeira (FK)** - a coluna que aponta para a chave primária de outra tabela, é ela que **materializa o relacionamento**.

#### PostgreSQL

O **PostgreSQL** é um SGBD relacional open source, maduro e muito usado no mercado. A instalação traz o servidor, que roda por padrão na porta **5432**, e o **pgAdmin**, interface gráfica para administrar os bancos. Com ele no ar, o passo inicial é criar o banco da aplicação (por exemplo, `screenmatch`) e guardar quatro informações: **host**, **nome do banco**, **usuário** e **senha**.

### JPA, Hibernate e ORM

#### O problema: objetos de um lado, tabelas do outro

O Java pensa em **objetos** (com herança, composição, listas de outros objetos); o banco pensa em **tabelas** (linhas, colunas, chaves). Traduzir manualmente entre os dois mundos, escrevendo SQL na mão para cada operação, é repetitivo e frágil. **ORM** (*Object-Relational Mapping*) é o nome da técnica que automatiza essa tradução.

#### JPA: a especificação

A **JPA** (*Jakarta/Java Persistence API*) é a **especificação** de ORM do ecossistema Java: define uma interface comum para persistir objetos, sem dizer *como* isso é feito. Seus conceitos-chave:

- **Entidade** - uma classe Java que representa algo armazenado no banco; cada entidade é mapeada para uma tabela;
- **EntityManager** - a interface central da JPA, que executa as operações de persistência (o CRUD) e gerencia o ciclo de vida das entidades;
- **JPQL** - a linguagem de consulta da JPA: um SQL orientado a objetos, escrito sobre **classes e atributos**, não sobre tabelas e colunas.

A vantagem de programar contra uma especificação é o **baixo acoplamento**: como a JPA encapsula a conversa com o banco, trocar o banco da aplicação (ou a implementação da JPA) não exige reescrever o código.

#### Hibernate: a implementação

A JPA sozinha não conecta em nada, ela é um contrato. Quem implementa esse contrato são frameworks como o **Hibernate**, a implementação mais popular e a usada aqui. É ele quem gera o SQL, conversa com o driver do banco e devolve objetos Java prontos.

#### Onde cada peça entra

```
Aplicação
   ↓
Spring Data JPA   → repositórios prontos: save, findAll, derived queries
   ↓
JPA               → a especificação: @Entity, EntityManager, JPQL
   ↓
Hibernate         → a implementação: gera o SQL
   ↓
Driver JDBC       → conversa com o banco
   ↓
PostgreSQL
```

Na prática, escrevemos quase só na camada de cima; o resto é configuração.

### Anotações de mapeamento

As anotações (do pacote `jakarta.persistence`) são o que transforma uma classe comum em entidade. As principais:

| Anotação | Para que serve |
|---|---|
| `@Entity` | marca a classe como entidade, ou seja, mapeada para uma tabela |
| `@Table(name = "...")` | personaliza o nome da tabela (por padrão, o Hibernate usa o nome da classe) |
| `@Id` | define o atributo que é a **chave primária** |
| `@GeneratedValue(strategy = ...)` | delega a geração do id ao banco (`IDENTITY`, `SEQUENCE`, `AUTO`, `TABLE`) |
| `@Column(name, unique, nullable)` | personaliza nome, obrigatoriedade e unicidade da coluna |
| `@Enumerated(EnumType.STRING)` | grava um enum como texto no banco |
| `@Transient` | marca um atributo que **não** deve ser persistido |
| `@OneToMany` / `@ManyToOne` | relacionamento um-para-muitos e muitos-para-um |
| `@OneToOne` / `@ManyToMany` | relacionamento um-para-um e muitos-para-muitos |
| `@JoinColumn(name = "...")` | define a coluna de chave estrangeira do relacionamento |
| `@JoinTable(...)` | define a tabela intermediária de um muitos-para-muitos |
| `@Embeddable` / `@Embedded` | reaproveita um grupo de campos dentro de outra entidade |
| `@NamedQuery` | dá nome a uma consulta JPQL para reutilizá-la |

A entidade `Serie` reunindo boa parte disso:

```java
@Entity
@Table(name = "series")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)          // não deixa gravar a mesma série duas vezes
    private String titulo;

    private Integer totalTemporadas;
    private Double avaliacao;

    @Enumerated(EnumType.STRING)    // grava "DRAMA", não 3
    private Categoria genero;

    public Serie() {}               // construtor vazio: obrigatório para a JPA
    ...
}
```

Três observações que economizam dor de cabeça:

- **Construtor vazio é obrigatório.** A JPA instancia a entidade por reflexão antes de preencher os campos; sem o construtor sem argumentos, a aplicação quebra ao subir.
- **`EnumType.STRING` em vez de `ORDINAL`.** O padrão (`ORDINAL`) grava a **posição** do valor no enum, se alguém reordenar as constantes depois, todos os registros antigos passam a significar outra coisa. `STRING` grava o nome e é imune a isso.
- **Atributos sem anotação também viram coluna.** O Hibernate mapeia tudo por convenção (`totalTemporadas` → `total_temporadas`); as anotações só entram quando queremos algo **diferente** do padrão.

### Configurando a persistência no projeto

#### Dependências

Duas linhas no `pom.xml`: a estrela do Spring Data JPA (que traz a JPA e o Hibernate junto) e o driver do banco.

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

#### application.properties

É o arquivo em `src/main/resources` onde a aplicação diz **onde** está o banco e **como** se comportar com ele:

```properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
```

- **`ddl-auto`** - o que o Hibernate faz com o **esquema** ao subir: `update` cria o que falta e preserva os dados (ótimo para estudo), `create` recria do zero a cada execução (apaga tudo), `validate` só confere se o mapeamento bate com o banco, `none` não mexe. Em produção, quem controla o esquema são migrações versionadas, não o `ddl-auto`.
- **`show-sql` / `format-sql`** - imprimem no console o SQL que o Hibernate gerou. É a melhor forma de **ver o ORM trabalhando** e entender o que uma consulta realmente faz.

#### Variáveis de ambiente

Repare que nenhuma senha aparece no arquivo: `${DB_HOST}`, `${DB_USER}` e `${DB_PASSWORD}` são **variáveis de ambiente**, lidas do sistema (ou configuradas nas *run configurations* da IDE) na hora de subir a aplicação. Assim o repositório pode ser público sem expor credenciais, e cada máquina, ou cada ambiente, aponta para um banco diferente sem alterar uma linha de código. A mesma ideia vale para as chaves de API.

### Repositories e injeção de dependências

#### A interface que ninguém implementa

Para operar sobre uma entidade, o Spring Data JPA pede apenas uma **interface** que estenda `JpaRepository`, informando a entidade e o tipo da chave primária:

```java
public interface SerieRepository extends JpaRepository<Serie, Long> { }
```

Não existe classe implementando essa interface, e é justamente esse o truque: o Spring **gera a implementação em tempo de execução**. Só com essa linha já vêm prontos:

```java
repositorio.save(serie);        // insere ou atualiza
repositorio.saveAll(lista);     // salva vários
repositorio.findAll();          // lista tudo
repositorio.findById(id);       // busca por id → Optional
repositorio.delete(serie);      // remove
repositorio.count();            // conta
```

#### Injeção de dependências

Uma interface não pode ser instanciada com `new`, então de onde vem o objeto? Do **contêiner do Spring**. O framework cria e gerencia esses objetos (os *beans*) e os **entrega** a quem declarar que precisa deles, é a **injeção de dependências**. A declaração se faz com `@Autowired`, e só funciona dentro de classes que o próprio Spring gerencia (como a classe anotada com `@SpringBootApplication`):

```java
@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    @Autowired
    private SerieRepository repositorio;   // o Spring preenche isto sozinho

    @Override
    public void run(String... args) {
        Principal principal = new Principal(repositorio);   // e a Principal recebe pelo construtor
        principal.exibeMenu();
    }
}
```

A `Principal` não é gerenciada pelo Spring, então ela **recebe o repositório pelo construtor**. Esse padrão, depender de uma abstração recebida de fora em vez de construí-la internamente, é o que mantém as classes desacopladas e testáveis.

### Relacionamentos entre entidades

Uma série tem **vários** episódios; cada episódio pertence a **uma** série. É um relacionamento **um-para-muitos**, e a JPA quer os dois lados declarados:

```java
// em Serie.java
@OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Episodio> episodios = new ArrayList<>();

// em Episodio.java
@ManyToOne
private Serie serie;
```

No banco, quem guarda a relação é a tabela `episodios`, através de uma coluna **`serie_id`**, a chave estrangeira apontando para a chave primária de `series`. O **`mappedBy = "serie"`** diz exatamente isso: "o dono da relação é o atributo `serie` do outro lado, não crie uma tabela extra para isso".

Os tipos de relacionamento possíveis são quatro: **um-para-um** (`@OneToOne`), **um-para-muitos** e **muitos-para-um** (`@OneToMany`/`@ManyToOne`) e **muitos-para-muitos** (`@ManyToMany`, que exige uma tabela intermediária, definida no `@JoinTable`).

#### Cascade: operações que se propagam

Salvamos a série e, depois, os episódios dela. Sem configuração, o Hibernate reclamaria de estar salvando uma série com episódios ainda não persistidos. O atributo **`cascade`** define quais operações se propagam do pai para os filhos: `CascadeType.ALL` propaga todas (salvar, atualizar, remover), o que aqui faz sentido, um episódio não existe sem a sua série.

#### Fetch: quando os dados relacionados são carregados

- **`FetchType.LAZY`** (padrão do `@OneToMany`) - carrega a série agora e os episódios **só quando forem acessados**. Economiza consulta, mas exige que a sessão com o banco ainda esteja aberta na hora do acesso;
- **`FetchType.EAGER`** - traz série **e** episódios de uma vez. Mais simples numa aplicação de console como esta, e mais pesado quanto maior a coleção.

Não há opção universalmente certa: é uma troca entre número de consultas e volume de dados trazido.

#### Relacionamento bidirecional consistente

Quando os dois lados existem no código, os dois lados precisam ser atualizados, senão o objeto em memória fica com uma relação "pela metade" (o episódio não sabe de qual série é, e a FK vai nula para o banco). A solução é resolver isso **dentro do próprio setter**:

```java
public void setEpisodios(List<Episodio> episodios) {
    episodios.forEach(e -> e.setSerie(this));   // cada episódio passa a conhecer a série
    this.episodios = episodios;
}
```

Assim quem usa a classe não precisa lembrar de fazer as duas chamadas, a entidade cuida da própria coerência.

### Derived queries

#### Consultas escritas no nome do método

O Spring Data JPA lê o **nome do método** declarado no repositório, interpreta as palavras-chave e **gera a consulta**. Nada de corpo, nada de SQL:

```java
public interface SerieRepository extends JpaRepository<Serie, Long> {
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);
    List<Serie> findByAtoresContainingIgnoreCase(String nomeAtor);
    List<Serie> findTop5ByOrderByAvaliacaoDesc();
    List<Serie> findByGenero(Categoria categoria);
    List<Serie> findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(int temporadas, double avaliacao);
}
```

As palavras-chave mais usadas:

| Palavra-chave | Exemplo | O que gera |
|---|---|---|
| `findBy` | `findByTitulo(String titulo)` | igualdade exata |
| `Containing` | `findByTituloContaining(...)` | `like %valor%` |
| `IgnoreCase` | `findByTituloContainingIgnoreCase(...)` | ignora maiúsculas/minúsculas |
| `And` / `Or` | `findByGeneroAndAvaliacao(...)` | combina condições |
| `GreaterThan(Equal)` / `LessThan(Equal)` | `findByAvaliacaoGreaterThanEqual(...)` | `>` / `>=` / `<` / `<=` |
| `Between` | `findByAvaliacaoBetween(a, b)` | intervalo |
| `OrderBy...Asc/Desc` | `findByGeneroOrderByAvaliacaoDesc(...)` | ordenação |
| `Top` / `First` | `findTop5ByOrderByAvaliacaoDesc()` | limita a quantidade |
| `countBy` | `countByCategoriaNome(...)` | contagem |
| navegação por atributo | `findByCategoriaNome(String nome)` | entra na entidade relacionada |

#### Streams ou banco?

Antes, buscar uma série pelo título era filtrar uma lista em memória com stream. Agora é uma chamada ao repositório. A diferença não é só estética: o stream exige **carregar tudo** para depois descartar quase tudo, enquanto a consulta filtra **dentro do banco**, com índices, e traz só o que interessa. Com dez séries dá na mesma; com dez mil, não. A regra prática: **filtrar e ordenar é trabalho do banco**; streams continuam ótimos para transformar em memória os dados que já vieram.

> E o argumento de "filtrar na aplicação para poupar o banco" não se sustenta: ele leria tudo do disco **e** mandaria tudo pela rede do mesmo jeito, só para a aplicação descartar quase tudo depois.

#### Quando a consulta pesa

Filtro em coluna indexada é das operações mais baratas que existem, então a saída para uma consulta lenta é **deixá-la mais leve**, não tirar o filtro do SQL:

- **índice** na coluna que se filtra ou ordena, é o que evita percorrer a tabela inteira (*scan*);
- **projeção** só das colunas necessárias, em vez de trazer a entidade inteira;
- **paginação**, para não carregar milhares de registros de uma vez.

O que costuma pesar não é o filtro em si, e sim a consulta mal montada: ordenação sem índice ou o problema **N+1**, uma consulta para trazer a lista e mais uma para cada item dela, que é justamente o risco do `FetchType.LAZY` quando os dados relacionados são acessados num laço.

> Existem caminhos mais pesados (cache, réplica de leitura, view materializada), mas eles respondem a **outra** pergunta: o que vale a pena guardar pronto em vez de recalcular. Isso é assunto de arquitetura, não da escolha entre stream e consulta.

#### Tipos de retorno

A assinatura declara o que a busca pode devolver, e cada escolha tem consequência:

- **`Serie`** - devolve `null` se não achar (e explode se achar mais de um);
- **`List<Serie>`** - devolve lista vazia quando não há resultado, nunca `null`;
- **`Optional<Serie>`** - deixa a ausência **explícita**, e obriga quem chama a tratá-la com `isPresent()`/`orElse()`.

Para buscas que podem não encontrar nada, `Optional` é a opção mais honesta:

```java
Optional<Serie> serie = repositorio.findByTituloContainingIgnoreCase(nomeSerie);
if (serie.isPresent()) {
    System.out.println("Dados da série: " + serie.get());
} else {
    System.out.println("Série não encontrada");
}
```

#### Lendo um enum digitado pela pessoa usuária

Para filtrar por gênero, o texto digitado em português precisa virar `Categoria` antes de chegar ao repositório, é aí que o método personalizado do enum entra em cena:

```java
String nomeGenero = leitura.nextLine();
Categoria categoria = Categoria.fromPtbr(nomeGenero);   // "comédia" → Categoria.COMEDIA
List<Serie> series = repositorio.findByGenero(categoria);
```

### JPQL e consultas personalizadas

#### Quando o nome do método não dá conta

`findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual` funciona, mas ninguém merece ler isso. Quando a consulta cresce, a **`@Query`** permite dar ao método um nome curto e escrever a consulta separadamente, em **JPQL**:

```java
@Query("select s from Serie s where s.totalTemporadas <= :totalTemporadas and s.avaliacao >= :avaliacao")
List<Serie> seriesPorTemporadaEAvaliacao(int totalTemporadas, double avaliacao);
```

JPQL **se parece** com SQL, mas opera sobre o modelo de objetos: `Serie` é a **classe** (não a tabela `series`) e `s.avaliacao` é o **atributo** (não a coluna). Os `:parametros` são preenchidos pelos argumentos do método, o `@Param("nome")` só é necessário quando os nomes não coincidem.

#### Junções pelo relacionamento

Como o mapeamento já conhece a relação, o `join` é feito **pelo atributo**, sem `on` nem chave estrangeira à vista. Isso permite partir de uma série e buscar **episódios**:

```java
@Query("select e from Serie s join s.episodios e where e.titulo ilike %:trechoEpisodio%")
List<Episodio> episodiosPorTrecho(String trechoEpisodio);

@Query("select e from Serie s join s.episodios e where s = :serie order by e.avaliacao desc limit 5")
List<Episodio> topEpisodiosPorSerie(Serie serie);
```

Note que o **retorno é `List<Episodio>`** mesmo estando em `SerieRepository`: o `select` define o que volta, não a entidade do repositório.

#### Recursos de SQL que aparecem aqui

- **`like` / `ilike`** - busca por trecho com `%`; o `ilike` (do PostgreSQL) ignora maiúsculas/minúsculas;
- **`order by ... desc`** e **`limit`** - ordenar e cortar o resultado no banco;
- **funções de data** - assim como o Java tem o `java.time`, o SQL tem as suas: `YEAR(e.dataLancamento)` extrai o ano direto na consulta;
- **agregações** - `AVG`, `MAX`, `COUNT` com `GROUP BY` e `HAVING`;
- **`random()`** - ordenação aleatória; com `limit 1`, é a forma mais curta de **sortear um registro** sem carregar a tabela inteira na aplicação:

```java
@Query("select f from Frase f order by random() limit 1")
Frase sorteioFrase();
```

```java
@Query("select e from Serie s join s.episodios e where s = :serie and YEAR(e.dataLancamento) >= :anoLancamento")
List<Episodio> episodiosPorSerieEAno(Serie serie, int anoLancamento);

@Query("SELECT c.nome, COUNT(p) FROM Produto p JOIN p.categoria c GROUP BY c.nome HAVING COUNT(p) > :quantidade")
List<Object[]> categoriasComMaisDe(@Param("quantidade") long quantidade);
```

Quando o `select` não devolve uma entidade inteira, mas um conjunto de colunas, o retorno vem como `List<Object[]>`, cada posição do array é uma coluna projetada.

#### Consultas nativas

Se for preciso usar um recurso específico do banco, dá para escrever **SQL puro** com `nativeQuery = true`. Aí valem os nomes reais de **tabelas e colunas**, e a consulta deixa de ser portátil entre bancos, é a saída de emergência, não a primeira escolha:

```java
@Query(value = "SELECT * FROM produto ORDER BY preco DESC LIMIT 5", nativeQuery = true)
List<Produto> buscarTop5ProdutosMaisCaros();
```

#### Resumo dos três caminhos

| Forma | Como se escreve | Quando usar |
|---|---|---|
| **Derived query** | palavras-chave no nome do método | consultas simples e diretas |
| **JPQL (`@Query`)** | consulta sobre classes e atributos | consultas complexas, junções, agregações |
| **Native query** | SQL puro (`nativeQuery = true`) | recursos exclusivos do banco |

### Do console para a web

#### A aplicação ganha um servidor

Até aqui o Screen Match era uma aplicação **de console**: o `CommandLineRunner` subia o menu e o resultado aparecia no terminal de quem executou. Para que outra aplicação, um site ou um app, consiga usar esses dados, ele precisa **responder por HTTP**. Uma dependência resolve:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

O *starter* `web` traz o Spring MVC, o Jackson e um **Tomcat embutido**, não há servidor para instalar nem arquivo para publicar. Rodar a classe `...Application` sobe a aplicação em **`http://localhost:8080`**, e ela **não termina mais sozinha**: fica no ar esperando requisições. A porta é configurável:

```properties
server.port=8081
```

Com o servidor no lugar, a classe principal deixa de implementar `CommandLineRunner`, quem "chama" a aplicação agora é o navegador.

#### Front-end e back-end conversando

O front-end (HTML, CSS e JavaScript, aberto com a extensão *Live Server* do VS Code) não sabe nada de Java: ele faz um `fetch` para uma URL e espera **JSON** de volta.

```javascript
const baseURL = 'http://localhost:8080';

export default function getDados(endpoint) {
    return fetch(`${baseURL}${endpoint}`)
        .then(response => response.json());
}
```

O trabalho do back-end é fazer com que cada endereço que o front chama (`/series`, `/series/top5`, `/series/{id}`...) **exista e devolva os dados no formato esperado**. São dois projetos separados, rodando em portas separadas, unidos apenas pelo contrato das rotas, e é por isso que o desenvolvimento vira **incremental**: implementa-se uma rota, confere-se na tela o que passou a funcionar, e segue para a próxima.

### MVC e a organização em camadas

**MVC** (*Model-View-Controller*) separa a aplicação em três papéis:

- **Model** - os dados e as regras do domínio;
- **View** - a apresentação, o que a pessoa vê;
- **Controller** - o intermediário, que recebe a requisição, aciona o model e devolve a resposta.

Em Java, o padrão já foi aplicado com **JSP** (código Java misturado ao HTML) e com o **Thymeleaf** (páginas HTML na pasta `resources`, sem mistura de código), os dois mantendo a View **dentro** da aplicação Java. O mais comum hoje é **separar front-end e back-end**: o back-end fica com Model e Controller e entrega só dados; o front-end, uma aplicação à parte, cuida da View.

No projeto, isso vira um pacote por responsabilidade:

```
br.com.amanda.screenmatch
├── model/        → entidades e records (os dados)
├── repository/   → acesso ao banco
├── service/      → regras de negócio
├── dto/          → os dados que saem pela API
├── controller/   → as rotas
└── config/       → configurações (CORS, por exemplo)
```

Cada camada conversa apenas com a vizinha: o controller chama o serviço, o serviço chama o repositório, o repositório fala com o banco.

### Controllers: as rotas da API

#### A primeira rota

Um **controller** é a porta de entrada HTTP da aplicação:

```java
@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService servico;

    @GetMapping
    public List<SerieDTO> obterSeries() {
        return servico.obterTodasSeries();
    }
}
```

- **`@RestController`** - registra a classe como controladora e faz com que **o retorno dos métodos vire o corpo da resposta**, serializado em JSON. É a soma de `@Controller` + `@ResponseBody`; o `@Controller` sozinho devolveria o nome de uma página a ser renderizada;
- **`@RequestMapping("/series")`** - o prefixo comum a todas as rotas da classe, evita repetir `/series` em cada método;
- **`@GetMapping`** - mapeia o método para o verbo **GET** naquele caminho (aqui, `/series` puro).

Basta subir a aplicação e abrir `localhost:8080/series` no navegador para ver o JSON. Não escrevemos uma linha de conversão: o Jackson, que veio junto com o *starter* `web`, **serializa** a lista de objetos automaticamente.

#### Parâmetros na URL com @PathVariable

Rotas que dependem de um dado (o id da série, o nome de um gênero) declaram o trecho variável **entre chaves** no mapeamento e recebem esse valor em um parâmetro anotado com **`@PathVariable`**:

```java
@GetMapping("/{id}")
public SerieDTO obterPorId(@PathVariable Long id) {
    return servico.obterPorId(id);
}

@GetMapping("/{id}/temporadas/{numero}")
public List<EpisodioDTO> obterTemporadasPorNumero(@PathVariable Long id, @PathVariable Long numero) {
    return servico.obterTemporadasPorNumero(id, numero);
}

@GetMapping("/categoria/{genero}")
public List<SerieDTO> obterSeriesPorCategoria(@PathVariable String genero) {
    return servico.obterSeriesPorCategoria(genero);
}
```

O nome entre chaves precisa ser **igual** ao do parâmetro do método, e o tipo pode ser número ou texto: `/series/1` e `/series/categoria/comédia` usam o mesmo recurso. Vale a mesma lição da integração com o front: **testar com registros diferentes**, e não só com o primeiro da lista, é o que confirma que a busca está mesmo correta.

> **`@PathVariable` ou `@RequestParam`?** O primeiro lê um pedaço do **caminho** (`/series/1`); o segundo lê a **query string** (`/series?id=1`). Caminho para identificar o recurso, query string para filtros e opções.

#### As anotações web mais usadas

| Anotação | Para que serve |
|---|---|
| `@Controller` | classe controladora no padrão MVC (devolve páginas) |
| `@RestController` | controladora de API REST: o retorno vira JSON (`@Controller` + `@ResponseBody`) |
| `@RequestMapping` | mapeia URL e verbo HTTP para a classe ou o método |
| `@GetMapping` / `@PostMapping` / `@PutMapping` / `@DeleteMapping` | atalhos para GET, POST, PUT e DELETE |
| `@PathVariable` | lê um trecho variável da URL |
| `@RequestParam` | lê um parâmetro da query string |
| `@RequestBody` | converte o JSON enviado na requisição em um objeto |
| `@ResponseBody` | usa o retorno do método como corpo da resposta |
| `@Valid` / `@Validated` | dispara a validação dos dados recebidos |
| `@CrossOrigin` | libera o acesso de outra origem (CORS) |

### A camada de serviço com @Service

É a mesma separação de responsabilidades da [modularização](#modularização-classes-de-serviço), agora com o Spring cuidando das instâncias. A regra que mantém o controller legível: **a única responsabilidade dele é a comunicação**, receber a requisição, chamar quem sabe resolver e devolver a resposta. Regra de negócio não mora ali. Quem faz o trabalho é uma classe anotada com **`@Service`**, que o Spring gerencia e injeta no controller:

```java
@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public List<SerieDTO> obterTodasSeries() {
        return converteDados(serieRepository.findAll());
    }

    public List<SerieDTO> obterTop5Series() {
        return converteDados(serieRepository.findTop5ByOrderByAvaliacaoDesc());
    }

    private List<SerieDTO> converteDados(List<Serie> series) {   // extraído: a conversão se repetia em todo método
        return series.stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),
                        s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }
}
```

Repare no `converteDados`: a mesma transformação de `Serie` em `SerieDTO` aparecia em cada método do serviço. **Extrair o trecho repetido para um método privado** é das refatorações mais simples e mais valiosas: no dia em que o DTO ganhar um campo novo, um único lugar muda.

### DTOs e serialização

#### O problema: serialização circular

Devolver a entidade `Serie` direto do controller parece o caminho curto, mas quebra. `Serie` tem uma lista de `Episodio`, e cada `Episodio` tem uma referência de volta para `Serie`: é o **relacionamento bidirecional** que a JPA pediu. Na hora de gerar o JSON, o Jackson entra em **loop infinito** - série → episódios → série → episódios... até estourar.

#### A solução: Data Transfer Object

Um **DTO** (*Data Transfer Object*) é uma classe simples, sem relacionamentos e sem comportamento, que existe só para **transportar os dados que a API devolve**. Um `record` cumpre esse papel com uma única declaração:

```java
public record SerieDTO(Long id, String titulo, Integer totalTemporadas,
                       Double avaliacao, Categoria genero, String atores,
                       String poster, String sinopse) {
}
```

Sem a lista de episódios não há ciclo, e vêm três ganhos junto:

- **Segurança** - só sai da API o que foi declarado no DTO; o resto da entidade fica de fora;
- **Contrato estável** - renomear um atributo da entidade não muda o JSON que o front consome;
- **Personalização** - cada rota tem o seu recorte (o `EpisodioDTO` leva só temporada, número e título).

A conversão acontece na camada de serviço: **entidade entra, DTO sai**, e o controller nunca vê a entidade.

### CORS: a resposta que o navegador bloqueia

Com a rota pronta e o front no ar, o navegador ainda recusa a resposta com um erro de **CORS** (*Cross-Origin Resource Sharing*). O motivo é uma política de segurança do próprio navegador, a *same-origin policy*: uma página só consome livremente recursos da **mesma origem**, ou seja, mesmo protocolo, mesmo domínio e mesma porta. O front roda em `127.0.0.1:5501` (Live Server) e a API em `localhost:8080`, portas diferentes, origens diferentes.

Quem precisa autorizar é o **servidor**. Uma classe de configuração declara quais origens e métodos são aceitos:

```java
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")                        // vale para todas as rotas
                .allowedOrigins("http://127.0.0.1:5501")  // a origem do front-end
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
```

- **`@Configuration`** - marca a classe como fonte de configuração, carregada pelo Spring na subida;
- **`WebMvcConfigurer`** - a interface com os pontos de extensão do Spring MVC; aqui sobrescrevemos o `addCorsMappings`.

Um detalhe que economiza tempo de depuração: a origem precisa bater **exatamente**, `http://127.0.0.1:5501` e `http://localhost:5501` são endereços diferentes para o navegador.

### DevTools e Live Reload

Reiniciar a aplicação a cada alteração custa segundos que viram minutos ao longo do dia. O **Spring Boot DevTools** faz isso sozinho assim que percebe que as classes foram recompiladas:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

No IntelliJ, duas configurações completam o arranjo:

- em *Build, Execution, Deployment → Compiler*, ligar o **Build project automatically**;
- na *run configuration* da aplicação, definir o **Update action / On frame deactivation** como **Update classes and resources**, assim, sair da janela da IDE já dispara a atualização.

Vale saber o limite: o DevTools reinicia o **back-end**; recarregar a página continua sendo trabalho do Live Server.

### O caminho completo de uma requisição

Fechando o ciclo, o percurso de um clique no navegador até o banco e de volta:

```
navegador (fetch /series/top5)
   ↓
Controller     → @RestController + @GetMapping: recebe a requisição
   ↓
Service        → @Service: aplica as regras e converte entidade em DTO
   ↓
Repository     → Spring Data JPA: consulta o banco
   ↓
PostgreSQL
   ↑
DTO → JSON     → o Jackson serializa a resposta
   ↑
navegador renderiza a tela
```

O Screen Match percorreu esse caminho inteiro ao longo da trilha: começou como um programa de console que imprimia texto, ganhou consumo de API e streams, depois um banco de dados e, por fim, um servidor e rotas próprias, virando uma aplicação que outras pessoas conseguem abrir e usar.

## Curso: Boas práticas de programação: automatizando testes com Java

O projeto desta etapa foi o **Adopet**, uma API REST de adoção de pets: abrigos cadastram animais, tutores solicitam adoções e cada solicitação passa por validações e dispara e-mails de aviso. Diferente das trilhas anteriores, aqui o foco não foi construir a aplicação, e sim **provar que ela funciona** escrevendo testes automatizados para cada camada, do cálculo de regras de negócio até as rotas HTTP. As ferramentas centrais foram o **JUnit** (para estruturar e rodar os testes), o **Mockito** (para isolar dependências) e o **MockMvc** do Spring (para simular requisições). Todas vêm juntas numa única dependência, a `spring-boot-starter-test`.

### Por que escrever testes automatizados

Testar manualmente, subir a aplicação e disparar requisições no **Postman**, por exemplo, funciona, mas não escala: cada alteração no código exigiria repetir todos os cenários na mão. Um teste automatizado é um trecho de código que **verifica outro trecho de código** e pode ser reexecutado a qualquer momento, de graça. Os ganhos:

- **Detecção precoce** - o erro aparece na hora de rodar os testes, e não em produção;
- **Segurança para mudar** - dá para refatorar sabendo que, se algo quebrar, um teste vai acusar;
- **Documentação viva** - os cenários de teste descrevem o comportamento esperado da aplicação.

A boa prática que acompanha isso: **testar a aplicação sempre que o código muda**, e cuidar para que os cenários de teste acompanhem essas mudanças. Quando um teste falha, o primeiro passo é descobrir **onde está o bug**, ele pode estar no código da aplicação ou no próprio código de teste (um cenário mal montado, um valor esperado errado).

> **Tipos de teste.** Existe uma pirâmide: os **testes de unidade** verificam uma peça isolada (um método, uma classe), são rápidos e numerosos; os **testes de integração** verificam várias peças conversando (a rota, o serviço e o banco juntos); e os **testes de ponta a ponta (E2E)** exercitam o sistema inteiro pela interface. A base da pirâmide (os de unidade) é onde mais se escreve, por serem baratos e rápidos.

Um conceito ligado a isso é a **cobertura de testes**: quanto do código é de fato exercitado pelos testes. Cobrir vários cenários (o caminho feliz, os erros, os limites) aumenta a cobertura e a confiança na aplicação.

### JUnit: a anatomia de um teste

O **JUnit** é a biblioteca padrão de testes em Java. Os testes moram em `src/test/java`, **espelhando os pacotes** de `src/main/java`: a classe `CalculadoraProbabilidadeAdocao` (no pacote `service`) é testada pela `CalculadoraProbabilidadeAdocaoTest`, no mesmo pacote `service` do lado de teste. Por convenção, a classe de teste leva o sufixo `Test`.

Cada cenário é um método anotado com **`@Test`**, é o que diz ao JUnit "este método é um teste, execute-o". Dentro dele, uma **asserção** compara o valor obtido com o esperado; se forem diferentes, o teste falha:

```java
class CalculadoraProbabilidadeAdocaoTest {

    @Test
    void probabilidadeAltaCenario1() {
        Abrigo abrigo = new Abrigo(new CadastroAbrigoDto("Abrigo feliz", "94999999999", "abrigofeliz@email.com.br"));
        Pet pet = new Pet(new CadastroPetDto(TipoPet.GATO, "Miau", "Siames", 4, "Cinza", 4.0f), abrigo);
        CalculadoraProbabilidadeAdocao calculadora = new CalculadoraProbabilidadeAdocao();

        ProbabilidadeAdocao probabilidade = calculadora.calcular(pet);

        Assertions.assertEquals(ProbabilidadeAdocao.ALTA, probabilidade);
    }
}
```

As asserções mais usadas, todas da classe `Assertions` do JUnit:

- **`assertEquals(esperado, obtido)`** - passa se os dois forem iguais; é a mais comum;
- **`assertThrows(Excecao.class, () -> ...)`** - passa se o trecho lançar a exceção indicada (ótimo para testar validações);
- **`assertDoesNotThrow(() -> ...)`** - o oposto: passa se **não** houver exceção.

O cálculo da calculadora depende de faixas de idade e peso, então **um teste só não basta**: escrevemos um cenário para a probabilidade `ALTA` (gato jovem e leve), outro para a `MEDIA` (gato idoso), e assim por diante. Cada faixa de regra merece o seu cenário.

### Nomes descritivos com @DisplayName

`probabilidadeAltaCenario1` diz pouco sobre o que o teste faz. O JUnit resolve isso com **`@DisplayName`**, que dá ao teste um nome legível, exibido nos relatórios:

```java
@Test
@DisplayName("Probabilidade alta para gatos jovens com peso baixo")
void probabilidadeAltaCenario1() { ... }
```

A vantagem é separar duas coisas: o **nome do método** segue as regras do Java, enquanto o **`@DisplayName`** descreve o cenário claro, sem precisar espremer todos os detalhes no nome do método. Quando um teste falha, é essa frase que aparece e ela deve dizer, sozinha, o que se esperava.

### AAA e GWT: organizando o cenário

Para o corpo do teste não virar uma parede de código, existem padrões de organização. O mais usado é o **AAA** (*Arrange, Act, Assert*), também chamado de **Triple A**, que divide o teste em três blocos:

- **Arrange (preparar)** - monta o cenário: cria objetos, define valores, configura dependências;
- **Act (agir)** - executa a ação que está sendo testada (normalmente uma única chamada de método);
- **Assert (verificar)** - confere se o resultado bate com o esperado.

No projeto, esses blocos aparecem marcados por comentários:

```java
@Test
void probabilidadeAltaCenario1() {
    //ARRANGE
    Pet pet = new Pet(new CadastroPetDto(TipoPet.GATO, "Miau", "Siames", 4, "Cinza", 4.0f), abrigo);
    CalculadoraProbabilidadeAdocao calculadora = new CalculadoraProbabilidadeAdocao();

    //ACT
    ProbabilidadeAdocao probabilidade = calculadora.calcular(pet);

    //ASSERT
    Assertions.assertEquals(ProbabilidadeAdocao.ALTA, probabilidade);
}
```

Um padrão irmão é o **GWT** (*Given, When, Then*), vindo do **BDD** (*Behavior-Driven Development*): **Given** (dado o contexto), **When** (quando a ação acontece), **Then** (então o resultado esperado). É a mesma ideia de três etapas, com uma linguagem mais próxima de como o comportamento é descrito entre as pessoas do time, inclusive as não técnicas. Não à toa, o Mockito traz uma API com esse vocabulário (`given(...).willReturn(...)`), que aparece nas próximas seções.

### Mocks: testando código com dependências

A calculadora era fácil de testar: ela não depende de nada, é só entrada e saída. Mas a maioria das classes tem **dependências**. O `AdocaoService` precisa dos repositórios, do `EmailService` e da lista de validações. Testar de verdade contra um banco e um servidor de e-mail deixaria o teste lento, instável e dependente de infraestrutura.

A solução é o **mock**: um objeto **falso** que ocupa o lugar da dependência real, devolvendo respostas combinadas e registrando como foi chamado. Assim o teste isola **a classe sob teste**, e não o mundo em volta dela. A biblioteca padrão para isso em Java é o **Mockito**.

Para o Mockito entrar em ação, a classe de teste é anotada com **`@ExtendWith(MockitoExtension.class)`**. A partir daí:

- **`@Mock`** - cria um objeto simulado da dependência;
- **`@InjectMocks`** - cria a classe sob teste e **injeta nela** os mocks declarados acima;
- **`BDDMockito.given(...).willReturn(...)`** - combina o comportamento do mock: "quando este método for chamado, devolva isto".

```java
@ExtendWith(MockitoExtension.class)
class TutorServiceTest {

    @Mock
    private TutorRepository repository;
    @Mock
    private CadastroTutorDto dto;

    @InjectMocks
    private TutorService service;

    @Test
    @DisplayName("Não cadastrar tutor: e-mail ou telefone já cadastrado")
    void naoCadastrarTutor() {
        //ARRANGE
        given(repository.existsByTelefoneOrEmail(dto.telefone(), dto.email())).willReturn(true);

        //ACT + ASSERT
        assertThrows(ValidacaoException.class, () -> service.cadastrar(dto));
    }
}
```

O `repository` nunca toca no banco: ele foi **instruído** a responder `true` para aquela consulta, e o teste verifica que, nesse cenário, o serviço lança a exceção de validação. Trocando o `willReturn(true)` por `willReturn(false)`, o mesmo desenho de teste cobre o caminho oposto.

> **Outras bibliotecas de mock.** O Mockito é o padrão, mas não o único. O **EasyMock** segue um estilo de "expectativa e verificação"; o **PowerMock** estende Mockito/EasyMock para casos difíceis (métodos estáticos, construtores privados, classes finais), úteis em código legado; e o **JMockit** oferece mocks e spies com gravação/reprodução de chamadas. Cada um cobre cenários que o Mockito sozinho não alcança.

### A camada de serviço: ArgumentCaptor e spy

A camada **`@Service`** coordena o fluxo de regras de negócio. No Adopet, o `AdocaoService.solicitar` busca o pet e o tutor, roda as validações, **cria** uma `Adocao`, a salva e ainda dispara um e-mail. Testar isso levanta uma pergunta nova: como conferir o objeto que o serviço **criou internamente** e passou para `repository.save(...)`, se ele nunca sai do método?

A resposta é o **`ArgumentCaptor`**: um "grampo" que **captura o argumento** que chegou ao mock. Declarado com **`@Captor`**, ele é usado na verificação e depois inspecionado:

```java
@Captor
private ArgumentCaptor<Adocao> adocaoCaptor;

@Test
@DisplayName("Salva adoção após solicitação")
void salvarAdocaoCenario1() {
    //ARRANGE
    this.dto = new SolicitacaoAdocaoDto(10L, 20L, "motivo qualquer");
    given(petRepository.getReferenceById(dto.idPet())).willReturn(pet);
    given(tutorRepository.getReferenceById(dto.idTutor())).willReturn(tutor);
    given(pet.getAbrigo()).willReturn(abrigo);

    //ACT
    service.solicitar(dto);

    //ASSERT
    then(repository).should().save(adocaoCaptor.capture());
    Adocao adocaoSalva = adocaoCaptor.getValue();
    Assertions.assertEquals(pet, adocaoSalva.getPet());
    Assertions.assertEquals(tutor, adocaoSalva.getTutor());
    Assertions.assertEquals(dto.motivo(), adocaoSalva.getMotivo());
}
```

Duas coisas acontecem no bloco de asserção. Primeiro, **`then(repository).should().save(...)`** verifica que o `save` foi mesmo chamado (a API `BDDMockito.then(...).should()` é a versão "GWT" do `verify`). Segundo, o `adocaoCaptor.capture()` grava o argumento daquela chamada, e `getValue()` o devolve, permitindo afirmar que a `Adocao` salva tem o pet, o tutor e o motivo certos.

Ao lado do mock existe o **spy**, declarado com **`@Spy`**. A diferença é essencial:

- um **mock** é um objeto totalmente falso - todo método devolve um valor "vazio" até ser combinado com `given`;
- um **spy** é um objeto **real** que executa o próprio código, mas cujo comportamento pode ser observado e, se preciso, substituído método a método.

No `AdocaoServiceTest`, a lista de validações é um `@Spy` de um `ArrayList` real: o teste adiciona mocks de validadores a ela e, depois de chamar o serviço, confirma que **cada validador foi acionado** usando a lista de verdade, não uma simulação dela:

```java
@Spy
private List<ValidacaoSolicitacaoAdocao> validacoes = new ArrayList<>();

// ...
validacoes.add(validador1);
validacoes.add(validador2);

service.solicitar(dto);

then(validador1).should().validar(dto);
then(validador2).should().validar(dto);
```

> **Mock ou spy?** Use **mock** quando quer isolar a dependência por completo e ditar as respostas dela. Use **spy** quando quer manter o comportamento real do objeto e só observar (ou ajustar um método pontual). Na dúvida, mock é o caso mais comum.

### Testando o controller com MockMvc

Falta a ponta HTTP: o **controller**. Aqui o interesse é outro; não a regra de negócio (já testada no serviço), e sim se a **rota responde com o código de status certo**: `200` quando o JSON é válido, `400` quando falha a validação do `@Valid`.

Para isso o Spring oferece o **`MockMvc`**, que **simula requisições** à API sem subir um servidor de verdade. A classe de teste combina três anotações:

- **`@SpringBootTest`** - carrega o contexto da aplicação;
- **`@AutoConfigureMockMvc`** - disponibiliza o `MockMvc` pronto para injeção;
- **`@MockBean`** - coloca no contexto um mock da dependência (o `AdocaoService`), para o teste focar só no controller.

```java
@SpringBootTest
@AutoConfigureMockMvc
class AdocaoControllerTest {

    @Autowired
    private MockMvc mvc;
    @MockBean
    private AdocaoService service;

    @Test
    @DisplayName("Devolve código 400 para solicitação de adoção com erros")
    void solicitarAdocaoComErrosCenario1() throws Exception {
        //ARRANGE
        String json = "{}";

        //ACT
        MockHttpServletResponse response = mvc.perform(
                post("/adocoes")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(400, response.getStatus());
    }
}
```

O `mvc.perform(...)` monta a requisição (verbo `post`, caminho `/adocoes`, corpo JSON), e `getResponse().getStatus()` devolve o código HTTP para a asserção. Um `{}` vazio não passa nas anotações de validação do DTO, então a API responde `400`; um JSON com os campos preenchidos passa, e a resposta é `200`. O mesmo desenho testa os `PUT /adocoes/aprovar` e `/adocoes/reprovar`.

> **Escrevendo o JSON com um objeto.** Em vez de montar o JSON como `String` na mão, dá para usar o **`JacksonTester`**, que serializa um DTO (por exemplo o `SolicitacaoAdocaoDto`) no JSON esperado, mantendo o teste alinhado ao contrato real da requisição.

> **MockMvc x TestRestTemplate.** O `MockMvc` simula a requisição internamente, sem tráfego HTTP real. Quando se quer disparar **requisições de verdade** contra a aplicação no ar, o Spring oferece o **`TestRestTemplate`**, usado com `@SpringBootTest(webEnvironment = RANDOM_PORT)`: ele sobe a aplicação numa porta real e faz chamadas HTTP autênticas com o método `exchange(...)`. É a abordagem de **teste de integração**, mais completa e mais lenta que o mock.

### O que vale a pena testar?

Nem toda classe merece teste. A régua é simples: **teste onde há lógica**.

- **Interfaces `Repository`** - se só têm as operações CRUD geradas pelo Spring Data JPA, não precisam de teste: esse código já é exaustivamente testado pelo próprio framework. Mas **queries personalizadas** (derived queries ou `@Query`) valem teste, para garantir que a consulta traz o que se espera.
- **Entidades e DTOs** - se são apenas atributos, construtores e getters/setters, não há o que testar. Se ganharem **métodos com lógica** (uma validação, uma regra de negócio), aí sim.

A ideia é não gastar esforço testando código trivial ou de terceiros, e concentrar os testes onde um bug realmente poderia se esconder.

### Teste de mutação com Pitest

Uma pergunta natural: como saber se os testes são **bons**, e não só numerosos? O **teste de mutação** responde a isso. A ideia é introduzir pequenas alterações propositais no código (os **mutantes**, simulando erros comuns [trocar um `>=` por `>`, um `+` por `-`]) e rodar a suíte de testes contra cada versão mutante. Se os testes **continuam passando** mesmo com o código adulterado, é sinal de que faltam cenários: aquele trecho não está sendo de fato verificado. Em Java, a biblioteca **Pitest** automatiza esse processo, revelando lacunas de cobertura que a contagem simples de linhas cobertas não mostra.

### As anotações de teste mais usadas

| Anotação | Origem | Para que serve |
|---|---|---|
| `@Test` | JUnit | marca um método como teste a ser executado |
| `@DisplayName` | JUnit | dá ao teste um nome legível nos relatórios |
| `@ExtendWith(MockitoExtension.class)` | JUnit + Mockito | liga o Mockito à classe de teste |
| `@Mock` | Mockito | cria um objeto simulado (falso) de uma dependência |
| `@InjectMocks` | Mockito | instancia a classe sob teste e injeta os mocks nela |
| `@Spy` | Mockito | cria um objeto real, com comportamento observável |
| `@Captor` | Mockito | declara um `ArgumentCaptor` para capturar argumentos |
| `@SpringBootTest` | Spring | carrega o contexto da aplicação no teste |
| `@AutoConfigureMockMvc` | Spring | disponibiliza o `MockMvc` para simular requisições |
| `@MockBean` | Spring | põe um mock no lugar de um bean do contexto |

E os métodos que mais apareceram: `Assertions.assertEquals`, `assertThrows` e `assertDoesNotThrow`; e, do Mockito, `given(...).willReturn(...)` e `then(...).should()`.

---

## Curso: JavaScript: programando na linguagem da web

O projeto foi o **Aparecida Nutrição**, a página de um consultório de nutrição construída em volta de uma **tabela de pacientes**. A partir dela, a aplicação calcula o **IMC** de cada paciente, cadastra novos por um **formulário** (com validação), remove uma linha com **duplo clique** e animação, **filtra a tabela** em tempo real conforme se digita e importa pacientes de uma **API externa**. Na trilha inicial o JavaScript apareceu para criar jogos; aqui o foco foi fundo no que a linguagem faz melhor no navegador: **manipular o DOM, reagir a eventos, lidar com formulários e conversar com um servidor sem recarregar a página**.

### JavaScript além do navegador

O JavaScript nasceu para rodar dentro do navegador, mas há tempos não vive só ali. Com o **Node.js** ele roda no servidor e na linha de comando, usando o mesmo motor de execução do Chrome (o V8) fora do browser. A partir daí a linguagem foi parar em lugares inesperados:

- **Electron** - framework para criar aplicações **desktop** com HTML, CSS e JavaScript. O editor **Atom** (e também o VS Code) foi construído com ele;
- **Johnny-Five** - biblioteca para programar **robótica e hardware** (Arduino e afins) em JavaScript.

A lição é que aprender JavaScript abre portas para além da página web: back-end, aplicativos de mesa e até eletrônica.

### O código em arquivos e a variável document

Assim como no Java se separa cada responsabilidade em uma classe, aqui a organização começa **dividindo o código em arquivos `.js`** por funcionalidade, em vez de um `<script>` gigante no HTML. No projeto, cada arquivo cuida de uma coisa: `calcula-imc.js`, `form.js`, `filtra.js`, `remover-paciente.js`, `buscar-pacientes.js`.

Esses arquivos são importados **sempre no final do `<body>`**:

```html
	<script src="js/calcula-imc.js"></script>
	<script src="js/form.js"></script>
	<script src="js/filtra.js"></script>
</body>
```

O motivo é a ordem de carregamento: o navegador lê o HTML de cima para baixo, então, ao chegar nos scripts no fim, **todos os elementos da página já existem no DOM**. Se o script rodasse no `<head>`, um `querySelector` procuraria por um botão que ainda não foi desenhado e devolveria `null`.

A ponte entre o JavaScript e a página é a variável **`document`**. Ela contém o **DOM** (*Document Object Model*), a representação em memória do HTML que o navegador cria ao carregar a página e usa para desenhá-la (revisada em [o DOM](#o-que-é-o-dom)). Um ponto que fica mais claro neste curso: quando o JavaScript troca o texto de um `<h1>` ou a classe de um elemento, ele altera **essa cópia em memória**, e o navegador redesenha na hora, mas o **arquivo HTML original fica intacto**. Recarregar a página descarta tudo e reconstrói o DOM do zero a partir do arquivo.

A busca dos elementos é feita com **`document.querySelector()`** (o primeiro que casar) e **`querySelectorAll()`** (todos), preferindo selecionar por **`#id`** ou **`.classe`**, mais estáveis e específicos do que pelo nome da tag.

### Eventos: addEventListener e o objeto event

Uma página é interativa porque **reage a eventos**: um clique, uma tecla, o carregamento de um dado. Para escutar um evento, usa-se **`addEventListener('evento', função)`** no elemento: quando o evento acontece, o navegador chama a função.

Aqui entra a diferença entre **funções nomeadas** e **funções anônimas**. A função anônima é declarada ali mesmo, sem nome, só para aquele evento; a nomeada existe por conta própria e pode ser reaproveitada:

```javascript
// função anônima: existe só para este clique
var btnAdicionar = document.querySelector('#adicionar-paciente');
btnAdicionar.addEventListener('click', function(event){
    event.preventDefault();
    // ...
});
```

O parâmetro **`event`** que a função recebe é o **objeto do evento**: ele carrega tudo sobre o que aconteceu e traz atalhos úteis. Dois aparecem o tempo todo no projeto:

- **`event.preventDefault()`** - cancela o comportamento padrão do navegador. O botão de adicionar está dentro de um `<form>`, e clicar nele **recarregaria a página** (o envio padrão do formulário); `preventDefault()` impede isso para o JavaScript assumir o controle;
- **`event.target`** - o elemento exato que disparou o evento (usado adiante na delegação).

### Criando elementos e lendo o formulário

Para cadastrar um paciente, é preciso **ler o formulário** e **criar uma linha nova** na tabela. Os campos de um `<form>` são acessíveis pelo atributo **`name`** de cada input, e o valor digitado vem da propriedade **`.value`** (sempre uma **string**):

```javascript
function obtemPacienteDoFormulario(form){
    var paciente = {
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calculaImc(form.peso.value, form.altura.value)
    }
    return paciente;
}
```

Com os dados em mãos, a linha é montada **criando elementos do zero**. A função **`document.createElement('tag')`** cria um elemento, `textContent`/`classList` o preenchem, e **`appendChild()`** o encaixa dentro de outro:

```javascript
function montaTr(paciente){
    var pacienteTr = document.createElement('tr');
    pacienteTr.classList.add('paciente');
    pacienteTr.appendChild(montaTd('info-nome', paciente.nome));
    pacienteTr.appendChild(montaTd('info-peso', paciente.peso));
    // ... demais colunas
    return pacienteTr;
}

function montaTd(classe, dado){
    var td = document.createElement('td');
    td.classList.add(classe);
    td.textContent = dado;
    return td;
}
```

O `<tr>` recém-criado é então inserido na tabela com um último `appendChild`, e a linha aparece na página, tudo sem tocar no arquivo HTML.

### Objetos e funções com uma responsabilidade

O `paciente` acima é um **objeto** JavaScript: uma coleção de pares **chave/valor** entre `{ }`, acessados por `paciente.nome`, `paciente.peso` etc. É a forma natural de agrupar dados que andam juntos, no lugar de quatro variáveis soltas.

O outro cuidado é **quebrar funções grandes em funções menores**, cada uma com uma responsabilidade. Em vez de um único bloco fazendo tudo no clique, o fluxo é dividido: `obtemPacienteDoFormulario` (lê), `montaTr`/`montaTd` (constroem), `validaPaciente` (valida), `adicionaPacienteNaTabela` (insere), `exibeMensagemDeErro` (avisa). O `click` só orquestra:

```javascript
btnAdicionar.addEventListener('click', function(event){
    event.preventDefault();
    var form = document.querySelector('#form-adiciona');
    var paciente = obtemPacienteDoFormulario(form);
    var erros = validaPaciente(paciente);

    if(erros.length > 0){
        exibeMensagemDeErro(erros);
    } else {
        adicionaPacienteNaTabela(paciente);
        form.reset();
        document.querySelector('#mensagens-erro').innerHTML = '';
    }
});
```

Depois de um cadastro bem-sucedido, **`form.reset()`** limpa todos os campos do formulário de uma vez, e `innerHTML = ''` esvazia a lista de mensagens de erro.

### Validando o formulário

Antes de aceitar um paciente, cada campo é conferido. A validação usa muito o **operador de negação NOT (`!`)**, que inverte um booleano, `if(!validaPeso(...))` lê-se "se o peso **não** for válido":

```javascript
function validaPaciente(paciente){
    var erros = [];

    if(paciente.nome.length == 0){
        erros.push('O nome não pode ser em branco!');
    }
    if(!validaPeso(paciente.peso)){
        erros.push('Peso inválido!');
    }
    if(!validaAltura(paciente.altura)){
        erros.push('Altura inválida!');
    }
    // ... demais campos

    return erros;
}
```

Em vez de parar no primeiro problema, os erros são **acumulados num array** com **`push()`**, que adiciona um item ao fim da lista. No fim, a função devolve o array inteiro: se estiver **vazio** (`erros.length == 0`), está tudo certo; se não, cada mensagem vira um `<li>` dentro da `<ul>` de erros:

```javascript
function exibeMensagemDeErro(erros){
    var ul = document.querySelector('#mensagens-erro');
    ul.innerHTML = '';                    // limpa erros anteriores
    erros.forEach(function(erro) {
        var li = document.createElement('li');
        li.textContent = erro;
        ul.appendChild(li);
    });
}
```

Duas ferramentas se destacam aqui: a propriedade **`innerHTML`**, usada com `''` para **apagar** os itens antigos da lista antes de mostrar os novos; e o método **`forEach`**, que percorre o array chamando a função para **cada elemento**, uma alternativa mais limpa ao `for` clássico quando o objetivo é só visitar todos os itens. Uma boa prática que acompanha isso é **separar as funções de validação** em seu próprio contexto, para que possam ser reaproveitadas (o cálculo do IMC, por exemplo, valida peso e altura com as mesmas `validaPeso`/`validaAltura`).

### Delegação de eventos e remoção animada

Um paciente é removido com **duplo clique** na linha, o evento **`dblclick`**. A primeira ideia seria adicionar um `addEventListener` em **cada** `<tr>`. Mas isso tem um furo: linhas cadastradas **depois**, pela função de adicionar, não teriam o listener, afinal, elas não existiam quando o código rodou.

A saída é entender como os eventos **propagam** pela página. Quando se clica num `<td>`, o evento não fica só nele: ele **borbulha** (*bubbling*) para os elementos-pai, o `<tr>`, depois o `<tbody>`, a `<table>`, e assim por diante. Isso permite a **delegação de eventos**: em vez de um listener por linha, coloca-se **um único listener na tabela** e descobre-se quem foi clicado por `event.target`:

```javascript
var tabela = document.querySelector('#tabela-pacientes');
tabela.addEventListener('dblclick', function(event){
    event.target.parentNode.classList.add('fadeout');
    setTimeout(function(){
        event.target.parentNode.remove();
    }, 500);
});
```

Como o clique cai num `<td>`, `event.target.parentNode` sobe para o `<tr>` da linha. A delegação resolve o problema de origem: **qualquer** linha, inclusive as futuras, é coberta pelo mesmo listener, porque quem escuta é a tabela.

A remoção também é **animada**. Em vez de sumir de imediato, a linha ganha a classe `fadeout` (que o CSS usa para um efeito de desaparecimento) e só é de fato retirada do DOM depois, com **`setTimeout`**, que agenda uma função para rodar após um tempo, aqui, os `500` milissegundos que a animação leva. Assim o `.remove()` espera o efeito terminar.

### Busca em tempo real com expressões regulares

O campo de filtro esconde e mostra pacientes **conforme se digita**, usando o evento **`input`**, que dispara a **cada alteração** do campo (cada tecla, colar, apagar), diferente do `change`, que só dispara ao perder o foco.

O truque para "esconder" um paciente é puramente de CSS: uma classe **`invisivel`** com `display: none`. Adicionar a classe tira o elemento da tela; removê-la o traz de volta. A busca, então, é percorrer os pacientes, **esconder os que não interessam e mostrar os que interessam**:

```javascript
var campoFiltro = document.querySelector('#filtrar-tabela');
campoFiltro.addEventListener('input', function(){
    var pacientes = document.querySelectorAll('.paciente');
    var valor = this.value;

    if(valor.length > 0){
        pacientes.forEach(function(paciente) {
            var nome = paciente.querySelector('.info-nome').textContent;
            var expressao = new RegExp(valor, 'i');

            if(!expressao.test(nome)){
                paciente.classList.add('invisivel');
            } else {
                paciente.classList.remove('invisivel');
            }
        });
    } else {
        pacientes.forEach(function(paciente) {
            paciente.classList.remove('invisivel');
        });
    }
});
```

Para casar o texto digitado com **qualquer pedaço** do nome (e não só o começo), entram as **expressões regulares**. Uma `RegExp` descreve um padrão de texto; `new RegExp(valor, 'i')` monta o padrão a partir do que foi digitado, e a flag **`'i'`** o torna **insensível a maiúsculas/minúsculas**. O método **`.test(nome)`** devolve `true`/`false` conforme o nome contenha ou não aquele padrão. Quando o campo está vazio (`valor.length` igual a `0`), todos voltam a aparecer.

### AJAX: requisições assíncronas com XMLHttpRequest e JSON

A última funcionalidade importa uma lista de pacientes de uma **API na internet**, sem recarregar a página. Isso exige uma **requisição assíncrona**: o JavaScript pede os dados ao servidor e **não trava** esperando a resposta, o resto da página segue funcionando, e quando a resposta chega, um evento avisa. Essa técnica de buscar dados em segundo plano e atualizar só um pedaço da tela é o **AJAX** (*Asynchronous JavaScript And XML*).

A ferramenta clássica para isso é o objeto **`XMLHttpRequest`**. O fluxo tem três passos: **configurar** a requisição com `.open()`, **escutar** o retorno com o evento `load` e **enviar** com `.send()`:

```javascript
var botao = document.querySelector('#buscar-pacientes');
botao.addEventListener('click', function(){
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://.../pacientes.json');   // 1. configura (método + URL)

    xhr.addEventListener('load', function(){          // 2. escuta a resposta
        if(xhr.status == 200){
            document.querySelector('#erro-ajax').classList.add('invisivel');
            var pacientes = JSON.parse(xhr.responseText);
            pacientes.forEach(function(paciente){
                adicionaPacienteNaTabela(paciente);
            });
        } else {                                      // deu erro
            document.querySelector('#erro-ajax').classList.remove('invisivel');
        }
    });

    xhr.send();                                       // 3. dispara
});
```

O evento **`load`** dispara quando a resposta **termina de chegar**. Mas chegar não é o mesmo que dar certo: é preciso conferir o **`xhr.status`** (o código HTTP). `200` significa sucesso; qualquer outro valor (um `404`, um `500`) cai no `else`, onde a aplicação **trata o erro** exibindo uma mensagem, escondida por padrão com a classe `invisivel`. Lidar com o caminho de erro é parte do AJAX, não um extra.

A resposta chega em **`xhr.responseText`** como **texto** no formato **JSON** (*JavaScript Object Notation*), a mesma notação de objetos da linguagem, usada como formato universal de troca de dados entre sistemas. Como é texto, não dá para usá-lo direto; a função **`JSON.parse()`** o **converte em um objeto/array JavaScript** de verdade, que aí pode ser percorrido com `forEach` para inserir cada paciente na tabela. O caminho inverso, de objeto para texto JSON, seria o `JSON.stringify()`.

> **XMLHttpRequest e o que veio depois.** O `XMLHttpRequest` é a base histórica do AJAX, mas hoje o navegador oferece a **API `fetch`**, mais enxuta e baseada em *Promises*, que evita o encadeamento de listeners. O conceito, porém, é o mesmo: pedir dados de forma assíncrona e tratar a resposta (e os erros) quando ela chega.

Um resumo dos eventos que apareceram no curso e do que cada um observa:

| Evento | Dispara quando | Onde foi usado |
|---|---|---|
| `click` | o elemento é clicado | botões de adicionar e buscar pacientes |
| `dblclick` | o elemento recebe duplo clique | remover uma linha da tabela |
| `input` | o valor de um campo muda (a cada tecla) | filtrar a tabela em tempo real |
| `load` | uma requisição termina de carregar | receber a resposta do AJAX |

---

## Curso: React: desenvolvendo com JavaScript

O projeto foi o **Organo**, uma página que organiza os colaboradores de uma empresa em **times coloridos**. Por um **formulário**, cadastra-se uma pessoa (nome, cargo, imagem e time) e a aplicação monta um **card** que aparece na seção do time correspondente. No curso anterior de JavaScript, a página era manipulada na mão (`createElement`, `appendChild`); aqui esse trabalho é do **React**: descreve-se a interface em **componentes** e o **estado** dos dados, e a biblioteca cuida de desenhar e redesenhar a tela sozinha.

### O que é React (e o Node por trás dele)

O **React** é uma **biblioteca** criada pelo Facebook para resolver um problema específico: páginas com muitos eventos e dados mudando na tela ficavam difíceis de manter em sincronia com o DOM manualmente. A ideia é descrever a interface em **componentes** e deixar um mecanismo de **databinding** manter a tela em dia com os dados: quando o dado muda, o React redesenha **só o que mudou**, em vez de ficar re-renderizando a página inteira o tempo todo. O componente original do React era baseado em **classes**; hoje o padrão são os componentes funcionais que veremos a seguir.

Por baixo das ferramentas está o **Node.js**, que roda JavaScript fora do navegador (revisitado em [JavaScript além do navegador](#javascript-além-do-navegador)). O Node é feito de duas peças: o **V8** (o mesmo motor que executa JS no Chrome) e o **libuv** (que cuida da entrada e saída assíncrona). Como o JavaScript roda em uma **única thread** com um **event loop**, ele não trava esperando por I/O, o que o torna rápido para lidar com muitas conexões ao mesmo tempo.

Em volta do Node vive o **npm** (*Node Package Manager*), que guarda as bibliotecas e frameworks JavaScript e ajuda a **automatizar os processos** (a ideia de automatizar tarefas com um gerenciador de pacotes vem de comunidades como a do Ruby). Ferramentas como o **webpack** ou o **rollup** empacotam os arquivos do projeto. Alguns nomes que aparecem no ecossistema: **express** (framework popular de back-end), **JWT** (tokens de autenticação), **GraphQL** (consulta de conjuntos massivos de dados) e a clusterização (rodar várias instâncias da aplicação).

### Criando o projeto com Create React App

Em vez de configurar webpack e babel na mão, o curso usa o **Create React App (CRA)**, uma ferramenta que gera um projeto já pronto e configurado. Os passos, no terminal:

```bash
# 1. entrar no diretório onde o projeto será criado
# 2. criar o projeto (baixa o CRA e monta a estrutura)
        npx create-react-app organo
# 3. entrar na pasta criada
        cd organo
# 4. subir o servidor de desenvolvimento
        npm start
```

O `npx` executa um pacote sem precisar instalá-lo globalmente. O `npm start` sobe um servidor local em `http://localhost:3000` com **recarga automática**: ao salvar um arquivo, a página se atualiza sozinha.

O projeto já vem com as dependências listadas no **`package.json`**:

- **`react`** e **`react-dom`** - a biblioteca em si e a peça que a desenha no DOM do navegador;
- **`react-scripts`** - embrulha as ferramentas de build (webpack, babel...) por trás dos comandos.

Essas bibliotecas ficam instaladas na pasta **`node_modules`**. O `package.json` também define os **scripts** disponíveis: `start` (desenvolvimento), `build` (gera a versão otimizada para produção), `test` (roda os testes) e `eject` (expõe a configuração escondida, um caminho sem volta).

### Componentes funcionais e JSX

Uma aplicação React é uma **árvore de componentes**. O ponto de entrada é o `src/index.js`, que renderiza o componente raiz `<App />` dentro da `<div id="root">` do `public/index.html`:

```javascript
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
```

Um **componente funcional** é apenas uma função JavaScript que devolve **JSX**:

```javascript
function Banner() {
    return (
        <header className="banner">
            <img src="/imagens/banner.png" alt="Banner principal da página do organo" />
        </header>
    )
}

export default Banner;
```

O **JSX** parece HTML dentro do JavaScript, mas não é HTML: é uma notação que o build converte em chamadas de função JS. Como vive dentro do JavaScript, alguns nomes mudam, o mais comum é **`class` virar `className`** (`class` é palavra reservada em JS). Comentários dentro do JSX vão entre `{/* */}`. Cada componente é exportado com `export default` e importado onde for usado.

Sobre a forma de criar componentes: neste curso trabalhamos **apenas com componentes funcionais**, a maneira mais simples. Também é possível criar componentes com **classes do ES6** (a forma original do React), mas ela não é a única possível, e a versão funcional é hoje o padrão.

Uma regra importante do JSX: o componente precisa devolver **um único elemento raiz**. Quando é preciso devolver elementos irmãos sem embrulhá-los num `<div>` extra, usa-se um **Fragment**: `<Fragment></Fragment>` ou a forma curta `<> </>`, que agrupa os filhos sem adicionar um nó ao DOM.

### Estilização: CSS por componente e estilos inline

Cada componente guarda o seu próprio **arquivo CSS** ao lado (`Banner.js` + `Banner.css`), importado no topo do arquivo:

```javascript
import './Banner.css'
```

O `import` avisa o build para incluir aquele CSS, e as classes são aplicadas pelo `className`. Além das classes, o React permite **estilos inline** com o atributo `style`, que recebe um **objeto** (e não uma string): as chaves são as propriedades CSS em camelCase e os valores são strings. É assim que os cards do time recebem a cor certa, conhecida só em tempo de execução:

```javascript
<section className='time' style={{backgroundColor: props.corSecundaria}}>
    <h3 style={{borderColor: props.corPrimaria}}>{props.nome}</h3>
```

As chaves duplas `{{ }}` são duas coisas: as de fora dizem "aqui vem JavaScript" dentro do JSX, e as de dentro são o objeto JS com o estilo.

### Props: passando dados de pai para filho

As **props** (propriedades) são a forma de um componente-pai passar dados para um filho, como se fossem atributos HTML. Dentro do componente, elas chegam no objeto `props`, e as chaves `{ }` do JSX **interpolam** um valor JavaScript:

```javascript
const Colaborador = (props) => {
    return <h4>{props.nome}</h4>
}
```

As props são **somente leitura**: o filho recebe e usa, mas não altera. Para não repetir `props.` toda hora, dá para **desestruturar** as props já no parâmetro:

```javascript
const Colaborador = ({nome, cargo, img, corDeFundo}) => {
    return(
        <div className='colaborador'>
            <div className='cabecalho' style={{backgroundColor: corDeFundo}}>
                <img src={img} alt={nome} />
            </div>
            <div className='rodape'>
                <h4>{nome}</h4>
                <h5>{cargo}</h5>
            </div>
        </div>
    );
}
```

A passagem acontece no JSX do pai: `<Colaborador nome="Ana" cargo="Dev" />`. Qualquer tipo passa por props, strings, números, objetos, arrays e até funções (adiante).

### Renderizando listas com map e a prop key

Para desenhar uma **lista** de componentes a partir de um array, a ferramenta idiomática é o **`.map()`**, que transforma cada item em um pedaço de JSX. No `App`, o array de times vira uma lista de `<Time>`:

```javascript
{times.map(time => <Time 
    key={time.nome} 
    nome={time.nome} 
    corPrimaria={time.corPrimaria} 
    corSecundaria={time.corSecundaria}
    colaboradores={colaboradores.filter(colaborador => colaborador.time === time.nome)} />)}
```

Cada elemento renderizado em lista precisa de uma **`key`**: um identificador único entre os irmãos. O React usa a key para saber **qual item mudou, foi adicionado ou removido** e redesenhar só aquele, em vez da lista inteira. Sem ela, aparece um aviso no console. A key deve ser estável e única (aqui, o nome do time); o índice do array é o último recurso.

### A prop children

Além das props nomeadas, todo componente recebe uma prop especial, a **`children`**: tudo o que for escrito **entre a tag de abertura e a de fechamento** do componente. O `Botao` a usa para renderizar o seu texto:

```javascript
const Botao = (props) => {
    return(
        <button className='botao'>
            {props.children}
        </button>
    );
}
```

Usado como `<Botao>Criar Card</Botao>`, o `props.children` é o texto "Criar Card". Isso cria componentes flexíveis: o conteúdo pode ser texto, elementos HTML ou até outros componentes, deixando o botão "embrulhar" o que for passado.

### Eventos e o envio do formulário

O React escuta eventos com atributos em **camelCase**: o `onclick` do HTML vira **`onClick`**, o `onsubmit` vira **`onSubmit`**, o `onchange` vira `onChange`. O valor passado é uma **função** (e não uma string de código como no HTML inline).

O `Formulario` escuta o **`onSubmit`** do formulário, uma escolha proposital: enviar o formulário dispara a **validação nativa do HTML** dos campos `required` antes de a função rodar. Assim, aproveita-se a validação que o próprio navegador oferece:

```javascript
const aoSalvar = (event) => {
    event.preventDefault();
    props.aoColaboradorCadastrar({ nome, cargo, img, time });
    setNome('');
    setCargo('');
    setImg('');
    setTime('');
}

return (
    <form onSubmit={aoSalvar}>
        {/* campos */}
        <Botao>Criar Card</Botao>
    </form>
);
```

O `event.preventDefault()` cancela o comportamento padrão do navegador, enviar um formulário **recarrega a página**, para o React assumir o controle dos dados (revisitado do curso de JavaScript, em [Eventos](#eventos-addeventlistener-e-o-objeto-event)). Um `<button>` dentro de um `<form>` já o envia por padrão, e é por isso que o `onSubmit` dispara. Fora esse, há uma lista imensa de eventos disponíveis no HTML, e no React todos ganham a forma em camelCase.

### Estado com useState e componentes controlados

Props vêm de fora e não mudam; quando um componente precisa de um dado que **muda com o tempo e redesenha a tela**, isso é **estado**. Em componentes funcionais, o estado vem do **hook `useState`**:

```javascript
const [nome, setNome] = useState('');
```

O `useState('')` devolve um par: o **valor atual** (`nome`) e uma **função para atualizá-lo** (`setNome`). A mudança de estado só é feita pelo setter, chamar `setNome('Ana')` atualiza o valor **e pede ao React para redesenhar** o componente com o novo valor. Atribuir direto à variável não dispararia o redesenho.

O React tem duas abordagens para inputs de formulário. Um **componente controlado** (*statefull*) é um input cujo valor é controlado pelo React: o `value` vem do estado, e cada tecla dispara o `onChange`, que atualiza o estado, que redesenha o input. Um **componente não controlado** (*stateless*) funciona como um campo de formulário comum fora do React, o navegador guarda o valor e não dá para forçá-lo. O curso usa inputs **controlados**, ligando `value` + `onChange`:

```javascript
const CampoTexto = (props) => {
    const aoDigitar = (event) => {
        props.aoAlterar(event.target.value);
    }
    return (
        <div className="campo-texto">
            <label>{props.label}</label>
            <input value={props.valor} onChange={aoDigitar} required={props.obrigatorio} placeholder={props.placeholder} />
        </div>
    )
}
```

O ciclo é: eu digito → o `onChange` dispara → o estado muda → o React redesenha o input com o novo `value`. O campo e o estado ficam sempre em sincronia.

### Funções como props: a comunicação de filho para pai

As props descem (pai → filho), mas muitas vezes o filho precisa **avisar o pai** que algo aconteceu, aqui, que um colaborador foi cadastrado. A solução é passar uma **função como prop**: o pai entrega uma função ao filho, e o filho a chama quando o evento ocorre.

A lista de colaboradores mora no **`App`** (o pai comum entre o formulário e os times), no estado:

```javascript
const [colaboradores, setColaboradores] = useState([]);

const aoNovoColaboradorAdicionar = (colaborador) => {
    setColaboradores([...colaboradores, colaborador]);
}
```

O `App` passa essa função para o `Formulario` na prop `aoColaboradorCadastrar`; ao enviar o formulário, o filho **chama a prop**, mandando o novo colaborador para cima:

```javascript
// App
<Formulario aoColaboradorCadastrar={colaborador => aoNovoColaboradorAdicionar(colaborador)} />

// Formulario, dentro do aoSalvar
props.aoColaboradorCadastrar({ nome, cargo, img, time });
```

Manter o estado no pai para que vários filhos o compartilhem é o que se chama de **elevação de estado** (*lifting state up*). O novo colaborador é adicionado com o **spread** `[...colaboradores, colaborador]`, que cria um **array novo** com os itens antigos mais o novo, o estado nunca é alterado no lugar, sempre substituído.

> **Prop drilling.** Quando um dado precisa atravessar vários níveis, uma prop é passada do pai para o filho, do filho para o filho dele, e assim por diante, isso se chama **prop drilling** ("vazamento de props"). Funciona, mas em pouco tempo fica difícil rastrear onde o dado foi criado, atualizado e de fato usado. Para casos profundos existem outras ferramentas (Context, bibliotecas de estado), mas o conceito a reconhecer é esse: props sendo repassadas por componentes que nem as usam, só para chegar a um descendente.

### Transformando arrays: filter e renderização condicional

Com os colaboradores em uma única lista, cada time precisa mostrar **só os seus**. É o que o **`.filter()`** faz, devolve um **array novo** apenas com os itens que passam num teste:

```javascript
colaboradores.filter(colaborador => colaborador.time === time.nome)
```

O resultado é passado para cada `<Time>`, que recebe só os seus colaboradores. Juntando `.map()` (transformar) e `.filter()` (selecionar), lida-se com arrays de objetos sem laços na mão.

O React também faz **renderização condicional**: decidir se algo aparece com base nos dados. Um time vazio não deve exibir a sua seção, então o `Time` só renderiza quando tem colaboradores, usando o **ternário**:

```javascript
props.colaboradores.length > 0 ? <section className='time'> ... </section> : ''
```

Se a condição for falsa, devolve `''` (nada aparece). Uma variação comum é o **`&&`**: `condição && <Componente />` renderiza o componente só quando a condição é verdadeira, útil quando não há um "senão".

### Depurando: mensagens de erro e o debugger

Errar faz parte, e o React ajuda: quando algo quebra, ele mostra uma **tela de erro** sobre a página com a mensagem e o arquivo/linha. O primeiro passo é sempre **ler a mensagem**, ela costuma dizer exatamente o quê e onde.

Para erros de lógica (o código roda, mas faz a coisa errada), a ferramenta é o **`debugger`**: escrever a palavra `debugger` no código **pausa a execução** naquele ponto para inspecioná-lo linha a linha:

1. na página, abra o **DevTools** do navegador (F12);
2. no ponto suspeito do código, escreva a instrução `debugger`;
3. ao chegar ali durante a navegação, a execução **pausa** e dá para ver os valores das variáveis naquele instante;
4. **F8** retoma a execução (até a próxima pausa).

Isso é mais preciso do que encher o código de `console.log`, porque congela o estado no exato momento em questão.

### O ecossistema React: bibliotecas e próximos passos

O React é só a base, a comunidade acrescenta muita coisa em volta:

- **Bibliotecas de componentes** prontos e estilizados, que aceleram a construção da interface: o **MUI** (Material UI, https://mui.com) e o **Ant Design** (https://ant.design). Em vez de estilizar tudo do zero, usam-se botões, campos e tabelas já prontos;
- **Next.js** - uma **framework** construída sobre o React que adiciona rotas, renderização no servidor e uma estrutura de projeto, um passo comum para aplicações reais;
- **Vercel** (https://vercel.com, a antiga Zeit) - uma plataforma para **publicar** (*deploy*) aplicações React/Next.js com pouca configuração, colocando o projeto no ar.

Nenhuma delas foi usada no Organo, mas mostram para onde o React caminha a partir daqui.

Para fechar, um resumo dos componentes construídos no projeto e do que cada um exercita:

| Componente | Papel na página | O que exercita |
|---|---|---|
| `App` | Componente raiz; guarda os times e o estado dos colaboradores | estado, elevação de estado, `map`, `filter` |
| `Banner` | Cabeçalho com a imagem do topo | componente sem props |
| `Formulario` | Formulário de cadastro do colaborador | estado, componentes controlados, `onSubmit` |
| `CampoTexto` | Um campo de input rotulado e controlado | props, `value`/`onChange` |
| `ListaSuspensa` | O `<select>` de times | props, `map` nas `<option>` |
| `Botao` | Botão de enviar | prop `children` |
| `Time` | Seção colorida de um time com seus cards | renderização condicional, `map`, estilo inline |
| `Colaborador` | O card de uma pessoa | props desestruturadas, estilo inline |
| `Rodape` | Rodapé com redes sociais e logo | componente sem props |

---

## Curso: React JS: crie testes com Jest e Testing Library e garanta o funcionamento do Front-end

O projeto foi o **Bytebank**, a interface de um banco digital (cabeçalho com o usuário logado, menu de navegação, saldo, extrato e o formulário de nova transação). Diferente dos cursos anteriores, em que o trabalho era construir a aplicação, aqui o foco foi **garantir que ela funciona**: escrever testes automatizados para os componentes e para a regra de negócio, do saldo à submissão do formulário. As ferramentas centrais foram o **Jest** (para estruturar e rodar os testes) e o **React Testing Library** (para renderizar e consultar os componentes como uma pessoa usuária os veria). As duas já vêm instaladas no projeto criado pelo Create React App, e os testes rodam com `npm test`.

### Por que testar o Front-end e a pirâmide de testes

Testar aumenta a confiança no código, melhora a qualidade do produto e otimiza o tempo de quem desenvolve e de quem garante a qualidade. Em aplicações pequenas, um **teste manual** (abrir a página e clicar para conferir) até resolve, mas ele não escala: conforme novas funcionalidades são adicionadas, repetir todos os cenários na mão fica complexo e improdutivo. A saída é o teste **automatizado**, um código que verifica outro código e pode ser reexecutado a qualquer momento.

Para decidir **quais** testes escrever e **em que proporção**, existe a **pirâmide de testes**, que organiza os tipos por relação de tempo e custo:

- **Testes de unidade** - verificam uma peça isolada (uma função, um componente). São únicos, **rápidos e baratos**; formam a base da pirâmide, onde mais se escreve;
- **Testes de integração** - verificam como partes da aplicação **interagem entre si**;
- **Testes de ponta a ponta (E2E)** - exercitam **todo o fluxo da pessoa usuária** pela interface. São os mais **demorados e caros**, no topo da pirâmide.

Quanto mais alto na pirâmide, mais lento e caro o teste, por isso a base (unidade) é a mais numerosa. A pirâmide é uma ferramenta para guiar essas decisões, e criar uma **cultura de testes** na equipe é o que sustenta tudo isso.

> **Outros tipos de teste.** Além dos três da pirâmide, há testes voltados a aspectos específicos: o **teste de análise estática** (verifica o código sem executá-lo, é o que ESLint e Prettier fazem na próxima seção); o **teste de acessibilidade**, que confere se a página funciona para todas as pessoas (ferramentas: Lighthouse, AChecker, Jest Axe, Pa11y); e o **teste de regressão visual**, que compara imagens da tela para detectar mudanças indesejadas no visual (ferramentas: Loki, Percy, Cypress).

### Análise estática: ESLint e Prettier

Antes mesmo de escrever um teste, dá para pegar problemas **em tempo de desenvolvimento** com a **análise estática**: ferramentas que leem o código sem executá-lo. Duas se complementam:

- **Prettier** - cuida da **formatação** (aspas, indentação, quebras de linha), deixando o código com um estilo único. Instala-se o motor no projeto, definem-se as regras no arquivo `.prettierrc`, e falta o **gatilho** que aplica a formatação: a extensão do Prettier no VS Code com *Format On Save*, ou rodar o comando na mão.

  ```bash
  npm i -D prettier          # instala o motor no projeto
  npx prettier --write .     # formata os arquivos segundo o .prettierrc
  ```

  ```json
  // .prettierrc
  { "singleQuote": true, "tabWidth": 2 }
  ```

- **ESLint** - faz a **análise do código** em busca de problemas e más práticas (variáveis não usadas, hooks mal utilizados). As regras ficam no `.eslintrc`, e o pacote **`eslint-config-prettier`** desliga as regras de estilo do ESLint que brigariam com o Prettier, para os dois não competirem.

  ```bash
  npm i -D eslint eslint-config-prettier
  ```

No projeto, esses comandos viram **scripts** no `package.json` (`"format"` e `"lint"`), para rodar tudo de uma vez pelo `npm run format` e `npm run lint`.

### Jest e o primeiro teste

O **Jest** é o executor de testes que já vem com o Create React App. Ele encontra automaticamente os arquivos terminados em **`.test.js`** e os roda. A convenção do projeto é deixar cada teste **ao lado do que ele testa**: `Menu.test.js` mora na mesma pasta que o componente `Menu`.

A anatomia de um teste tem três peças:

- **`test(descrição, fn)`** (ou seu apelido **`it`**) - declara um cenário; a descrição diz o que se espera;
- **`expect(valor)`** - pega o valor obtido;
- um **matcher** encadeado ao `expect`, que faz a comparação; o mais básico é o **`toBe`**, que checa igualdade.

```javascript
test('Que é um depósito, o saldo deve aumentar', () => {
  const transacao = { transacao: 'Depósito', valor: 50 };
  const novoSaldo = calculaNovoSaldo(transacao, 100);
  expect(novoSaldo).toBe(150);
});
```

Se o valor obtido bater com o esperado, o teste passa (verde); se não, falha (vermelho) e o Jest mostra o que esperava e o que recebeu. Para **agrupar** vários cenários relacionados, existe o **`describe(descrição, fn)`**, que embrulha os testes sob um título comum (visto adiante).

### Renderizando e consultando: render, screen e as queries

Para testar um **componente React**, o React Testing Library oferece duas peças importadas de `@testing-library/react`:

- **`render(<Componente />)`** - desenha o componente num DOM de teste;
- **`screen`** - o objeto por onde se **consulta** o que foi renderizado.

A filosofia da biblioteca é consultar a tela **como uma pessoa usuária faria**: procurando por textos, papéis (*roles*) e rótulos, e não por classes CSS ou estrutura interna. O teste do `Cabecalho` só renderiza e procura o nome na tela:

```javascript
import { render, screen } from '@testing-library/react';
import Cabecalho from './index';

test('Deve renderizar o nome do usuário logado', () => {
  render(<Cabecalho />);
  const nomeUsuario = screen.getByText('Joana Fonseca Gomes');
  expect(nomeUsuario).toBeInTheDocument();
});
```

As funções de consulta (**queries**) seguem um padrão de nomes com três variações, e a diferença entre elas está em **o que fazem quando não encontram** (ou encontram vários):

| Variante | Quantos | Se não achar | Uso típico |
|---|---|---|---|
| `getBy...` | um | **lança erro** | o elemento **deve** existir |
| `getAllBy...` | vários (array) | lança erro | uma **lista** que deve existir |
| `queryBy...` | um | devolve `null` | afirmar que algo **não** existe |
| `findBy...` | um (assíncrono) | lança erro após esperar | elemento que aparece **depois** (Promise) |
| `findAllBy...` | vários (assíncrono) | lança erro após esperar | lista que aparece depois |

O sufixo diz **por onde procurar**: `...ByText` (pelo texto), `...ByRole` (pelo papel: `link`, `button`, `listitem`, `combobox`, `option`), `...ByPlaceholderText` (pelo *placeholder*) e `...ByTestId` (por um atributo `data-testid` que se coloca no elemento). O teste do `Menu` usa três variantes de uma vez:

```javascript
test('Deve renderizar uma lista de links', () => {
  render(<Menu />);
  const listaLinks = screen.getAllByRole('link');
  expect(listaLinks).toHaveLength(4);
});

test('Não deve renderizar um link para extrato', () => {
  render(<Menu />);
  const linkExtrato = screen.queryByText('Extrato');
  expect(linkExtrato).not.toBeInTheDocument();
});
```

Repare no `queryByText`: para provar que algo **não** está na tela, não dá para usar `getByText` (ele lançaria erro na hora de não encontrar). O `queryBy...` devolve `null` e deixa a asserção `not.toBeInTheDocument()` fazer o trabalho.

> **Por que o `findBy...` é assíncrono?** Ele é usado quando o elemento **não aparece na mesma hora**, por exemplo, depois de uma requisição a uma API: os dados da resposta não chegam imediatamente. Por baixo, o `findBy...` é a combinação de dois métodos: o **`waitFor`**, que **espera as Promises resolverem**, e só então o `getBy...`, que faz a consulta. Por isso ele devolve uma Promise e é usado com `await`.

### Asserções e testes de snapshot

As asserções sobre elementos do DOM ficam mais legíveis com os **matchers do jest-dom**, uma biblioteca importada uma única vez no `src/setupTests.js` (`import '@testing-library/jest-dom'`) e disponível em todos os testes. Os mais usados no projeto:

- **`toBeInTheDocument()`** - o elemento está na tela;
- **`toHaveTextContent('...')`** - contém aquele texto;
- **`toHaveClass('...')`** - tem aquela classe CSS;
- **`toHaveAttribute('type', 'number')`** - tem aquele atributo;
- **`toHaveValue(50)`** - o campo tem aquele valor;
- **`toHaveLength(4)`** - o array tem aquele tamanho.

Um tipo de teste à parte é o **teste de snapshot**: o `toMatchSnapshot()` tira uma "fotografia" da renderização do componente na **primeira execução** e guarda num arquivo na pasta `__snapshots__`. Nas execuções seguintes, ele compara a saída atual com a foto salva e falha se elas divergirem, um jeito de perceber que algo no HTML mudou sem querer.

```javascript
test('Deve renderizar uma lista de links com a classe link', () => {
  render(<Menu />);
  const links = screen.getAllByRole('link');
  links.forEach((link) => expect(link).toHaveClass('link'));
  expect(links).toMatchSnapshot();
});
```

> **Cuidado com o snapshot sozinho.** Uma dúvida comum é: "por que fazer várias asserções se um snapshot resolveria?" Porque o snapshot é **frágil**: ele é facilmente atualizado (basta um comando quando o componente muda) e precisa de um **olhar humano** para conferir se a renderização está mesmo certa. Ele é um bom aliado, mas só ele torna o teste frágil, sempre combine snapshot com **asserções fortes** que de fato testam o comportamento do componente, como o `toHaveClass` acima.

### Simulando o usuário com o userEvent

Testar um componente interativo exige **simular ações** da pessoa usuária. O **`userEvent`** (de `@testing-library/user-event`, já instalado pelo Create React App) faz isso de forma mais fiel ao navegador do que o `fireEvent` embutido, disparando a sequência de eventos que uma interação real geraria. Alguns dos seus métodos:

- **`click()`** - dispara um clique num elemento;
- **`dblClick()`** - um duplo clique;
- **`type()`** - escreve um texto dentro de um `<input>` ou `<textarea>`;
- **`keyboard()`** - simula eventos de teclado;
- **`selectOptions()`** - seleciona opções de um `<select>`.

No `Formulario`, o `userEvent` preenche o campo, seleciona uma opção e clica no botão:

```javascript
test('que pode ser preenchido', () => {
  render(<Formulario />);
  const campoTexto = screen.getByPlaceholderText('Digite um valor');
  userEvent.type(campoTexto, '50');
  expect(campoTexto).toHaveValue(50);
});

test('Deve ser possível selecionar uma opção do elemento select', () => {
  render(<Formulario />);
  const select = screen.getByRole('combobox');
  userEvent.selectOptions(select, ['Depósito']);
  expect(screen.getByRole('option', { name: 'Depósito' }).selected).toBe(true);
});
```

### Organizando testes e testando props

Quando um componente tem vários cenários, o **`describe`** os agrupa sob uma descrição geral, deixando a saída dos testes organizada:

```javascript
describe('Deve renderizar um campo de input', () => {
  test('no documento', () => { /* ... */ });
  test('com type number', () => { /* ... */ });
  test('que pode ser preenchido', () => { /* ... */ });
});
```

Componentes costumam receber **props**, e o teste as passa como atributos no JSX. O teste do `Saldo` passa um saldo e confere que ele aparece formatado:

```javascript
test('Deve renderizar o saldo com o valor monetário', () => {
  render(<Saldo saldo={1000} />);
  const saldo = screen.getByTestId('saldo');
  expect(saldo).toHaveTextContent('R$ 1000');
});
```

Um cuidado importante em componentes de lista é garantir que eles exibem **dados dinâmicos**, vindos das props, e não um HTML **estático** escrito na mão. Para provar isso, o teste do `Transacoes` renderiza com uma transação, verifica o que aparece e depois usa o **`rerender`** (devolvido pelo `render`) para **redesenhar o mesmo componente com props novas**, conferindo que a tela acompanhou:

```javascript
const { rerender } = render(<Transacoes transacao={transacao} estilos={estilos} />);
expect(screen.getByTestId('tipoTransacao')).toHaveTextContent('Depósito');
expect(screen.getByTestId('valorTransacao')).toHaveTextContent('R$ 100');

const novaTransacao = { transacao: 'Transferência', valor: 50 };
rerender(<Transacoes transacao={novaTransacao} estilos={estilos} />);
expect(screen.getByTestId('tipoTransacao')).toHaveTextContent('Transferência');
expect(screen.getByTestId('valorTransacao')).toHaveTextContent('R$ 50');
```

Se o componente exibisse texto fixo, ele não mudaria após o `rerender` e o teste falharia, exatamente o que se quer detectar.

### Mock de funções com jest.fn()

Para testar um componente sem depender do que uma função **de verdade** faz, cria-se uma **função dublada** com o **`jest.fn()`**: uma função falsa que se pode passar como prop e que **registra como foi chamada** (quantas vezes, com quais argumentos). É o que testa a submissão do `Formulario`, sem precisar da lógica real de transação:

```javascript
test('Deve chamar um evento de onSubmit ao clicar em realizar transação', () => {
  const realizarTransacao = jest.fn();
  render(<Formulario realizarTransacao={realizarTransacao} />);
  const botao = screen.getByRole('button');
  userEvent.click(botao);
  expect(realizarTransacao).toHaveBeenCalledTimes(1);
});
```

Os matchers para funções dubladas verificam a **interação**: `toBeCalled()` / `toHaveBeenCalled()` (foi chamada?), `toHaveBeenCalledTimes(1)` (quantas vezes?) e `toHaveBeenCalledWith(arg)` (com quais argumentos?). O `jest.fn()` também dá para **implementar** um comportamento simulado, útil para testar a **regra de negócio** e até para **imaginar features ainda não construídas**:

```javascript
test('Deve retornar o valor do saldo atualizado com o rendimento', () => {
  const calculaRendimento = jest.fn((saldo) => saldo + saldo * 0.005);
  const novoSaldo = calculaRendimento(100);
  expect(novoSaldo).toBe(100.5);
  expect(calculaRendimento).toHaveBeenCalledWith(100);
});
```

### TDD: desenvolvimento orientado a testes

**TDD** (*Test Driven Development*, Desenvolvimento Orientado a Testes) é uma metodologia que **inverte a ordem** de sempre: primeiro o teste, depois o código. O ciclo tem três passos:

1. **Escrever um teste que falha** - como a funcionalidade ainda não existe, o teste começa vermelho;
2. **Implementar o código** que faça o teste passar, satisfazendo imediatamente a asserção, nada além disso;
3. **Refatorar** com segurança - com o teste verde, dá para melhorar o código sabendo que, se algo quebrar, o teste acusa, sem precisar reescrevê-lo.

Foi assim que nasceu a função `calculaNovoSaldo` (em `src/utils`): primeiro escrevemos os cenários (depósito aumenta o saldo, transferência diminui) e só depois a implementação que os satisfaz.

```javascript
export const calculaNovoSaldo = (valores, saldo) => {
  if (valores.transacao === 'Depósito') {
    return saldo + parseInt(valores.valor);
  } else {
    return saldo - parseInt(valores.valor);
  }
};
```

### Integração contínua: CI/CD e GitHub Actions

Testes rendem mais quando rodam **sozinhos** a cada mudança. É o que fazem as práticas de **CI/CD**:

- **CI** (*Continuous Integration*, Integração Contínua) - a cada mudança no código, ela é **integrada e testada** automaticamente, e esse fluxo é compartilhado com o time todo. Reduz conflitos e pega problemas cedo;
- **CD** (*Continuous Delivery*, Entrega Contínua) - reúne a integração, os testes e a etapa de **colocar a aplicação em produção**, isto é, no ar.

O **GitHub Actions** é uma plataforma de CI/CD que automatiza compilação, testes e comandos de *pipeline*. Ele executa **fluxos de trabalho** (*workflows*), processos disparados por um **evento no repositório** (um `push` ou um `pull request`), e fornece máquinas virtuais Linux, Windows e macOS para rodá-los.

A mesma ideia protege a aplicação **em produção**. Na Vercel, dá para configurar o *Build Command* para **rodar os testes antes de publicar**, de modo que um código que não passa nos testes nem chega a ir para produção:

```bash
react-scripts test && react-scripts build
```

O `&&` garante que o `build` só acontece se o `test` passar. Fecha o ciclo do curso: escrever testes com boas práticas e uma linguagem semântica, e usar essa rede de segurança para **impedir que código não testado chegue ao ar**.

Para fechar, um resumo dos arquivos de teste do projeto e do que cada um exercita:

| Arquivo de teste | O que testa | O que exercita |
|---|---|---|
| `utils.test.js` | A função `calculaNovoSaldo` | TDD, `toBe`, `describe`, `jest.fn()` |
| `Cabecalho.test.js` | O nome do usuário logado | `render`, `screen`, `getByText` |
| `Menu.test.js` | Os links de navegação | `getAllByRole`, `queryByText`, `toHaveClass`, snapshot |
| `Saldo.test.js` | O saldo formatado | props, `getByTestId`, `toHaveTextContent` |
| `Extrato.test.js` | A lista de transações | `getByRole('listitem')` |
| `Transacoes.test.js` | Dados dinâmicos da transação | props, `rerender`, `getByTestId` |
| `Formulario.test.js` | O formulário de nova transação | `userEvent`, `getByRole`, `jest.fn()`, `onSubmit` |

---

## Curso: SQL com MySQL: manipule e consulte dados

Depois de usar bancos de dados por baixo do Hibernate e do Spring Data JPA, este curso foi um mergulho no **SQL puro**: escrever à mão os comandos que até agora o framework gerava sozinho. O projeto foi a base **Sucos**, o banco de uma distribuidora de sucos com as tabelas `Cliente`, `Vendedor` e `Produto`. A partir dela, o trabalho foi **criar o banco e as tabelas**, **incluir, alterar e apagar** registros e dar os **primeiros passos na consulta** com o `SELECT`. A ferramenta central foi o **MySQL Workbench**, e tudo o que foi feito por lá também dá para fazer por linha de comando. As consultas mais elaboradas (filtrar, ordenar, agrupar e cruzar tabelas) ficaram para o curso seguinte, [Consultas SQL: avançando no SQL com MySQL](#curso-consultas-sql-avançando-no-sql-com-mysql).

### SQL e o MySQL: história e a família de comandos

**SQL** (*Structured Query Language*) é a linguagem padrão para trabalhar com **bancos de dados relacionais**, aqueles que organizam a informação em **tabelas** (linhas e colunas) com relações entre si. Ela não é uma linguagem de programação de propósito geral como Java ou JavaScript: é uma linguagem feita sob medida para **definir, manipular e consultar** dados. Apesar de existir um padrão da ANSI, cada banco (MySQL, PostgreSQL, Oracle, SQL Server) traz suas pequenas variações de dialeto.

Os comandos SQL se dividem em **famílias**, cada uma com um papel:

- **DDL** (*Data Definition Language*) - **define a estrutura** do banco: cria e altera bancos, tabelas e colunas (`CREATE`, `ALTER`, `DROP`);
- **DML** (*Data Manipulation Language*) - **manipula os dados** dentro das tabelas (`INSERT`, `UPDATE`, `DELETE`) e, para muitos, também o `SELECT` que consulta;
- **DCL** (*Data Control Language*) - **controla o acesso**, gerenciando permissões de quem pode fazer o quê (`GRANT`, `REVOKE`).

O **MySQL** é um dos bancos de dados relacionais mais usados no mundo, conhecido por ser rápido e de código aberto. Ele nasceu na empresa sueca MySQL AB, foi comprado pela Sun Microsystems e, quando a **Oracle** adquiriu a Sun e passou a controlar o MySQL, parte da comunidade ficou preocupada com o futuro do projeto e criou uma bifurcação (*fork*) livre a partir do código: o **MariaDB**, mantido de forma independente e compatível com o MySQL.

### Instalando e acessando: Workbench e linha de comando

Para usar o MySQL, instalam-se duas peças: o **servidor MySQL** (o banco em si, que roda em segundo plano e guarda os dados) e o **MySQL Workbench**, uma interface gráfica para escrever comandos, visualizar tabelas e administrar o banco sem precisar decorar tudo. Durante a instalação define-se a senha do usuário **`root`**, o administrador do banco.

Tudo o que o Workbench faz também pode ser feito pela **linha de comando**, entrando no cliente do MySQL e digitando os comandos direto no terminal:

```text
C:\Program Files\MySQL\MySQL Server 8.0\bin> mysql -h localhost -u root -p
mysql> -- seus comandos SQL aqui, sempre terminados com ;
mysql> EXIT
```

Os parâmetros são: **`-h`** o *host* (o endereço do servidor, aqui a própria máquina, `localhost`), **`-u`** o usuário (`root`) e **`-p`** para que ele **peça a senha**. Já dentro do prompt `mysql>`, cada comando é encerrado com **ponto e vírgula (`;`)**, e o `EXIT` encerra a sessão.

No **Workbench**, o fluxo é visual: cria-se uma **conexão** com o servidor, e a partir dela dá para navegar pelos bancos (*schemas*) no painel lateral, abrir uma aba de SQL para escrever comandos e executá-los com o botão de **raio** (⚡) ou com `Ctrl+Enter`. As tabelas, colunas e dados aparecem em painéis, e boa parte das operações (criar banco, criar tabela, editar linhas) pode ser feita tanto **por script SQL** quanto por um **assistente** de janelas, que no fim gera o mesmo SQL.

### Criando e apagando bancos de dados

Um **banco de dados** (no MySQL, também chamado de ***schema***) é o contêiner que agrupa as tabelas de um sistema. Cria-se com `CREATE DATABASE` (ou o sinônimo `CREATE SCHEMA`) e apaga-se com `DROP DATABASE`:

```sql
CREATE SCHEMA IF NOT EXISTS Sucos DEFAULT CHARACTER SET utf8;
DROP SCHEMA IF EXISTS Sucos;
```

Dois detalhes importantes aparecem aí:

- **`IF NOT EXISTS` / `IF EXISTS`** - evitam erro caso o banco já exista (ao criar) ou não exista (ao apagar). São uma proteção comum em scripts que rodam mais de uma vez;
- **`DEFAULT CHARACTER SET utf8`** - define a **codificação** de caracteres do banco, garantindo que acentos e caracteres especiais (comuns em português) sejam armazenados corretamente.

Depois de criar o banco, é preciso dizer ao MySQL **em qual banco** os próximos comandos vão operar, com o **`USE`**:

```sql
USE Sucos;
```

Sem o `USE`, cada tabela teria de ser referenciada com o nome completo (`Sucos.Cliente`). O `USE` fixa o banco atual e deixa escrever só `Cliente`.

> **`DROP` é definitivo.** O `DROP DATABASE` apaga o banco **inteiro** com todas as suas tabelas e dados, sem confirmação e sem lixeira. É um comando poderoso e irreversível, daí o cuidado ao rodá-lo.

### Os tipos de dados de uma coluna

Ao criar uma tabela, cada **coluna** precisa de um **tipo de dado**, que define o que ela pode guardar e quanto espaço ocupa. Escolher o tipo certo economiza espaço e evita erros. O MySQL organiza os tipos em **quatro famílias**: numéricos, de data e hora, de texto e espaciais.

#### Numéricos

Os tipos numéricos se dividem em três grupos, conforme guardem inteiros, decimais ou bits:

| Grupo | Tipos | Guarda |
|---|---|---|
| Inteiros | `TINYINT`, `SMALLINT`, `MEDIUMINT`, `INT`, `BIGINT` | números inteiros, do menor ao maior alcance (ver os prefixos abaixo) |
| Decimais aproximados | `FLOAT`, `DOUBLE` | casas decimais em **ponto flutuante** (valores aproximados) |
| Decimais exatos | `DECIMAL` / `NUMERIC` | casas decimais **exatas**, ideais para dinheiro |
| Lógico | `BIT` | bits (`0` ou `1`), usado em campos verdadeiro/falso |

Três **atributos** ajustam o comportamento desses tipos: **`SIGNED`/`UNSIGNED`** (permite ou não valores negativos), **`ZEROFILL`** (preenche com zeros à esquerda) e **`AUTO_INCREMENT`** (o banco gera sozinho um número crescente a cada linha, típico de chaves primárias).

**Os prefixos de tamanho: `TINY`, `SMALL`, `MEDIUM`, `BIG` (e o `INT` sem prefixo).** Os cinco tipos inteiros guardam todos a mesma coisa, números inteiros; o que muda entre eles é **quanto espaço reservam** e, por consequência, a **faixa de valores** que cabe. O prefixo é justamente esse "tamanho": `TINY` é o menor, `BIG` o maior, e o `INT` **sem prefixo** é o meio-termo padrão, o mais usado no dia a dia.

| Tipo | Prefixo | Espaço | Faixa com sinal (`SIGNED`) |
|---|---|---|---|
| `TINYINT` | `TINY` | 1 byte | −128 a 127 |
| `SMALLINT` | `SMALL` | 2 bytes | −32.768 a 32.767 |
| `MEDIUMINT` | `MEDIUM` | 3 bytes | ≈ ±8,3 milhões |
| `INT` | *(nenhum)* | 4 bytes | ≈ ±2,1 bilhões |
| `BIGINT` | `BIG` | 8 bytes | ≈ ±9,2 quintilhões |

A regra prática é escolher o **menor tipo que caiba com folga**: quanto menor, menos espaço a coluna ocupa. Um valor que estoure a faixa gera erro, então vale deixar uma margem. Na base Sucos, `idade` é `SMALLINT`, que dá conta de sobra de qualquer idade (um `TINYINT` já bastaria). O atributo `UNSIGNED` desloca a faixa toda para o lado positivo: um `TINYINT UNSIGNED`, por exemplo, vai de 0 a 255 em vez de −128 a 127.

Esse mesmo sistema de prefixos reaparece nos tipos de **texto** e **binários** (vistos abaixo): `TINYTEXT`, `TEXT`, `MEDIUMTEXT` e `LONGTEXT`, e os equivalentes `...BLOB`, seguem a mesma lógica de tamanho, só trocando o maior de `BIG` por `LONG`.

#### Data e hora

| Tipo | Guarda | Formato |
|---|---|---|
| `DATE` | só a data: dia, mês e ano | `AAAA-MM-DD` (ex.: `1989-10-05`) |
| `DATETIME` | data e hora juntas | `AAAA-MM-DD HH:MM:SS` |
| `TIMESTAMP` | data e hora, mas atreladas ao fuso e atualizadas sozinhas a cada alteração da linha | `AAAA-MM-DD HH:MM:SS` |
| `TIME` | só a hora (ou uma duração de tempo) | `HH:MM:SS` |
| `YEAR` | só o ano | `AAAA` |

`DATETIME` e `TIMESTAMP` guardam a mesma informação; a diferença é que o `TIMESTAMP` leva o fuso horário em conta e costuma servir para registrar **quando** uma linha foi criada ou alterada. Na base Sucos, as colunas de data (`data_nascimento`, `data_admissao`) são `DATE`, já que só interessa o dia.

#### Texto (string)

| Tipo | Guarda |
|---|---|
| `CHAR` | texto de **tamanho fixo** (bom para dados de largura constante, como `CHAR(11)` para CPF) |
| `VARCHAR` | texto de **tamanho variável** até um limite (`VARCHAR(100)`) |
| `BINARY`, `VARBINARY` | dados binários de tamanho fixo/variável |
| `BLOB` (`TINYBLOB`…`LONGBLOB`) | grandes blocos binários (imagens, arquivos) |
| `TEXT` (`TINYTEXT`…`LONGTEXT`) | grandes blocos de texto |
| `ENUM` | um valor de uma **lista fixa** de opções |

Dois atributos acompanham essa família: **`SET`** (guarda um conjunto de valores de uma lista) e **`COLLATE`** (define as regras de comparação e ordenação do texto, por exemplo diferenciar ou não maiúsculas de minúsculas e acentos).

> **`CHAR` x `VARCHAR`.** O `CHAR(11)` sempre reserva 11 caracteres, sobre ou falte; o `VARCHAR(100)` guarda só o que for necessário, até 100. Por isso o `CHAR` combina com campos de largura sempre igual (CPF, siglas de estado) e o `VARCHAR` com campos de tamanho imprevisível (nomes, endereços).

#### Espaciais

Para dados geográficos e geométricos: `GEOMETRY`, `POINT`, `LINESTRING` e `POLYGON`, usados em aplicações de mapas e localização.

### Criando e apagando tabelas (DDL)

Com o banco escolhido pelo `USE`, cria-se uma **tabela** com o `CREATE TABLE`, listando entre parênteses cada coluna com seu tipo. Foi assim que nasceu a tabela `Cliente` da base Sucos:

```sql
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
```

Cada linha descreve **uma coluna**: o nome, o tipo e, opcionalmente, restrições como o `PRIMARY KEY`. Para **apagar** uma tabela inteira (estrutura e dados), usa-se o `DROP TABLE`:

```sql
DROP TABLE Produto;
```

E para **alterar** uma tabela já existente sem recriá-la, o `ALTER TABLE`, que adiciona colunas, define chaves e muda a estrutura:

```sql
ALTER TABLE Produto ADD PRIMARY KEY (codigo);
ALTER TABLE Cliente ADD COLUMN (data_nascimento DATE);
```

### Chaves primárias

A **chave primária** (*primary key*) é a coluna (ou combinação de colunas) que **identifica de forma única** cada linha da tabela, não pode se repetir nem ficar vazia. Na tabela `Cliente`, a chave é o `cpf`; na `Produto`, o `codigo`; na `Vendedor`, a `matricula`. Define-se junto da coluna, na hora de criar a tabela, ou depois com `ALTER TABLE`:

```sql
cpf CHAR(11) PRIMARY KEY            -- na criação da tabela
ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);   -- depois
```

A escolha da chave primária exige cuidado: ela deve ser um valor **realmente único e estável** para cada registro. Um CPF serve porque não se repete entre pessoas; já um nome, não, duas pessoas podem se chamar igual. Uma chave mal escolhida (que possa repetir ou mudar) compromete a integridade da tabela inteira, por isso é uma decisão que vale pensar com calma na modelagem. Quando não há um identificador natural bom, é comum criar uma coluna de `id` numérica com `AUTO_INCREMENT` só para esse papel.

### Inserindo dados: o INSERT

Com as tabelas criadas (mas vazias), o `INSERT INTO` **inclui linhas** nelas. Informa-se a tabela, a lista de colunas que serão preenchidas e, depois do `VALUES`, os valores na mesma ordem:

```sql
INSERT INTO Cliente(cpf, nome, cidade, estado, data_nascimento, idade, sigla_sexo,
                    limite_credito, volume_compra, primeira_compra)
VALUES ('00388934505', 'João da Silva', 'CARATINGA', 'AMAZONAS',
        '1989-10-05', 30, 'M', 10000.00, 2000, 0);
```

Vale reparar em como cada tipo é escrito: **textos e datas entre aspas simples** (`'João da Silva'`, a data sempre no formato **`AAAA-MM-DD`**), **números sem aspas** (`30`, `10000.00`) e os **campos lógicos `BIT`** como `0` (falso) ou `1` (verdadeiro), também sem aspas — é o caso de `primeira_compra` e `ferias` na base Sucos. Uma mesma instrução `INSERT` pode inserir **vários registros de uma vez**, separando cada conjunto de valores por vírgula, jeito bem mais prático de popular a tabela:

```sql
INSERT INTO Produto(codigo, nome, embalagem, tamanho, sabor, preco_lista) VALUES
  ('1040107', 'Light - 350 ml - Melância', 'Lata', '350 ml', 'Melância', 4.56),
  ('1037797', 'Clean - 2 Litros - Laranja', 'PET', '2 Litros', 'Laranja', 16.01),
  ('1000889', 'Sabor da Montanha - 700 ml - Uva', 'Garrafa', '700 ml', 'Uva', 6.31);
```

Se uma coluna não for citada na lista, ela fica com o valor padrão (em geral `NULL`). É por isso que a lista de colunas no começo é importante: ela diz exatamente **quais** campos aquele `VALUES` está preenchendo.

### Alterando e apagando: UPDATE e DELETE

Depois de inserir, dois comandos mudam os dados existentes. O **`UPDATE`** altera valores de linhas já gravadas: informa-se a tabela, o que muda (`SET`) e, no `WHERE`, **quais** linhas devem mudar:

```sql
UPDATE Produto SET embalagem = 'Lata', preco_lista = 2.46 WHERE codigo = '544931';
UPDATE Vendedor SET nome = 'José Geraldo da Fonseca Junior' WHERE matricula = '00233';
```

O **`DELETE`** apaga linhas inteiras, também selecionadas pelo `WHERE`:

```sql
DELETE FROM Produto WHERE codigo = '1078680';
DELETE FROM Vendedor WHERE matricula = '00233';
```

O ponto crítico dos dois é o **`WHERE`**. Ele é quem restringe a operação às linhas certas, em geral pela chave primária, que atinge exatamente um registro. **Esquecer o `WHERE` é o erro clássico e perigoso do SQL:** um `UPDATE Produto SET preco_lista = 0` sem `WHERE` zera o preço de **todos** os produtos, e um `DELETE FROM Cliente` sem `WHERE` apaga **a tabela inteira**, e não há "desfazer".

> **Teste o `WHERE` com um `SELECT` primeiro.** Antes de um `UPDATE` ou `DELETE` importante, rode um `SELECT * FROM tabela WHERE ...` com a mesma condição: as linhas que aparecerem são exatamente as que serão alteradas ou apagadas. Uma conferência barata que evita um estrago irreversível.

### Consultando dados: o SELECT

O **`SELECT`** é o comando de **consulta**, o que mais se usa no dia a dia. Ele lê dados da tabela sem alterá-los. A forma mais simples traz **todas as colunas** (o `*`) de todas as linhas:

```sql
SELECT * FROM tbcliente;
```

Para trazer **só as colunas que interessam**, basta listá-las no lugar do `*`, o que deixa o resultado mais enxuto e a consulta mais rápida:

```sql
SELECT cpf, nome, data_nascimento FROM tbcliente;
```

E para **renomear** as colunas no resultado (sem mudar a tabela), usa-se o **`AS`**, criando um **apelido** (*alias*) mais legível para quem lê:

```sql
SELECT cpf AS cpf_cliente, nome AS nome_cliente FROM tbcliente;
```

O `SELECT` é a porta de entrada para todo o resto: a partir dele se **ordena**, se **limita** e, principalmente, se **filtra** o que aparece.

Para fechar, um resumo dos comandos vistos no curso, organizados pela família à qual pertencem:

| Comando | Família | O que faz |
|---|---|---|
| `CREATE DATABASE` / `CREATE SCHEMA` | DDL | cria um banco de dados |
| `DROP DATABASE` / `DROP TABLE` | DDL | apaga um banco ou uma tabela |
| `USE` | DDL | escolhe o banco atual |
| `CREATE TABLE` | DDL | cria uma tabela e suas colunas |
| `ALTER TABLE` | DDL | altera a estrutura de uma tabela |
| `INSERT INTO` | DML | inclui linhas na tabela |
| `UPDATE` | DML | altera dados de linhas existentes |
| `DELETE` | DML | apaga linhas da tabela |
| `SELECT` | DML | consulta e retorna dados |

Esse `SELECT` inicial (trazer todas as colunas ou só algumas, renomeá-las com `AS`) é só o começo. **Filtrar** com precisão, **ordenar**, **agrupar** e **cruzar** tabelas foi o tema do curso seguinte.

## Curso: Consultas SQL: avançando no SQL com MySQL

Se o curso anterior parou no `SELECT` simples, este foi inteiro dedicado a **consultar**. O ponto de partida foi outra montagem da mesma distribuidora de sucos, agora a base **`sucos_vendas`**, mais completa: além de clientes, produtos e vendedores, ela traz as **notas fiscais** e os **itens** de cada nota, ou seja, as vendas de verdade. Com esse volume de dados, o trabalho foi **filtrar** linhas com precisão, **agrupar** e **resumir** números, **cruzar** tabelas com `JOIN`, aplicar **funções** de texto, data e cálculo e, no fim, montar dois **relatórios** de negócio como uma empresa pediria. Vale notar que os nomes de coluna mudam um pouco em relação ao curso introdutório: aqui aparece o `_DE_` (`PRECO_DE_LISTA`, `LIMITE_DE_CREDITO`, `DATA_DE_NASCIMENTO`), detalhe que só se acerta conhecendo a base antes de escrever a consulta.

### Conhecendo a base antes de consultar

A primeira lição foi quase um conselho: **antes de consultar, conheça a base**. Escrever uma boa consulta depende de saber quais tabelas existem, quais colunas cada uma tem, quais são as **chaves** e como as tabelas se **relacionam**. A base `sucos_vendas` tem cinco tabelas:

| Tabela | Guarda | Chave |
|---|---|---|
| `tabela_de_clientes` | dados dos clientes (CPF, nome, endereço, `LIMITE_DE_CREDITO`, `VOLUME_DE_COMPRA`…) | `CPF` |
| `tabela_de_produtos` | catálogo de sucos (`CODIGO_DO_PRODUTO`, `NOME_DO_PRODUTO`, `SABOR`, `EMBALAGEM`, `PRECO_DE_LISTA`) | `CODIGO_DO_PRODUTO` |
| `tabela_de_vendedores` | vendedores (matrícula, nome, comissão, `BAIRRO`, `DE_FERIAS`) | `MATRICULA` |
| `notas_fiscais` | cada venda: quem comprou (`CPF`), quem vendeu (`MATRICULA`), a data e o `NUMERO` da nota | `NUMERO` |
| `itens_notas_fiscais` | os produtos de cada nota: `NUMERO`, `CODIGO_DO_PRODUTO`, `QUANTIDADE` e `PRECO` | `NUMERO` + `CODIGO_DO_PRODUTO` |

As duas últimas são o coração do modelo: uma **nota fiscal** liga um cliente a um vendedor numa data, e os **itens** dizem quais produtos e quantos entraram naquela nota. As ligações são feitas por **chaves estrangeiras**; `notas_fiscais.CPF` aponta para `tabela_de_clientes`, `notas_fiscais.MATRICULA` para `tabela_de_vendedores`, `itens_notas_fiscais.NUMERO` para `notas_fiscais` e `itens_notas_fiscais.CODIGO_DO_PRODUTO` para `tabela_de_produtos`. É esse desenho que torna possível, mais adiante, cruzar tudo com `JOIN` e perguntar coisas como "quanto cada cliente comprou por mês".

> **Explorar antes de escrever.** No Workbench dá para inspecionar tabelas e colunas sem decorar nada, e a documentação oficial ([dev.mysql.com](https://dev.mysql.com/doc/)) junto do [w3schools](https://www.w3schools.com) foram a consulta constante durante o curso para lembrar a sintaxe de cada função.

### Filtrando com o WHERE e os operadores de comparação

O **`WHERE`** é a cláusula que **filtra** as linhas: só aparecem no resultado as que satisfazem a condição. É o coração de qualquer consulta específica. A condição usa **operadores de comparação**:

| Operador | Significado |
|---|---|
| `=` | igual a |
| `<>` (ou `!=`) | diferente de |
| `>` / `<` | maior que / menor que |
| `>=` / `<=` | maior ou igual / menor ou igual |

```sql
SELECT * FROM tabela_de_clientes WHERE CIDADE = 'Rio de Janeiro';    -- igualdade de texto
SELECT * FROM tabela_de_clientes WHERE IDADE <> 22;                  -- diferente de
SELECT * FROM tabela_de_clientes WHERE LIMITE_DE_CREDITO >= 100000;  -- maior ou igual
```

Um detalhe interessante é que os operadores de **maior/menor também funcionam com texto**, seguindo a **ordem alfabética**. A consulta abaixo traz os clientes cujo nome vem **depois** de "Fernando Cavalcante" na ordem alfabética:

```sql
SELECT * FROM tabela_de_clientes WHERE NOME > 'Fernando Cavalcante';
```

### Filtros compostos: AND, OR e parênteses

Uma condição só nem sempre basta. Os operadores lógicos **`AND`** e **`OR`** combinam várias condições no mesmo `WHERE`:

- **`AND`** - **todas** as condições precisam ser verdadeiras;
- **`OR`** - **pelo menos uma** precisa ser verdadeira.

```sql
SELECT * FROM tabela_de_clientes WHERE IDADE >= 18 AND IDADE <= 22;        -- entre 18 e 22 anos
SELECT * FROM tabela_de_produtos WHERE SABOR = 'Manga' AND EMBALAGEM = 'PET';
```

Quando `AND` e `OR` aparecem juntos, entram os **parênteses** para deixar claro o que se agrupa, exatamente como na matemática. Sem eles, o banco segue uma ordem de precedência (o `AND` vem antes do `OR`) que pode não ser a intenção. A consulta abaixo busca clientes que sejam **homens entre 18 e 22 anos**, **ou** que morem no Rio de Janeiro **ou** no bairro Jardins:

```sql
SELECT * FROM tabela_de_clientes
WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M')
   OR (CIDADE = 'Rio de Janeiro' OR BAIRRO = 'Jardins');
```

Os parênteses separam os dois grandes grupos de condição: quem cair em **qualquer um** deles entra no resultado.

### Buscando texto: LIKE e expressões regulares

Comparar texto com `=` exige o valor **exato**. Para buscar por **parte** de um texto, usa-se o **`LIKE`** com o curinga **`%`**, que representa "qualquer sequência de caracteres". A consulta abaixo acha todo produto cujo sabor contenha "Maça" em qualquer posição:

```sql
SELECT * FROM tabela_de_produtos WHERE SABOR LIKE '%Maça%';
```

O `%` pode ir no começo (`'%Limão'`, termina em "Limão"), no fim (`'Festival%'`, começa com "Festival") ou dos dois lados (`'%Maça%'`, contém "Maça"). Existe ainda o curinga `_`, que representa **um único** caractere qualquer. O `LIKE` combina bem com o `AND` para estreitar a busca:

```sql
SELECT * FROM tabela_de_produtos WHERE SABOR LIKE '%Maça%' AND EMBALAGEM = 'PET';
```

Para buscas mais poderosas, o MySQL também aceita **expressões regulares** com o **`REGEXP_LIKE`**, que casa um padrão dentro do texto, próximo do que as `RegExp` fazem em JavaScript:

```sql
SELECT * FROM tabela_de_produtos WHERE REGEXP_LIKE(SABOR, 'Maça');
```

### Listas e faixas: IN, NOT IN e BETWEEN

Quando o filtro é "a coluna é um destes vários valores", escrever um `OR` para cada um cansa. O **`IN`** recebe uma **lista** e casa quem estiver nela; o **`NOT IN`** casa quem **não** estiver:

```sql
SELECT * FROM tabela_de_clientes WHERE BAIRRO IN ('Tijuca', 'Jardins', 'Copacabana', 'Santo Amaro');
SELECT * FROM tabela_de_produtos WHERE SABOR NOT IN ('Laranja', 'Manga');
```

Já quando o filtro é uma **faixa** de valores, entra o **`BETWEEN`**, que pega tudo entre dois limites (inclusive). Ele é especialmente útil com colunas de **ponto flutuante** (`FLOAT`/`DOUBLE`), e aí mora um cuidado importante: como esses tipos guardam números de forma **aproximada** (o "19.51" pode estar armazenado como 19.5100001…), comparações de **igualdade exata** (`=`, `<>`) podem **falhar silenciosamente**, a consulta não retorna a linha que deveria porque o número procurado não bate bit a bit com o guardado. Filtrar por uma faixa curta contorna o problema:

```sql
-- ponto flutuante não é confiável com = exato; use uma faixa:
SELECT * FROM tabela_de_produtos WHERE PRECO_DE_LISTA BETWEEN 19.50 AND 19.52;
-- equivale a:
SELECT * FROM tabela_de_produtos WHERE PRECO_DE_LISTA >= 19.50 AND PRECO_DE_LISTA <= 19.52;
```

O `BETWEEN` é apenas uma forma abreviada de escrever a combinação de `>=` e `<=`. Para valores decimais que precisam de **exatidão** (dinheiro, por exemplo), a recomendação continua sendo usar o tipo `DECIMAL` desde a criação da tabela, em vez de `FLOAT`.

> **Por que isso acontece.** Ponto flutuante representa números em base 2, e muitos decimais "redondos" em base 10 não têm representação exata em binário, o mesmo motivo pelo qual `0.1 + 0.2` não dá exatamente `0.3` em várias linguagens. Filtrar por faixa contorna o problema sem depender da representação exata.

O `IN` ainda tem um segundo uso poderoso: no lugar da lista fixa, colocar **outra consulta** que devolve os valores; assunto das [subconsultas](#subconsultas-subqueries).

### Filtrando por datas

Colunas `DATE` também entram no `WHERE`, e por serem guardadas no formato padrão `AAAA-MM-DD` podem ser **comparadas e ordenadas** como se fossem valores em ordem. Dá para filtrar por uma data limite:

```sql
SELECT * FROM tabela_de_clientes WHERE DATA_DE_NASCIMENTO <= '1995-01-13';
```

E, para filtrar por **parte** da data (só o ano, só o mês), o MySQL oferece **funções de data** que extraem um pedaço do valor. Como nos seguintes casos:

```sql
SELECT * FROM tabela_de_clientes WHERE YEAR(DATA_DE_NASCIMENTO) = 1995;   -- nascidos em 1995
SELECT * FROM tabela_de_clientes WHERE MONTH(DATA_DE_NASCIMENTO) = 10;    -- nascidos em outubro
```

A função recebe a coluna de data e devolve só a parte pedida, que então é comparada normalmente. Há muitas outras funções de data (de diferença entre datas a formatação) reunidas mais adiante na seção de [funções](#funções-texto-números-datas-e-conversão).

### Linhas distintas: o DISTINCT

Às vezes a mesma combinação de valores se repete em muitas linhas e só interessa saber **quais combinações existem**, sem repetição. O **`DISTINCT`**, logo após o `SELECT`, elimina as linhas duplicadas do resultado:

```sql
SELECT DISTINCT EMBALAGEM, TAMANHO FROM tabela_de_produtos;
```

O `DISTINCT` considera a **linha inteira** selecionada: duas linhas só são "iguais" se **todas** as colunas listadas baterem. Acima, cada par `EMBALAGEM` + `TAMANHO` aparece uma única vez, mesmo que dezenas de produtos compartilhem a mesma combinação.

### Ordenando e limitando: ORDER BY e LIMIT

Por padrão, o banco devolve as linhas na ordem em que achar melhor. Para **ordenar** o resultado, usa-se o **`ORDER BY`** seguido da coluna, com **`ASC`** (crescente, o padrão) ou **`DESC`** (decrescente):

```sql
SELECT * FROM tabela_de_produtos ORDER BY NOME_DO_PRODUTO DESC;
```

Pode-se ordenar por **mais de uma coluna**: o banco ordena pela primeira e, nos empates, desempata pela segunda, e assim por diante. Cada coluna tem seu próprio `ASC`/`DESC`:

```sql
SELECT * FROM tabela_de_produtos ORDER BY EMBALAGEM DESC, NOME_DO_PRODUTO ASC;
```

Já o **`LIMIT`** corta o resultado num número máximo de linhas. Combinado com o `ORDER BY`, é o jeito clássico de responder perguntas do tipo "os 5 mais baratos":

```sql
SELECT * FROM tabela_de_produtos ORDER BY PRECO_DE_LISTA LIMIT 5;
```

O `LIMIT` aceita ainda **dois números**, `LIMIT início, quantidade`: o primeiro diz **quantas linhas pular** e o segundo **quantas trazer**, útil para paginar resultados. A consulta abaixo pula as 2 primeiras linhas e traz as 3 seguintes:

```sql
SELECT * FROM tabela_de_produtos LIMIT 2, 3;   -- pula 2, traz 3
```

### Agrupando dados: GROUP BY e funções de agregação

Até aqui as consultas devolviam linha a linha. O **`GROUP BY`** muda o jogo: ele **agrupa** as linhas que compartilham um mesmo valor e permite aplicar **funções de agregação** sobre cada grupo, resumindo muitas linhas em uma. As mais usadas são:

| Função | Resume o grupo em |
|---|---|
| `SUM(coluna)` | a **soma** dos valores |
| `AVG(coluna)` | a **média** |
| `MAX(coluna)` / `MIN(coluna)` | o **maior** / **menor** valor |
| `COUNT(*)` | a **quantidade** de linhas |

Escolhe-se a coluna que define o grupo, e as funções calculam o resumo de cada um. Por exemplo, o limite de crédito **somado por estado**, ou o preço **mais alto por embalagem**, ou **quantos** produtos há em cada embalagem:

```sql
SELECT ESTADO, SUM(LIMITE_DE_CREDITO) AS LIMITE_TOTAL FROM tabela_de_clientes GROUP BY ESTADO;
SELECT EMBALAGEM, MAX(PRECO_DE_LISTA) AS MAIOR_PRECO FROM tabela_de_produtos GROUP BY EMBALAGEM;
SELECT EMBALAGEM, COUNT(*) AS CONTADOR FROM tabela_de_produtos GROUP BY EMBALAGEM;
```

Dá para agrupar por **mais de um campo**, o grupo passa a ser cada combinação. E o `WHERE` continua valendo: ele **filtra as linhas antes** de elas serem agrupadas.

```sql
-- soma do limite por bairro, só entre clientes do Rio:
SELECT BAIRRO, SUM(LIMITE_DE_CREDITO) AS LIMITE FROM tabela_de_clientes
WHERE CIDADE = 'Rio de Janeiro' GROUP BY BAIRRO;

-- agrupando por estado e bairro ao mesmo tempo:
SELECT ESTADO, BAIRRO, SUM(LIMITE_DE_CREDITO) AS LIMITE FROM tabela_de_clientes
GROUP BY ESTADO, BAIRRO;
```

> **Regra de ouro do `GROUP BY`.** Toda coluna que aparece no `SELECT` fora de uma função de agregação precisa estar no `GROUP BY`. Faz sentido: se a linha do resultado representa um grupo, cada coluna "solta" tem de ser um dos critérios que definem esse grupo.

### Filtrando grupos: o HAVING

O `WHERE` filtra linhas **antes** do agrupamento, então ele não enxerga os totais calculados pelo `GROUP BY`. Para filtrar **pelos valores agregados** ("só os grupos cuja soma passa de X") existe o **`HAVING`**, que executa **depois** do agrupamento:

```sql
SELECT ESTADO, SUM(LIMITE_DE_CREDITO) AS SOMA_LIMITE FROM tabela_de_clientes
GROUP BY ESTADO HAVING SUM(LIMITE_DE_CREDITO) > 900000;
```

A diferença entre os dois é a chave para não se confundir:

| Cláusula | Quando roda | Filtra por |
|---|---|---|
| `WHERE` | **antes** de agrupar | valores de cada **linha** |
| `HAVING` | **depois** de agrupar | valores **agregados** (`SUM`, `MAX`…) |

Os dois podem conviver na mesma consulta: o `WHERE` enxuga as linhas que entram, o `GROUP BY` agrupa o que sobrou e o `HAVING` descarta os grupos que não interessam.

### Classificando com o CASE

O **`CASE`** cria uma coluna cujo valor depende de uma **condição**, funcionando como o `if`/`else` das linguagens de programação: testa cada `WHEN` na ordem, e o primeiro que for verdadeiro define o resultado; se nenhum casar, vale o `ELSE`. Serve para **classificar** um campo por um critério. Abaixo, cada produto ganha um rótulo conforme a faixa de preço:

```sql
SELECT NOME_DO_PRODUTO, PRECO_DE_LISTA,
CASE
    WHEN PRECO_DE_LISTA >= 12 THEN 'PRODUTO CARO'
    WHEN PRECO_DE_LISTA >= 7 AND PRECO_DE_LISTA < 12 THEN 'PRODUTO EM CONTA'
    ELSE 'PRODUTO BARATO'
END AS STATUS_PRECO
FROM tabela_de_produtos ORDER BY STATUS_PRECO;
```

Como o `CASE` gera um valor, ele pode entrar também no `GROUP BY`, dando para agrupar pela **categoria** que ele cria (produtos caros, em conta, baratos) e tirar a média de preço de cada faixa, por exemplo. É a peça que transforma um número cru numa **classificação** legível, e reaparece nos relatórios do fim do curso.

### Juntando tabelas: os JOINs

Os dados de negócio ficam **espalhados** em várias tabelas, o nome do cliente numa, a venda em outra, o produto numa terceira. O **`JOIN`** **cruza** tabelas relacionadas, casando as linhas por uma condição (o **`ON`**), quase sempre a igualdade entre uma chave e sua chave estrangeira. Para encurtar, dá-se um **apelido** a cada tabela (`A`, `B`) e as colunas são referenciadas como `A.coluna`:

```sql
SELECT * FROM tabela_de_vendedores A
INNER JOIN notas_fiscais B ON A.MATRICULA = B.MATRICULA;
```

Existem tipos diferentes de `JOIN`, que mudam **o que fazer com as linhas sem par**:

| Tipo | Traz |
|---|---|
| `INNER JOIN` | só as linhas que **casam** nas duas tabelas |
| `LEFT JOIN` | **todas** as da tabela da esquerda, casem ou não (as sem par vêm com `NULL`) |
| `RIGHT JOIN` | **todas** as da direita, casem ou não |

O `INNER JOIN` é o mais comum: pega apenas quem tem correspondência dos dois lados (vendedores **com** notas, por exemplo). Já o `LEFT JOIN` é a ferramenta para achar **quem não tem par**: traz todo mundo da esquerda e, combinado com `WHERE ... IS NULL`, isola justamente as linhas sem correspondência, como os clientes que **nunca compraram**:

```sql
SELECT DISTINCT A.CPF, A.NOME FROM tabela_de_clientes A
LEFT JOIN notas_fiscais B ON A.CPF = B.CPF
WHERE B.CPF IS NULL;
```

> **O `FULL OUTER JOIN` não existe no MySQL.** Alguns bancos trazem, de uma vez, todas as linhas dos dois lados; o MySQL não. O jeito de simular é fazer um `LEFT JOIN` e um `RIGHT JOIN` e uni-los com `UNION` (a seguir). Vale lembrar também a sintaxe antiga, com as tabelas separadas por vírgula e a condição no `WHERE` (`FROM a, b WHERE a.x = b.x`), que equivale a um `INNER JOIN`.

### Combinando seleções: UNION e UNION ALL

Enquanto o `JOIN` junta tabelas **lado a lado** (mais colunas), o **`UNION`** **empilha** os resultados de duas seleções, um embaixo do outro (mais linhas). A única exigência é que as duas seleções tenham a **mesma quantidade e ordem de colunas**. O `UNION` **remove as duplicatas**; o **`UNION ALL`** mantém tudo, inclusive repetições (e por isso é mais rápido):

```sql
SELECT DISTINCT BAIRRO FROM tabela_de_clientes
UNION
SELECT DISTINCT BAIRRO FROM tabela_de_vendedores;
```

Um truque útil é acrescentar uma **coluna de texto fixo** em cada seleção para marcar a origem da linha:

```sql
SELECT BAIRRO, NOME, 'CLIENTE' AS TIPO FROM tabela_de_clientes
UNION
SELECT BAIRRO, NOME, 'VENDEDOR' AS TIPO FROM tabela_de_vendedores;
```

É também com `UNION` que se simula o `FULL OUTER JOIN` que falta no MySQL: basta unir um `LEFT JOIN` com um `RIGHT JOIN` das mesmas tabelas.

### Subconsultas (subqueries)

Uma **subconsulta** é uma consulta **dentro de outra**. Dois usos apareceram no curso. No primeiro, ela serve de **critério de filtro**: no lugar de uma lista fixa depois do `IN`, entra um `SELECT` que devolve os valores. A consulta abaixo traz os clientes que moram em algum bairro **onde também mora um vendedor**:

```sql
SELECT * FROM tabela_de_clientes WHERE BAIRRO
IN (SELECT DISTINCT BAIRRO FROM tabela_de_vendedores);
```

No segundo, a subconsulta faz o papel de uma **tabela temporária** dentro do `FROM`: primeiro ela calcula um resultado (aqui, o maior preço por embalagem) e a consulta de fora trabalha em cima dele. Uma subconsulta no `FROM` **precisa de um apelido** (o `X`):

```sql
SELECT X.EMBALAGEM, X.PRECO_MAXIMO FROM
    (SELECT EMBALAGEM, MAX(PRECO_DE_LISTA) AS PRECO_MAXIMO FROM tabela_de_produtos
     GROUP BY EMBALAGEM) X
WHERE X.PRECO_MAXIMO >= 10;
```

Esse padrão (agrupar numa subconsulta e filtrar ou ordenar o resultado por fora) é a espinha dorsal dos relatórios mais complexos do curso.

### Visões (Views)

Quando uma consulta é boa e vai ser reaproveitada, dá para **salvá-la** como uma **visão** (*view*): um `SELECT` guardado no banco com um nome, que passa a ser usado **como se fosse uma tabela**. Cria-se com `CREATE VIEW` (ou `CREATE OR REPLACE VIEW`, que sobrescreve se já existir):

```sql
CREATE OR REPLACE VIEW VW_MAIORES_EMBALAGENS AS
SELECT EMBALAGEM, MAX(PRECO_DE_LISTA) AS MAIOR_PRECO FROM tabela_de_produtos
GROUP BY EMBALAGEM;
```

A partir daí, consulta-se a view direto, sem repetir todo o agrupamento:

```sql
SELECT EMBALAGEM, MAIOR_PRECO FROM VW_MAIORES_EMBALAGENS WHERE MAIOR_PRECO >= 10;
```

A view **não guarda dados**, é virtual: cada vez que é consultada, o `SELECT` por trás roda de novo sobre os dados atuais. Sua força é **encapsular** consultas complexas atrás de um nome simples, e ela pode inclusive entrar num `JOIN` como qualquer tabela, o que deixa consultas grandes bem mais legíveis.

### Funções: texto, números, datas e conversão

Além de filtrar e agrupar, o SQL traz um arsenal de **funções** que **transformam valores** na saída da consulta. O curso passou por quatro famílias.

#### Texto

Para limpar, juntar e recortar strings: `TRIM` (e as variantes `LTRIM`/`RTRIM`) tira espaços das pontas, `CONCAT` junta pedaços, `UPPER`/`LOWER` trocam a caixa e `SUBSTRING` recorta a partir de uma posição.

```sql
SELECT TRIM('   OLÁ   ') AS RESULTADO;                       -- 'OLÁ'
SELECT CONCAT('OLÁ', ' ', 'TUDO BEM', '?') AS RESULTADO;     -- 'OLÁ TUDO BEM?'
SELECT SUBSTRING('OLÁ, TUDO BEM?', 6, 4) AS RESULTADO;       -- 'TUDO' (da posição 6, 4 caracteres)
SELECT CONCAT(NOME, ' (', CPF, ')') AS RESULTADO FROM tabela_de_clientes;
```

#### Matemáticas

Para arredondar e calcular: `ROUND` arredonda (opcionalmente a N casas), `CEILING` e `FLOOR` empurram para cima e para baixo, `RAND` sorteia. Operações aritméticas (`+ - * /`) também valem entre colunas:

```sql
SELECT CEILING(12.33), FLOOR(12.77), ROUND(12.777) AS RESULTADO;
SELECT NUMERO, QUANTIDADE, PRECO, ROUND(QUANTIDADE * PRECO, 2) AS FATURAMENTO
FROM itens_notas_fiscais;
```

#### Datas

Além de `YEAR()` e `MONTH()` (usadas nos filtros), há funções para a data atual (`CURDATE`, `CURRENT_TIMESTAMP`), diferença entre datas (`DATEDIFF`, em dias), aritmética de datas (`DATE_SUB` com `INTERVAL`), nomes por extenso (`DAYNAME`, `MONTHNAME`) e **formatação** (`DATE_FORMAT`, com máscaras como `%Y` ano, `%m` mês, `%d` dia, `%W` dia da semana):

```sql
SELECT DATEDIFF(CURRENT_TIMESTAMP(), '2004-03-06') AS RESULTADO;      -- diferença em dias
SELECT DATE_SUB(CURRENT_TIMESTAMP(), INTERVAL 5 DAY) AS RESULTADO;    -- 5 dias atrás
SELECT DATE_FORMAT(CURRENT_TIMESTAMP(), '%W, %d/%m/%y') AS RESULTADO; -- monta a data com máscara
```

#### Conversão

Para mudar o **tipo** de um valor, o `CONVERT`; por exemplo, transformar um número em texto para depois recortá-lo com `SUBSTRING`:

```sql
SELECT CONVERT(23.3, CHAR) AS RESULTADO;                     -- '23.3' (agora é texto)
SELECT SUBSTRING(CONVERT(23.3, CHAR), 1, 1) AS RESULTADO;    -- '2'
```

### Colocando em prática: dois relatórios

A última aula reuniu tudo em **dois relatórios** encomendados pela distribuidora, cada um cruzando várias tabelas com `JOIN`, resumindo com `GROUP BY` e classificando com `CASE`.

**1. Relatório de vendas válidas.** A pergunta: em cada mês, a quantidade que um cliente comprou passou do seu **limite de compra**? Foi preciso cruzar `notas_fiscais` (a venda) com `itens_notas_fiscais` (as quantidades) e `tabela_de_clientes` (o limite), somar a quantidade por cliente e por mês (com `DATE_FORMAT(..., '%Y-%m')` transformando a data em "ano-mês") e, por fim, comparar o total com o limite num `CASE`. O agrupamento ficou numa subconsulta, e a classificação por fora:

```sql
SELECT X.CPF, X.NOME, X.MES_ANO, X.QUANTIDADE_VENDAS, X.QUANTIDADE_LIMITE,
CASE
    WHEN (X.QUANTIDADE_LIMITE - X.QUANTIDADE_VENDAS) < 0 THEN 'INVÁLIDA'
    ELSE 'VÁLIDA'
END AS STATUS_VENDA
FROM (
    SELECT NF.CPF, TC.NOME, DATE_FORMAT(NF.DATA_VENDA, '%Y-%m') AS MES_ANO,
           SUM(INF.QUANTIDADE)      AS QUANTIDADE_VENDAS,
           MAX(TC.VOLUME_DE_COMPRA) AS QUANTIDADE_LIMITE
    FROM notas_fiscais NF
    INNER JOIN itens_notas_fiscais INF ON NF.NUMERO = INF.NUMERO
    INNER JOIN tabela_de_clientes  TC  ON TC.CPF = NF.CPF
    GROUP BY NF.CPF, TC.NOME, DATE_FORMAT(NF.DATA_VENDA, '%Y-%m')
) X
ORDER BY STATUS_VENDA;
```

**2. Relatório de participação por sabor.** A pergunta: em 2016, quanto cada **sabor** representou do total vendido? Aqui foram cruzadas `tabela_de_produtos`, `itens_notas_fiscais` e `notas_fiscais`, com a quantidade somada **por sabor** de um lado e a quantidade **total do ano** de outro. As duas somas foram calculadas em subconsultas e cruzadas por `JOIN`, e a participação (%) saiu de uma divisão arredondada com `ROUND`:

```sql
SELECT VENDA_SABOR.SABOR, VENDA_SABOR.ANO, VENDA_SABOR.QUANTIDADE,
       ROUND((VENDA_SABOR.QUANTIDADE / VENDA_TOTAL.QUANTIDADE) * 100, 2) AS PARTICIPACAO
FROM
    (SELECT TP.SABOR, YEAR(NF.DATA_VENDA) AS ANO, SUM(INF.QUANTIDADE) AS QUANTIDADE
     FROM tabela_de_produtos TP
     INNER JOIN itens_notas_fiscais INF ON TP.CODIGO_DO_PRODUTO = INF.CODIGO_DO_PRODUTO
     INNER JOIN notas_fiscais NF ON NF.NUMERO = INF.NUMERO
     WHERE YEAR(NF.DATA_VENDA) = 2016
     GROUP BY TP.SABOR, YEAR(NF.DATA_VENDA)) AS VENDA_SABOR
INNER JOIN
    (SELECT YEAR(NF.DATA_VENDA) AS ANO, SUM(INF.QUANTIDADE) AS QUANTIDADE
     FROM tabela_de_produtos TP
     INNER JOIN itens_notas_fiscais INF ON TP.CODIGO_DO_PRODUTO = INF.CODIGO_DO_PRODUTO
     INNER JOIN notas_fiscais NF ON NF.NUMERO = INF.NUMERO
     WHERE YEAR(NF.DATA_VENDA) = 2016
     GROUP BY YEAR(NF.DATA_VENDA)) AS VENDA_TOTAL
ON VENDA_SABOR.ANO = VENDA_TOTAL.ANO
ORDER BY VENDA_SABOR.QUANTIDADE DESC;
```

Os dois relatórios são a síntese do curso: sozinho, cada comando é simples; o valor aparece quando `JOIN`, `GROUP BY`, funções, subconsultas e `CASE` se combinam para responder a uma pergunta de negócio real.

Para fechar, um resumo dos recursos de consulta vistos no curso:

| Recurso | O que faz |
|---|---|
| `WHERE` + `=`, `<>`, `>`, `<`, `>=`, `<=` | filtra linhas por comparação |
| `AND`, `OR`, `( )` | combina condições |
| `LIKE`, `REGEXP_LIKE` | busca por padrão de texto |
| `IN`, `NOT IN`, `BETWEEN` | filtra por lista ou faixa |
| `DISTINCT` | remove linhas repetidas |
| `ORDER BY`, `LIMIT` | ordena e limita a saída |
| `GROUP BY` + `SUM`/`AVG`/`MAX`/`MIN`/`COUNT` | agrupa linhas e resume números |
| `HAVING` | filtra grupos por valor agregado |
| `CASE` | classifica um campo por um critério |
| `INNER`/`LEFT`/`RIGHT JOIN` | cruza tabelas relacionadas |
| `UNION`, `UNION ALL` | empilha duas seleções |
| subconsulta (*subquery*) | usa uma consulta dentro de outra |
| `VIEW` | salva uma consulta e a usa como tabela |
| funções de texto, número, data e conversão | transformam valores na saída |

## Curso: Java e JDBC: trabalhando com um banco de dados

Nos cursos de Spring Boot, o banco de dados era acessado por baixo do **Hibernate** e do **Spring Data JPA**, que geravam o SQL sozinhos; nos cursos de SQL, o trabalho foi escrever esse SQL à mão, direto no Workbench. Este curso juntou os dois lados: acessar um banco **MySQL a partir do próprio código Java**, sem framework de persistência, usando o **JDBC**, a API padrão do Java para bancos de dados. O projeto foi a **loja_virtual**, uma loja com as tabelas `Categoria` e `Produto` (uma categoria tem vários produtos), e o caminho foi do "abrir uma conexão" até uma pequena aplicação organizada em camadas, passando por `Statement`, `PreparedStatement`, transações, pool de conexões e o padrão DAO. Foram dois projetos: um de **console** (`loja-virtual-repository`), onde cada conceito foi testado numa classe `main`, e um com **tela** (`loja-virtual-view-repository`), que amarrou tudo numa interface gráfica em camadas.

### JDBC: a ponte entre o Java e o banco

Para o Java conversar com um banco de dados, é preciso um **driver**: uma biblioteca (um arquivo **JAR**) que sabe falar o "idioma" daquele banco específico. Cada banco tem o seu; para o MySQL, o driver é o `mysql-connector-java`, que basta adicionar ao **classpath** do projeto (na pasta de bibliotecas ou como dependência do módulo).

O **JDBC** (*Java Database Connectivity*) é a peça que fica entre a aplicação e esse driver. Ele vive no pacote **`java.sql`** e define uma **camada de abstração**: um conjunto de **interfaces** (`Connection`, `Statement`, `ResultSet`…) que o código usa, e que cada driver **implementa** por baixo. A vantagem é o desacoplamento: o código é escrito contra as interfaces do JDBC, então trocar o MySQL por PostgreSQL ou Oracle é, em boa parte, trocar o JAR do driver e a string de conexão, sem reescrever a lógica.

Para **abrir uma conexão**, usa-se o método estático `getConnection` da classe **`DriverManager`**, passando uma **string de conexão JDBC** que descreve a URL, o usuário e a senha:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost/loja_virtual?serverTimezone=UTC", "root", "root");
```

A URL segue o formato `jdbc:mysql://<host>/<banco>?<parâmetros>`: o `jdbc:mysql` diz qual driver usar, o `localhost/loja_virtual` aponta o servidor e o banco, e os parâmetros ajustam detalhes como o fuso horário (`serverTimezone=UTC`). O primeiro teste do curso foi só abrir e fechar essa conexão para confirmar que o driver estava no lugar:

```java
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();
        System.out.println("Fechando conexão...");
        con.close();
    }
}
```

### A ConnectionFactory e o Factory Method

Repetir a string de conexão e a chamada ao `DriverManager` toda vez que a aplicação precisa do banco espalha o mesmo código por vários lugares e acopla tudo aos detalhes da conexão. A solução é **encapsular a criação da conexão** numa classe só, a **`ConnectionFactory`**:

```java
public class ConnectionFactory {

    public Connection recuperarConexao() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost/loja_virtual?serverTimezone=UTC", "root", "root");
    }
}
```

Quem precisa de uma conexão chama `new ConnectionFactory().recuperarConexao()` e não sabe (nem precisa saber) como ela é criada. Esse é o padrão de projeto **Factory Method**: um método cuja única responsabilidade é **fabricar um objeto**, escondendo os detalhes da criação. Se amanhã a URL, o usuário ou até o mecanismo de criação mudar, a alteração fica num ponto só. Mais adiante foi exatamente esse método que trocou a conexão simples por um pool, sem que o resto do código percebesse.

### Executando comandos: o Statement

Com a conexão aberta, os comandos SQL são enviados pela interface **`java.sql.Statement`**, criada a partir da conexão. O método **`execute`** manda o comando para o banco:

```java
Connection con = new ConnectionFactory().recuperarConexao();
Statement stm = con.createStatement();
stm.execute("INSERT INTO Produto (nome, descricao) VALUES ('Mouse', 'Sem fio')",
        Statement.RETURN_GENERATED_KEYS);
```

Dependendo do comando, dá para **recuperar informações de volta**. Num `INSERT` numa tabela com chave `AUTO_INCREMENT`, a constante `Statement.RETURN_GENERATED_KEYS` pede ao banco que devolva a **chave primária gerada**, lida depois num **`ResultSet`** com `getGeneratedKeys`:

```java
ResultSet rst = stm.getGeneratedKeys();
while (rst.next()) {
    Integer id = rst.getInt(1);
    System.out.println("O id criado foi: " + id);
}
```

O `ResultSet` é o resultado de uma consulta em forma de tabela: `rst.next()` avança para a próxima linha (e devolve `false` quando acabam), e `getInt(1)`, `getString(2)`… leem cada **coluna pela posição**. Num `SELECT`, o resultado das linhas vem do `getResultSet`; já num `UPDATE` ou `DELETE`, o `getUpdateCount` informa **quantas linhas** foram afetadas:

```java
PreparedStatement stm = con.prepareStatement("DELETE FROM Produto WHERE id > 4");
stm.execute();
Integer linhasModificadas = stm.getUpdateCount();
System.out.println("Quantidade de linhas modificadas: " + linhasModificadas);
```

### SQL Injection e o PreparedStatement

Montar o comando concatenando valores direto na string SQL (`"... VALUES ('" + nome + "')"`) abre uma brecha de segurança clássica: o **SQL Injection**. A ideia é simples e perigosa: se o valor vem de fora (um formulário, por exemplo), alguém pode escrever um texto que **fecha a string e emenda um novo comando SQL**, fazendo o banco executar algo que não estava previsto, como apagar uma tabela inteira.

Para evitar isso, usa-se a interface **`PreparedStatement`**. Em vez de colar os valores na string, o comando fica com **marcadores `?`** no lugar de cada parâmetro, e os valores são informados depois pelos métodos `setString`, `setInt` e afins:

```java
String sql = "INSERT INTO Produto (nome, descricao) VALUES (?, ?)";
try (PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
    pstm.setString(1, produto.getNome());
    pstm.setString(2, produto.getDescricao());
    pstm.execute();
}
```

A diferença essencial é que, ao contrário do `Statement`, o `PreparedStatement` **trata (sanitiza) cada parâmetro**: o driver garante que o valor entre como *dado*, nunca como *comando*, fechando a porta do SQL Injection. Como efeito colateral, o código também fica mais limpo (sem concatenação) e o comando pode ser reaproveitado com valores diferentes. Por segurança e clareza, o `PreparedStatement` passou a ser o padrão do curso, deixando o `Statement` só para a demonstração inicial.

### Transações: commit, rollback e o try-with-resources

Uma **transação** é o recurso do banco para tratar **várias alterações como uma única unidade de trabalho**: ou todas são aplicadas, ou nenhuma é. É o que garante, por exemplo, que ao gravar dois produtos que precisam entrar juntos, um não fique salvo sem o outro. Por padrão o JDBC opera em *autocommit* (cada comando é confirmado sozinho); para controlar a transação na mão, desliga-se esse modo com `setAutoCommit(false)` e usam-se as duas operações clássicas:

- **`commit`** - **confirma** todas as alterações da transação de uma vez;
- **`rollback`** - **desfaz** tudo, voltando ao estado anterior, quando algo dá errado.

```java
try (Connection con = new ConnectionFactory().recuperarConexao()) {
    con.setAutoCommit(false);
    try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        adicionarVariavel("SmartTV", "45 polegadas", stm);
        adicionarVariavel("Radio", "Sem antena", stm);
        con.commit();
    } catch (Exception e) {
        e.printStackTrace();
        con.rollback();
        System.out.println("rollback executado");
    }
}
```

Se qualquer uma das inserções falhar, o `catch` chama o `rollback` e nenhuma das duas é gravada; só quando ambas dão certo o `commit` grava as duas juntas.

Repare no **`try (...)`** com a conexão declarada dentro dos parênteses: é o **try-with-resources**, uma cláusula do Java que **fecha os recursos automaticamente** ao final do bloco, mesmo que ocorra uma exceção. Ele funciona com qualquer objeto que implemente a interface **`AutoCloseable`**, e as peças do JDBC (`Connection`, `PreparedStatement`, `ResultSet`) implementam. Fechar esses recursos é obrigatório: uma conexão que fica aberta é um vazamento de recurso que, acumulado, esgota o banco. O try-with-resources garante esse fechamento sem precisar de um `finally` manual para cada recurso.

> **Feche sempre, e deixe o Java fechar por você.** Antes do try-with-resources, era comum esquecer um `close` ou fechá-lo no lugar errado. Declarar o recurso no `try (...)` resolve isso de uma vez: o Java chama o `close` na ordem inversa da abertura, aconteça o que acontecer dentro do bloco.

### Pool de conexões e o DataSource

Abrir uma conexão é uma operação **cara**: tem custo de rede, autenticação e alocação no banco. Fazer isso a cada operação desperdiça tempo e recursos. A boa prática é usar um **pool de conexões**: um componente que **mantém um conjunto de conexões já abertas** e as **empresta** para a aplicação, recolhendo-as de volta quando terminam. O pool **administra a quantidade** de conexões abertas, normalmente com um **mínimo** e um **máximo** definidos, o que também protege o banco de um número descontrolado de conexões simultâneas.

Assim como o JDBC tem uma interface para a conexão (`java.sql.Connection`), ele tem uma interface para o pool: a **`javax.sql.DataSource`**. E, do mesmo jeito que o driver do MySQL implementa `Connection`, existem implementações prontas de pool. O curso usou o **C3P0**, uma implementação Java de pool, cuja classe `ComboPooledDataSource` é configurada dentro da própria `ConnectionFactory`:

```java
public class ConnectionFactory {
    public DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?serverTimezone=UTC");
        pool.setUser("root");
        pool.setPassword("root");
        pool.setMaxPoolSize(15);
        this.dataSource = pool;
    }

    public Connection recuperarConexao() throws SQLException {
        return this.dataSource.getConnection();
    }
}
```

Como o `getConnection` continua devolvendo um `Connection`, **o resto do código não muda**: só a `ConnectionFactory` sabe que agora há um pool por trás. Detalhe importante: quando se chama `close()` numa conexão vinda do pool, ela **não é de fato fechada**, apenas **devolvida** ao pool para ser reaproveitada. Um teste ilustrou o limite configurado pedindo 20 conexões seguidas com um `setMaxPoolSize(15)`; a partir da décima sexta, o pool faz a aplicação esperar por uma conexão livre. O C3P0 exige dois JARs no classpath: o `c3p0` em si e o `mchange-commons-java`, do qual ele depende.

### Classes de domínio e o padrão DAO

Até aqui o SQL estava misturado com o teste. Para organizar, o curso adotou duas ideias que andam juntas. A primeira: para **cada tabela de domínio, uma classe de domínio**. A tabela `Produto` ganha a classe `Produto`, e **cada objeto dessa classe representa uma linha** da tabela:

```java
public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    // construtores, getters e setters...
}
```

A segunda é o padrão **DAO** (*Data Access Object*): para cada classe de domínio, existe um DAO que **concentra todo o acesso àquela tabela**. A classe `Produto` tem o seu `ProdutoDAO`; a `Categoria`, o `CategoriaDAO`. Todo o JDBC relacionado ao produto (inserir, listar, alterar, apagar) fica **encapsulado no `ProdutoDAO`**, que recebe a `Connection` no construtor:

```java
public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Produto produto) throws SQLException {
        try (PreparedStatement pstm = connection.prepareStatement(
                "INSERT INTO Produto (nome, descricao) VALUES (?, ?)",
                Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.execute();
            try (ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()) {
                    produto.setId(rst.getInt(1));
                }
            }
        }
    }

    public List<Produto> listar() throws SQLException { /* SELECT que devolve List<Produto> */ }
}
```

O ganho é a **separação de responsabilidades**: quem usa o `ProdutoDAO` pensa em objetos `Produto` (o "o quê"), sem lidar com SQL, `ResultSet` nem colunas (o "como"). O DAO vira a única porta de entrada para aquela tabela, e o SQL para de vazar pelo resto da aplicação.

### O problema das queries N + 1

Ao listar as categorias e, para cada uma, buscar os seus produtos, aparece uma armadilha de desempenho: executa-se **uma** query para trazer as categorias e, em seguida, **mais uma nova query para cada** categoria, para buscar seus produtos. É o problema das **queries N + 1**: 1 consulta inicial mais N consultas (uma por relacionamento). Com poucas categorias passa despercebido; com muitas, são centenas de idas ao banco e a performance despenca.

A saída é **evitar as N consultas com um `JOIN`**: uma única query traz categorias e produtos já cruzados, e o código monta os objetos em memória, agrupando os produtos sob a categoria certa:

```java
public List<Categoria> listarComProdutos() throws SQLException {
    Categoria ultima = null;
    List<Categoria> categorias = new ArrayList<>();

    String sql = "SELECT c.id, c.nome, p.id, p.nome, p.descricao FROM Categoria c "
               + "INNER JOIN Produto p ON c.id = p.categoria_id";
    try (PreparedStatement pstm = connection.prepareStatement(sql)) {
        pstm.execute();
        try (ResultSet rst = pstm.getResultSet()) {
            while (rst.next()) {
                if (ultima == null || !ultima.getNome().equals(rst.getString(2))) {
                    ultima = new Categoria(rst.getInt(1), rst.getString(2));
                    categorias.add(ultima);
                }
                Produto produto = new Produto(rst.getInt(3), rst.getString(4), rst.getString(5));
                ultima.adicionar(produto);
            }
        }
    }
    return categorias;
}
```

A variável `ultima` guarda a categoria da linha anterior: como o resultado vem ordenado pela categoria, só se cria uma nova `Categoria` quando o nome muda; os produtos seguintes são adicionados à mesma. Uma consulta só, os objetos montados na mão. É, no fundo, um primeiro passo na construção de uma **camada de persistência própria**, o mesmo tipo de trabalho que o Hibernate faz por baixo dos panos.

### Uma aplicação em camadas

O curso fechou amarrando tudo numa aplicação organizada em **camadas**, um jeito clássico de estruturar um sistema separando responsabilidades. As camadas clássicas são **view** (a interface), **controller** (a coordenação), **modelo** (as classes de domínio) e **persistência** (o acesso ao banco), e o fluxo entre elas segue uma ordem:

```text
view <--> controller <--> persistência
```

O foco deste curso foi a **camada de persistência** (a `ConnectionFactory` e os DAOs). Por cima dela, o segundo projeto (`loja-virtual-view-repository`) acrescentou uma **view** simples, uma tela feita com **Swing** (`JFrame` com formulário, tabela e botões de salvar, editar, limpar e apagar), e uma camada de **controller** que fica entre a tela e o DAO:

```java
public class ProdutoController {
    private ProdutoDAO produtoDAO;

    public ProdutoController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.produtoDAO = new ProdutoDAO(connection);
    }

    public List<Produto> listar() { return this.produtoDAO.listar(); }
    public void salvar(Produto produto) { this.produtoDAO.salvar(produto); }
    public void alterar(String nome, String descricao, Integer id) {
        this.produtoDAO.alterar(nome, descricao, id);
    }
    public void deletar(Integer id) { this.produtoDAO.deletar(id); }
}
```

A tela conversa só com o `ProdutoController`, e o controller conversa só com o `ProdutoDAO`, cada camada falando apenas com a vizinha. O princípio central é que **uma camada não deve deixar "vazar" detalhes da sua implementação** para as outras. Um exemplo concreto: a `SQLException` é uma exceção específica do JDBC; deixá-la subir até a view acoplaria a tela ao banco. Por isso, no projeto com tela, os DAOs **tratam a `SQLException` e a envolvem numa `RuntimeException`**, escondendo o detalhe de persistência de quem está acima:

```java
public List<Produto> listar() {
    try (PreparedStatement pstm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO")) {
        // ...
    } catch (SQLException e) {
        throw new RuntimeException(e);   // não vaza SQLException para o controller/view
    }
    return produtos;
}
```

Esse foi o encerramento da trilha de persistência: das trilhas anteriores, já se conhecia o SQL puro e o acesso ao banco por frameworks (JPA/Hibernate); aqui se viu **o que existe no meio do caminho**, o JDBC, sobre o qual esses frameworks são construídos.

Para fechar, um resumo das principais peças do JDBC vistas no curso:

| Recurso | Pacote | Papel |
|---|---|---|
| `DriverManager` | `java.sql` | abre conexões com `getConnection` |
| `Connection` | `java.sql` | representa a conexão; controla `commit`, `rollback` e `setAutoCommit` |
| `Statement` | `java.sql` | executa um comando SQL fixo |
| `PreparedStatement` | `java.sql` | executa SQL com parâmetros `?` tratados (evita SQL Injection) |
| `ResultSet` | `java.sql` | percorre, linha a linha, o resultado de uma consulta |
| `DataSource` | `javax.sql` | representa o pool de conexões (implementado pelo C3P0) |

---

## Curso: Engenharia de software na era da IA: como usar IA no fluxo real de desenvolvimento

Todos os cursos anteriores construíram uma aplicação em uma linguagem ou framework; este curso muda o objeto de estudo. Em vez de aprender uma tecnologia nova, o foco é o **fluxo de trabalho**: como usar um **agente de IA** no desenvolvimento real, com critério. A ferramenta usada foi o **Claude Code**, um agente que roda no terminal, e o projeto de apoio foi o **CodeConnect**, uma rede social para pessoas desenvolvedoras montada como um **monorepo** com front-end em React e back-end em NestJS. O que se aprende aqui não é uma ferramenta específica (ela muda em poucos meses), e sim os critérios para trabalhar com qualquer agente: escolher o modelo certo, dar o contexto certo, planejar antes de executar, integrar o agente a serviços externos e, acima de tudo, revisar o que ele produz. A ideia central que atravessa o curso é que a IA não substitui a pessoa desenvolvedora; ela muda o que essa pessoa faz.

### A IA mudou o que significa programar

A pergunta que abre o curso ("a IA vai substituir o programador?") tem uma resposta curta, não, e uma mais honesta: a pergunta está errada. A IA não substituiu ninguém; ela mudou o que significa programar. Quando a ferramenta gera o código, saber **ler**, **questionar** e **decidir se aquele código presta** passa a ser a habilidade principal. Quem não entende o que o agente gerou não consegue revisar, e quem não consegue revisar está confiando às cegas, o que não é produtividade.

Esse movimento não é novo, apenas mais rápido. A carreira de quem desenvolve sempre evoluiu de escrever muito código para revisar mais, pensar em arquitetura e em produto. A IA acelerou esse caminho para todo mundo: a pessoa iniciante precisa desenvolver **senso crítico** mais cedo, porque o agente entrega um código que compila e parece certo, mas que pode não estar.

Há uma distinção que orienta o uso saudável da ferramenta: usar a IA para **aprender** e usar a IA para **produzir**. Usar para aprender é pedir que ela explique um código desconhecido, apresente uma biblioteca nova ou esclareça um padrão. Usar para produzir é pedir que ela implemente uma funcionalidade, gere testes ou refatore. O problema aparece quando alguém usa a IA para produzir sem ter passado pela etapa de aprender, e acaba entregando algo que não compreende. A execução ficou barata, mas execução sem revisão não tem valor.

### O que a IA faz bem e o que faz mal hoje

Saber o que esperar do agente evita frustração e retrabalho. Hoje a IA se sai bem em tarefas onde o padrão é conhecido e o contexto cabe na conversa:

- **Boilerplate e scaffolding**: gerar a estrutura repetitiva de um projeto ou de um módulo.
- **Refatoração**: reorganizar um código existente mantendo o comportamento.
- **Testes**: escrever casos de teste a partir de um código pronto.
- **Explicar código**: descrever o que um trecho faz.
- **Documentação**: gerar textos a partir do código.

Um ponto importante sobre a documentação, e sobre qualquer pedido, é a necessidade de **direcionar** o que se quer. Uma documentação para uma pessoa técnica é diferente de uma para quem não é da área; um texto para outra equipe pede outro recorte; e é preciso dizer qual parte deve ser documentada. Quanto mais claro o direcionamento, melhor o resultado.

Do outro lado, a IA ainda tropeça em:

- **Bases de código grandes**, como um monolito ou um conjunto de vários microsserviços, onde o contexto não cabe de uma vez.
- **Consistência** ao longo de um trabalho extenso.
- **Casos de borda** (edge cases) que fogem do caminho comum.
- **Admitir que não sabe**: em vez de dizer "não sei", o modelo tende a responder com confiança mesmo quando erra.

Esse último ponto é o que mais exige atenção de quem revisa: uma resposta segura não é garantia de resposta correta.

### Tendências: o que ganha e o que perde fama

O curso situa o momento do mercado (início de 2026) listando o que está em alta e o que está em baixa, não como moda, mas para orientar onde investir tempo de estudo.

Ganhando espaço:

- **Context engineering**: cuidar de todo o contexto entregue ao agente, e não só do texto do prompt.
- **Spec-driven development**: escrever uma especificação antes de pedir a implementação.
- **Agentes no CI/CD**: o agente rodando de forma automática na esteira de integração.
- **Prompt como código**: tratar as instruções do agente como artefatos versionados do projeto.

Perdendo espaço:

- **Vibe coding puro**: enviar um prompt e aceitar o que sai, sem revisão.
- **Prompt engineering isolado**: a ideia de que só o texto do prompt determina a qualidade.
- **A tese de que "a IA vai substituir os devs"**.

E, na prática do dia a dia, algumas promessas ainda não se sustentam: **sistemas multiagentes** em produção (com questões legais e de confiabilidade), **a geração de aplicações completas do zero** e o **desenvolvimento autônomo sem supervisão**. Tudo isso pode mudar; o que não muda são o conhecimento, a experiência e o senso crítico de quem conduz.

### Os riscos de colocar a IA no fluxo

Trabalhar com um agente traz riscos que precisam ser conhecidos antes de dar acesso a ele:

- **Prompt injection**: instruções maliciosas escondidas em um conteúdo que o agente lê (uma página, um arquivo, um comentário) e que tentam fazer o agente agir contra o interesse de quem o usa.
- **Dados sensíveis**: chaves de API e tokens, dados de pessoas usuárias, variáveis de ambiente e dados de produção nunca devem vazar para o modelo nem para um repositório.
- **Wallet attack**: consumo descontrolado que gera custo, seja por um uso mal calibrado, seja por um ataque que force chamadas em excesso.
- **Overreliance**: a dependência excessiva, aceitar o resultado sem entender, que corrói o próprio senso crítico que deveria proteger o trabalho.

Esses riscos reaparecem ao longo do curso e são a razão de várias das boas práticas adotadas, como usar variáveis de ambiente para segredos e revisar todo código antes de integrá-lo.

### Escolhendo o modelo: os quatro critérios

Antes de escolher entre marcas, o curso ensina a olhar para quatro critérios que valem para qualquer modelo, hoje ou daqui a alguns meses:

- **Janela de contexto** (context window): quanto de informação o modelo consegue considerar de uma vez. Bases grandes pedem janelas maiores.
- **Custo por token**: cada modelo cobra por volume de entrada (input) e de saída (output). Tarefas de grande volume pesam no custo.
- **Latência**: quanto tempo o modelo leva para responder. Em tarefas rápidas e repetitivas, a latência importa mais que a profundidade.
- **Qualidade de output**: quão bom é o resultado para o tipo de tarefa em questão.

O princípio prático é **ajustar a escolha à complexidade da tarefa**: uma tarefa simples pede um modelo rápido e barato; uma decisão de arquitetura pede um modelo mais capaz, ainda que mais caro. Entender os critérios é o que permite avaliar qualquer modelo novo sem depender de propaganda.

### As famílias de modelos: Claude, GPT e Gemini

Três famílias disputam o mercado, cada uma com camadas de preço e capacidade. A escolha do modelo e a da ferramenta são independentes, e boa parte das ferramentas deixa trocar o modelo por baixo.

**Claude** (Anthropic), a família usada no curso, tem três camadas: o **Haiku** é o mais barato e serve para tarefas rápidas, como classificação e extração de dados; o **Sonnet** é o do dia a dia, tão próximo do topo em tarefas de código que, na maioria dos casos, a diferença não justifica pagar mais; e o **Opus** é o topo de linha, para quando é preciso raciocínio profundo, decisão de arquitetura, análise de base grande ou planejamento de uma funcionalidade complexa. A regra prática apresentada: Sonnet para a maior parte do trabalho, Opus quando o Sonnet se mostra insuficiente para a tarefa, e Haiku para tarefas de volume em que a latência pesa mais.

**GPT** (OpenAI) tem uma janela de contexto ampla, um destaque em *computer use* (o modelo operando a tela como uma pessoa faria) e um parâmetro que controla quanto o modelo raciocina, e gasta, por requisição. Em código puro, fica próximo do topo do Claude; a diferença está mais em como cada um lida com instruções complexas e contexto longo.

**Gemini** (Google) tem um modelo principal para desenvolvimento e um dos mais baratos do mercado, é nativo em multimodalidade (texto, imagem, áudio e vídeo) e integra bem com o ecossistema do Google.

Nenhum é "o melhor" em tudo: o Claude tende a ser consistente em seguir instruções complexas e trabalhar em bases grandes, o GPT é forte em raciocínio e tem o ecossistema mais amplo, e o Gemini é competitivo em preço. A escolha depende da tarefa, não da marca.

### As ferramentas: do editor ao terminal

Modelo e ferramenta são decisões independentes: o modelo é o motor, a ferramenta é o carro. As principais opções no momento do curso:

- **Claude Code** é a ferramenta usada no curso. Roda no **terminal**, sem interface gráfica: recebe um objetivo, lê a base de código, planeja, implementa, roda os testes e devolve o resultado. Depois de acostumar, a ausência de IDE vira vantagem, com contexto limpo e integração direta com o git e o terminal. Suporta MCP, hooks, skills e subagents.
- **Cursor** é um editor (um fork do VS Code) com uma camada de IA por cima: autocomplete preditivo, um agente que edita vários arquivos e um modo de planejamento. Deixa escolher o modelo por baixo.
- **Antigravity** é a IDE do Google, com a filosofia de agentes autônomos trabalhando em paralelo enquanto a pessoa orquestra. É promissora, mas ainda instável para o dia a dia de produção.
- **Lovable** é um gerador de aplicações a partir de uma descrição: serve bem para prototipar uma ideia ou montar um MVP, e tem dificuldade com código de produção mais complexo. Sincroniza com o GitHub, o que permite gerar ali e continuar em outra ferramenta.

Nenhuma dessas é definitiva; o mapa muda a cada poucos meses. Por isso o curso foca em critérios, e não em catálogo: quem entende os critérios avalia qualquer ferramenta nova que aparecer.

### Context engineering: o contexto vale mais que o prompt

Quando se usa a IA de verdade no fluxo de trabalho, o trabalho deixa de ser escrever um prompt bonito. Passa a ser cuidar de **todo o contexto** que o agente recebe: as instruções do projeto, as convenções da equipe, as ferramentas a que ele tem acesso e o histórico da conversa. A ideia central do **context engineering** é que a qualidade do resultado depende menos do prompt e mais de tudo o que está ao redor dele.

Na prática, é isso que separa o uso amador do profissional. Um prompt vago gera um resultado vago; um contexto bem montado gera um resultado que encaixa no projeto. As seções seguintes são, em boa parte, formas concretas de fazer context engineering: o arquivo de regras do projeto, o planejamento antes da execução e a conexão do agente a serviços externos.

### Preparando o ambiente e criando o monorepo

O primeiro passo prático foi instalar as ferramentas de linha de comando. Com o **nvm** (gerenciador de versões do Node), instala-se o Node; com o npm, instalam-se o **pnpm** (o gerenciador de pacotes usado no projeto) e o próprio **Claude Code**:

```bash
nvm install 22
npm install -g pnpm
npm install -g @anthropic-ai/claude-code
```

Com o Claude Code instalado, ele é iniciado digitando `claude` no terminal, dentro da pasta do projeto. O modelo de trabalho é escolhido com o comando `/model` (por exemplo, `/model opusplan`, que usa o Opus para planejar e um modelo mais leve para executar).

A estrutura escolhida para o projeto CodeConnect foi um **monorepo**: um único repositório com mais de uma aplicação dentro. Usando **pnpm workspaces**, ele reúne dois apps, um front-end em **React com Vite** e um back-end em **NestJS**, ambos em TypeScript, cada um gerado com o `npx` a partir do zero. Na raiz, o `package.json` recebe atalhos para rodar comandos em cada app sem precisar trocar de pasta:

```bash
pnpm web:dev    # sobe o front-end
pnpm api:dev    # sobe o back-end
```

O git foi inicializado uma vez na raiz, com um `.gitignore` em cada app e o cuidado de garantir que nenhum app tivesse um repositório git próprio dentro dele. Todo esse trabalho pode ser pedido ao agente em linguagem natural, descrevendo a estrutura desejada; o papel de quem conduz é revisar o que foi gerado.

### O CLAUDE.md e as guidelines do projeto

O comando **`/init`** do Claude Code lê a base de código e gera um arquivo **`CLAUDE.md`** na raiz. Esse arquivo é onde ficam o **contexto e as regras globais do projeto**: o agente o lê a cada sessão, então tudo que estiver ali passa a orientar o que ele gera. É a peça central do context engineering dentro do projeto.

Depois de gerado, o `CLAUDE.md` foi incrementado com as convenções da equipe. No front-end: usar **Atomic Design** (organizar os componentes em atoms, molecules, organisms, templates e pages), **Tailwind** para estilo e a regra de que todo componente precisa de um teste cobrindo o seu uso essencial. No back-end: seguir os princípios **REST** (recursos como substantivos, verbos HTTP corretos, códigos de status semânticos, nomes de coleção no plural). E, para os dois, o padrão de **Conventional Commits** nas mensagens de commit.

Mais adiante, duas guidelines foram acrescentadas ao arquivo para manter a consistência visual:

- **Tamanhos de fonte**: usar sempre o token de tamanho do Tailwind mais próximo ao valor do design, em vez de valores arbitrários como `text-[31px]`.
- **Cores**: em vez de hexadecimais soltos nas classes, estender o tema do Tailwind e configurar a paleta do projeto em tokens nomeados (por exemplo, `bg-grafite`, `text-offwhite`, `bg-verde-destaque`).

Registrar essas regras no `CLAUDE.md` evita repeti-las em cada pedido: o agente passa a segui-las por padrão.

### Planejar antes de executar: modos e modelos

Um hábito que atravessou todo o curso foi **separar o planejamento da execução**, aproveitando os pontos fortes de cada modelo. O fluxo é:

1. Colocar o agente em **modo de planejamento** com um modelo mais capaz (o Opus), descrever a tarefa com todos os detalhes (imagens de referência, pontos de atenção, oportunidades de reuso) e pedir que ele **salve o plano** em um arquivo, por exemplo em uma pasta `/plans`, sem implementar nada ainda.
2. Revisar o plano com calma.
3. Trocar para um modelo de execução (o Sonnet, mais barato) e pedir que ele **execute o plano** salvo.

Esse padrão traz dois ganhos. O primeiro é de **custo e desempenho**: o modelo caro é usado só onde ele faz diferença, o raciocínio, e o barato faz o trabalho repetitivo da implementação. O segundo é de **qualidade**: revisar um plano em texto é muito mais fácil do que revisar um conjunto de arquivos já alterados, e um plano ruim é corrigido antes de virar código.

### MCP: o protocolo que conecta o agente a serviços

Um agente fica muito mais útil quando consegue conversar com serviços externos, como o GitHub, o Figma ou um banco de dados. O problema é que, antes, cada ferramenta de IA precisava de uma integração feita sob medida para cada serviço. Com muitos modelos e muitos serviços, o número de integrações a construir e manter explode.

O **MCP** (Model Context Protocol) resolve isso do mesmo jeito que o padrão USB-C resolveu a confusão de cabos: em vez de um conector diferente para cada fabricante, um único padrão serve para todos. Cada serviço implementa o protocolo uma vez, e qualquer modelo que fale MCP consegue usá-lo. O MCP foi lançado como padrão aberto pela Anthropic em novembro de 2024, foi adotado pelos demais e, em dezembro de 2025, foi doado para a Linux Foundation, o que o torna infraestrutura aberta da indústria.

Vale entender as peças envolvidas em uma chamada. Quando se pede "faça o code review deste PR", acontece uma cadeia:

- O **host** (o Claude Code) recebe o pedido e o envia ao modelo junto com a lista de ferramentas disponíveis.
- O **modelo** decide qual ferramenta usar (por exemplo, "ler o diff deste PR"), mas não chama o serviço diretamente: ele pede ao host.
- O host encaminha o pedido a um **client**, que está ligado ao **server** MCP do serviço.
- O **server** chama a API do serviço, pega o resultado e o devolve pelo mesmo caminho de volta.

O detalhe importante é que o modelo **nunca fala direto com o serviço**: há sempre o host e o client no meio, e é ali que ficam as permissões e os controles de segurança.

Um server MCP pode expor três tipos de coisa:

- **Tools** (ferramentas): ações, como listar PRs ou fazer merge. Podem ter efeito colateral, por isso o host costuma pedir confirmação antes de executar.
- **Resources** (recursos): dados para leitura, como o esquema de um banco ou um arquivo de configuração. O modelo lê, não altera.
- **Prompts**: modelos de interação prontos que o server sugere, como um roteiro de code review.

### O MCP do GitHub na prática

O primeiro MCP configurado no curso foi o do **GitHub**, que dá ao agente acesso a repositórios, PRs e issues. São necessários o Claude Code instalado e um **token de acesso pessoal** (PAT, personal access token) do GitHub.

O token é gerado nas configurações do GitHub, com um nome, um prazo de expiração e as permissões desejadas. Em um ambiente de estudo é aceitável liberar acesso amplo; em um projeto real, o correto é conceder **apenas as permissões necessárias**. O token aparece **uma única vez**, então precisa ser guardado com cuidado em uma **variável de ambiente**, nunca colado direto no código versionado.

> **Atenção com segredos.** Um token dá acesso à conta e é um dado sensível, exatamente o tipo de coisa que o curso alerta para não vazar. Ele deve ficar em uma variável de ambiente ou em um arquivo `.env` incluído no `.gitignore`, e nunca ser escrito em arquivos que vão para o repositório. Nos exemplos abaixo, o valor real do token está substituído por um espaço reservado.

O server é registrado no Claude Code com um comando que informa o tipo de conexão, a URL do server e o cabeçalho de autorização com o token:

```bash
claude mcp add-json github '{"type":"http","url":"https://api.githubcopilot.com/mcp","headers":{"Authorization":"Bearer <SEU_GITHUB_PAT>"}}'
```

Depois, dá para conferir se a conexão está de pé e ver os detalhes do server:

```bash
claude mcp list
claude mcp get github
```

Com o MCP conectado, o fluxo de trabalho no terminal passou a incluir pedidos como "liste os PRs em aberto deste repositório" e "faça o code review e, estando tudo certo, faça o merge", tudo sem abrir o navegador. Vale reforçar que o merge é uma ação com efeito, então a revisão do que o agente propõe continua sendo responsabilidade de quem conduz.

### O MCP do Figma: do design ao código

O segundo MCP foi o do **Figma**, usado para transformar um design em código. Ele é mais trabalhoso de configurar que o do GitHub, e a razão está no tipo de problema que resolve. O GitHub expõe uma API REST aberta e simples; um arquivo do Figma, ao contrário, é uma estrutura proprietária com layers, componentes, variáveis, auto layout e estilos. Para gerar código fiel, o agente não precisa da imagem, e sim desses **dados estruturados**: qual componente é qual, quais tokens de cor e espaçamento ele usa e como está a hierarquia.

Há dois caminhos para acessar esses dados: um **server local**, que roda dentro do Figma Desktop com o Dev Mode ativo, e um **server remoto**, hospedado pelo próprio Figma. Os dois exigem autenticação e um plano com o acesso adequado. A configuração no Claude Code, no caso do server remoto, segue o mesmo formato dos demais MCPs:

```bash
claude mcp add --transport http figma https://mcp.figma.com/mcp
```

Um ponto de atenção prático é o **consumo de cota**: cada ferramenta do Figma MCP que lê dados conta contra um limite, que varia conforme o plano. Pedir muitos frames em sequência pode esgotar a cota rápido.

A lição mais importante desta parte é que **a qualidade do código gerado depende de como o Figma está organizado**. Um arquivo bem estruturado (com componentes bem definidos, variáveis de cor e tipografia, layers nomeados de forma clara e auto layout configurado) entrega dados que o agente interpreta bem, e o resultado chega perto do design. Um arquivo desorganizado entrega dados desorganizados, e o agente faz o que pode com o que recebe. Por isso, a abordagem que funciona é ir **do menor para o maior**: gerar primeiro os componentes atômicos (botão, input, badge), validar cada um e depois compor os maiores a partir deles. E, mesmo com tudo bem organizado, o resultado raramente sai perfeito de primeira: ajustes finos, comparando o implementado com o layout, continuam necessários.

### Spec-driven development: a especificação como contrato

O que mais influenciou a qualidade dos resultados no curso não foi o texto do prompt, e sim o quanto se deixava claro **o que se queria antes de pedir**: critérios de aceite, contrato da API, regras de negócio e a stack. Esse hábito tem um nome que vem ganhando espaço no mercado: **spec-driven development** (desenvolvimento guiado por especificação).

A ideia é escrever, antes de qualquer pedido, uma **especificação**, um documento curto que descreve o que será construído, por quê, quais são as restrições e como saber que está pronto. O agente implementa a partir desse documento, não de um prompt solto. É a diferença entre dois fluxos: sem spec (prompt direto, aceitar, descobrir o problema depois) e com spec (definir a intenção, desenhar a solução, implementar contra a spec, validar).

Existe até ferramenta para estruturar esse fluxo, como o **Spec Kit**, do GitHub, que separa o trabalho em fases (o que e por que, depois como, depois a quebra em tarefas e só então a implementação) e traz o conceito de um arquivo de regras inegociáveis do projeto, a mesma ideia do `CLAUDE.md`. O curso não adota uma ferramenta formal de spec, mas o que se faz ao planejar antes de pedir, definir critérios de aceite e revisar antes de aceitar já é spec-driven na essência.

### Do front ao back: acessibilidade, API e persistência

A parte final do projeto integrou front-end e back-end, e cada etapa reforçou o mesmo método de planejar, pedir, revisar e ajustar.

**Acessibilidade.** Antes de avançar, o projeto precisou garantir o segundo nível do **WCAG** (o padrão de acessibilidade da web). O caminho foi começar pelos **testes automatizados** para levantar os problemas (com ferramentas como o Lighthouse), analisar o relatório, planejar as correções e então executá-las. Ajustes típicos foram o idioma da página, a semântica do HTML e os atributos WAI-ARIA.

**Os endpoints.** O back-end em NestJS recebeu três endpoints: um para **cadastrar** uma pessoa usuária (nome, e-mail e senha), um para **efetuar login** com **JWT** (JSON Web Token) e um para **obter os dados da pessoa logada**, protegido por um **auth guard** seguindo o padrão da documentação do NestJS. A documentação da API foi gerada com o **Swagger** (entradas e saídas de cada rota). No começo, os dados ficaram apenas em memória, em um array, para só depois migrarem para um banco.

**Testes da API.** Os endpoints e a autenticação foram validados com uma ferramenta de cliente HTTP (o **Bruno**), que permite disparar requisições e conferir as respostas sem depender do front-end.

**Persistência.** O array em memória foi substituído por um banco **PostgreSQL**. A escolha do ORM foi pedida ao agente com uma exigência importante: **justificar a escolha e apontar as alternativas consideradas**. O ORM adotado foi o **TypeORM**. Para o banco, foi criado um **Docker Compose** na raiz do projeto, já montando um **volume** para manter os dados persistidos entre as execuções.

**Integração.** No front-end, a comunicação com a API passou a usar o **axios** (cliente HTTP para JavaScript), consumindo os endpoints de autenticação documentados no Swagger.

**O feed.** A última funcionalidade foi a página de **feed de posts**: modelos e migrations no back-end, um **seed** gerando posts fictícios, um **placeholder** para quando um post não tem imagem, o reuso dos componentes já criados no front-end e uma regra de negócio clara (quem não está logado pode ver o feed, mas não comentar nem curtir; quem está logado pode criar, comentar e curtir). O filtro do feed foi implementado como uma **busca full-text** no lado do back-end.

Um recurso de apoio que apareceu aqui foi o **Git worktree**, que permite ter várias branches em pastas separadas ao mesmo tempo, útil para rodar sessões paralelas do agente sem que uma atrapalhe a outra.

### O "slop dev" e a dívida técnica na velocidade da IA

O curso dá nome ao mau uso da ferramenta: o **slop dev**, aquele que escreve prompts vagos, não revisa nada e deixa passar até um segredo em um PR. O ponto é que a IA não cria um problema novo; ela **acelera** um problema antigo. Código ruim, sem revisão, sem teste e sem pensar em manutenção, existe desde antes da IA. A diferença é a velocidade: a dívida técnica que antes se acumulava no ritmo humano agora se acumula no ritmo da máquina.

O mercado sente esse efeito. Pesquisas recentes com pessoas desenvolvedoras mostram um padrão curioso: o uso de ferramentas de IA cresceu, mas a confiança na precisão do resultado caiu, e a maior frustração é lidar com código gerado que está "quase certo, mas não exatamente", que acaba tomando mais tempo para depurar do que se tivesse sido escrito à mão. A maioria também diz que o vibe coding não faz parte do trabalho profissional e que o motivo mais comum para ainda recorrer a uma pessoa é justamente **não confiar na resposta da IA**.

A conclusão prática é direta: a **responsabilidade é de quem faz o commit**. A IA não responde quando o sistema cai de madrugada; quem assina o commit responde. Usar IA para desenvolver mais rápido é inteligente; usar IA para desenvolver sem pensar é acumular dívida técnica com juros. As ferramentas mudam, os princípios não.

### O agente fora do terminal: CI/CD, Slack e agendamento

O último passo foi tirar o agente do uso manual no terminal e colocá-lo para trabalhar de forma **automática**. O exemplo central foi configurar o Claude Code como uma **GitHub Action** que faz **code review automático** sempre que alguém abre um PR para a branch principal. Para isso é preciso instalar o app do Claude Code no GitHub, configurar uma chave de API da Anthropic com créditos (é ela que paga a execução) e adicionar o arquivo YAML da action ao repositório, com o prompt que orienta a revisão. Um detalhe que evita falhas: o arquivo da action na branch de trabalho precisa estar igual ao da branch principal.

A partir daí, o mesmo padrão se estende para além do CI/CD:

- **Slack como gatilho**: marcar o agente em uma thread onde um bug foi reportado; ele lê o contexto da conversa, investiga a base de código, implementa a correção e abre um PR, enviando atualizações na própria thread.
- **Tarefas agendadas**: o agente roda tarefas recorrentes na infraestrutura da Anthropic, mesmo com a máquina desligada, como revisar os PRs abertos toda manhã, auditar dependências toda semana ou gerar um changelog a cada merge.
- **Remote control**: acompanhar e controlar as sessões do agente de qualquer lugar, inclusive pelo celular.

O que muda com isso não é a habilidade essencial (montar o contexto, revisar, saber quando confiar e quando desconfiar), e sim a **escala**: o agente passa a trabalhar em paralelo, de forma assíncrona, enquanto a pessoa foca no que exige julgamento humano.

### O dev à prova de futuro: os 3 Os

O curso encerra com um enquadramento sobre a carreira, apoiado no material "Dev à prova de futuro". A mudança trazida pela IA não elimina a pessoa desenvolvedora; ela desloca onde essa pessoa gasta o tempo, de escrever código para garantir que o código (venha de onde vier) funciona, é seguro e é sustentável.

Um resumo útil desse novo papel são os **3 Os**:

- **Operar**: usar as ferramentas de IA com fluência no trabalho.
- **Orquestrar**: coordenar agentes e sistemas, dividindo e conduzindo o trabalho em vez de digitar cada linha.
- **Observar**: revisar, validar e responsabilizar-se pelo resultado, mantendo o senso crítico.

É por isso que o curso não gira em torno de uma ferramenta específica, que pode mudar em seis meses, e sim do repertório para trabalhar com qualquer agente, em qualquer cenário, com critério para não aceitar um resultado ruim como se fosse bom. As ferramentas mudam; o conhecimento, a experiência e o senso crítico permanecem.

---

## Artigo: O que é metodologia ágil?

O último item da trilha não é um curso, e sim um artigo que fecha o programa com um tema que atravessa todas as tecnologias vistas até aqui: a forma de organizar o trabalho. Metodologia ágil é o nome dado a um conjunto de abordagens de gestão de projetos que trocam o plano rígido e fechado por ciclos curtos de entrega e ajuste contínuo. Em vez de definir tudo no início e seguir o roteiro até o fim, a equipe entrega partes funcionais com frequência, ouve quem vai usar o resultado e corrige o rumo a cada ciclo. O artigo apresenta a origem dessa ideia, os principais frameworks que a colocam em prática e os critérios para decidir quando ela faz sentido.

### O que é metodologia ágil

Uma metodologia ágil prioriza a **flexibilidade** e a **adaptação** em vez de planos fixos. A premissa é simples: em projetos com incerteza, tentar prever tudo no começo custa caro e erra muito, então é melhor entregar em pequenas partes, verificar o que funcionou e ajustar. O artigo organiza essa forma de trabalhar em quatro pilares:

- **Iteratividade**: o desenvolvimento acontece em ciclos curtos, cada um entregando uma parte funcional do produto em vez de esperar o projeto inteiro ficar pronto.
- **Colaboração**: a comunicação entre a equipe e as pessoas interessadas (stakeholders) é constante, e o conhecimento circula entre áreas diferentes.
- **Autonomia e empoderamento**: as equipes se auto-organizam e têm espaço para tomar decisões, em vez de depender de ordens vindas de cima.
- **Entrega de valor**: o foco é gerar benefício real e contínuo para quem recebe o resultado, não apenas cumprir etapas.

### O Manifesto Ágil e seus valores

A referência que deu nome ao movimento é o **Manifesto Ágil**, escrito em 2001 por dezessete profissionais de desenvolvimento de software que buscavam uma alternativa aos processos pesados da época. O manifesto se apoia em quatro valores, e cada um coloca uma coisa **acima** de outra sem descartar a segunda:

1. **Indivíduos e interações** acima de processos e ferramentas.
2. **Software funcionando** acima de documentação abrangente.
3. **Colaboração com o cliente** acima de negociação de contratos.
4. **Resposta a mudanças** acima de seguir um plano.

O ponto que costuma passar despercebido é que os itens da direita continuam tendo valor; o manifesto apenas diz que, quando houver conflito, os da esquerda pesam mais. Além dos valores, o documento traz **doze princípios** que os detalham, como satisfazer o cliente com entregas contínuas, aceitar mudanças de requisito mesmo em fases avançadas e manter um ritmo de trabalho sustentável.

### Os principais frameworks e metodologias

"Ágil" é a filosofia; os frameworks são as formas concretas de aplicá-la. O artigo apresenta os mais usados:

- **Scrum**: framework iterativo apoiado em três pilares (transparência, inspeção e adaptação). O trabalho acontece em **sprints**, ciclos de duas a quatro semanas, com artefatos como o Product Backlog e papéis bem definidos.
- **Kanban**: foca em **visualizar o trabalho** e limitar quantas tarefas ficam em andamento ao mesmo tempo. Usa um quadro com cartões que avançam pelas etapas do fluxo.
- **Extreme Programming (XP)**: criado por Kent Beck, valoriza práticas de engenharia como programação em par (pair programming), desenvolvimento orientado a testes (TDD) e integração contínua.
- **Lean**: nascido do sistema de produção da Toyota, busca eliminar desperdícios e cultivar a melhoria contínua.
- **Crystal**: uma família de metodologias que se ajustam ao tamanho e ao contexto de cada projeto e equipe.
- **SAFe (Scaled Agile Framework)**: pensado para aplicar o ágil em larga escala, reunindo Lean, Scrum e Kanban em grandes organizações.
- **LeSS (Large-Scale Scrum)**: adapta o Scrum para várias equipes trabalhando juntas, mantendo seus valores essenciais.

### Ágil ou cascata: duas formas de conduzir um projeto

A abordagem tradicional é a **cascata** (waterfall): o projeto avança por fases sequenciais (planejamento, análise, design, desenvolvimento, testes e implementação), e cada fase só começa quando a anterior termina. Funciona bem quando o problema é conhecido e os requisitos não mudam, mas cobra caro quando algo precisa ser revisto, já que voltar atrás significa refazer etapas inteiras. A metodologia ágil faz o contrário: trabalha em ciclos que permitem revisar e ajustar o tempo todo, entregando valor aos poucos em vez de tudo no fim. Uma não é melhor que a outra em abstrato; cada uma serve a um tipo de projeto.

### Quando faz sentido ser ágil: o modelo Cynefin

Nem todo projeto pede uma abordagem ágil. O artigo usa o modelo **Cynefin** para ajudar nessa escolha, separando os problemas pela sua natureza. Em domínios **complexos**, onde há incerteza, muitos fatores que se influenciam e nenhuma solução pronta, o ágil se destaca, porque experimentar e ajustar é o caminho mais seguro. Já em problemas **simples** ou **complicados**, com solução conhecida e previsível, abordagens estruturadas como a cascata podem ser mais adequadas. O recado é evitar tratar o ágil como resposta única: a primeira pergunta é qual o tipo de problema em mãos.

### Papéis e prática: quem faz o quê e o que se ganha

No vocabulário do Scrum, três papéis se destacam:

- **Product Owner**: define as prioridades e representa as necessidades do cliente.
- **Scrum Master**: facilita o processo e remove os obstáculos que travam a equipe.
- **Equipe de desenvolvimento**: auto-organizada, é quem executa o trabalho.

Para funcionar na prática, o artigo resume seis atitudes que sustentam o dia a dia ágil: adaptar-se continuamente, buscar feedback constante das pessoas interessadas, manter o progresso transparente, entregar valor tangível, experimentar para aprender e colaborar com engajamento. Quando isso acontece, os ganhos aparecem em pontos concretos: cliente mais satisfeito, prioridades mais bem geridas, mais visibilidade sobre o andamento do projeto, equipe mais produtiva e motivada e capacidade de responder rápido a mudanças de requisito. O sucesso depende menos de seguir um ritual à risca e mais de comunicação fluida, conhecimento compartilhado do trabalho de cada pessoa e alinhamento frequente com quem recebe o resultado.
