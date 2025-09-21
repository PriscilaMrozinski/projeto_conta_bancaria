package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println(Cores.TEXT_GRAY + Cores.ANSI_CYAN_BACKGROUND_BRIGHT
			        + "***********************************************");
			System.out.println("--------- Bem-vindo ao Banco Platinum ---------");
			System.out.println("***********************************************");
			System.out.println(Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_CYAN + "1 - Criar Conta            			");
			System.out.println("2 - Listar todas as Contas 			");
			System.out.println("3 - Buscar Conta por número 		");
			System.out.println("4 - Atualizar dados da Conta		");
			System.out.println("5 - Apagar Conta             		");
			System.out.println("6 - Sacar                   		");
			System.out.println("7 - Depositar                		");
			System.out.println("8 - Transferir valores entre Contas	");
			System.out.println("0 - Sair							");
			System.out.println(Cores.TEXT_GRAY + Cores.ANSI_CYAN_BACKGROUND_BRIGHT
			        + "************************************************");
			System.out.println("Digite a opção desejada: 			");
			menu = leia.nextInt();
						
			switch(menu) {
			
			case 1:				
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Criar conta ---");
							
				break;
			case 2:
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Listar todas as Contas ---");
				System.out.println("");
				
				break;
			case 3: 	
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Buscar Conta por número ---");
				System.out.println("");
				
				break;
			case 4: 	
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Atualizar dados da Conta ---");
				System.out.println("");
				
				break;
			case 5: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Apagar Conta ---");
				System.out.println("");
				
				break;
			case 6: 	
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Sacar ---");
				System.out.println("");
				
				break;
			case 7: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Depositar ---");
				System.out.println("");
				
				break;
			case 8: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Transferir valores entre Contas ---");
				System.out.println("");
				
				break;
			case 0: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Menu encerrado ---");
				System.out.println("");
				
				break;
			default:
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "Opção Inválida!");
				System.out.println("Digite a opção desejada:");
				System.out.println("");
				
				break;				
			}
			
		}while(menu != 0);

		System.out.println(Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_BLUE);		
		sobre();
		
		leia.close();
	}
	
	public static void sobre(){
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Priscila Lins Mrozinski ");
		System.out.println("priscila_alins@hotmail.com | github.com/PriscilaMrozinski ");
		System.out.println("----------------------------------------------------------");
	}
	
}
