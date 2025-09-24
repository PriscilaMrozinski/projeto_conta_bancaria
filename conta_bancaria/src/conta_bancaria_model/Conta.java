package conta_bancaria_model;
 
public class Conta {
 
	
	//Atributos da Classe
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	//Metodo Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}//este atributo numero é o numero que receber do construtor
	
	// POLIMORFISMO - SOBRECARGA DE METODO
	public Conta() {
		
	}//exemplo calcular area de um quadrado e triangulo
	//aqui tem dois construtores, um com parametros e este SEM PARAMETROS, 
	
	//adicionando (outro exemplo) POLIMORFISMO SOBRECARGA:
	//public Conta(int numero, int agencia) {
		//this.numero = numero;
		//this.agencia = agencia;
	//}
	
	
	//Metodos Get e Set
	public int getNumero() {
		return numero;
	}
 
	public void setNumero(int numero) {
		this.numero = numero;
	}
 
	public int getAgencia() {
		return agencia;
	}
 
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
 
	public int getTipo() {
		return tipo;
	}
 
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
 
	public String getTitular() {
		return titular;
	}
 
	public void setTitular(String titular) {
		this.titular = titular;
	}
 
	public float getSaldo() {
		return saldo;
	}
 
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		if(this.saldo < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}//boolean para saber se deu certo o saque
		this.saldo = this.saldo - valor;
		return true;
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}//Lembra que VOID não retorna valor
	
	
	
	public void visualizar() {
		String tipo = "";
		switch(this.tipo) {
		case 1 -> tipo = "Conta Corrente";
		case 2 -> tipo = "Conta Poupança";
		default -> tipo = "Desconhecido";
		}//para alterar o numero para escrita
		
		System.out.println("\n *****************");
		System.out.println("Dados da Conta");
		System.out.println("*******************");
		System.out.printf("Número da conta: %d%n", this.numero);
		System.out.printf("Número da conta: %d%n", this.agencia);
		System.out.printf("Número da conta: %s%n", tipo);//altera o this.tipo para tipo, assim aparece a a escrita
		System.out.printf("Número da conta: %s%n", this.titular);
		System.out.printf("Número da conta: %.2f%n", this.saldo);
	}//assim não precisa chamar vários gets
	
	
	
}