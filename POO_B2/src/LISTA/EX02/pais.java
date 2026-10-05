package LISTA.EX02;

public class pais {
    private String sigla;
    private String nome;
    private int populacao;
    private double area;

    public pais(String sigla, String nome, int populacao, double area) {
        this.sigla = sigla;
        this.nome = nome;
        this.populacao = populacao;
        this.area = area;
    }

    public void listaPais() {
        System.out.println("Sigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Populacao: " + populacao);
        System.out.println("Area: " + area + " km2");
        System.out.println();
    }
}
