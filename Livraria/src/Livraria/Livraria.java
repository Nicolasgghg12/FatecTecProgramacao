package Livraria;

public class Livraria {
	public static void main(String[] args) {		
		
		Autor autor01 = new Autor("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123.456.789-10");
		Autor autor02 = new Autor("Paulo Silveira", "paulo.silveira@caelum.com.br", "123.456.789-11");

		
		Livro livro01 = new Livro("Java 8 Prático","Novos recursos da linguagem",59.90,"978-85-66250-46-6",autor02);
		Livro livro02 = new Livro("Lógica de programação","Crie seus primeiros programas",59.90,"978-85-66250-22-0",autor01);
	
		livro01.mostrarDetalhesCompletos();
		livro02.mostrarDetalhesCompletos();
	}

}
