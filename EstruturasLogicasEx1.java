import java.util.Scanner;

public class EstruturasLogicasEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Informe um número: ");
		n1 = sc.nextInt();
		
		if(n1%2==0){
			System.out.println("é par!");
		} 
		else {
			System.out.println("é impar!");
		}
		
		sc.close();
		
	}

}
