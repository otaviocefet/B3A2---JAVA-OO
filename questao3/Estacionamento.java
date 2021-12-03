public class Estacionamento {
    private String modelo;
    private String placa;
    private int entrada;
    private int saida;


    public void Inicializar(){
        setEntrada(0);
        setModelo("");
        setPlaca("");
        setSaida(0);

    }

    public void imprimirDados(){
        System.out.println("\n\nModelo: " + getModelo() + "\nPlaca: " + getPlaca() +"\nHorário da entrada: " + getEntrada()+"\nHorário da saída: " + getSaida());
    }

    public double CalcularValor(){
        int horarioEntrada = getEntrada();
        int horarioSaida = getSaida();
        return ((horarioSaida-horarioEntrada)*1.5);
    }



    public void setModelo(String modeloCarro){
        modelo = modeloCarro;
    }
    public String getModelo(){
        return modelo;
    }


    public void setPlaca(String placaCarro){
        placa = placaCarro;
    }
    public String getPlaca(){
        return placa;
    }

    public void setEntrada(int entradaCarro){
        entrada = entradaCarro;
    }
    public int getEntrada(){
        return entrada;
    }

    public void setSaida(int saidaCarro){
        saida = saidaCarro;
    }
    public int getSaida(){
        return saida;
    }

}
