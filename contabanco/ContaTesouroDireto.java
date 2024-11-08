package contabanco;

public class ContaTesouroDireto extends Conta{

	public ContaTesouroDireto(String numeroConta, double saldo) {
		super(numeroConta, saldo);
	}
	
	public void render() {
		double juros = this.getSaldo() + this.getSaldo() * 0.01;
		this.setSaldo(juros);
	}
	
	public void deposito(double valor) {
		if(valor >= 1000) {
			double deposito = this.getSaldo() + valor;
			this.setSaldo(deposito);
		}
	}
}
