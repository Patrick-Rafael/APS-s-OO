
import java.util.Calendar;

class Data {

	private int dia ;
 	private int mes ;
	private int ano ;
	
	
	//Construtor Com Parametros
	public Data (int dia, int mes, int ano) {
		
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
				
		}			
		//Faz o metodo toString para formatar a data de acordo com as especificações.
		public String toString() {
			return this.dia + "/" + this.mes + "/" + this.ano;
		} 
		
		//Contrutor sem parametros
		public Data() {
			Calendar c = Calendar.getInstance();
			this.dia = c.get(Calendar.DAY_OF_MONTH);
			this.mes= c.get(Calendar.MONTH) +1;
			this.ano = c.get(Calendar.YEAR);
			
		}
		
	
		//Gets E Sets
		public int getDia() {
			return (int) dia;
		}
		
		public void setDia(int dia ) {
			this.dia = dia;
			
		}
		
		public int getMes() {
			return mes;
		}
		
		public void setMes(int mes ) {
			this.mes = mes;
			
		}
		public int getAno() {
			return ano;
		}
		
		public void setAno(int ano ) {
			this.ano = ano;
			
		}
		
		// Função para passar o dia 
		public void passaDia() {
			dia++;
			if(dia > 31) {
				dia = 1; mes++;
				
			if(mes > 12) {
				mes = 1; ano++;
			}
			
		}
	}
		
}
