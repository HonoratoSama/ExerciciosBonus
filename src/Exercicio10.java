import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		String nome, setor, transporte;
		int placa;
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome Funcionario: ");
			nome = sc.next();

			System.out.println("Digite o Departamento do Funcionario: ");
			setor = sc.next();

			System.out.println("Informe o transporte utilizado pelo Funcionario: ");
			transporte = sc.next();
			
			switch(transporte) {
			case "CARRO":
				System.out.println("Digite o ultimo digito da placa: ");
				placa = sc.nextInt();
				switch(placa) {
				case 1:
					System.out.println("SEU DIA DE RODÍZIO É SEGUNDA-FEIRA");
					break;
				case 2:
					System.out.println("SEU DIA DE RODÍZIO É SEGUNDA-FEIRA");
					break;
				case 3:
					System.out.println("SEU DIA DE RODÍZIO É TERÇA-FEIRA");
					break;
				case 4:
					System.out.println("SEU DIA DE RODÍZIO É TERÇA-FEIRA");
					break;
				case 5:
					System.out.println("SEU DIA DE RODÍZIO É QUARTA-FEIRA");
					break;
				case 6:
					System.out.println("SEU DIA DE RODÍZIO É QUARTA-FEIRA");
					break;
				case 7:
					System.out.println("SEU DIA DE RODÍZIO É QUINTA-FEIRA");
					break;
				case 8:
					System.out.println("SEU DIA DE RODÍZIO É QUINTA-FEIRA");
					break;
				case 9:
					System.out.println("SEU DIA DE RODÍZIO É SEXTA-FEIRA");
					break;
				case 0:
					System.out.println("SEU DIA DE RODÍZIO É SEXTA-FEIRA");
					break;
				default:
					break;
				}
				break;
			case "ONIBUS":
				System.out.println("RODÍZIO NÃO SE APLICA");
				break;
			default:
				break;
			}
		}
		sc.close();
	}

}
