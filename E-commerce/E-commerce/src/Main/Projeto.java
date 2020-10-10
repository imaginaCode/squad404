package Main;

import java.util.Scanner;

public class Projeto {

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
		// TODO Auto-generated method stub		
		
				
		nomeGet();
		System.out.printf("Ola usuario %s seu sexo é %c",nomeIn,sexoIn);		
		
		
		
		
	}
	
	
	public static void nomeGet() {
		
		System.out.print("Digite o seu nome : ");
		nomeIn = leia.next();
		
		System.out.println(nomeIn);
		do
		{
			System.out.print("Digite o seu sexo : H-homem, M-mulher, O-outros ");
			sexoIn = leia.next().toUpperCase().charAt(0);
			
		}while (sexoIn != 'H' && sexoIn != 'M' && sexoIn != 'O');
		
		leia.close();
		
	}

}
