public class CalculadoraSimples {

    int ultimoResultado = 0;
    int somar(int argumento1, int argumento2) {
        return argumento1 + argumento2;
    }
    int multiplicar(int argumento1, int argumento2) {
        return argumento1 * argumento2;
    }
    int dividir(int argumento1, int argumento2) {
        return argumento1 / argumento2;
    }
    int subtrair(int argumento1, int argumento2) {
        ultimoResultado = argumento1 / argumento2;
        return ultimoResultado;
    }

}
