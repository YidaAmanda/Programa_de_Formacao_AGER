let total;
let carrinho = document.getElementById('lista-produtos');
let valorTotal = document.getElementById('valor-total');

limpar();

function adicionar(){
    let produto = document.getElementById('produto').value;
    let nomeProduto = produto.split('-')[0];
    let valorUnitario = parseInt(produto.split('R$')[1]); //ou parseFloat se tiver números decimais
    let quantidade = document.getElementById('quantidade').value;
    
    if (!produto || produto.trim() == "") {
        alert("Selecione um produto válido.");
    }else if(quantidade > 0){
        let subTotal = valorUnitario * quantidade;
        carrinho.innerHTML += '<section class="carrinho__produtos__produto"><span class="texto-azul">'+quantidade+'x</span> '+nomeProduto+' <span class="texto-azul">R$'+subTotal+'</span></section>';

        total += subTotal;
        valorTotal.textContent = 'R$'+total;

        document.getElementById('quantidade').value = 0;
    } else {
        alert('Digite uma quantidade válida!')
    }
}

function limpar(){
    total = 0;
    carrinho.innerHTML = '';
    document.getElementById('valor-total').textContent = 'R$'+total;
}