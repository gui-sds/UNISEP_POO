public class aluno {

	//Atributos 
	String nome;
	String ra;
	float valor_mensalidade;
	
	//construtores
        //public aluno(){
       // this.nome = "NOME NÃO PRENCHIDO";
       // this.ra = "";
       // this.valor_mensalidade = 0.0f;

   // }

    public aluno(String nome, String ra, Float valor_mensalidade){
        this.nome = nome;
        this.ra = ra;
        this.valor_mensalidade = valor_mensalidade;

    }


	//metodos 
    public void imprime_aluno() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("RA: " + this.ra);
        System.out.println("Valor da Mensalidade: " + this.valor_mensalidade);
    }

	

}