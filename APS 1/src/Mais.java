
public class Mais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chama o metodo data para alocar uma nova data
		Data data = new Data(25,12,2077);
		//Data que foi Pr� colocada
		System.out.println("-----------------------------------------------");	
		System.out.println("O dia que voc� escolheu �: " + data.toString());
		System.out.println("-----------------------------------------------");

		data.passaDia();
		//Mostra o dia seguinte ao escolhido
		System.out.println("-----------------------------------------------");
		System.out.println("E o dia seguinte �: " + data.toString());
		System.out.println("-----------------------------------------------");

		
		Data dataHojeSemParametros = new Data();
		//Data do dia atual caso o usuario n�o coloque uma data especifica
		System.out.println("-----------------------------------------------");
		System.out.println("E hoje � dia : "+ dataHojeSemParametros.toString());
		System.out.println("-----------------------------------------------");

		// O dia seguinte ao dia pego pelo sistema 
		dataHojeSemParametros.passaDia();
		System.out.println("-----------------------------------------------");
		System.out.println("E o dia de amanh� ser� : "+ dataHojeSemParametros.toString());
		System.out.println("-----------------------------------------------");

		
		
	}
}	
		