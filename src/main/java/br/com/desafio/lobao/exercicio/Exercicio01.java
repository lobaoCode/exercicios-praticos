package br.com.desafio.lobao.exercicio;

import br.com.desafio.lobao.exercicio.intf.IExercicio01;

public class Exercicio01 implements IExercicio01{
	
	private final int totalEleitores = 1000;
	private final int votosValidos = 800;
	private final int votosBrancos = 150;
	private final int votosNulos = 50;

	@Override
	public float percentualVotosValidos() {
		return (100 * votosValidos)/totalEleitores;
	}

	@Override
	public float percentualVotosBrancos() {
		return (100 * votosBrancos)/totalEleitores;
	}

	@Override
	public float percentualVotosNulos() {
		return (100 * votosNulos)/totalEleitores;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Porcentagem votos válidos: " + percentualVotosValidos() + "%");
		System.out.println("Porcentagem votos brancos: " + percentualVotosBrancos() + "%");
		System.out.println("Porcentagem votos nulos: " + percentualVotosNulos() + "%");
		
	}
	
	
}
