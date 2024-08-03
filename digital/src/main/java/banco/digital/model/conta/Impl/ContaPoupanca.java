package banco.digital.model.conta.Impl;

import banco.digital.model.cliente.Cliente;

public class ContaPoupanca extends ContaImpl{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    @Override
    public void mostrarExtrato(){
        System.out.println("EXIBIR EXTRATO DA CONTA POUPANÇA. ");
        super.mostrarExtrato();
        //super.exibirExtrato();
    }

    @Override
    public void exibirExtrato() {
        System.out.println("EXIBIR EXTRATO DA CONTA POUPANÇA. ");
        super.mostrarExtrato();
    }
}
