import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args){
		//instanciar la clase
		Scanner sc= new Scanner(System.in);
		//
		System.out.println("Escribe el numero a evaluar");	
		//captar el numero evaluado
		int numeroEvaluado = sc.nextInt();
		//cierra proceso de escuchar
		sc.close();
		//valoracion por ternario
		String resultado = (numeroEvaluado % 2 == 0)? "Es par":"Es impar";
		System.out.println(resultado);	
		
	}

}
