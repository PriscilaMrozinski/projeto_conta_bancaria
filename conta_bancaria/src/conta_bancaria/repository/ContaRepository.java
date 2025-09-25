package conta_bancaria.repository;

import conta_bancaria_model.Conta;

public interface ContaRepository {
	
	//Métodos do CRUD (cria, le, atualiza, exclui):
	public void listarTodas ();
	public void cadastrar(Conta conta);//aqui vem todas as informações da conta ... tem que passar um objeto como parametro - Conta porque é a super classe
	public void atualizar(Conta conta);
	public void procurarPorNumero(int numero);
	public void deletar(int numero);
	
	//Métodos Bancários:
	public void sacar(int numero, float valor); //passa o numero para identificar a conta e o valor
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
