# 🚀 Programa de Formação AGER

Minha jornada no **Programa de Formação AGER**.

---

## Índice

- [Sobre o programa](#sobre-o-programa)
- [Progresso da trilha](#progresso-da-trilha)
- [O que aprendi?](#o-que-aprendi)
  - [1. Artigo: Como escolher minha carreira em TI?](#1-artigo-como-escolher-minha-carreira-em-ti)
  - [2. Artigo: 5 passos para aprender a programar](#2-artigo-5-passos-para-aprender-a-programar)
  - [3. Trilha: Iniciante em programação](#3-trilha-iniciante-em-programação)
    - [Módulo 1 - Primeiros passos em programação](#módulo-1---primeiros-passos-em-programação)
    - [Módulo 2 - Entendendo a lógica de programação](#módulo-2---entendendo-a-lógica-de-programação)
    - [Módulo 3 - Ferramentas essenciais para programar e compartilhar projetos](#módulo-3---ferramentas-essenciais-para-programar-e-compartilhar-projetos)
    - [Módulo 4 - Praticando lógica de programação com desafios](#módulo-4---praticando-lógica-de-programação-com-desafios)
  - [4. Trilha: Aprenda a programar em Java com orientação a objetos](#4-trilha-aprenda-a-programar-em-java-com-orientação-a-objetos)
- [Projetos práticos](#projetos-práticos)
- [Tecnologias](#tecnologias)
- [Como executar os projetos web](#como-executar-os-projetos-web)

---

## Sobre o programa

O **Programa de Formação AGER** é o programa de formação em tecnologia da AGE Technology, empresa da Baixada Santista que desenvolve o SOC, software líder no segmento de Saúde e Segurança no Trabalho. A proposta é impulsionar quem está começando na área: são 8 semanas com uma trilha de estudos online, mentorias com profissionais da AGE e desafios práticos.

---

## Progresso da trilha

### Passo a passo — Conteúdo da Trilha

| # | Conteúdo | Tipo | Status |
|---|----------|:------:|:------:|
| 1 | Como escolher minha carreira em TI? | Artigo | Concluído |
| 2 | 5 passos para aprender a programar | Artigo | Concluído |
| 3 | Iniciante em programação | Trilha Alura | Concluído |
| 4 | Aprenda a programar em Java com orientação a objetos | Trilha Alura | ✎ A fazer |

### Sub-trilha: Iniciante em programação (5/5)

| # | Módulo / Curso | Status |
|---|----------------|:------:|
| 1 | Primeiros passos em programação | Concluído |
| 2 | Entendendo a lógica de programação (2 cursos) | Concluído |
| 3 | Ferramentas essenciais para programar e compartilhar projetos | Concluído |
| 4 | Praticando lógica de programação com desafios | Concluído |

### Sub-trilha: Aprenda a programar em Java com Orientação a Objetos

| # | Módulo / Curso | Status |
|---|----------------|:------:|
| 1 | Entender a linguagem Java | ✎ A fazer |
| 2 | Orientação a objetos | ✎ A fazer |
| 3 | Manipule listas, consuma uma API e lide com exceções (2 cursos) | ✎ A fazer |

---

## O que aprendi?

### 1. Artigo: Como escolher minha carreira em TI?

- Panorama das áreas de atuação em Tecnologia da Informação.
- Pontos a considerar antes de decidir a carreira.

---

### 2. Artigo: 5 passos para aprender a programar

- Um roteiro prático de como começar a aprender programação.
- A importância da constância e da prática para evoluir.
- Mentalidade para encarar os desafios de quem está começando.

---

### 3. Trilha: Iniciante em programação

Trilha Alura aninhada dentro do Passo a passo. Abaixo, o que aprendi nos módulos.

#### Módulo 1 - Primeiros passos em programação

**Curso:** Começando em Programação: carreira e primeiros passos

- O que é programação e como ela está presente no dia a dia.
- Principais áreas de atuação na área de tecnologia.
- Como funciona o mercado de trabalho e por onde começar.
- Dicas essenciais para iniciar a trajetória como pessoa desenvolvedora.

#### Módulo 2 - Entendendo a lógica de programação

**Cursos:** Lógica de programação: mergulhe em programação com JavaScript · Lógica de programação: explore funções e listas

Aqui coloquei a mão na massa construindo o **Jogo do Número Secreto**, em duas versões (do console ao navegador).

**Conceitos praticados:**

- **Variáveis** (`let`) e tipos de dados (números, strings).
- **Entrada e saída** com `alert()` e `prompt()`.
- **Estruturas condicionais**: `if`, `else if`, `else` e operador **ternário** (`condição ? a : b`).
- **Operadores** de comparação (`>`, `<`, `==`, `!=`) e lógicos (`||`, `&&`).
- **Laços de repetição** com `while` (contagem regressiva, progressiva e o loop do jogo).
- **Números aleatórios** com `Math.random()` e `parseInt()`.
- **Funções**: criar, reaproveitar código e organizar o programa em blocos.
- **Listas (arrays)**: `push()`, `includes()`, `length` - evitando sortear números repetidos.
- **Manipulação do DOM**: `document.querySelector()`, `innerHTML`, atributos (`disabled`).
- **Web Speech API**: fazer o navegador "falar" o texto na tela.

#### Módulo 3 - Ferramentas essenciais para programar e compartilhar projetos

**Curso:** Git e GitHub: compartilhando e colaborando em projetos

Aqui o foco foi versionamento de código e colaboração, do setup inicial até desfazer alterações e compartilhar snippets.

**Configuração e primeiros passos**

- Criar conta no GitHub e instalar o Git na máquina.
- Configurar a identidade com `git config --global user.name` e `git config --global user.email`.
- Criar um repositório local com `git init` e um repositório remoto no GitHub.
- Conectar os dois com `git remote add origin <url>` e enviar o primeiro commit com `git push`.
- Clonar um repositório já existente com `git clone`.

**Fluxo de trabalho do dia a dia**

- Registrar alterações com `git add` (stage) e `git commit` (confirmação).
- Verificar o estado da árvore de trabalho com `git status`.
- Inspecionar o histórico com `git log` - autor, data e mensagem de cada commit.
  - Variações úteis: `git log --oneline`, `git log --graph`, `git log -p`.
- Listar e inspecionar os remotos com `git remote` (`git remote -v`).
- Sincronizar com `git push` (envia commits locais) e `git pull` (traz commits do remoto).

**Colaboração**

- Adicionar uma pessoa como colaboradora em um repositório e aceitar um convite recebido.
- Creditar co-autoria em um commit com o trailer `Co-authored-by:`

```
  $ git commit -m "texto"
  >
  >
  Co-authored-by: Nome <email@exemplo.com>
```

  O GitHub reconhece o e-mail e exibe os dois avatares no commit.

**Desfazendo alterações**

| Comando | O que faz | Reescreve histórico? |
|---------|-----------|:--------------------:|
| `git commit --amend` | Corrige o **último** commit (mensagem ou conteúdo) | Sim |
| `git revert <hash>` | Cria um **novo** commit que desfaz o commit apontado | Não |
| `git reset --soft <hash>` | Move o HEAD; mantém alterações no *stage* | Sim |
| `git reset --mixed <hash>` | Move o HEAD; mantém alterações no diretório de trabalho (padrão) | Sim |
| `git reset --hard <hash>` | Move o HEAD e **descarta** todas as alterações | Sim |

- `revert` é a opção segura em branches compartilhadas, porque não reescreve o histórico.
- `reset --hard` é destrutivo: o que não estava commitado é perdido.
- `commit --amend` e `reset` em commits já publicados exigem `push --force`, o que pode quebrar o trabalho de outras pessoas.

**Documentação e arquivos ignorados**

- Criar o `README.md`, que serve como documentação e cartão de visitas do repositório.
- Usar o arquivo oculto `.gitignore` para dizer ao Git quais arquivos e diretórios não devem ser rastreados (dependências, builds, `.env`, arquivos de IDE).
- Detalhe importante: o `.gitignore` só afeta arquivos **não rastreados**. Se o arquivo já foi commitado antes, é preciso removê-lo do índice com `git rm --cached <arquivo>`.

**Compartilhando trechos de código**

- Usar o **Gist** do GitHub para compartilhar snippets isolados, sem precisar criar um repositório inteiro. Podem ser públicos ou secretos e também têm histórico de versões.

#### Módulo 4 - Praticando lógica de programação com desafios

**Curso:** Lógica de programação: praticando com desafios

Aqui a proposta foi treinar lógica construindo **5 pequenas aplicações web** do zero, cada uma reforçando um conjunto de conceitos. Em todas o ponto de partida foi o mesmo: **analisar o HTML da página** para entender a estrutura antes de escrever o JavaScript da funcionalidade.

**AluGames** - alugar e devolver jogos de tabuleiro

- Recuperar elementos com `document.querySelector()` e `document.getElementById()`.
- Verificar e alternar o **status de um jogo** (alugado/disponível) com `if/else` e a `classList` (`contains`, `remove`, `add`).
- Trocar o texto do botão com a propriedade `textContent`.

**Carrinho de compras** - somar produtos e o valor total

- Ler o produto selecionado, separar nome e preço da string e calcular o subtotal.
- Validar a quantidade com condicionais e ir montando a lista na página com `innerHTML`.

**Sorteador de números** - sortear N números únicos dentro de um intervalo

- Recuperar elementos com `document.getElementById()` e ler campos de formulário com a propriedade `value`.
- Converter texto em número inteiro com `parseInt()`.
- Gerar números aleatórios dentro de um intervalo com `Math.random()`.
- **Laço `for`** para sortear a quantidade pedida e **`array`** com `push()` para guardar os números já sorteados (evitando repetidos com `includes()`).
- Manipular o botão *Reiniciar* com `if/else` e a `classList`: `contains()`, `remove()` e `add()` para trocar as classes CSS.
- Alterar o conteúdo da página com `innerHTML` (e a diferença para `textContent`).
- **Template String** para concatenar variáveis dentro de uma string.

**e-Ticket** - comprar ingressos de diferentes setores

- Escrever cada funcionalidade em **funções separadas** (uma por tipo de ingresso).
- Usar um bloco condicional (`switch`) para **decidir qual função chamar** de acordo com o valor selecionado.
- Converter valores com `parseInt()` e atualizar a quantidade disponível na tela.

**Amigo Secreto** - montar a lista e sortear os pares

- **Validar** as informações com condicionais (nome vazio, nome repetido, mínimo de participantes).
- **Interromper** a execução de uma função com `return`.
- Contar itens de um `array` com `length` e checar se um item existe com `includes()`.

---

### 4. Trilha: Aprenda a programar em Java com orientação a objetos

Trilha Alura aninhada dentro do Passo a passo. Abaixo, o que aprendi nos módulos. _em breve_

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

---

## Tecnologias

![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)

---

##  Como executar os projetos web

1. Clone este repositório:
   ```bash
   git clone https://github.com/YidaAmanda/Programa_de_Formacao_AGER.git
   ```
2. Entre na pasta do projeto que quer testar (ex.: `js-curso-2-aula1`).
3. Abra o arquivo `index.html` no navegador (duplo clique já funciona).
