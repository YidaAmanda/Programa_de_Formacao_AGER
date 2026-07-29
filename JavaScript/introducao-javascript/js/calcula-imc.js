var pacientes = document.querySelectorAll('.paciente');

for(var i = 0; i < pacientes.length; i++){
    var paciente = pacientes[i];
    var peso = paciente.querySelector('.info-peso').textContent;
    var altura = paciente.querySelector('.info-altura').textContent;
    var imc = paciente.querySelector('.info-imc');

    if(!validaPeso){
        imc.textContent = 'Peso inválido!';
        valido = false;
        paciente.classList.add('paciente-invalido');
    }

    if(!validaAltura){
        imc.textContent = 'Altura inválida!';
        valido = false;
        paciente.classList.add('paciente-invalido');
    }

    if(validaPeso && validaAltura){
        imc.textContent = calculaImc(peso, altura);
    }
}

function calculaImc(peso, altura){
    return (peso / (altura * altura)).toFixed(2);
}

function validaPeso(peso){
    if(peso <= 0 || peso >= 1000){
        return false;
    }

    return true;
}

function validaAltura(altura){
    if(altura <= 0 || altura >= 3.0){
        return false
    }
    
    return true;
}
