import java.util.Scanner;

public class QuatroOpera��esMatem�ticas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.println("Digite o primeiro n�mero:");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero:");
		n2 = entrada.nextDouble();
		
		double resultado1 = n1+n2;
		double resultado2 = n1-n2;
		double resultado3 = n1*n2;
		double resultado4 = n1/n2;
		
		System.out.println("A soma de "+ n1 + " + " + n2+ " = " + resultado1);
		System.out.println("A subtra��o de "+ n1 + " - " + n2+ " = " + resultado2);
		System.out.println("A multiplica��o de "+ n1 + " x " + n2+ " = " + resultado3);
		System.out.println("A divis�o de "+ n1 + " / " + n2+ " = " + resultado4);
		
		entrada.close();		

	}

}
