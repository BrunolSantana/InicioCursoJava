import java.util.Scanner;

public class CalculadoraEx1 {

	public static void main(String[] args) {
		double n1, n2;
		double A;
		double soma, sub, mult, div;
		int op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique a operação!");
		System.out.println("[1] - Adição");
		System.out.println("[2] - Subtração");
		System.out.println("[3] - Multiplcação");
		System.out.println("[4] - Divisão");
		System.out.println("[5] - Potenciação");
		System.out.println("[6] - Raiz Quadrada");
		System.out.println("[7] - Par ou Ímpar");
		System.out.println("[8] - Será que é divisível por 3?");
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
				System.out.println("A subtração de "+ n1 + " - " + n2+ " = " + sub);
				break;
			case 3:
				mult = n1*n2;
				System.out.println("A multiplicação de "+ n1 + " x " + n2+ " = " + mult);
				break;
			case 4:
				div = n1/n2;
				System.out.println("A divisão de "+ n1 + " / " + n2+ " = " + div);
				break;	
			case 5:
				A = Math.pow(n1,n2);
				System.out.println("O resultado da poteciação é: " + A);
				break;
			case 6:
				A = Math.sqrt(n1);
				System.out.println("O resultado da raiz quadrada é: " + A);
				if(n1<0) {
					System.out.println("Não é possível extrair raiz quadrada de um número negativo.");
				}
				break;
			case 7:
				if(n1%2==0){
					System.out.println("é par!");
				} 
				else {
					System.out.println("é impar!");
				}
				break;
			case 8:
				if(n1%3==0){
					System.out.println("é um número divisível por 3!");
				}
				break;
			default:
				System.out.println("Informe a opção correta.");
		
		}
		
		sc.close();
		
	}

}

