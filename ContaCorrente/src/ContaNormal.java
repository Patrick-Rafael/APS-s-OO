
public class ContaNormal {
	
	private double deposito;
	private double saque;
	protected double saldo = 0;
   
    
	public double getDepositar() {
		return deposito;
	}
	public void setDepositar(double depositar) {
		this.deposito = depositar;
	}
	
	public double getSacar() {
		return saque;
	}
	public void setSacar(double sacar) {
		this.saque = sacar;
	} 
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	 public double getSacar(double sacar){
        return  saldo=saldo - (sacar * 0.05) - sacar ;

     }
	
	  public double getDepositar(double deposito){
        return saldo = saldo + deposito;

      }
	
	
	
}
