package Apresentacao;

import javax.swing.JOptionPane;

import Modelo.Midia;

public class MidiaApresentacao {
	
	public int selecionaMidia(String aux[] ) {
		return JOptionPane.showOptionDialog(null,
				"Escolha o tipo de Mídia:", "Midia", 1, -1, null, aux,
				null);
}
	public void cadastraMidia( Midia midia) {
		midia.setNomeMidia(JOptionPane.showInputDialog(null, 
				"Digite o nome da Midia:", "Midia",-1));
}
	public void listaCheia() {
		JOptionPane.showMessageDialog(null,
				"Limite de midias atingido!", "Midia", 1);
}
	
	public void listaVazia() {
		JOptionPane.showMessageDialog(null,
				"Tipo de Midia não cadastrado!", "Midia", 1);
}
	
}