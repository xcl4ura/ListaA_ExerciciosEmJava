package listaA;


import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  PARA  LER  DOIS  VALORES  PARA  AS  VARI�VEIS  A  E  B, 
 * EFETUAR  A  TROCA  DOS VALORES DE FORMA QUE A VARI�VEL A PASSE A POSSUIR O VALOR 
 * DA VARI�VEL B E QUE A VARI�VEL B PASSE APOSSUIR O VALOR DA VARI�VEL A. APRESENTAR OS VALORES TROCADOS.
 */

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double a,b,c;
		
		
		 System.out.println("Insira o valor de A: "); //ESCREVA
		 a = meuScanner.nextDouble(); //LEIA
		 
		 
		 System.out.println("Insira o valor de B: "); //ESCREVA
		 b = meuScanner.nextDouble(); //LEIA
		
		 c=a; //PROCESSAMENTO/CONTA.
		 a=b; //PROCESSAMENTO/CONTA.
		 b=c; //PROCESSAMENTO/CONTA.
		 
		 
		System.out.println("O valor de A � "+a+" e o valor de B � "+b); //ESCREVA
				
	}

}
