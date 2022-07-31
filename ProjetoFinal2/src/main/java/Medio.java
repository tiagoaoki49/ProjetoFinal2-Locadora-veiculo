import java.math.BigDecimal;

public class Medio extends Veiculo{

    public Medio(String nomeCarro) {
        super(nomeCarro);
    }

    public Medio() {
    }

    @Override
    public BigDecimal valorDiaria() {
        return new BigDecimal(150.0);
    }
}
