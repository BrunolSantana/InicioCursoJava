import java.util.Scanner;

public class EstruturasLogicasEx2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;

		System.out.println("Informe outro n�mero");
		n1 = sc.nextInt();
		
		if(n1>0) {
			System.out.println("� positivo");
		}
		else if(n1==0) {
			System.out.println("� nulo");
		}
		else {
			System.out.println("� negativo");
		}
			
		sc.close();

	}

}
