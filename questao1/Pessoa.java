public class Pessoa {
    private String nome;
    private int nascimento;
    private float altura;


    public void setNome(String nomePessoa){
        nome = nomePessoa;
    }

    public String getNome(){
        return nome;
    }


    public void setNascimento(int nascimentoPessoa){
        nascimento = nascimentoPessoa;
    }

    public int getNascimento(){
        return nascimento;
    }



    public void setAltura(float alturaPessoa){
        altura = alturaPessoa;
    }

    public float getAltura(){
        return altura;
    }

    public void imprimirDados(){
        System.out.println("\n\nNome: " + getNome() + "\nAltura: " + getAltura() + "\nData de Nascimento: " + getNascimento());
    }


    public void calcularIdade(){
        System.out.println("Idade: " + (2021-getNascimento()) );
    }

}
