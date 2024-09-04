package Segundo;

public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;	
	Autor autor;
	
	
	
	void mostrarDetalhes() {
		System.out.println();
		System.out.println(" * Nome do livro: " + nome);
		System.out.println(" * Descrição do livro: " + descricao);
		System.out.println(" * Proço: " + valor);
		System.out.println(" * Código do produto: " + isbn);
		autor.mostrarDetalhes();
		System.out.println("----------");
	}
	
}


