package banco.digital.model.conta.Impl;

import banco.digital.model.cliente.Cliente;
import banco.digital.model.conta.Conta;
import banco.digital.model.transacao.Transferencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ContaImpl implements Conta {
    private final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL =1;
    private List<Transferencia> historico = new ArrayList<>();


    protected Cliente cliente;
    protected int agencia;
    protected double saldo;
    protected int numero;

    public ContaImpl(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
    }

    @Override
    public Cliente getCliente() {
        return null;
    }

    @Override
    public int getNumero() {
        return 0;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
            adicionarValorTransferenciaAoHistorico("SAQUE", valor);
        }else {
            System.out.println("SEM SALDO SUFICIENTE PARA O SAQUE. ");
        }

    }

    private void adicionarValorTransferenciaAoHistorico(String saque, double valor) {
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        adcionarValorTransferenciaAoHistorico("DEPOSITO",valor);

    }

    @Override
    public void transferir(double valor, Conta contaDeDestino) {

        if (saldo >= valor){
            this.sacar(valor);
            adcionarValorTransferenciaAoHistorico("TRANSFERENCIA",valor);
        }else {
            System.out.println("SALDO INSUFICIENTE PARA REALIZAR A TRANSFERÊNCIA. ");
        }
    }
    public void  adcionarValorTransferenciaAoHistorico(String transferencia,double valor){
        Transferencia novaTransferencia = new Transferencia(transferencia,valor);
        historico.add(novaTransferencia);
    }

    @Override
    public void mostrarExtrato() {
        System.out.println(LocalDate.now() + "AG: " + agencia + "Nº CONTA:" + numero);

        System.out.println(cliente.getNome().toUpperCase());
        System.out.println("DATA   HISTORICO      VALOR");

        for (Transferencia transferencia : historico){
            System.out.println(transferencia.getData() + "" + transferencia.getTransferencia()+"R$" + transferencia.getValor());


            System.out.println("==============================================================================");
            System.out.println("SALDO:                 R$" + saldo);
        }

    }


    public abstract void exibirExtrato();

    //public abstract void exibirExtrato();
}


