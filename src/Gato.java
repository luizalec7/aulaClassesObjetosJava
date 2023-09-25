class Gato {
    static int quantidadeDeGatos = 10;
    String nome = "Nome padrão";

    Gato(String nome) {
        Gato.quantidadeDeGatos++;
        this.nome = nome;
    }

    String retornarNome() {
        System.out.println("oi");
        return nome;
    }

    void miar() {
        System.out.println("miau");


    }
    void miar(String miado){
            System.out.println(miado);
        }

}