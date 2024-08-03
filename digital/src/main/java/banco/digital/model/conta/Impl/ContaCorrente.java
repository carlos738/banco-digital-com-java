package banco.digital.model.conta.Impl;

import banco.digital.model.cliente.Cliente;

public class ContaCorrente extends ContaImpl{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

   @Override
    public void exibirExtrato(){
       System.out.println("EXTRATO DA CONTA CORRENTE");
       super.mostrarExtrato();
   }
}
