function comprarPista(qtd){
    let qtdPista = parseInt(document.getElementById('qtd-pista').textContent);
    if(qtd < 1){
        alert('Insira uma quantidade válida!');
    } else if(qtd > qtdPista) {
        alert(qtdPista+' ingressos disponiveis');
    } else {
        qtdPista -= qtd;
        document.getElementById('qtd-pista').textContent = qtdPista;
        alert('Compra realizada com sucesso!');
    }
}

function comprarInferior(qtd){
    let qtdInferior = parseInt(document.getElementById('qtd-inferior').textContent);
    if(qtd < 1){
        alert('Insira uma quantidade válida!');
    } else if(qtd > qtdInferior) {
        alert(qtdInferior+' ingressos disponiveis');
    } else {
        qtdInferior -= qtd;
        document.getElementById('qtd-inferior').textContent = qtdInferior;
        alert('Compra realizada com sucesso!');
    }
}

function comprarSuperior(qtd){
    let qtdSuperior = parseInt(document.getElementById('qtd-superior').textContent);
    if(qtd < 1){
        alert('Insira uma quantidade válida!');
    } else if(qtd > qtdSuperior) {
        alert(qtdSuperior+' ingressos disponiveis');
    } else {
        qtdSuperior -= qtd;
        document.getElementById('qtd-superior').textContent = qtdSuperior;
        alert('Compra realizada com sucesso!');
    }
}

function comprar(){
    let tipoIngresso = document.getElementById('tipo-ingresso').value;
    let qtd = document.getElementById('qtd').value;
    
    switch (tipoIngresso) {
        case 'pista':
            comprarPista(qtd);
            break;
        case 'inferior':
            comprarInferior(qtd);
            break;
        case 'superior':
            comprarSuperior(qtd);
            break;
        default:
            alert('Selecione uma opção de ingresso válida!');
    }
}