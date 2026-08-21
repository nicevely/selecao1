package POO;
import POO.Estudante;
public class Estudante {
    String nome;
    int idade;
    char sexo;
    public static void main(String[] args){
        Estudante estudante = new Estudante();

        estudante.nome = "ana paula";        //atributos da variavel estudante
        estudante.idade = 17;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
