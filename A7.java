package listaA;


import java.util.Scanner;

/*FAÇA  UM  ALGORITMO  QUE  CALCULE  A  QUANTIDADE  DE  LITROS  DE  COMBUSTÍVEL  
 * GASTA  EMUMA  VIAGEM, UTILIZANDO  UM  AUTOMÓVEL  QUE  FAZ  12KM  POR  LITRO. 
 * PARA  OBTER  OCÁLCULO,  O  USUÁRIO  DEVE  FORNECER  O TEMPO  GASTO  NA  VIAGEM  E 
 * A  VELOCIDADE  MÉDIADURANTE  ELA.  DESTA  FORMA,  SERÁ  POSSÍVEL  OBTER  A DISTÂNCIA  
 * PERCORRIDA  COM  AFÓRMULA  DISTANCIA  =  TEMPO  *  VELOCIDADE.  TENDO  O  VALOR  DA DISTÂNCIA,
 * BASTA CALCULAR A QUANTIDADE DE LITROS DE COMBUSTÍVEL UTILIZADA NA VIAGEM COM AFÓRMULA:  
 * LITROS_USADOS  =  DISTANCIA  /  12.  O  PROGRAMA  DEVE  APRESENTAR  OSVALORES  DA VELOCIDADE  MÉDIA,
 * TEMPO  GASTO  NA  VIAGEM,  A  DISTÂNCIA  PERCORRIDA  E  AQUANTIDADE  DE  LITROS  UTILIZADA NA VIAGEM.
 */

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double vm,temp, dist,lit;
		
		 System.out.println("Insira o tempo gasto: "); //ESCREVA
		 temp = meuScanner.nextDouble(); //LEIA
		 
		 System.out.println("Insira a velocidade média percorrida: "); //ESCREVA
		 vm = meuScanner.nextDouble(); //LEIA
		 
		 dist = (temp*vm); //PROCESSAMENTO/CONTA.
		 lit = (dist/12); //PROCESSAMENTO/CONTA.
		 
		 System.out.println("Você gastou "+lit+" litros na viagem de "+ dist+" Km percorridos, com a velocidade média de "+vm+" KM/H no tempo de "+temp); //ESCREVA
		
	}

}
