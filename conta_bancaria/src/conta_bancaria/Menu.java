package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;
import conta_bancaria_model.Conta;
import conta_bancaria_model.ContaCorrente;
import conta_bancaria_model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu;
		
		//Instanciar Objetos da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Cintia Dourado", 50000.00f); 
		//parametros(conta, numero conta, agencia, nome, saldo conta
		
		Conta c2 = new Conta(2, 123, 2, "Priscila Lins Mrozinski", 50000.00f);
			
		System.out.println(c1.sacar(1000));
		System.out.println(c2.sacar(60000));
		
		
		System.out.println("O saldo da conta é: " + c1.getSaldo());
		//metodo get: retorna o valor		
		
		c1.setSaldo(6000000.00f);
		System.out.println("O saldo da conta é: " + c1.getSaldo());
		
		c1.visualizar();
		
		c2.visualizar();
		
		System.out.println(c1.sacar(1000));
		System.out.println("O saldo da conta é: " + c1.getSaldo());
		
		System.out.println(c2.sacar(1000000));
		System.out.println("O saldo da conta é: " + c2.getSaldo());
		
		c1.depositar(5000);
		System.out.println("O saldo da conta é: " + c1.getSaldo());
		
		
		//Instanciar Objetos da Classe ContaCorrente: //lembra de importar a Classe!
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Thuany Silva", 25000.00f, 5000.00f);
		cc1.visualizar();
		//Para conseguir visualizar o Limite:
		//usa o conceito de POLIMORFISMO: sobrescreve um metodo (reescreve o metodo da conta na contaCorrente)
		
		//Polimorfismo de SOBRECARGA:
		//não traz os atributos
		//Conta c4 = new Conta () {
			
		//};
		
		//Outro exemplo POLIMORFISMO SOBRECARGA:
		//int numero, int agencia
		//Conta c4 = new Conta (4, 879);
		
		//Polimorfismo -Sobreescrita
		//Teste conta corrente, sacar com limite:
		System.out.println(cc1.sacar(32000.00f));
		cc1.visualizar();
		
		System.out.println(cc1.sacar(5000.00f));
		cc1.visualizar();
		
		//teste depositar:
		cc1.depositar(200.00f);
		cc1.visualizar();
		
		//TESTE CONTA POUPANÇA:
		ContaPoupanca pop1 = new ContaPoupanca (1, 123, 2, "João da Silva", 650.00f, 24);
		pop1.render(24);
		pop1.visualizar();
		

		
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
