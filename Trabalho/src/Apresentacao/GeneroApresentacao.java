package Apresentacao;

import javax.swing.JOptionPane;
import Modelo.Genero;

public class GeneroApresentacao {
	
	public int selecionaGenero(String aux[]) {
		return JOptionPane.showOptionDialog(null,
				"Escolha o g�nero do filme:", "Genero", 1, -1, null, aux,
				null);
	}

	public void cadastraGenero(Genero genero) {
		genero.setNomeGenero(JOptionPane.showInputDialog(null,
				"Digite o nome da genero:", "Genero", -1));
	}

	public void listaCheia() {
		JOptionPane.showMessageDialog(null,
				"Limite de filmes e g�neros excedido!", "Genero", 1);
	}

	public void listaVazia() {
		JOptionPane.showMessageDialog(null,
				"Fimes e generos n�o cadastrados!", "Genero", 1);
	}
}
