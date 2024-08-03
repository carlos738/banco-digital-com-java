package banco.digital.transacao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Transferencia {
    private LocalDate data = LocalDate.now();
    private String transferecia;
    private double valor;

    public Transferencia(LocalDate data, String transferecia, double valor) {
        this.data = data;
        this.transferecia = transferecia;
        this.valor = valor;
    }
}
