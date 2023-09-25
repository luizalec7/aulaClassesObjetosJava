public class TesteGato {
    public static void main(String[] args) {
        Gato mingau = new Gato("Mingau");
        Gato floquinho = new Gato("Floquinho");
        Gato monicao = new Gato("Monicao");


        System.out.println(mingau.nome);
        System.out.println(floquinho.nome);
        System.out.println(monicao.nome);

        String nomeDoMingau = mingau.retornarNome();
        System.out.println("retorno do método retornarNome: " + nomeDoMingau);

        mingau.miar("MIAUUUUUU!");

        System.out.println(Gato.quantidadeDeGatos);


    }

    static void criarCincoGatos() {

        new Gato("gato 1");
        new Gato("gato 2");
        new Gato("gato 3");
        new Gato("gato 4");
        new Gato("gato 5");
    }

}
