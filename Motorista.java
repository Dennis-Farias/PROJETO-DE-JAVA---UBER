package Uber;
// Aplicando Herança
public class Motorista extends Pessoa{ 

    private String cnh;
    private int qtViagens;
    private double receita;

    public double getReceita() {
        return receita;
    }
    public void setReceita(double receita) {
        this.receita = receita;
    }
    public int getQtViagens() {
        return qtViagens;
    }
    public void setQtViagens(int qtViagens) {
        this.qtViagens = qtViagens;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    @Override
    public void bonificacao(double valor){
        if(qtViagens >= 100 ){
            this.setReceita(getReceita()+100); 
        }    
    }

    void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("CNH: "+getCnh());
        System.out.println("Quantidade de viagens: "+getQtViagens());
        System.out.println("Receita: "+getReceita());
    }
    //Apliquei herança com o uso do super, pegando o método da classe mãe
}
