import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Elevador dadosElevador = new Elevador();
        int capacidadeDoElevador;
        int totalDeAndares;
        int decisao = 1;
 

        System.out.println("Informe a capacidade total do elevador: ");
        capacidadeDoElevador = sc.nextInt();
        System.out.println("Informe o total de andares: ");
        totalDeAndares = sc.nextInt();

        dadosElevador.Inicializa(capacidadeDoElevador, totalDeAndares);

        




       
        while (decisao <=4 && decisao>0){
            System.out.println("Escolha uma opção:\n1- Entrar mais uma pessoa no elevador.\n2- Sair uma pessoa do Elevador.\n3- Subir um andar.\n4- Descer um andar.\n5- Sair.");
            decisao = sc.nextInt();
            switch(decisao){
                case 1:
                    dadosElevador.Entra();
                case 2:
                    dadosElevador.Sai();
                case 3:
                    dadosElevador.Sobe();
                case 4:
                    dadosElevador.Desce();
            }

            
        } 

        
        
        sc.close();

    }
}
