public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasNoElevador;


    public void Inicializa(int capacidadeElevador, int totalAndares){
        setCapacidade(capacidadeElevador);
        setTotalAndares(totalAndares);
        setAndarAtual(0);
        setTotalAndares(0);
    }


    public void Entra(){
        if (getPessoasNoElevador() < getCapacidade()){
            setPessoasNoElevador(getPessoasNoElevador()+1);
        }
    }

    public void Sai(){
        if (getPessoasNoElevador() > 0){
            setPessoasNoElevador(getPessoasNoElevador()-1);
    
        }
    }

    public void Sobe(){
        if (getAndarAtual() < getTotalAndares()){
            setAndarAtual(getAndarAtual()+1);
        }
    }

    public void Desce(){
        if (getAndarAtual() > 0){
            setAndarAtual(getAndarAtual()-1);
        }
    }


    public void setPessoasNoElevador(int qtdPessoas){
        pessoasNoElevador = qtdPessoas;
    }
    public int getPessoasNoElevador(){
        return pessoasNoElevador;
    }


    public void setCapacidade(int capacidade){
        capacidadeElevador = capacidade;
    }
    public int getCapacidade(){
        return pessoasNoElevador;
    }



    public void setTotalAndares(int qtdAndares){
        totalAndares = qtdAndares;
    }
    public int getTotalAndares(){
        return totalAndares;
    }



    public void setAndarAtual(int andarNow){
        andarAtual = andarNow;
    }
    public int getAndarAtual(){
        return andarAtual;
    }
    
}
