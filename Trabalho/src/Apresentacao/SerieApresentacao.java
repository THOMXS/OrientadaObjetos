package Apresentacao;

import javax.swing.JOptionPane;

import Modelo.Serie;

public class SerieApresentacao{

	public int selecionaSerie( String aux[]) {
		return JOptionPane.showOptionDialog(null,
			"Escolha a Serie:", "Serie", 1, -1,
null, aux,
			null);
}

	public void cadastraSerie( Serie serie) {
		serie.setNomeSerie(JOptionPane.showInputDialog(null,
			"Digite o nome da Serie:", "Serie", -1));
}

	public void listaCheia() {
		JOptionPane.showMessageDialog(null,
				"Limite de Series atingido!", "Serie", 1);
}
	
	public void listaVazia() {
		JOptionPane.showMessageDialog(null,
				"Serie não cadastrada!", "Serie", 1);
}
	
}