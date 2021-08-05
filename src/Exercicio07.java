import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (i != 1238) {
			System.out.println("Digite a quantidade de feijões do jarro : ");
			i = sc.nextInt();
		}
		System.out.println("Acertou !!");
		sc.close();

	}

}
