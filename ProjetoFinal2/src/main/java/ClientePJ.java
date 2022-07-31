import java.math.BigDecimal;

public class ClientePJ extends Cliente{

    public ClientePJ() {
    }

    public ClientePJ(String nome, String cnpj) {
        super(nome, cnpj);
    }

    @Override
    public BigDecimal valorDesconto() {
        return new BigDecimal(0.1);
    }
}
