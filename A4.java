package listaA;

import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  PARA  LER  O  RAIO  E  A  ALTURA  DE  UMA  LATA  DE  ÓLEO  E  CALCULAR  O  VALOR  DO SEU VOLUME, 
  UTILIZANDO A FÓRMULA: VOLUME=3.14159*R*R*ALTURA.*/


public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double raio, alt, vol;
		
		System.out.println("Insira o valor do raio: "); //ESCREVA
		 raio = meuScanner.nextDouble(); //LEIA
		
			System.out.println("Insira a altura: "); //ESCREVA
			 alt= meuScanner.nextDouble(); //LEIA
			 
			vol = 3.14159*raio*raio*alt; //PROCESSAMENTO/CONTA.
			
			System.out.println("O volume da lata de óleo é respectivamente: "+ vol); //ESCREVA
			
	
				
	}

}
