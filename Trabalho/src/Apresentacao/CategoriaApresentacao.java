
package Apresentacao;

import javax.swing.JOptionPane;

import Modelo.Categoria;

public class CategoriaApresentacao {
	
	public int selecionaCategoria(String aux[] ) {
		return JOptionPane.showOptionDialog(null,
				"Escolha a Categoria:", "Categoria", 1, -1, null, aux,
				null);
}
	public void cadastraCategoria( Categoria categoria) { 
		categoria.setNomeCategoria (JOptionPane.showInputDialog(null, 
				"Digite a Categoria:", "Categoria",-1));
}
	public void listaCheia() {
		JOptionPane.showMessageDialog(null,
				"Limite de Categorias cadastradas atingido!", "Categoria", 1);
}
	
	public void listaVazia() {
		JOptionPane.showMessageDialog(null,
				"Categoria não cadastrada!", "Categoria", 1);
}
	
}