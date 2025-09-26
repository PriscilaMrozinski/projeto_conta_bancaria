package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.util.Cores;
import conta_bancaria_model.Conta;
import conta_bancaria_model.ContaCorrente;
import conta_bancaria_model.ContaPoupanca;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);//aqui serve para todos os métodos, além do main
	//final: usa para constantes, quer dizer que não será modificado, sempre receberá algo do teclado.
	
	//Instanciar a Conta Controller:
	private static final ContaController contaController = new ContaController();
	
	public static void main(String[] args) {
		int opcao;
				
		//Instanciar Objetos da Classe ContaCorrente: //lembra de importar a Classe!
		//ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Thuany Silva", 25000.00f, 5000.00f);
		//cc1.visualizar();
			
		//TESTE CONTA POUPANÇA:
		//ContaPoupanca pop1 = new ContaPoupanca (1, 123, 2, "João da Silva", 650.00f, 24);
		//pop1.render(24);
		//pop1.visualizar();
		
		criarContasTeste();
		
		
		while (true) {
			
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
			
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			}catch(InputMismatchException e) {
				opcao = -1;//pode colocar qq número que não seja opções do menu
				System.out.println("\nDigite um número inteiro entre 0 e 8");
				leia.nextLine();
			}
			
			if (opcao==0) {
				System.out.println("\nBanco Platinum - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
				
			}
						
			switch(opcao) {
			
			case 1:				
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Criar conta ---\n\n");
				cadastrarConta();
				keyPress();			
				break;
			case 2:
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Listar todas as Contas ---\n\n");
				listarContas();
				keyPress();		
				break;
			case 3: 	
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Consultar dados da Conta (por número) ---\n\n");
				procurarContaPorNumero();
				keyPress();		
				break;
			case 4: 	
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Atualizar dados da Conta ---\n\n");
				atualizarConta();
				keyPress();		
				break;
			case 5: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Apagar Conta ---\n\n");		
				deletarConta();
				keyPress();		
				break;
			case 6: 	
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Sacar ---\n\n");
				keyPress();		
				break;
			case 7: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Depositar ---\n\n");
				keyPress();		
				break;
			case 8: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Transferir valores entre Contas ---");
				keyPress();		
				break;
			case 0: 
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "--- Menu encerrado ---");
				keyPress();		
				break;
			default:
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_PURPLE + "Opção Inválida!\n\n");
				keyPress();		
				break;				
			}
		}
	}
	
	
	public static void sobre(){
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Priscila Lins Mrozinski ");
		System.out.println("priscila_alins@hotmail.com | github.com/PriscilaMrozinski ");
		System.out.println("----------------------------------------------------------");
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione ENTER para continuar...");
		leia.nextLine();
	}
	
	// Método para testar contas
	private static void criarContasTeste() {
		contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
	
	private static void listarContas() {
		contaController.listarTodas();
	}
	
	private static void cadastrarConta() {
		System.out.print("Digite o número da Agência: ");
		int agencia = leia.nextInt();
		
		System.out.print("Digite o nome do Titular: ");
		leia.skip("\\R");
		String titular = leia.nextLine();
		
		System.out.print("Digite o Tipo da conta (1-CC | 2-CP): ");
		int tipo = leia.nextInt();
		
		System.out.print("Digite o Saldo Inicial: ");
		float saldo = leia.nextFloat();
		
		//verificar a variavel tipo:
		switch(tipo) {
		case 1->{
			System.out.print("Digite o limite inicial: ");
			float limite = leia.nextFloat();
			leia.nextLine();
			//contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), (agencia, tipo, titular, saldo, limite));
			contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2->{
			System.out.println("Digite o dia do aniversário da conta: ");
			int aniversario = leia.nextInt();
			leia.nextLine();
			//contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), (agencia, tipo, titular, saldo, aniversario));
			contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida" + Cores.TEXT_RESET);
				
		}
	}
	
	private static void procurarContaPorNumero() {
		System.out.printf("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();//para evitar o problema do /n String
		
		contaController.procurarPorNumero(numero);		
	}
	
	private static void deletarConta() {		
		System.out.print("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		Conta conta = contaController.buscarNaCollection(numero);
		
		if(conta != null) {
		
			System.out.print("\nTem certeza que deseja excluir esta conta? (S/N): ");
			String confirmacao = leia.nextLine();
			
			
			if(confirmacao.equalsIgnoreCase("S")) {
				contaController.deletar(numero);
			}else {
				System.out.println("\nOperação cancelada!");
			}
			
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
	
	private static void atualizarConta() {
		System.out.print("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		Conta conta = contaController.buscarNaCollection(numero);
		
		if(conta != null) {
			
			int agencia = conta.getAgencia();
			String titular = conta.getTitular();
			int tipo = conta.getTipo();
			float saldo = conta.getSaldo();
			
			System.out.printf("A agência atual é: %d\n Nova Agência (Pressione ENTER para manter o valor atual: ", agencia);
			String entrada = leia.nextLine();
			agencia = entrada.isEmpty() ? agencia : Integer.parseInt(entrada);//é um if ternario: se entrada for vazio mantem o valor atual, se não for vazio usa entrada
			//parseInt: passe para inteiro (conversão de dados)
			//? é uma condição, se não --- if ternário (para duas condições: verdadeiro ou falos)
			//se a pessoa digitou alguma coisa converte, caso nao digitou nada vida que segue
			
			System.out.printf("O nome do Titular atual: %s\n Novo titular (Pressione ENTER para manter o valor atual: ", titular); 
			entrada = leia.nextLine();
			titular = entrada.isEmpty() ? titular : entrada;
							
			System.out.printf("O Saldo atual: %.2f\n Novo Saldo (Pressione ENTER para manter o valor atual): ", saldo);
			entrada = leia.nextLine();
			saldo = entrada.isEmpty() ? saldo : Float.parseFloat(entrada);
				 
				 
			//verificar a variavel tipo:
			switch(tipo) {
			case 1->{
				float limite = ((ContaCorrente) conta).getLimite();//processo de casting
				System.out.printf("O Limite atual é: %.2f\n Novo Limite (Pressione ENTER para manter o valor atual): ", limite);
				entrada = leia.nextLine();
				limite = entrada.isEmpty() ? limite : Float.parseFloat(entrada);
				contaController.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
				}
			case 2->{
				int aniversario = ((ContaPoupanca) conta).getAniversario();
				System.out.printf("O aniversário é: %d\n Nova Aniversário (Pressione ENTER para manter o valor atual: ", aniversario);
				entrada = leia.nextLine();
				aniversario = entrada.isEmpty() ? aniversario : Integer.parseInt(entrada);
				contaController.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
				}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida!" + Cores.TEXT_RESET);
						
				}
			}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
}
