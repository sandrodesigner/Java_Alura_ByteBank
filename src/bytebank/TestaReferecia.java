package bytebank;

public class TestaReferecia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta  =  primeiraConta;
		
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		System.out.println("___________________________________________");
		
		segundaConta.saldo += 100;
		System.out.println("saldo da primeira conta " + segundaConta.saldo);
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			
			System.out.println("SÃO AS MESMISSIMAS CONTAS!");
		}else {
			
			System.out.println("São contas diferentes!");
		}
		
	}
}
