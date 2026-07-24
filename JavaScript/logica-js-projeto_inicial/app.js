let mensagemInicial = 'Boas vindas ao jogo do número secreto!';
alert(mensagemInicial);

let numeroMaximo = 100;
let numeroSecreto = parseInt(Math.random()*numeroMaximo+1);
//console.log(numeroSecreto)
let chute;
let tentativas = 0;

while (chute != numeroSecreto){
    chute = prompt('Escolha um número entre 1 e ' + numeroMaximo);
    if (chute > numeroSecreto){
        alert('O número secreto é menor que ' + chute);
    } else if (chute < numeroSecreto) {
        alert('O número secreto é maior que ' + chute);
    }
    tentativas ++;
    //console.log(tentativas);
}
let palavraTentativa = tentativas > 1 ? ' tentativas' : ' tentativa';
alert('Você acertou com ' + tentativas + palavraTentativa);

/*//anotação
let idade;
alert(`Você tem ${idade >= 18 ? "maioridade" : "menoridade"}`);
*/

/*//Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".
let diaSemana = prompt('Digite o dia da semana:');
if (diaSemana == 'Sábado' || diaSemana == 'Domingo'){
    alert('Bom final de semana');
} else {
    alert('Boa semana');
}*/

/*//Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.
let numero = prompt('Digite um número:');
if (numero > 0){
    alert('O número é positivo');
} else if (numero < 0) {
    alert('O número é negativo');
} else {
    alert('O número é nulo');
}*/

/*//Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador.
let numero = prompt('digite um número:');
while(numero >= 0){
    alert(numero);
    numero--;
}*/

/*//Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador.
let numero = prompt('digite um número:');
let contador = 0;
while(contador <= numero){
    alert(contador);
    contador++;
}*/
