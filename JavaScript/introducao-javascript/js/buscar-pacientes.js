var botaoAdicionar = document.querySelector('#buscar-pacientes');
botaoAdicionar.addEventListener('click', function(){
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://raw.githubusercontent.com/loresgarcia/Pacientes-API/master/pacientes.json');
    xhr.addEventListener('load', function(){
        if(xhr.status == 200){
            document.querySelector('#erro-ajax').classList.add('invisivel');
           var pacientes = JSON.parse(xhr.responseText)
            pacientes.forEach(paciente => {
                adicionaPacienteNaTabela(paciente);
            }); 
        } else {
            console.log(xhr.setRequestHeader);
            console.log(xhr.responseText);
            document.querySelector('#erro-ajax').classList.remove('invisivel');
        }
    });
    xhr.send();
});