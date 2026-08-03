import { calculaNovoSaldo } from './index';

//TDD
describe('Quando realiza uma transacao', () => {
  it('Que é um depósito, o saldo deve aumentar', () => {
    const transacao = {
      transacao: 'Depósito',
      valor: 50,
    };
    const novoSalto = calculaNovoSaldo(transacao, 100);
    expect(novoSalto).toBe(150);
  });

  test('Que é uma transferência, o saldo deve diminuir', () => {
    const transacao = {
      transacao: 'Transferência',
      valor: 50,
    };
    const novoSalto = calculaNovoSaldo(transacao, 100);
    expect(novoSalto).toBe(50);
  });
});

test('Deve retornar o valor do saldo atualizado com o rendimento', () => {
  const calculaRendimento = jest.fn((saldo) => saldo + saldo * 0.005);
  const saldo = 100;
  const novoSalto = calculaRendimento(saldo);
  expect(novoSalto).toBe(100.5);
  expect(calculaRendimento).toBeCalled();
  expect(calculaRendimento).toHaveBeenCalledWith(saldo);
});

/*test('Deve retornar o quadrado de um número', () => {
  const calculaOQuadrado = jest.fn();
  calculaOQuadrado.mockImplementation((num) => num ** 2);
  expect(calculaOQuadrado(2)).toBe(4);
  expect(calculaOQuadrado(4)).toBe(16);
});*/
