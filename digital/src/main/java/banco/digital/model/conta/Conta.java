package banco.digital.model.conta;

import banco.digital.model.cliente.Cliente;

public interface Conta {
    Cliente getCliente();
    int getNumero();
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor,Conta contaDeDestino);
    void mostrarExtrato();

}
