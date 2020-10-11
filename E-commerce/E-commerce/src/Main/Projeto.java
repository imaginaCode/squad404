package Main;

import java.util.Scanner;

public class Projeto {

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
			"Tech Leader América", "Dev de Ferro", "Capitão Cod", "Java Snow", "For Fantástico", "Capitã Main" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		compra();		
		
		imprimirEstoque();
		
		
		leia.close();
	}

	public static void nomeGet() {

		System.out.print("Digite o seu nome : ");
		nomeIn = leia.next();

		System.out.println(nomeIn);
		do {
			System.out.print("Digite o seu sexo : H-homem, M-mulher, O-outros ");
			sexoIn = leia.next().toUpperCase().charAt(0);

		} while (sexoIn != 'H' && sexoIn != 'M' && sexoIn != 'O');	

	}
	
	public static void imprimirEstoque() 
	{
		int contador = 0;

		System.out.println("CÓDIGO--------Estoque-----------Valor-----------Fantasia\n");
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
			System.out.print("Digite o código do produto que você deseja comprar : ");
			
			podIn = leia.nextInt();
			
			if(podIn<0 || podIn>9)
			{
				System.out.println("Código inválido, digite novamente.");
			}
		
		
		}while(podIn<0 || podIn>9);
		
	
		do
		{
	
			System.out.printf("Pruduto : %s, foi selecionado. Digite a quantidade : ",produtoNome[podIn]);
			qIn = leia.nextInt();
			
			if( (qIn>quantEstoque[podIn]) || qIn<=0)
			{
				System.out.println("Quantidade inválida, digite novamente.");
			}
			
		}while((qIn>quantEstoque[podIn]) || qIn<=0);
		
		
		quantIn[podIn] += qIn;
		
		valorTotal[podIn]=quantIn[podIn]* valorUnitario[podIn];
		
		valorTaxa[podIn]=valorTotal[podIn]*0.09;
		
		valorTotal[podIn]+=valorTaxa[podIn];
		
		quantEstoque[podIn]-=qIn;
		
		System.out.printf("Produto : %s\nQuantidade : %d\nADICIONADO AO CARRINHO",produtoNome[podIn],quantIn[podIn]);
		
		
		System.out.println("\nFalta a fução carrinho");
        }

}
