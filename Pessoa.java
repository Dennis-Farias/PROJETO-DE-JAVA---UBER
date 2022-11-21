package Uber;
// Aplicando Classe abstrata
public abstract class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    void mostrarAtributos(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
    }
    public abstract void bonificacao(double valor);
    // Método abstrato
}
