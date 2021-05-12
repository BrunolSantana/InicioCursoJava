import java.util.Scanner;

public class CalculadoraEstudoDev {

	public static void main(String[] args) {
		double n1 = 0, n2 = 0;
		double soma = 0, sub = 0, mult = 0, div = 0;
		double x = 0;
		double R = 0, P = 0;
		 
		R = Math.sqrt(x);
		P = Math.pow(n1, n2);
		
		char op1;
		
		int op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! O que deseja calcular?");
		System.out.println("[1] - Operações básicas");
		System.out.println("[2] - Potenciação");
		System.out.println("[3] - Raiz Quadrada");
		System.out.println("[4] - Par ou Ímpar?");
		System.out.println("[5] - Divisibilidade | 3");
		System.out.println("[0] - Sair");
		op = sc.nextInt();
		
		switch (op) {
		case 1:
			System.out.print( '+' );
			System.out.print( '-' );
			System.out.print( '*' );
			System.out.println( '/' );
			System.out.println("Informe a operação desejada: ");
			op1 = sc.next().charAt(0);
			
			if('+'==soma) {
				System.out.println("Informe o primeiro número: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo número: ");
				n2 = sc.nextDouble();
				soma=n1+n2;
				System.out.println("Resultado da soma: "+ soma);
			}
			else if('-'==sub) {
				System.out.println("Informe o primeiro número: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo número: ");
				n2 = sc.nextDouble();
				sub=n1-n2;
				System.out.println("Resultado da subtração: "+ sub);
			}
			else if('*'==mult) {
				System.out.println("Informe o primeiro número: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo número: ");
				n2 = sc.nextDouble();
				mult=n1*n2;
				System.out.println("Resultado da Multiplicação: "+ mult);	
			}
			else if('/'==div) {
				System.out.println("Informe o primeiro número: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo número: ");
				n2 = sc.nextDouble();
				div=n1/n2;
				System.out.println("Resultado da Divisão: "+ div);
			}
			break;
		case 2:
			System.out.println("Digite o número da base: ");
			n1 = sc.nextDouble();
			System.out.println("Digite o expoente: ");
			n2 = sc.nextDouble();
			P = Math.pow(n1,n2);
			System.out.println("O resultado da Potência de " + n1 +"elevado a "+ n2 +"="+ P);
			break;
		case 3:
			System.out.println("Digite um número: ");
			x = sc.nextDouble();
			R = Math.sqrt(x);
			System.out.println("O resultado da Raiz Quadrada de " + x +"é"+ R);
			if(n1<0) {
				System.out.println("Não é possível extrair raiz quadrada de um número negativo.");
			}
			break;
		case 4:
			System.out.println("Digite um número: ");
			if(n1%2==0){
				System.out.println("é par!");
			} 
			else {
				System.out.println("é impar!");
			}
			break;
		case 5:
			System.out.println("Digite um número");
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
