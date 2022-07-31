public abstract class Veiculo implements Alugavel{

    private String nomeCarro;

    public Veiculo(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public Veiculo() {
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
}
