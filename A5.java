package listaA;

import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  PARA  LER  O  PREÇO  DE  UM  PRODUTO  E  CALCULAR  O  PREÇO 
 *  À  VISTA  DESTE PRODUTO COM 10% DE DESCONTO. O PROGRAMA DEVERÁ REALIZAR 
 *  OS SEGUINTES PASSOS:-ESTABELECER A LEITURA DA VARIÁVEL PRECO (PREÇO BRUTO DO PRODUTO);
 *  -CALCULAR O VALOR DO DESCONTO (DESCONTO) DIVIDINDO O PREÇO POR 100 E MULTIPLICANDO PELO PERCENTUAL DE DESCONTO ((PRECO/100)*10).
 *  -CALCULAR O PREÇO DO PRODUTO À VISTA (PRECO_VISTA), DESCONTANDO O VALOR DO DESCONTO DO PREÇO BRUTO DO PRODUTO (PRECO -DESCONTO).
 *  APRESENTAR  OS  VALORES  DO  PREÇO  BRUTO  E  DO  PREÇO  À  VISTA,  ALÉM  DO  DESCONTO:  PRECO, DESCONTO E PRECO_VISTA.
 */

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double prec,precV,desc;
		
		System.out.println("Insira o preço do produto em reais: "); //ESCREVA
		 prec = meuScanner.nextDouble(); //LEIA
		 
		desc = (prec/100)*10; //PROCESSAMENTO/CONTA.
		precV =  prec - desc ; //PROCESSAMENTO/CONTA.
		
		
		System.out.println("O valor R$ "+ prec + " aplicado com desconto de 10% é respectivamente: "+precV); //ESCREVA
		
		
	}

}
