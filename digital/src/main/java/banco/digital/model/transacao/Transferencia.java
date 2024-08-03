package banco.digital.model.transacao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Transferencia {
    private final String transferencia;
    private LocalDate data = LocalDate.now();
    private String transferecia;
    private double valor;

    public Transferencia(String transferencia, double valor) {
        //this.data = data;
        this.transferencia = transferencia;
        this.valor = valor;
    }
}
