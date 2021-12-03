import java.util.Scanner;

public class PessoaCalcular {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa dadosPessoa = new Pessoa();
        
        String nomeDaPessoa;
        int nascimentoDaPessoa;
        float alturaDaPessoa;

        System.out.println("Informe o nome: ");
        nomeDaPessoa = sc.next();
        dadosPessoa.setNome(nomeDaPessoa);
        
        System.out.println("Informe o ano de nascimento: ");
        nascimentoDaPessoa= sc.nextInt();
        dadosPessoa.setNascimento(nascimentoDaPessoa);

        System.out.println("Informe a altura: ");
        alturaDaPessoa = sc.nextFloat();
        dadosPessoa.setAltura(alturaDaPessoa);


        dadosPessoa.imprimirDados();
        dadosPessoa.calcularIdade();
        sc.close();
        
        
    }
}

