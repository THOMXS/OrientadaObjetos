package Apresentacao;

import javax.swing.JOptionPane;
import Modelo.Genero;

public class GeneroApresentacao {
	
	public int selecionaGenero(String aux[]) {
		return JOptionPane.showOptionDialog(null,
				"Escolha o gênero do filme:", "Genero", 1, -1, null, aux,
				null);
	}

	public void cadastraGenero(Genero genero) {
		genero.setNomeGenero(JOptionPane.showInputDialog(null,
				"Digite o nome da genero:", "Genero", -1));
	}

	public void listaCheia() {
		JOptionPane.showMessageDialog(null,
				"Limite de filmes e gêneros excedido!", "Genero", 1);
	}

	public void listaVazia() {
		JOptionPane.showMessageDialog(null,
				"Fimes e generos não cadastrados!", "Genero", 1);
	}
}
