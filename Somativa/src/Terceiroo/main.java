package Terceiroo;

public class main {
	public static void main(String[] args) {
	LIvro livro = new LIvro("Victor Freitag", "Nao sei o autor", 1500);
	
	System.out.println(livro.getNome());
	System.out.println(livro.getAutor());
	System.out.println(livro.getPaginas());


}
}