import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		int escolha = 0, randomico = 0;
		String voce, pc;
		
		Scanner sc = new Scanner(System.in);
		
		Random rando = new Random();
		
		while(escolha != 3) {
			randomico = rando.nextInt(3);
			System.out.println("Digite 0 para Pedra,1 para Papel, 2 para Tesoura ou 3 para Sair");
			escolha = sc.nextInt();
		switch(escolha) {
		case 0:
			voce = "PEDRA";
			if (randomico == 0) {
				pc = "PEDRA";
				System.out.println("EMPATE, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc );
			}else if(randomico == 1) {
				pc = "PAPEL";
				System.out.println("PERDEU, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}else {
				pc = "TESOURA";
				System.out.println("VENCEU, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}
			break;
		case 1:
			voce = "PAPEL";
			if (randomico == 0) {
				pc = "PEDRA";
				System.out.println("VENCEU, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}else if(randomico == 1) {
				pc = "PAPEL";
				System.out.println("EMPATE, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}else {
				pc = "TESOURA";
				System.out.println("PERDEU, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}
			break;
		case 2:
			voce = "TESOURA";
			if (randomico == 0) {
				pc = "PEDRA";
				System.out.println("PERDEU, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}else if(randomico == 1) {
				pc = "PAPEL";
				System.out.println("VENCEU, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}else {
				pc = "TESOURA";
				System.out.println("EMPATE, VOCÊ ESCOLHEU " + voce + " E O PC ESCOLHEU " + pc);
			}
			break;
		case 3:
			System.out.println("##### SAINDO DO JOGO #####");
			break;
		default:
			System.out.println("Digite um valor entre 0 e 3");
			break;
		}
		}
		sc.close();
	}

}
