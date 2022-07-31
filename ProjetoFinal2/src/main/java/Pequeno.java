import java.math.BigDecimal;

public class Pequeno extends Veiculo {
    public Pequeno(String nomeCarro) {
        super(nomeCarro);
    }

    public Pequeno() {
    }

    @Override
    public BigDecimal valorDiaria() {
        return new BigDecimal(100.0);
    }
}
