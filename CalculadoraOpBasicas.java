import java.util.Scanner;

public class CalculadoraOpBasicas {

	public static void main(String[] args) {
		double n1, n2;
		double soma, sub, mult, div;
		int op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol�! O que deseja saber?");
		System.out.println("[1] - Adi��o");
		System.out.println("[2] - Subtra��o");
		System.out.println("[3] - Multiplica��o");
		System.out.println("[4] - Divis�o");
		op = sc.nextInt();
		
		System.out.println("Informe o primeiro valor:");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo valor");
		n2 = sc.nextDouble();
		
		switch (op) {
			case 1:
				soma = n1+n2;
				System.out.println("A soma de "+ n1 + " + " + n2+ " = " + soma);
				break;
			case 2:
				sub = n1-n2;
				System.out.println("A subtra��o de "+ n1 + " - " + n2+ " = " + sub);
				break;
			case 3:
				mult = n1*n2;
				System.out.println("A multiplica��o de "+ n1 + " x " + n2+ " = " + mult);
				break;
			case 4:
				div = n1/n2;
				System.out.println("A divis�o de "+ n1 + " / " + n2+ " = " + div);
				break;				
			default:
				System.out.println("Informe a op��o correta.");
		
		}
		
		sc.close();
		
	}

}
