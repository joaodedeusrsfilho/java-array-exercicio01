package aula19_Arrays;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Criar um vetor A com 5 Elementos inteiros. 
		 * Construir um vetor B de Mesmo tipo e tamanho e com os mesmos
		 *  elementos do vetor A, ou seja, B[i] = A[i].*/
		Scanner ler = new Scanner(System.in);
		int [] vetorA = new int[5];
		int [] vetorB = new int [vetorA.length];
		
		for(int index=0;index<vetorA.length;index++) {
			System.out.println("digite o valor da posicao "+index);
			vetorA[index] = ler.nextInt();
			vetorB[index] = vetorA[index];
		}
		for(int index=0;index<vetorA.length;index++) {
			System.out.println("O valor do Vetor A na posicao "+index+" = "+vetorA[index]);
		}
		System.out.println();
		
		for(int index=0;index<vetorB.length;index++) {
			System.out.println("O valor do Vetor B na posicao "+index+" = "+vetorB[index]);
		}

	}

}
