import java.util.Scanner;

import Calculando.Numero;



public class Calcu {
    public static void main(String[] args) {
    
    Numero numero = new Numero();
    Scanner sc =new Scanner(System.in);
    
        System.out.println("Informe um numero:"); 
        numero.n1 = sc.nextDouble();
        System.out.println("Digite o calculo que deseja para a operaçao ,+ , -, /, *, ^ para potencia, R raiz quadrada"); 
		numero.resul = sc.next();
        System.out.println("Informe o segundo numero:"); 
		numero.n2 = sc.nextDouble();

		double resultado = numero.calcular();

		System.out.println("Resultado: " + resultado);
	
    }
}
