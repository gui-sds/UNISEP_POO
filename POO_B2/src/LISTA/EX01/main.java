package LISTA.EX01;
public class main {

    public static void main(String[] args) {
        contador objeto1 = new contador();

        objeto1.incrementar();
        objeto1.zerar();
        objeto1.incrementar();
        objeto1.incrementar();
        objeto1.incrementar();

        System.out.println("VALOR DO CONTADOR: " + objeto1.retornarValorContador());

    }
    
}
