package br.com.desafio.lobao;

import java.math.BigInteger;

import br.com.desafio.lobao.exercicio.Exercicio01;
import br.com.desafio.lobao.exercicio.Exercicio02;
import br.com.desafio.lobao.exercicio.Exercicio03;
import br.com.desafio.lobao.exercicio.Exercicio04;

public class App {
	
	public static void main(String[] args) {
		execicio01();
		execicio02();
		execicio03();
		execicio04();
	}
	
	private static void execicio01() {
		new Exercicio01().imprimirDados();
	}
	
	private static void execicio02() {
		Exercicio02 exercicio02 = new Exercicio02();
		int[] lista = {2,6,8,9,5,3,1};
		lista = exercicio02.ordenarBubbleSort(lista);
		exercicio02.imprimir(lista);
	}
	
	private static void execicio03() {
		System.out.println(new Exercicio03().fatorial(new BigInteger("900")));
	}
	
	private static void execicio04() {
		System.out.println(new Exercicio04().somarMultiplos3e5(100));
	}
}
