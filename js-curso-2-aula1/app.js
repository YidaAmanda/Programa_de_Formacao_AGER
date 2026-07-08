let numeroMaximo = 10;
let listaDeNumerosSorteados = [];
let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 0;

function exibirTextoNaTela(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    //responsiveVoice.speak(texto, 'Brazilian Portuguese Female', {rate:2});
     if ('speechSynthesis' in window) {
        let utterance = new SpeechSynthesisUtterance(texto);
        utterance.lang = 'pt-BR'; 
        utterance.rate = 2; 
        window.speechSynthesis.speak(utterance); 
    } else {
        console.log("Web Speech API não suportada neste navegador.");
    }
}

function exibirMensagemInicial(){
    exibirTextoNaTela('h1', 'Jogo do Número Secreto');
    exibirTextoNaTela('p', 'Escolha um número entre 1 e '+numeroMaximo+':');
}

function gerarNumeroAleatorio() {
    let numeroEscolhido = parseInt(Math.random()*numeroMaximo+1);
    let quantidadeDeElementosNaLista = listaDeNumerosSorteados.length;

    if(quantidadeDeElementosNaLista == numeroMaximo){
        listaDeNumerosSorteados=[];
    }

    if(listaDeNumerosSorteados.includes(numeroEscolhido)){
        return gerarNumeroAleatorio();
    } else {
        listaDeNumerosSorteados.push(numeroEscolhido);
        return numeroEscolhido;
    }
}

function limparCampo() {
    chute = document.querySelector('input');
    chute.value = '';
}

exibirMensagemInicial();

function verificarChute(){
    let chute = document.querySelector('input').value;
    tentativas++;

    if(chute == numeroSecreto){
        let palavraTentativa = tentativas == 1 ? ' tentativa!' : ' tentativas!';
        exibirTextoNaTela('p', 'Você descobriu o número secreto em '+tentativas+palavraTentativa);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else {
        if (chute > numeroSecreto){
            exibirTextoNaTela('p', 'O número secreto é menor que '+chute);
        }else{
            exibirTextoNaTela('p', 'O número secreto é maior que '+chute);
        }

        limparCampo();
    }
}

function reiniciarJogo(){
    exibirMensagemInicial();
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 0;
    document.getElementById('reiniciar').setAttribute('disabled', true);
}