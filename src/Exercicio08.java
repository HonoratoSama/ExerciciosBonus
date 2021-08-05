import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		double media,nota;
		int i = 0,maior = 0, menor = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Professor, digite a média :");
		media = sc.nextDouble();
		while(i < 10) {
			System.out.println("Favor digitar a nota do aluno: ");
			nota = sc.nextDouble();
			i = i + 1;
			if (nota < media) {
				menor = menor + 1;
			}else {
				maior = maior + 1;
			}
		}
		System.out.println("Alunos acima da média : "+ maior + " Alunos abaixo da media : " + menor);
		sc.close();

	}

}
