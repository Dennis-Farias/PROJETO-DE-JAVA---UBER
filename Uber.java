package Uber;
//Aplicando Interface
public class Uber implements CalculadoraTarifa{
    private double kmRodados;
    private double valorViagem;
    
    public double getValorViagem() {
        return valorViagem;
    }
    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }
    

    void motorista5estrelas(Motorista m){
        System.out.println("Parabéns: "+m.getNome());
        System.out.println("Você recebeu uma avaliação 5 estrelas");
    }
    // Método para fazer o polimorfismo


    @Override
    public void calculaTarifa() {
        this.setValorViagem(this.getKmRodados()*1.60);
    }

}

