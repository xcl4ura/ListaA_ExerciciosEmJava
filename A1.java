package listaA;

import java.util.Scanner;

//DESENVOLVA  UM  PROGRAMA  PARA  LER  QUATRO  VALORES  E  CALCULAR E  APRESENTAR A  MÉDIA  DESTES VALORES.

public class A1 {

	public static void main(String[] args) {
		
			Scanner meuScanner = new Scanner(System.in);//DECLARAÇÃÓ DO OBJETO MEUSCANNER(SCANNER), PARA A ENTRADA DE DADOS/LEIA
			
			int n1, n2, n3, n4;//DECLARANDO AS VARIÁVEIS PARA OS NÚMEROS(INTEIRO)
			
			double soma, media;//DECLARANDO AS VARIÁVEIS PARA RECEBEREM A SOMA E A MEDIA(REAL)
			
			System.out.println("Digite o primeiro número");//ESCREVA
			n1 = meuScanner.nextInt();//LEIA
			
			System.out.println("Digite o segundo número");//ESCREVA
			n2 = meuScanner.nextInt();//LEIA
			
			System.out.println("Digite o terceiro número");//ESCREVA
			n3 = meuScanner.nextInt();//LEIA
			
			System.out.println("Digite o quarto número");//ESCREVA
			n4 = meuScanner.nextInt();//LEIA
			
			soma = (n1 + n2 + n3 + n4);//PROCESSAMENTO - SOMA E ATRIBUIÇÃO 
			media = (soma / 4);
			
			System.out.println("A média dos números é " + media);

	}

}
