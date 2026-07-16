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

**Curso:** Java: trabalhando com lambdas, streams e Spring Framework

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

- **`@JsonAlias`** - aceita nomes **alternativos** na hora de **ler** o JSON (pode listar vários);
- **`@JsonProperty`** - define o nome do campo **tanto na leitura quanto na escrita** do JSON;
- **`@JsonIgnoreProperties(ignoreUnknown = true)`** - instrui o Jackson a **ignorar os campos do JSON que não foram mapeados**. Sem ela, qualquer campo desconhecido derruba a conversão com exceção, e APIs costumam devolver dezenas de campos que não nos interessam.

```java
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title, title") String titulo,
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

**Um único método, zero redundância** - e se alguém tentar atribuir o resultado ao tipo errado, o erro aparece em compilação, não em produção.

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

Repare no `filter` presente nos dois exemplos: elementos sem avaliação real (convertidos para `0.0` no tratamento de exceção) **distorceriam a média** se entrassem no cálculo. A lição vale para qualquer análise: **defina o que é dado válido e filtre antes de calcular**;  estatística sobre dado sujo produz conclusão errada com cara de certa.
