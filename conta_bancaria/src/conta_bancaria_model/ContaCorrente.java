package conta_bancaria_model;

public class ContaCorrente extends Conta {
	//extends: indica que ContaCorrente é herança da Classe Conta
	
	//tem um único atributo: o limite
	private float limite;
	
	//Método Construtor:
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite; //acrescenta o atributo específico do Classe ContaCorrente
	}
	
	//Métodos GET e SET
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//adicionando o POLIMORFISMO SOBREESCRITA:
	//@Override: deve adicionar e indica que está sobreescrevendo da SuperClasse
	@Override
	public void visualizar() {
		super.visualizar();//copia a estrutura conta
		System.out.printf("Limite da Conta: R$ %.2f%n", this.limite);
	}
	
	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	


}
