import java.util.Scanner;

public class ExemploFormulárioCadastro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite se CPF:");
		String CPF = entrada.nextLine();
		
		System.out.println("Informe sua idade:");
		int idade = entrada.nextInt();
		
		System.out.println("Informe sua altura:");
		Double altura = entrada.nextDouble();
		
		System.out.println();
		System.out.println("Confirme seus dados:");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		
		entrada.close();
	}

}
