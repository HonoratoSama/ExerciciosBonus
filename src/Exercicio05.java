import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int p1, p2, p3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o peso do primeiro lixo : ");
		p1 = sc.nextInt();
		
		System.out.println("Informe o peso do segundo  lixo : ");
		p2 = sc.nextInt();
		
		System.out.println("Informe o peso do terceiro lixo : ");
		p3 = sc.nextInt();

		if (p1 < p2) {
			if (p1 < p3) {
				System.out.println("Peso carregado : " + p1);
			}else {
				System.out.println("Peso carregado : " + p3);
			}
		}else if (p2 < p3) {
			System.out.println("Peso carregado : " + p2);
		}else {
			System.out.println("Peso carregado : " + p3);
		}
		sc.close();
	}

}
