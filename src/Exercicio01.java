import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int anoNasc;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Ano de Nascimento: ");
		anoNasc = sc.nextInt();
		
		System.out.println("Você tem " + (2021-anoNasc) + " Anos");
		sc.close();
	}

}
