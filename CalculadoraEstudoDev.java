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
		
		System.out.println("Ol�! O que deseja calcular?");
		System.out.println("[1] - Opera��es b�sicas");
		System.out.println("[2] - Potencia��o");
		System.out.println("[3] - Raiz Quadrada");
		System.out.println("[4] - Par ou �mpar?");
		System.out.println("[5] - Divisibilidade | 3");
		System.out.println("[0] - Sair");
		op = sc.nextInt();
		
		switch (op) {
		case 1:
			System.out.print( '+' );
			System.out.print( '-' );
			System.out.print( '*' );
			System.out.println( '/' );
			System.out.println("Informe a opera��o desejada: ");
			op1 = sc.next().charAt(0);
			
			if('+'==soma) {
				System.out.println("Informe o primeiro n�mero: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo n�mero: ");
				n2 = sc.nextDouble();
				soma=n1+n2;
				System.out.println("Resultado da soma: "+ soma);
			}
			else if('-'==sub) {
				System.out.println("Informe o primeiro n�mero: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo n�mero: ");
				n2 = sc.nextDouble();
				sub=n1-n2;
				System.out.println("Resultado da subtra��o: "+ sub);
			}
			else if('*'==mult) {
				System.out.println("Informe o primeiro n�mero: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo n�mero: ");
				n2 = sc.nextDouble();
				mult=n1*n2;
				System.out.println("Resultado da Multiplica��o: "+ mult);	
			}
			else if('/'==div) {
				System.out.println("Informe o primeiro n�mero: ");
				n1 = sc.nextDouble();
				System.out.println("Informe o segundo n�mero: ");
				n2 = sc.nextDouble();
				div=n1/n2;
				System.out.println("Resultado da Divis�o: "+ div);
			}
			break;
		case 2:
			System.out.println("Digite o n�mero da base: ");
			n1 = sc.nextDouble();
			System.out.println("Digite o expoente: ");
			n2 = sc.nextDouble();
			P = Math.pow(n1,n2);
			System.out.println("O resultado da Pot�ncia de " + n1 +"elevado a "+ n2 +"="+ P);
			break;
		case 3:
			System.out.println("Digite um n�mero: ");
			x = sc.nextDouble();
			R = Math.sqrt(x);
			System.out.println("O resultado da Raiz Quadrada de " + x +"�"+ R);
			if(n1<0) {
				System.out.println("N�o � poss�vel extrair raiz quadrada de um n�mero negativo.");
			}
			break;
		case 4:
			System.out.println("Digite um n�mero: ");
			if(n1%2==0){
				System.out.println("� par!");
			} 
			else {
				System.out.println("� impar!");
			}
			break;
		case 5:
			System.out.println("Digite um n�mero");
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
