public class Main {
    public static void main(String[] args) {
        System.out.println("Boa noite!");

        aluno objeto1 = new aluno("Adriel", "123456", 500.00f);
        objeto1.nome = ("Adriel");
        objeto1.ra = ("123456");
        objeto1.valor_mensalidade = (500.00f);

        objeto1.imprime_aluno();
        
        aluno objeto2 = new aluno("Guilherme", "654321", 600.00f);
        // objeto2.nome = ("Guilherme");
        //objeto2.ra = ("654321");
        //objeto2.valor_mensalidade = (600.00f);

        objeto2.imprime_aluno( );

        aluno objeto3 = new aluno("Adriel", "123456", 500.00f);
        objeto3.imprime_aluno();

        aluno objeto4 = new aluno("Guilherme", "654321", 600.00f);
        objeto4.imprime_aluno();

    }
}

