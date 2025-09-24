package conta_bancaria_model;

public class ContaPoupanca extends Conta {
	
	//Atributo específico:
	private int data;
	
	
	//Método Construtor:
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int data) {
		super(numero, agencia, tipo, titular, saldo);
		this.data = data;
	}

	//Implementa Método Get e Set para o atributo data:
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	//Adiciona cálculo de rendimento com juros pré-definido: 
	public boolean render(int diaAtual) {
		if (diaAtual == this.data && this.getSaldo()>0) {
			float rendimento = this.getSaldo() * 0.05f;
			this.setSaldo(this.getSaldo() + rendimento);
			return true;
		}
		return false;
	}
	
	// Adiciona o método visualizar:
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Data rendimento: %d\n", this.data);
		System.out.printf("Saldo com rendimento: R$ %.2f\n", this.getSaldo());
	}
	
}
