

public class Main {
    public static void main(String[] args) {
       //Criando 2 objetos(Professor e Aluno) para instanciar.
        Professor professor = new Professor("Alan Turing");
        Aluno aluno = new Aluno("Joseph");

        //Mensagem que vai aparecer na tela.
        professor.enviarEmail("Esta é uma mensagem para o professor.");
        aluno.enviarEmail("Esta é uma mensagem para o aluno.");
    }
}
