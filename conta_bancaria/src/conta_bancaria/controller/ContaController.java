package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.List;

import conta_bancaria.repository.ContaRepository;
import conta_bancaria_model.Conta;

public class ContaController implements ContaRepository{

	//Criar lista, para o Método ListarTodas:
	private List<Conta> listaContas =new ArrayList<Conta>();
	int numero = 0;//variável para controlar o numero das contas
	
	
	@Override
	public void listarTodas() {
		for(var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("Conta cadastrada com sucesso");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}

}
