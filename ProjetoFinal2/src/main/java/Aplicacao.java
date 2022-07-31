public class Aplicacao {
    public static void main(String[] args) {

    Cliente cli1 = new ClientePF("Lucio Costa", "46578741125");
    Cliente cli2 = new ClientePJ("Drogasil", "13245613245654");
    Cliente cli3 = new ClientePF("Oscar Niemeyer", "48569735846");
    Cliente cli4 = new ClientePJ("Oficina", "48945613245654");

    Veiculo veiculoFord = new Pequeno("Ka");
    Veiculo veiculoHonda = new Medio("City");
    Veiculo veiculoToyota = new Suv("Rav4");

    Aluguel aluguel1 = new Aluguel(veiculoFord, cli1, 10);
    Aluguel aluguel2 = new Aluguel(veiculoHonda, cli2, 4);
    Aluguel aluguel3 = new Aluguel(veiculoToyota,cli3,4);
    Aluguel aluguel4 = new Aluguel(veiculoToyota,cli4,2);

    System.out.println(aluguel1);
    System.out.println();
    System.out.println(aluguel2);
    System.out.println();
    System.out.println(aluguel3);
    System.out.println();
    System.out.println(aluguel4);
    System.out.println();


    }
}
