package listaA;


import java.util.Scanner;

/*FA�A  UM  ALGORITMO  QUE  CALCULE  A  QUANTIDADE  DE  LITROS  DE  COMBUST�VEL  
 * GASTA  EMUMA  VIAGEM, UTILIZANDO  UM  AUTOM�VEL  QUE  FAZ  12KM  POR  LITRO. 
 * PARA  OBTER  OC�LCULO,  O  USU�RIO  DEVE  FORNECER  O TEMPO  GASTO  NA  VIAGEM  E 
 * A  VELOCIDADE  M�DIADURANTE  ELA.  DESTA  FORMA,  SER�  POSS�VEL  OBTER  A DIST�NCIA  
 * PERCORRIDA  COM  AF�RMULA  DISTANCIA  =  TEMPO  *  VELOCIDADE.  TENDO  O  VALOR  DA DIST�NCIA,
 * BASTA CALCULAR A QUANTIDADE DE LITROS DE COMBUST�VEL UTILIZADA NA VIAGEM COM AF�RMULA:  
 * LITROS_USADOS  =  DISTANCIA  /  12.  O  PROGRAMA  DEVE  APRESENTAR  OSVALORES  DA VELOCIDADE  M�DIA,
 * TEMPO  GASTO  NA  VIAGEM,  A  DIST�NCIA  PERCORRIDA  E  AQUANTIDADE  DE  LITROS  UTILIZADA NA VIAGEM.
 */

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double vm,temp, dist,lit;
		
		 System.out.println("Insira o tempo gasto: "); //ESCREVA
		 temp = meuScanner.nextDouble(); //LEIA
		 
		 System.out.println("Insira a velocidade m�dia percorrida: "); //ESCREVA
		 vm = meuScanner.nextDouble(); //LEIA
		 
		 dist = (temp*vm); //PROCESSAMENTO/CONTA.
		 lit = (dist/12); //PROCESSAMENTO/CONTA.
		 
		 System.out.println("Voc� gastou "+lit+" litros na viagem de "+ dist+" Km percorridos, com a velocidade m�dia de "+vm+" KM/H no tempo de "+temp); //ESCREVA
		
	}

}
