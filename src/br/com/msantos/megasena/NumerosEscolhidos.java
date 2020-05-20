package br.com.msantos.megasena;

import java.util.ArrayList;

public class NumerosEscolhidos {

	private ArrayList<Integer> numerosEscolhidos;
	
	private int contador;
	
	public NumerosEscolhidos() {
		numerosEscolhidos = new ArrayList<Integer>();
	}
	
	public void adicionaNumero(Integer i) {
		
		this.numerosEscolhidos.add(i);
	}

	public ArrayList<Integer> getNumerosEscolhidos() {
		return numerosEscolhidos;
	}
	
	public void clearNumerosEscolhidos() {
		numerosEscolhidos.clear();
	}

	public String getConfereJogo(ArrayList<Integer> numerosSorteado) {
		
		contador = 0;
		
		for (int i = 0 ; i < 6 ; i ++) {
			
			/*Confere se há números sorteados que são iguais aos escolhidos*/
			if(numerosSorteado.contains(this.numerosEscolhidos.get(i))) {
				contador ++;
			}
		}
		
		return String.valueOf(contador);
	}
	
}
