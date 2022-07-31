import java.math.BigDecimal;

public class Suv extends Veiculo {
    public Suv(String nomeCarro) {
        super(nomeCarro);
    }

    public Suv() {
    }

    @Override
    public BigDecimal valorDiaria() {
        return new BigDecimal(200.0);
    }
}
