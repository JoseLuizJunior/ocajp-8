package br.com.oca.capitulo1.objetos.criar;

public class Egg {
	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		//Primeira linha a ser executada
		Egg egg = new Egg();
		//Saida 5 porque e executado linha a linha de cima para baixo
		System.out.println(egg.number);
	}
	
	private int number = 3;
	{number = 4;}
}