package conta_bancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("----- Bem-vindo ao Banco Platinum -----");
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Listar todas as Contas");
			System.out.println("3 - Buscar Conta por número");
			System.out.println("4 - Atualizar dados da Conta");
			System.out.println("5 - Apagar Conta");
			System.out.println("6 - Sacar");
			System.out.println("7 - Depositar");
			System.out.println("8 - Transferir valores entre Contas");
			System.out.println("0 - Sair");
			System.out.println("--------------------------------------");
			System.out.println("Digite a opção desejada: ");
			menu = leia.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.println("--- Criar conta ---");
				System.out.println("");
							
				break;
			case 2:
				System.out.println("--- Listar todas as Contas ---");
				System.out.println("");
				
				break;
			case 3: 
				System.out.println("--- Buscar Conta por número ---");
				System.out.println("");
				
				break;
			case 4: 
				System.out.println("--- Atualizar dados da Conta ---");
				System.out.println("");
				
				break;
			case 5: 
				System.out.println("--- Apagar Conta ---");
				System.out.println("");
				
				break;
			case 6: 
				System.out.println("--- Sacar ---");
				System.out.println("");
				
				break;
			case 7: 
				System.out.println("--- Depositar ---");
				System.out.println("");
				
				break;
			case 8: 
				System.out.println("--- Transferir valores entre Contas ---");
				System.out.println("");
				
				break;
			case 0: 
				System.out.println("--- Menu encerrado ---");
				System.out.println("");
				
				break;
			default:
				System.out.println("Opção Inválida!");
				System.out.println("Digite a opção desejada:");
				System.out.println("");
				
				break;				
			}
			
			
		}while(menu != 0);

		
		sobre();
		
		leia.close();
	}
	
	public static void sobre(){
		System.out.println("\n-----------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Priscila Lins Mrozinski ");
		System.out.println("priscila_alins@hotmail.com | github.com/PriscilaMrozinski ");
		System.out.println("\n-----------------------------------------------------");
	}
	
}
