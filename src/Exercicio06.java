import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Double valor;
		String cupom;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor : ");
		valor = sc.nextDouble();
		System.out.println("Digite o Cupom de Desconto : ");
		cupom = sc.next();
		
		if (cupom.equalsIgnoreCase("DIADEFESTA")) {
			valor = valor - (valor*0.03);
			System.out.println("Valor Total a Pagar : "+ valor);
		}else {
			System.out.println("Valor Total a Pagar : "+ valor);
		}
		sc.close();

	}

}
