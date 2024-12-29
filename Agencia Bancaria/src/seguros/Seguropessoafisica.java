package seguros;

import contas.Conta;

public class Seguropessoafisica extends Conta {

	public static void main(String[] args) {
		Seguropessoafisica cc3 = new Seguropessoafisica();
		cc3.setCliente ("Robson Ramund");
		cc3.setSaldo (9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();	
	}

}
