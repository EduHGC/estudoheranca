package contabanco;

public abstract class Conta {
	private String numeroConta;
	private double saldo;
	
	public Conta(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public Conta() {
		
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void render() {
		double juros = this.getSaldo() + (this.getSaldo() * 0.005);
		this.setSaldo(juros);
	}
}
