package br.com.desafio.lobao.exercicio;

import br.com.desafio.lobao.exercicio.intf.IExercicio04;

public class Exercicio04 implements IExercicio04{

	@Override
	public int somarMultiplos3e5(int pValor) {
		int resultado = 0;
		for (int i = 0; i < pValor; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				resultado += i;
			}
		}
		return resultado;
	}
}
