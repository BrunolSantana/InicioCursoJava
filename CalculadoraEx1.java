import java.util.Scanner;

public class CalculadoraEx1 {

	public static void main(String[] args) {
		double n1, n2;
		double A;
		double soma, sub, mult, div;
		int op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique a opera��o!");
		System.out.println("[1] - Adi��o");
		System.out.println("[2] - Subtra��o");
		System.out.println("[3] - Multiplca��o");
		System.out.println("[4] - Divis�o");
		System.out.println("[5] - Potencia��o");
		System.out.println("[6] - Raiz Quadrada");
		System.out.println("[7] - Par ou �mpar");
		System.out.println("[8] - Ser� que � divis�vel por 3?");
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
			case 5:
				A = Math.pow(n1,n2);
				System.out.println("O resultado da potecia��o �: " + A);
				break;
			case 6:
				A = Math.sqrt(n1);
				System.out.println("O resultado da raiz quadrada �: " + A);
				if(n1<0) {
					System.out.println("N�o � poss�vel extrair raiz quadrada de um n�mero negativo.");
				}
				break;
			case 7:
				if(n1%2==0){
					System.out.println("� par!");
				} 
				else {
					System.out.println("� impar!");
				}
				break;
			case 8:
				if(n1%3==0){
					System.out.println("� um n�mero divis�vel por 3!");
				}
				break;
			default:
				System.out.println("Informe a op��o correta.");
		
		}
		
		sc.close();
		
	}

}

