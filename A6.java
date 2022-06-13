package listaA;

import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  PARA  CALCULAR  O  SALÁRIO  LÍQUIDO  DE  UM  FUNCIONÁRIO  
 * A  PARTIR  DO  SEU SALÁRIO BRUTO. O PROGRAMA DEVERÁ REALIZAR OS SEGUINTES PASSOS:-ESTABELECER
 *A LEITURA DA VARIÁVEL HT (HORAS TRABALHADAS NO MÊS);-ESTABELECER A LEITURA DA VARIÁVEL VH 
 *(VALOR DA HORA TRABALHADA);-ESTABELECER A LEITURA DA VARIÁVEL PD (PERCENTUAL DE DESCONTO);
 *-CALCULAR O SALÁRIO BRUTO (SB), SENDO ESTE A MULTIPLICAÇÃO DAS VARIÁVEIS HT E VH;-CALCULAR  
 *O  TOTAL  DE  DESCONTO  (TD)  COM  BASE  NO  VALOR  DE  PD  DIVIDIDO  POR  100  E MULTIPLICADO PELO SB;
 *-CALCULAR O SALÁRIO LÍQUIDO (SL), DEDUZINDO O DESCONTO TOTAL DO SALÁRIO BRUTO (SB –TD);
 *APRESENTAR OS VALORES DOS SALÁRIOS BRUTO E LÍQUIDO, ALÉM DO DESCONTO TOTAL: SB, TD E SL.
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
		 
		 
		 System.out.println("O salário bruto é respectivamente R$"+ sb+", com o desconto de "+ td+ ", o salário fica R$"+sl); //ESCREVA
		 
		
		
	}

}
