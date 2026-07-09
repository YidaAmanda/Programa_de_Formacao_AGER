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
- [Projetos práticos](#projetos-práticos)
- [Tecnologias](#tecnologias)
- [Como executar os projetos](#como-executar-os-projetos)

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
| 3 | Iniciante em programação | Trilha Alura | Em andamento (4/5) |

### Sub-trilha: Iniciante em programação (4/5)

| # | Módulo / Curso | Status |
|---|----------------|:------:|
| 1 | Primeiros passos em Programação | Concluído |
| 2 | Entendendo a lógica de programação (2 cursos) | Concluído |
| 3 | Ferramentas essenciais para programar e compartilhar projetos | Concluído |
| 4 | _(em breve)_ | ✎ A fazer |

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

Trilha Alura aninhada dentro do Passo a passo. Está em andamento (**4/5**). Abaixo, o que aprendi nos módulos já concluídos.

#### Módulo 1 - Primeiros passos em Programação

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

---

## Projetos práticos

| Projeto | Descrição | O que usei |
|---------|-----------|------------|
| [`logica-js-projeto_inicial`](./logica-js-projeto_inicial) | Jogo do Número Secreto (versão console, com `alert`/`prompt`) | variáveis, `while`, `if/else`, ternário |
| [`js-curso-2-aula1`](./js-curso-2-aula1) | Jogo do Número Secreto (versão web, integrada à página) | funções, arrays, DOM, Web Speech API |

---

## Tecnologias

![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)

---

##  Como executar os projetos

1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/formacao-ager.git
   ```
2. Entre na pasta do projeto que quer testar (ex.: `js-curso-2-aula1`).
3. Abra o arquivo `index.html` no navegador (duplo clique já funciona).
