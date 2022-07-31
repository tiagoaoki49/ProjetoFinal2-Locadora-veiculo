import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aluguel {
    private Veiculo veiculo;
    private Cliente cliente;
    private int diasDeAluguel;

    public Aluguel(Veiculo veiculo, Cliente cliente, int diasDeAluguel) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.diasDeAluguel = diasDeAluguel;
    }

    public Aluguel() {
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDiasDeAluguel() {
        return diasDeAluguel;
    }

    public void setDiasDeAluguel(int diasDeAluguel) {
        this.diasDeAluguel = diasDeAluguel;
    }

    public BigDecimal calculaAluguel(){
        BigDecimal valorAluguel = new BigDecimal(diasDeAluguel);

        if(veiculo instanceof Pequeno){
            valorAluguel = valorAluguel.multiply(veiculo.valorDiaria());
            //System.out.println(valorAluguel);
        }
        if(veiculo instanceof Medio){
            valorAluguel = valorAluguel.multiply(veiculo.valorDiaria());
            //System.out.println(valorAluguel);
        }
        if(veiculo instanceof Suv){
            valorAluguel = valorAluguel.multiply(veiculo.valorDiaria());
            //System.out.println(valorAluguel);
        }else{
            //System.out.println("Valores inválidos");
        }


        return verificaSeHaDesconto(valorAluguel);

    }

    public BigDecimal verificaSeHaDesconto(BigDecimal valorAluguel){
        //BigDecimal valorAluguelFinal = new BigDecimal(valorAluguel);
        //desconto de 5% para Cliente PF com 5 diárias ou mais
        if(cliente instanceof ClientePF && diasDeAluguel>4){
            System.out.println("Foi descontado do valor total: " + valorAluguel.multiply(cliente.valorDesconto()).setScale(2, RoundingMode.HALF_DOWN));
            valorAluguel = valorAluguel.multiply(new BigDecimal(0.95));
            return valorAluguel.setScale(2, RoundingMode.HALF_DOWN);
        }
        // desconto de 10% para Cliente PJ com 3 diárias ou mais
        if(cliente instanceof ClientePJ && diasDeAluguel>2){
            System.out.println("Foi descontado do valor total: " + valorAluguel.multiply(cliente.valorDesconto()).setScale(2, RoundingMode.HALF_DOWN));
            valorAluguel = valorAluguel.multiply(new BigDecimal(0.9));
            return valorAluguel.setScale(2, RoundingMode.HALF_DOWN);
        }
        return valorAluguel;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "Veiculo: " + veiculo.getNomeCarro() +
                ", cliente: " + cliente.getNome() +
                ", número de diárias: " + diasDeAluguel +
                ", valor total: " + calculaAluguel() +
                '}';
    }
}
