import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int cm;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Distancia : ");
		cm = sc.nextInt();
		
		if (cm < 70) {
			System.out.println("Status da Arma : ATIVADO");
		}else {
			System.out.println("Status da Arma : DESATIVADO");
		}
		sc.close();

	}

}
