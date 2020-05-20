package br.com.msantos.megasena;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ambiente {

	public static void main(String[] args) {

		int larguraDoCampo = 25;
		int alturaDoCampo = 20;
		int posicaoDoCampo = 50;
		int posicaoDoCampoSorteado = 120;

		NumerosEscolhidos numerosEscolhidos = new NumerosEscolhidos();
		
		JFrame tela = new JFrame("Mega Sena");

		JLabel titulo = new JLabel("Escolha os números");
		
		titulo.setBounds(50, 10, 150, 30);

		JTextField campo1 = new JTextField();
		campo1.setBounds(30, posicaoDoCampo, larguraDoCampo, alturaDoCampo);

		JTextField campo2 = new JTextField();
		campo2.setBounds(60, posicaoDoCampo, larguraDoCampo, alturaDoCampo);

		JTextField campo3 = new JTextField();
		campo3.setBounds(90, posicaoDoCampo, larguraDoCampo, alturaDoCampo);

		JTextField campo4 = new JTextField();
		campo4.setBounds(120, posicaoDoCampo, larguraDoCampo, alturaDoCampo);

		JTextField campo5 = new JTextField();
		campo5.setBounds(150, posicaoDoCampo, larguraDoCampo, alturaDoCampo);

		JTextField campo6 = new JTextField();
		campo6.setBounds(180, posicaoDoCampo, larguraDoCampo, alturaDoCampo);
	

		JLabel ns = new JLabel("Números sorteados");
		ns.setBounds(50, 80, 150, 30);
		
		JTextField campoSorteado1 = new JTextField();
		campoSorteado1.setBounds(30, posicaoDoCampoSorteado, larguraDoCampo, alturaDoCampo);
		campoSorteado1.setEnabled(false);
		
		JTextField campoSorteado2 = new JTextField();
		campoSorteado2.setBounds(60, posicaoDoCampoSorteado, larguraDoCampo, alturaDoCampo);
		campoSorteado2.setEnabled(false);
		
		JTextField campoSorteado3 = new JTextField();
		campoSorteado3.setBounds(90, posicaoDoCampoSorteado, larguraDoCampo, alturaDoCampo);
		campoSorteado3.setEnabled(false);

		JTextField campoSorteado4 = new JTextField();
		campoSorteado4.setBounds(120, posicaoDoCampoSorteado, larguraDoCampo, alturaDoCampo);
		campoSorteado4.setEnabled(false);

		JTextField campoSorteado5 = new JTextField();
		campoSorteado5.setBounds(150, posicaoDoCampoSorteado, larguraDoCampo, alturaDoCampo);
		campoSorteado5.setEnabled(false);

		JTextField campoSorteado6 = new JTextField();
		campoSorteado6.setBounds(180, posicaoDoCampoSorteado, larguraDoCampo, alturaDoCampo);
		campoSorteado6.setEnabled(false);

		JLabel numeroDeAcertos = new JLabel();
		numeroDeAcertos.setBounds(40, 250, 200, 30);

		JButton btnReset = new JButton("Limpar");
		btnReset.setBounds(80, 200, 85, 20);
		
		JButton btnSorteio = new JButton("Sortear números");
		btnSorteio.setBounds(30, 160, 180, 30);

		btnSorteio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numerosEscolhidos.adicionaNumero(Integer.parseInt(campo1.getText()));
				numerosEscolhidos.adicionaNumero(Integer.parseInt(campo2.getText()));
				numerosEscolhidos.adicionaNumero(Integer.parseInt(campo3.getText()));
				numerosEscolhidos.adicionaNumero(Integer.parseInt(campo4.getText()));
				numerosEscolhidos.adicionaNumero(Integer.parseInt(campo5.getText()));
				numerosEscolhidos.adicionaNumero(Integer.parseInt(campo6.getText()));

				NumerosSorteados numerosSorteados = new NumerosSorteados();
				
				campoSorteado1.setText(numerosSorteados.getNumerosSorteado().get(0).toString());
				campoSorteado2.setText(numerosSorteados.getNumerosSorteado().get(1).toString());
				campoSorteado3.setText(numerosSorteados.getNumerosSorteado().get(2).toString());
				campoSorteado4.setText(numerosSorteados.getNumerosSorteado().get(3).toString());
				campoSorteado5.setText(numerosSorteados.getNumerosSorteado().get(4).toString());
				campoSorteado6.setText(numerosSorteados.getNumerosSorteado().get(5).toString());

				numeroDeAcertos.setText("Número de acertos: "
						+ numerosEscolhidos.getConfereJogo(numerosSorteados.getNumerosSorteado()));
				numerosSorteados.clearNumerosAleatorios();
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				numerosEscolhidos.clearNumerosEscolhidos();
				
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");
				campo4.setText("");
				campo5.setText("");
				campo6.setText("");
				
				campoSorteado1.setText("");
				campoSorteado2.setText("");
				campoSorteado3.setText("");
				campoSorteado4.setText("");
				campoSorteado5.setText("");
				campoSorteado6.setText("");
				
				numeroDeAcertos.setText("");
			}
		});

		tela.add(titulo);
		tela.add(campo1);
		tela.add(campo2);
		tela.add(campo3);
		tela.add(campo4);
		tela.add(campo5);
		tela.add(campo6);
		tela.add(campoSorteado1);
		tela.add(campoSorteado2);
		tela.add(campoSorteado3);
		tela.add(campoSorteado4);
		tela.add(campoSorteado5);
		tela.add(campoSorteado6);
		tela.add(ns);
		tela.add(numeroDeAcertos);
		tela.add(btnSorteio);
		tela.add(btnReset);

		tela.setSize(250, 300);
		tela.setLayout(null);
		tela.setVisible(true);
	}
}
