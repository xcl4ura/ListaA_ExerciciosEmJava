package listaA;

import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  PARA  LER  O  PRE�O  DE  UM  PRODUTO  E  CALCULAR  O  PRE�O 
 *  �  VISTA  DESTE PRODUTO COM 10% DE DESCONTO. O PROGRAMA DEVER� REALIZAR 
 *  OS SEGUINTES PASSOS:-ESTABELECER A LEITURA DA VARI�VEL PRECO (PRE�O BRUTO DO PRODUTO);
 *  -CALCULAR O VALOR DO DESCONTO (DESCONTO) DIVIDINDO O PRE�O POR 100 E MULTIPLICANDO PELO PERCENTUAL DE DESCONTO ((PRECO/100)*10).
 *  -CALCULAR O PRE�O DO PRODUTO � VISTA (PRECO_VISTA), DESCONTANDO O VALOR DO DESCONTO DO PRE�O BRUTO DO PRODUTO (PRECO -DESCONTO).
 *  APRESENTAR  OS  VALORES  DO  PRE�O  BRUTO  E  DO  PRE�O  �  VISTA,  AL�M  DO  DESCONTO:  PRECO, DESCONTO E PRECO_VISTA.
 */

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double prec,precV,desc;
		
		System.out.println("Insira o pre�o do produto em reais: "); //ESCREVA
		 prec = meuScanner.nextDouble(); //LEIA
		 
		desc = (prec/100)*10; //PROCESSAMENTO/CONTA.
		precV =  prec - desc ; //PROCESSAMENTO/CONTA.
		
		
		System.out.println("O valor R$ "+ prec + " aplicado com desconto de 10% � respectivamente: "+precV); //ESCREVA
		
		
	}

}
