package Livraria;

public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;	
	Autor autor;
	
	private void mostrarBasico() {
		System.out.println();
		System.out.println(" * Nome do livro: " + nome);
		System.out.println(" * Descrição do livro: " + descricao);
		System.out.println(" * Preço: " + valor);
		System.out.println(" * Código do produto: " + isbn);
	}
	
	
	void mostrarDetalhesSimples() {
		mostrarBasico();
		System.out.println(" * Autor: "+autor.nome);
		System.out.println("----------");
	}
	
	void mostrarDetalhesCompletos() {
		mostrarBasico();
		autor.mostrarDetalhes();
		System.out.println("----------");
	}
	Livro(String nome, String descricao, double valor, String isbn, Autor autor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
		this.autor = autor;
	}

}
