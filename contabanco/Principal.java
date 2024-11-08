package contabanco;

public class Principal {
	public static void main(String[] args) {
		/*
		 * O Banco do Brasil agora trabalha com investimentos em títulos do tesouro direto, que possuem 
		 * rendimentos superiores aos da poupança, no valor de 1% ao mês, no entanto só é permitido depósitos 
		 * acima de 1000 reais. Utilizando como base as classes da questão 1, modele a classe ContaTesouroDireto 
		 * herdando da classe ContaPoupança. Após finalizar a modelagem siga os seguintes passos:
		 */
		
		
		// Para criar uma array do tipo Conta e entar acessar métodos das subclasses alocados em 
		//elementos do array, estes métodos não irão funcionar, apenas os métodos herdados.
		
		//Crie um array de ContaPoupança de 10 posições
		Conta[] contas = new Conta[10];
		
		//Instancie um objeto ContaTesouroDireto com seu número e saldo inicial de 10000 reais e 
		//ponha esse objeto na primeira posição do array
		ContaTesouroDireto contaTD = new ContaTesouroDireto("001", 10000);
		contas[0] = contaTD;
		
		//Instancie um objeto ContaPoupanca com seu número e saldo inicial de 10000 reais e ponha esse objeto na segunda posição do array
		ContaPoupanca contaP = new ContaPoupanca("002", 10000);
		contas[1] = contaP;
		
		//Acesse a primeira posição do array e imprima na tela o saldo dessa conta
		System.out.println("Saldo da conta Tesouro Direto: R$" + String.format("%.2f", contas[0].getSaldo()));
		System.out.println();
		
		//Acesse a segunda posição do array e imprima na tela o saldo dessa conta
		System.out.println("Saldo da conta Poupança: R$" + String.format("%.2f", contas[1].getSaldo()));
		System.out.println();
		
		//Deposite o valor de 500  reais na conta da primeira posição do array
		contas[0].deposito(500);
		
		//Acesse a primeira posição do array e imprima na tela o saldo dessa conta
		System.out.println("Saldo da conta Tesouro Direto: R$" + String.format("%.2f", contas[0].getSaldo()));
		System.out.println();
		
		//Deposite o valor de 500  reais na conta da segunda posição do array
		contas[1].deposito(500);
		
		//Acesse a segunda posição do array e imprima na tela o saldo dessa conta
		System.out.println("Saldo da conta Poupança: R$" + String.format("%.2f", contas[1].getSaldo()));
		System.out.println();
		
		//Aplique os juros mensais na conta da primeira posição do array
		contas[0].render();
		
		//Acesse a primeira posição do array e imprima na tela o saldo dessa conta
		System.out.println("Saldo da conta Tesouro Direto: R$" + String.format("%.2f", contas[0].getSaldo()));
		System.out.println();
		
		//Aplique os juros mensais na conta da segunda posição do array
		contas[1].render();
		
		//Acesse a segunda posição do array e imprima na tela o saldo dessa conta
		System.out.println("Saldo da conta Poupança: R$" + String.format("%.2f", contas[1].getSaldo()));
		System.out.println();
	}
}
