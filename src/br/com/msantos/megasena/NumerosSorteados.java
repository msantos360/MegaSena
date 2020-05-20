package br.com.msantos.megasena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumerosSorteados {

	private ArrayList<Integer> numerosSorteados;
	
	/*Construtor da classe instancia um novo objeto ArrayList de números inteiros
	 * e executa o método privado para gerar os números Sorteados*/
	public NumerosSorteados() {		
		numerosSorteados = new ArrayList<Integer>();		
		sorteiaNumerosAleatorios();
	}
	
	public void clearNumerosAleatorios() {
		numerosSorteados.clear();
	}
	
	private void sorteiaNumerosAleatorios() {
		
		/*Um objeto do tipo Random é instanciado para gerar os números aleatórios*/
		Random gerador = new Random();
		
		/*Laço intera sobre o array e add os números gerados entre 1 e 60
		 * até que a 6 posições sejam preenchidas*/
		while ( numerosSorteados.size() < 6) {
			
			int numeroGerado = gerador.nextInt(60);
			
			if(numeroGerado != 0) {
				
				/*Não permite números duplicados*/
				if(!this.numerosSorteados.contains(numeroGerado)) {
					this.numerosSorteados.add(numeroGerado);				
				}
			}
		}
	}
	
	/*Método retorna o array preenchido e ordenado*/
	public ArrayList<Integer> getNumerosSorteado(){
		
		Collections.sort(this.numerosSorteados);
		return this.numerosSorteados;		
	}
	
}
