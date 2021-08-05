import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double hora;
		int    minuto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tempo do filme em minutos: ");
		minuto = sc.nextInt();
		hora = minuto / (double)60;
		
		System.out.println("o Filme tem " + hora + " horas");
		sc.close();

	}

}
