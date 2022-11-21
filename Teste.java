package Uber;
// Dennis de Sousa Farias e João Paulo Padilha de Oliveira Silva
public class Teste {
    public static void main(String[] args){
        Motorista lucas = new Motorista();
        lucas.setNome("Lucas Hideki Tamagawa");
        lucas.setIdade(21);
        lucas.setCnh("AB");
        lucas.setQtViagens(100);
        lucas.setReceita(2000);
        lucas.bonificacao(100);

        lucas.mostrarAtributos();

        Uber u = new Uber();
        u.motorista5estrelas(lucas);; //Aplicando Polimorfismo
    }
}
