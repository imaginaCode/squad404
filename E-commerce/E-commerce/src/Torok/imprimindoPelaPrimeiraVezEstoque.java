package Torok;

import java.util.Scanner;

public class imprimindoPelaPrimeiraVezEstoque {
		
		public static String nomeIn;	
		
		public static char sexoIn;

		public static Scanner leia = new Scanner(System.in);;
		
		public static int cod[] = {0,1,2,3,4,5,6,7,8,9},
				quantEstoque[] = {16,10,30,25,29,12,18,22,26,11},
				valorUnitario[] = {86,90,40,35,50,60,32,30,50,63},
				quantIn [] = new int[10],
				valorTotal [] = new int[10],
				valorTaxa [] = new int[10];
		public static String produtoNome [] = {"PythonMan","Else Kruger","Noite dos Errors","O Jorro","Tech Leader América","Dev de Ferro","Capitão Cod","Java Snow","For Fantástico","Capitã Main"};
	
	public static void main(String[] args) {
		/*imprimir pela primeira vez o estoque
		 * 
		 * colocar as variaveis
		 * 
		 * imprimir seguindo a ordem:
		 * 
		 * 1-cod
		 * 2-quantEstoque
		 * 3-valorUnitario
		 * 4-produtoNome
		 * 
		 */

		imprimirEstoque();
	
	
	}

	public static void imprimirEstoque() 
	{
		int contador = 0;
		
		System.out.println("CÓDIGO--------Estoque----------Valor------------Fantasia\n");
		for(contador=0;contador<10;contador++)
		{
			
			
			System.out.printf("   %d\t\t%d\t\t%d\t\t%s\n",cod[contador],quantEstoque[contador],valorUnitario[contador],produtoNome[contador]);
			
		
		}
	
	}
	

}
