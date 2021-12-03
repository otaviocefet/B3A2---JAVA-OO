import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Estacionamento dadosEstacionamento = new Estacionamento();
        int horasEntrada;
        int horasSaida;
        String modeloDoCarro;
        String placaDoCarro;

        System.out.println("Informe o modelo do carro: ");
        modeloDoCarro = sc.nextLine();
        System.out.println("Informe a placa do carro: ");
        placaDoCarro = sc.nextLine(); 
        System.out.println("Informe a hora de entrada: ");
        horasEntrada = sc.nextInt();
        System.out.println("Informe a hora de saída: ");
        horasSaida = sc.nextInt();

        dadosEstacionamento.setEntrada(horasEntrada);
        dadosEstacionamento.setSaida(horasSaida);
        dadosEstacionamento.setPlaca(placaDoCarro);
        dadosEstacionamento.setModelo(modeloDoCarro);
        dadosEstacionamento.imprimirDados();
        System.out.println("O valor a ser pago pelo estacionamento: "+ dadosEstacionamento.CalcularValor());
        sc.close();
    }
}
