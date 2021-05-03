import java.util.Scanner;

public class FunçõesMatemáticas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	 double x = 9.0;
	 double y = 4.0;
	 double A, B, C;
	 
	 A = Math.sqrt(x);
	 B = Math.sqrt(y);
	 C = Math.sqrt(25.0);
	 
	 System.out.println("Raiz quadrada de " + x + " = " + A);
	 System.out.println("Raiz quadrada de " + y + " = " + B);
	 System.out.println("Raiz quadrada de 25 = " + C);
	 		
		
	 sc.close();
	}

}
