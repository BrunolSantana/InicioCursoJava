import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o valor desejado: ");
		int mes = sc.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		default:
			System.out.println("Erro, digite novamente!");

		}
	}

}
