/*function alterarStatusBotao(){
    let btnReiniciar = document.getElementById('btn-reiniciar');
    if(btnReiniciar.classList.contains('container__botao-desabilitado')){
        btnReiniciar.classList.remove('container__botao-desabilitado');
        btnReiniciar.classList.add('container__botao');
    } else {
        btnReiniciar.classList.remove('container__botao');
        btnReiniciar.classList.add('container__botao-desabilitado');
    }
}*/

function limparCampo(id) {
    let campo = document.getElementById(id);
    campo.value = '';
}

function obterNumeroAleatorio(min, max){
    //return parseInt(Math.random() * (max-min) + min);
    return Math.floor(Math.random() * (max-min+1)) + min;
}

function sortear(){
    let quantidade = parseInt(document.getElementById('quantidade').value);
    let de = parseInt(document.getElementById('de').value);
    let ate = parseInt(document.getElementById('ate').value);

    if (quantidade > (ate - de + 1)) {
        alert('Campo "Quantidade" deve ser menor ou igual ao intervalo informado no campo "Do número" até o campo "Até o número". Verifique!');
    }else if (de >= ate) {
        alert('Campo "Do número" deve ser inferior ao campo "Até o número". Verifique!');
    } else {
        let sorteados = [];
        let numero;
        
        for (let i = 0; i < quantidade; i++) {
            do{
                numero = obterNumeroAleatorio(de,ate);; 
            }while(sorteados.includes(numero));
            sorteados.push(numero);
        }

        document.getElementById('resultado').innerHTML = '<label class="texto__paragrafo">Números sorteados: ' + sorteados;
        //.textContent <- texto simples

        let btnReiniciar = document.getElementById('btn-reiniciar');
        btnReiniciar.classList.remove('container__botao-desabilitado');
        btnReiniciar.classList.add('container__botao');
    }
}

function reiniciar(){
    limparCampo('quantidade');
    limparCampo('de');
    limparCampo('ate');
    document.getElementById('resultado').innerHTML = '<label class="texto__paragrafo">Números sorteados:  nenhum até agora</label>';
    let btnReiniciar = document.getElementById('btn-reiniciar');
    btnReiniciar.classList.remove('container__botao');
    btnReiniciar.classList.add('container__botao-desabilitado');
}