package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		System.out.println("______________$***$_________________");
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(300);
		
		if(contaMarcela.transfere(300, contaDoPaulo)) {
			
			System.out.println("Tranferencia realizada com sucesso!");
			
		}else {
			
			System.out.println("Tranferencia não realizada");
		}
		
		System.out.println("Marcele seu saldo é de R$: " + contaMarcela.saldo);
		System.out.println("Paulo seu saldo é de R$: " + contaDoPaulo.saldo);
	}
}
