package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Pessoa P;
		P = new Pessoa();
		System.out.println("Informe seu nome: ");
		P.nome = ler.nextLine();
		System.out.println("Informe sua idade: ");
		P.idade = ler.nextInt();
		System.out.println("Sua idade atual é: " + P.getIdade());
		P.fazAniversario();
		System.out.println(P.getIdade());
	}

}
