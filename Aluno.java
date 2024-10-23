public class Aluno extends Aula {

    //atributo para a classe Aluno

    //super classe para o nome
    public Aluno(String nome) {
        super(nome);
    }

    // método para a saudação do aluno
    @Override
    public String saudar() {
        return "Olá Aluno " + getNome() + "!";
    }
}
