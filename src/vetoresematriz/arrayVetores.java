package vetoresematriz;

import java.util.Scanner;

public class arrayVetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		boolean achou = false;

		System.out.println("Digite o número que deseja encontrar: ");
		int numeroProcurado = leia.nextInt();

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] == numeroProcurado) {
				achou = true;
				System.out.println("O numero " + numeroProcurado + "está localizado na posição: " + i);
				break;

			}
		}
		if (achou == false) {
			System.out.println("O numero não foi encontrado");
		}
	}

}
