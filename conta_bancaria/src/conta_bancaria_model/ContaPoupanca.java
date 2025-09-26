package conta_bancaria_model;

public class ContaPoupanca extends Conta {
	
	//Atributo específico:
	private int aniversario;
	
	
	//Método Construtor:
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	//Implementa Método Get e Set para o atributo data:
	public int getAniversario() {
		return aniversario;
	}
	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	//Adiciona cálculo de rendimento com juros pré-definido: 
	public boolean render(int diaAniversario) {
		if (diaAniversario == this.aniversario && this.getSaldo()>0) {
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
		System.out.printf("Data rendimento: %d\n", this.aniversario);
		System.out.printf("Saldo com rendimento: R$ %.2f\n", this.getSaldo());
	}
	
}
