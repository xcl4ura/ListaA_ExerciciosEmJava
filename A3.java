package listaA;

import java.util.Scanner;


/*DESENVOLVA  UM  PROGRAMA  PARA  LER  UMA  TEMPERATURA  EM  GRAUS  CENT�GRADOS  E  APRESENT�-LA CONVERTIDA EM GRAUS FAHRENHEIT.
 *  AF�RMULA DE CONVERS�O �: F=(9*C+160)/5, ONDE F � A TEMPERATURA EM FAHRENHEIT E C � A TEMPERATURA EM CENT�GRADOS.
 */


public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		double C, F;
		
		System.out.println("Insira o valor grau em �C"); //ESCREVA
		C = meuScanner.nextDouble(); //LEIA
		
		F = (9 * C + 160)/5 ; //PROCESSAMENTO/CONTA.
		
		System.out.println(C + "�C, convertido em FAHRENHEIT � respectivamente: "+ F);//ESCREVA
	}

}
