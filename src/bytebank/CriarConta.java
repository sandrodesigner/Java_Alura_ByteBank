package bytebank;

public class CriarConta {
	
 public static void main(String[] args) {
	
	 Conta primeiraConta;
	 
	 primeiraConta = new Conta();
	 
	 primeiraConta.saldo = 300;
	 
	 System.out.println("Seu saldo é " + primeiraConta.saldo);
	 
	 primeiraConta.saldo += 100;
	 
	 System.out.println("Agora eu saldo é " + primeiraConta.saldo);
	 
	 System.out.println("_____________________________________________");
	 
	 Conta segundaConta = new Conta();
	 
	 segundaConta.saldo = 50;
	 
	 System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
	 
	 
}
}
