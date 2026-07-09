let gamesAlugamos = 1;

function  contarEExibirJogosAlugados(){
    console.log('Total de jogos alugados: '+gamesAlugamos);
}

/*
document.addEventListener('DOMContentLoaded', function() {
    jogosAlugados = document.querySelectorAll('.dashboard__item__img--rented').length;
    contarEExibirJogosAlugados();
});
*/

function alterarStatus(id){
    let game = document.getElementById('game-'+id);
    let img = game.querySelector('.dashboard__item__img');
    let btn = game.querySelector('.dashboard__item__button');
    let nm = game.querySelector('.dashboard__item__name');
    if(btn.classList.contains('dashboard__item__button--return')){
        if (confirm('Você tem certeza que deseja devolver o jogo '+nm.textContent+'?')) {
            img.classList.remove('dashboard__item__img--rented');
            btn.classList.remove('dashboard__item__button--return');
            btn.textContent = 'Alugar';
            gamesAlugamos--;
        }
    } else {
        img.classList.add('dashboard__item__img--rented');
        btn.classList.add('dashboard__item__button--return');
        btn.textContent = 'Devolver';
        gamesAlugamos++;
    }

    contarEExibirJogosAlugados();
}