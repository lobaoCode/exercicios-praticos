package br.com.desafio.lobao.exercicio;

import br.com.desafio.lobao.exercicio.intf.IExercicio02;

public class Exercicio02 implements IExercicio02 {

	@Override
	public int[] ordenarBubbleSort(int[] pLista) {
		for (int i = 0; i < pLista.length - 1 ; i++) {
			for (int j = 0; j < pLista.length - 1; j++) {
				if(pLista[j] > pLista[j + 1]) {
					int valorPivo = pLista[j];
					pLista[j] = pLista[j + 1];
					pLista[j + 1] = valorPivo;
				}
			}
		}
		return pLista;
	}

	@Override
	public void imprimir(int[] pLista) {
		for (int valor : pLista) {
			System.out.print("|" + valor);
		}
		System.out.println("|");
	}
	
	
}
