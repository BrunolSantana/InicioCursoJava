import java.util.Scanner;

public class EstruturasLogicasEx2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;

		System.out.println("Informe outro número");
		n1 = sc.nextInt();
		
		if(n1>0) {
			System.out.println("é positivo");
		}
		else if(n1==0) {
			System.out.println("é nulo");
		}
		else {
			System.out.println("é negativo");
		}
			
		sc.close();

	}

}
