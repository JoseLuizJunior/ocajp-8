package br.com.oca.capitulo1.objetos.criar;

public class OrdemInicializacao {
	
	private String name = "Fluffy";
	
	//Bloco de Inicialização de Instância - Executado apenas quando cria o Objeto linha 16
	{ System.out.println("setting field"); }
	{ System.out.println(name); }
	
	public OrdemInicializacao() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args) {
		OrdemInicializacao chick = new OrdemInicializacao();
		
		System.out.println(chick.name);
	}

}
