package listaA;

import java.util.Scanner;

//DESENVOLVA UM PROGRAMA PARA LER OS LADOS DE UM RET�NGULO E CALCULAR A �REA DESTE RET�NGULO, UTILIZANDO A F�RMULA: �REA=LADO1*LADO2.

public class A2 {

	public static void main(String[] args) {
		

			Scanner meuScanner = new Scanner(System.in);
			
			double lado1, lado2, area; //DECLARA��O DE VARIAVEL
			
			System.out.println("Insira o valor do primeiro lado"); //ESCREVA
			lado1 = meuScanner.nextDouble(); //LEIA
			
			System.out.println("Insira o valor do segundo lado");
			lado2 = meuScanner.nextDouble(); //LEIA
			
			area = lado1*lado2; //PROCESSAMENTO/CONTA.
			
			System.out.println("A �rea do ret�ngulo � respectivamente: " + area);
			
			
	}

}
