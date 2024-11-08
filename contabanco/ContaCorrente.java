package contabanco;

public class ContaCorrente extends Conta{

	public ContaCorrente(String numeroConta, double saldo) {
		super(numeroConta, saldo);
	}
	
	public void deposito(double valor) {
		double deposito = this.getSaldo() + valor;
		this.setSaldo(deposito);	
	}

	
}
