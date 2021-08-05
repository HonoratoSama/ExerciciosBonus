import java.util.Random;
import java.util.Scanner;

public class JogoDeDados {

	public static void main(String[] args) {
		int dado1 = 0, dado2 = 0, opcao = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		while(opcao != 1) {
			System.out.println("Digite 0 para rodar os dados ou 1 para Sair");
			opcao = sc.nextInt();
			dado1 = rd.nextInt(7);
			dado2 = rd.nextInt(7);
			switch(opcao) {
			case 0:
				if(dado1 == 0) {
					dado1++;
				}
				if(dado2 == 0) {
					dado2++;
				}
				if(dado1 == dado2) {
					System.out.println("<<<<< PARABENS, VOCÊ CONSEGUIU UM DUPLO: "+ dado1 +" >>>>>");
				}else {				
					System.out.println("O resultado do 1º dado é: " + dado1 + " e do 2º dado é: "+ dado2);
					  }
				break;
			case 1:
				System.out.println("<<<< SAINDO DO JOGO >>>>");
				break;
			default:
				System.out.println("FAVOR DIGITAR UM VALOR ENTRE 0 E 1");
				break;
			}
		}
		sc.close();
	}

}
