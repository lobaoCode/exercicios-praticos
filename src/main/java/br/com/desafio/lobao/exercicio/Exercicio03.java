package br.com.desafio.lobao.exercicio;

import java.math.BigInteger;

import br.com.desafio.lobao.exercicio.intf.IExercicio03;

public class Exercicio03 implements IExercicio03{

	@Override
	public BigInteger fatorial(BigInteger pValor) {
		if (pValor.equals(new BigInteger("0"))) {
			return new BigInteger("1");
		} else {
			return pValor.multiply(fatorial(pValor.subtract(new BigInteger("1"))));
		}
	}

}
