package Torok;

import java.util.Scanner;

public class compra {
			public static String nomeIn;
		
			public static char sexoIn;
		
			public static Scanner leia = new Scanner(System.in);;
		
			public static int cod[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
					quantEstoque[] = { 16, 10, 30, 25, 29, 12, 18, 22, 26, 11 },
					 quantIn[] = new int[10];
	
			public static double valorUnitario[] = { 86, 90, 40, 35, 50, 60, 32, 30, 50, 63 },
			valorTotal[] = new double[10],
			valorTaxa[] = new double[10];

			public static String produtoNome[] = { "PythonMan", "Else Kruger", "Noite dos Errors", "O Jorro",
			"Tech Leader Am�rica", "Dev de Ferro", "Capit�o Cod", "Java Snow", "For Fant�stico", "Capit� Main" };
		
					/* FALTA A FUNCAO CARRINHO
					 * 
					 * FALTA A FUNCAO CARRINHO
					 * 
					 * FALTA A FUNCAO CARRINHO
					 * 
					 * imprimir o estoque
					 * 
					 * usar Do While
					 *
					 * 
					 * pedir pra digitar codigo do produto(criar variavel codin)
					 * 
					 * se for invalido volta
					 * se o codigo for ok sai do laco
					 * 
					 * FALTA A FUNCAO CARRINHO
					 * 
					 * FALTA A FUNCAO CARRINHO
					 * 
					 * FALTA A FUNCAO CARRINHO
					 */
			
			
			
	public static void main(String[] args) 
	{
	
	compra();
	
	}


		
		
		
		public static void imprimirEstoque() 
		{
			int contador = 0;
			
			System.out.println("C�DIGO--------Estoque----------Valor------------Fantasia\n");
			for(contador=0;contador<10;contador++)
			{
				
				
				System.out.printf("   %d\t\t%d\t\t%.2f\t\t%s\n",cod[contador],quantEstoque[contador],valorUnitario[contador],produtoNome[contador]);
				
			
			}
		
		}
		
        public static void compra()
        {
        int podIn=0,qIn;	
		
		imprimirEstoque();
		
		do
		{
			System.out.print("Digite o c�digo do produto que voc� deseja comprar : ");
			
			podIn = leia.nextInt();
			
			if(podIn<0 || podIn>9)
			{
				System.out.println("C�digo inv�lido, digite novamente.");
			}
		
		
		}while(podIn<0 || podIn>9);
		
		
			do
			{
		
			System.out.printf("Pruduto : %s, foi selecionado. Digite a quantidade : ",produtoNome[podIn]);
			qIn = leia.nextInt();
			
			if( (qIn>quantEstoque[podIn]) || qIn<=0)
			{
				System.out.println("Quantidade inv�lida, digite novamente.");
			}
			
			}while((qIn>quantEstoque[podIn]) || qIn<=0);
			
			
			quantIn[podIn] += qIn;
			
			valorTotal[podIn]=quantIn[podIn]* valorUnitario[podIn];
			
			valorTaxa[podIn]=valorTotal[podIn]*0.09;
			
			valorTotal[podIn]+=valorTaxa[podIn];
			
			quantEstoque[podIn]-=qIn;
			
			System.out.printf("Produto : %s\nQuantidade : %d\nADICIONADO AO CARRINHO",produtoNome[podIn],quantIn[podIn]);
			
			
			System.out.println("\nFalta a fu��o carrinho");
            }
			
	}	