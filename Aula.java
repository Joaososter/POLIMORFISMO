public abstract class Aula {
    //Atributo da classe Aluno ou pessoa
    public String nome;

    //Atributo para classe Aula
    public Aula(String nome) {
        this.nome = nome;
    }

    //Atributo usando o metodo getter
    public String getNome() {
        return nome;
    }

    //Método abstrato para usar o atributo saudação
    public abstract String saudar();

    //Método que envia email
    public void enviarEmail(String mensagem) {
        System.out.println(saudar() + "\nMensagem: " + mensagem);
    }

}


