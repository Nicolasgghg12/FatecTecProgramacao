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
		System.out.println("   * Nome Autor: " + autor.nome);
		System.out.println("   * Email Autor: " + autor.email);
		System.out.println("   * Cpf Autor: " + autor.cpf);
		System.out.println("----------");
	}
	
}


