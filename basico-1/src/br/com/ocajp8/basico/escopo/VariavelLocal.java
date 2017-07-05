//Escopo de variavel existe de quando até quando?
/* 
	Variaveis locais são declaradas dentro de métodos ou construtores
	existem apenas dentro do bloco que elas foram criadas metodo{int variavelLocal} ou construtor{int variavelLocal}
*/
public class VariavelLocal {
	
	public void m1(){
		//Variavel local existe apenas dentrod o bloco m1{x}
		int x = 10;
		//Criando outro bloco if(){}
		if(x >= 10){
			//Criando nova variavel local Y que é vista apenas dentro do bloco do if(){}
			int y = 50;
			System.out.println(y);

			//X ainda está acessivel porque não finalizamos o bloco m1(){}
			System.out.println(x);

		}

		//Neste ponto a variavel y não está acessivel porque está fora do bloco do if(){}
		//System.out.println(y);
		System.out.println(x);
	}

	//Exemplo variavel local com bloco for
	public void m2For(){
		//Neste exemplo for implicito existe o bloco do for(int i=0, j=0; i<= 10; i++){j++}
		//For implicito executa apenas uma linha de comando
		for(int i=0, j=0; i<= 10; i++)j++;
			//Não compila porque as variaveis locais não existem fora do bloco do for(){}
			//System.out.println(i);
			//System.out.println(j);

		//Representa o mesmo for anterior
		for(int i=0, j=0; i<= 10; i++){
			j++;
		}
		//Não compila porque as variaveis locais não existem fora do bloco do for(){}
		//System.out.println(i);
		//System.out.println(j);
	}

	//Exemplo variavel local como parâmetro do método
	public void m3Parametro(String nome){
		//Temos a Variavel local nome do tipo String
		System.out.println(nome);

	}

	//Executar uma variavel local definida como parâmetro de outro método é possível?
	public void m4Parametro(){
		//Não é possível usar o parâmetro de outro método neste momento estamos em outro bloco m4Parametro(){}
		//Erro de compilição
		//System.out.println(nome);

	}

	public static void main(String... args){
		VariavelLocal t = new VariavelLocal();
		t.m1();
		t.m2For();
		t.m3Parametro("Junior");
	}

}