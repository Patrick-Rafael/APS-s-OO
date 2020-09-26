
public class Mais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chama o metodo data para alocar uma nova data
		Data data = new Data(25,12,2077);
		//Data que foi Pré colocada
		System.out.println("-----------------------------------------------");	
		System.out.println("O dia que você escolheu é: " + data.toString());
		System.out.println("-----------------------------------------------");

		data.passaDia();
		//Mostra o dia seguinte ao escolhido
		System.out.println("-----------------------------------------------");
		System.out.println("E o dia seguinte é: " + data.toString());
		System.out.println("-----------------------------------------------");

		
		Data dataHojeSemParametros = new Data();
		//Data do dia atual caso o usuario não coloque uma data especifica
		System.out.println("-----------------------------------------------");
		System.out.println("E hoje é dia : "+ dataHojeSemParametros.toString());
		System.out.println("-----------------------------------------------");

		// O dia seguinte ao dia pego pelo sistema 
		dataHojeSemParametros.passaDia();
		System.out.println("-----------------------------------------------");
		System.out.println("E o dia de amanhã será : "+ dataHojeSemParametros.toString());
		System.out.println("-----------------------------------------------");

		
		
	}
}	
		