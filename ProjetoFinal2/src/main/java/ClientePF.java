import java.math.BigDecimal;

public class ClientePF extends Cliente{

    public ClientePF() {
    }

    public ClientePF(String nome, String cpf) {
        super(nome, cpf);
    }


    @Override
    public BigDecimal valorDesconto() {
        return new BigDecimal(0.05);
    }
}
