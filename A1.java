package listaA;

import java.util.Scanner;

//DESENVOLVA  UM  PROGRAMA  PARA  LER  QUATRO  VALORES  E  CALCULAR E  APRESENTAR A  M�DIA  DESTES VALORES.

public class A1 {

	public static void main(String[] args) {
		
			Scanner meuScanner = new Scanner(System.in);//DECLARA��� DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
			
			int n1, n2, n3, n4;//DECLARANDO AS VARI�VEIS PARA OS N�MEROS(INTEIRO)
			
			double soma, media;//DECLARANDO AS VARI�VEIS PARA RECEBEREM A SOMA E A MEDIA(REAL)
			
			System.out.println("Digite o primeiro n�mero");//ESCREVA
			n1 = meuScanner.nextInt();//LEIA
			
			System.out.println("Digite o segundo n�mero");//ESCREVA
			n2 = meuScanner.nextInt();//LEIA
			
			System.out.println("Digite o terceiro n�mero");//ESCREVA
			n3 = meuScanner.nextInt();//LEIA
			
			System.out.println("Digite o quarto n�mero");//ESCREVA
			n4 = meuScanner.nextInt();//LEIA
			
			soma = (n1 + n2 + n3 + n4);//PROCESSAMENTO - SOMA E ATRIBUI��O 
			media = (soma / 4);
			
			System.out.println("A m�dia dos n�meros � " + media);

	}

}
