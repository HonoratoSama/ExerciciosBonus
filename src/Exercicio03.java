import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor para A: ");
		a = sc.nextInt();
		System.out.println("digite o valor para B: ");
		b = sc.nextInt();
		
		a = (a+b);
		b = (a-b);
		a = (a-b);
		
		System.out.println("A = "+ a + " B = " + b);
		sc.close();
	}

}
