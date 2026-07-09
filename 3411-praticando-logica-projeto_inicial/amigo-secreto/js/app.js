let amigos = [];
let sorteio = document.getElementById('lista-sorteio');
let lista = document.getElementById('lista-amigos');

function excluirAmigo(index) {
    amigos.splice(index, 1);
    atualizarLista();
    atualizarSorteio();
}

function atualizarSorteio() {
    sorteio.innerHTML = '';
}


function atualizarLista() {
    lista.innerHTML = '';

    for (let i = 0; i < amigos.length; i++) {
        let paragrafo = document.createElement('p');
        paragrafo.textContent = amigos[i];

        paragrafo.addEventListener('click', function() {
            excluirAmigo(i);
        });

        lista.appendChild(paragrafo);
    }
}

function adicionar(){
    let amigo = document.getElementById('nome-amigo').value;
    // amigo = amigo.toLowerCase();

    if (amigo.trim() == ''){
        alert('Digite o nome para adicionar');
    } else if (amigos.includes(amigo)) {
        alert('Nome já adicionado!');
        document.getElementById('nome-amigo').value = '';
    } else {
        amigos.push(amigo);
        /*if (lista.textContent == '') {
            lista.textContent = amigo;
        } else {
            lista.textContent += ', ' + amigo;
        }
        //document.getElementById('lista-amigos').textContent = amigos;*/
        document.getElementById('nome-amigo').value = '';
        atualizarLista();
        atualizarSorteio();
    }
}

function sortear(){
    sorteio.textContent = '';
    if(amigos.length < 4){
        alert('Adicione pelo menos 4 pessoas!');
    } else {
        for (let i=(amigos.length-1); i>0; i--) {
            const j = Math.floor(Math.random() * (i + 1));
            [amigos[i], amigos[j]] = [amigos[j], amigos[i]];
        }

        for (i=0; i<(amigos.length); i++){
            if(i == amigos.length-1){
                sorteio.innerHTML += amigos[i]+' -> '+amigos[0]+'<br>';
            } else {
                sorteio.innerHTML += amigos[i]+' -> '+amigos[i+1]+'<br>';
            }
        }
    }
}

function reiniciar(){
    amigos = [];
    document.getElementById('lista-amigos').textContent = '';
    document.getElementById('nome-amigo').value = '';
    document.getElementById('lista-sorteio').textContent = ''; 
}