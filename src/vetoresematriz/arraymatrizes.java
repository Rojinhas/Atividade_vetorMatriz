package vetoresematriz;

import java.util.Scanner;

public class arraymatrizes {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0, linha = 0, coluna = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < matriz.length; linha++) {

			for (coluna = 0; coluna < matriz.length; coluna++) {

				System.out.println("Digite o numero da posição: (" + linha + "," + coluna + "): ");
				matriz[linha][coluna] = leia.nextInt(); // Guardar infos -> []
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			somaPrincipal = somaPrincipal + matriz[i][i];
			diagonalPrincipal = diagonalPrincipal + matriz[i][i] + " ";
		}

		for (int i = 0; i < matriz.length; i++) {
			somaSecundaria = somaSecundaria + matriz[i][matriz.length - 1 - i];
			diagonalSecundaria = diagonalSecundaria + matriz[i][matriz.length - 1 - i] + " ";

		}

		System.out.println("\n\nSoma de todos Elementos da Diagonal Principal:\n");
		System.out.println(somaPrincipal);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Secundária:\n");
		System.out.println(somaSecundaria);

		System.out.println("\n\nElementos da Diagonal Principal:\n");
		System.out.println(diagonalPrincipal);

		System.out.println("\n\nElementos da Diagonal Secundária:\n");
		System.out.println(diagonalSecundaria);
		leia.close();
	}
}