package listaA;

import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  PARA  CALCULAR  O  SAL�RIO  L�QUIDO  DE  UM  FUNCION�RIO  
 * A  PARTIR  DO  SEU SAL�RIO BRUTO. O PROGRAMA DEVER� REALIZAR OS SEGUINTES PASSOS:-ESTABELECER
 *A LEITURA DA VARI�VEL HT (HORAS TRABALHADAS NO M�S);-ESTABELECER A LEITURA DA VARI�VEL VH 
 *(VALOR DA HORA TRABALHADA);-ESTABELECER A LEITURA DA VARI�VEL PD (PERCENTUAL DE DESCONTO);
 *-CALCULAR O SAL�RIO BRUTO (SB), SENDO ESTE A MULTIPLICA��O DAS VARI�VEIS HT E VH;-CALCULAR  
 *O  TOTAL  DE  DESCONTO  (TD)  COM  BASE  NO  VALOR  DE  PD  DIVIDIDO  POR  100  E MULTIPLICADO PELO SB;
 *-CALCULAR O SAL�RIO L�QUIDO (SL), DEDUZINDO O DESCONTO TOTAL DO SAL�RIO BRUTO (SB �TD);
 *APRESENTAR OS VALORES DOS SAL�RIOS BRUTO E L�QUIDO, AL�M DO DESCONTO TOTAL: SB, TD E SL.
 */
 

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double ht,vh,pd,sb,td,sl;
		
		System.out.println("Insira as horas trabalhadas: "); //ESCREVA
		 ht = meuScanner.nextDouble(); //LEIA
		 
		 System.out.println("Insira o valor por hora trabalhada: "); //ESCREVA
		 vh = meuScanner.nextDouble(); //LEIA
		 
		 System.out.println("Insira o percentual de desconto: "); //ESCREVA
		 pd = meuScanner.nextDouble(); //LEIA
		 
		 sb = ht*vh; //PROCESSAMENTO/CONTA.
		 td = (pd/100)*sb; //PROCESSAMENTO/CONTA.
		 sl = sb -td; //PROCESSAMENTO/CONTA.
		 
		 
		 System.out.println("O sal�rio bruto � respectivamente R$"+ sb+", com o desconto de "+ td+ ", o sal�rio fica R$"+sl); //ESCREVA
		 
		
		
	}

}
