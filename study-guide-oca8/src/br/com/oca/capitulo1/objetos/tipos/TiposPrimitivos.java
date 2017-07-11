package br.com.oca.capitulo1.objetos.tipos;

public class TiposPrimitivos {
	
	//Tipos primitivos
	
	//Recebe true ou false valor default é false
	boolean bool = false;
	
	//Recebe um caracter porém permite números 
	char c = 'c';
	
	//Primitivos númericos 
	
	//byte recebe inteiro de -126 a 127
	byte byt = 127;
	
	short s;
	int i;
	long l;
	
	//Primitivos flutuante ou decimais
	
	//Números decimais com f no final para definir que é um float
	float f = 3.0f;
	
	double d;
	
	
	//Base octal digitos de 0-7
	int octal = 01234567;
	
	//Base binaria digitos de 0-1
	int baseBinaria = 0b0101010;
	
	//Base hexa decimal digitos 0-F
	int hexa = 0x012F;
	
	
	//Permite utilizar o separador _ para facilitar a leitura porém não altera o valor do literal 1000
	int mil = 1_000;
	
	//Não é permitido começar literal usando _
	//NÃO COMPILA doublenotAtStart = _1000.00;
	
	//Não permite finalizar literal usando _
	//NÃO COMPILA double notAtEnd = 1000.00_;
	
	//Não é permitido utilizar _ antes ou depois do . para números flutuantes
	//NÃO COMPILA double notByDecimal = 1000_.00;

	double	annoyingButLegal = 1_00_0.0_0; // this one compiles
	



	
	public static void main(String[] args) {
		System.out.println(01000);
	}

}
