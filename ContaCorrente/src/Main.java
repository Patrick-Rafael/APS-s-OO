import java.text.DecimalFormat;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formato = new DecimalFormat("0.00");

		
		ContaNormal conta = new ContaNormal();

		System.out.println("Seu saldo atual � de : " +conta.getSaldo());
		System.out.println("----------------------------------------------------");

		
		conta.getDepositar(100);
		System.out.println("Voc� depositou: " +conta.getSaldo() + " R$" + " na sua conta." );
		
		conta.getSacar(20);
		System.out.println("O seu saldo atual � de : "  + conta.getSaldo()+"R$");

		
		System.out.println("----------------------------------------------------");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.getDepositar(50);
		System.out.println("Voc� depositou: "  + contaEspecial.getSaldo() + "R$");
		
		contaEspecial.getSacar(20);
		System.out.println("O seu saldo atual com a conta especial � de: " + formato.format(contaEspecial.getSaldo()) + "R$");
		
		System.out.println("----------------------------------------------------");

		
		
	}

}
