package Victor;

import java.util.Scanner;

public class removerItemCarrinho {

	public static String nomeIn;

	public static char sexoIn;

	public static Scanner leia = new Scanner(System.in);;

	public static int cod[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
			quantEstoque[] = { 16, 10, 30, 25, 29, 12, 18, 22, 26, 11 },			
			 quantIn[] = new int[10];
	
	public static double valorUnitario[] = { 86, 90, 40, 35, 50, 60, 32, 30, 50, 63 },
			valorTotal[] = new double[10],
			valorTotalCarrinho, impostoTotalCarrinho,
			valorTaxa[] = new double[10];

	public static String produtoNome[] = { "PythonMan", "Else Kruger", "Noite dos Errors", "O Jorro",
			"Tech Leader América", "Dev de Ferro", "Capitão Cod", "Java Snow", "For Fantástico", "Capitã Main" };

	public static void main(String[] args) {
		removerItemCarrinho();

				
		
		
		
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
		linha();

		System.out.println("CÓDIGO--------Estoque-----------Valor-----------Fantasia\n");
		for(contador=0;contador<10;contador++)
		{

			
			System.out.printf("   %d\t\t%d\t\t%.2f\t\t%s\n",cod[contador],quantEstoque[contador],valorUnitario[contador],produtoNome[contador]);


		}

	}
	public static void linha() {
		System.out.println("*******************************************************************************");
	}
	
	public static void imprimirCarrinho() 
	{
		int contador = 0;
		valorTotalCarrinho =0;
		impostoTotalCarrinho = 0;
		linha();
		System.out.println("CÓDIGO---Quant---Valor Unitario(R$)---Imposto(R$)---Total(R$)---Fantasia\n");
		for(contador=0;contador<10;contador++)
		{

			if(quantIn[contador]>0)	{
				System.out.printf("  %d\t   %d\t\t%.2f\t\t%.2f\t      %.2f\t%s\n",cod[contador],quantIn[contador],valorUnitario[contador],valorTaxa[contador],valorTotal[contador],produtoNome[contador]);
				valorTotalCarrinho += valorTotal[contador];
				impostoTotalCarrinho += valorTaxa[contador];
			}
		}
		linha();
		System.out.printf("Total de imposto é :R$%.2f \n",impostoTotalCarrinho);
		System.out.printf("Total a pagar é :R$%.2f \n",valorTotalCarrinho);
		
	}
	
	public static void compra()
	    {
	    int podIn=0,qIn;	
		
		imprimirEstoque();
		linha();
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
		
		System.out.println();
		
		imprimirCarrinho();
		
		
        }
	public static void removerItemCarrinho() {
		 int podIn=0,qIn;	
			compra();
			imprimirCarrinho();
			linha();
			do
			{
				System.out.print("Digite o código do produto que você deseja remover : ");
				
				podIn = leia.nextInt();
				
				if(podIn<0 || podIn>9)
				{
					System.out.println("Código inválido, digite novamente.");
				}
			
			
			}while(podIn<0 || podIn>9);
			
		
			do
			{
		
				System.out.printf("Produto : %s, foi selecionado. Digite a quantidade que deseja remover : ",produtoNome[podIn]);
				qIn = leia.nextInt();
				
				if( (qIn>quantEstoque[podIn]) || qIn<=0)
				{
					System.out.println("Quantidade inválida, digite novamente.");
				}
				
			}while((qIn>quantEstoque[podIn]) || qIn<=0);
			
			
			quantIn[podIn] -= qIn;
			
			valorTotal[podIn]=(quantIn[podIn]* valorUnitario[podIn])*1.09;
			
			valorTaxa[podIn]=(quantIn[podIn]* valorUnitario[podIn])*0.09;
			
			quantEstoque[podIn]+=qIn;
			
			System.out.printf("Produto : %s\nQuantidade : %d\nREMOVIDO DO CARRINHO",produtoNome[podIn],quantIn[podIn]);
			
			System.out.println();
			
			imprimirCarrinho();
		
	}

}
