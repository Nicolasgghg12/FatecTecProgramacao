package Segundo;

public class Segundo {
	public static void main (String[] args) {
		//double LivroJava8;
		//double LivroTDD;
		//LivroJava8 = 59.90;
		//LivroTDD =  59.90;
		//double soma = LivroJava8 + LivroTDD;
		//System.out.println(soma);
		//boolean resultado = soma < 150;
		//System.out.println(resultado );
		
		//Autores
		Autor autor1 = new Autor();
		autor1.nome = "Rodrigo Turini";
		autor1.email = "rodrigo.turini@caelum.com.br";
		autor1.cpf = "123.456.789-10";
				

		Autor autor2 = new Autor();
		autor2.nome = "Paulo Silveira";
		autor2.email = "paulo.silveira@caelum.com.br";
		autor2.cpf = "123.456.789-11";
		
		
		//Livros
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático" ;
		livro.descricao = "Novos recursos da linguagem" ;
		livro.valor = 59.90 ;
		livro.isbn = "978-85-66250-46-6" ;
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de programação" ;
		outroLivro.descricao = "Crie seus primeiros programas" ;
		outroLivro.valor = 59.90 ;
		outroLivro.isbn = "978-85-66250-22-0" ;
		
		
		//declarando autor do livro
		
		livro.autor = autor2;
		outroLivro.autor = autor1;
		
		
		
		livro.mostrarDetalhes();
		outroLivro.mostrarDetalhes();
		
		
	}
}
