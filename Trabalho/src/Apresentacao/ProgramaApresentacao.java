package Apresentacao;

import javax.swing.JOptionPane;

public class ProgramaApresentacao {
	
	//adicionar pessoas + usuários
	
	public int mostraMenuPrincipal() {
		String aux = JOptionPane
				.showInputDialog(
						null,
						"1-Menu Filme \n2-Menu Genero\n10-Sair\n\nDigite o numero correspondente a uma das opções:",
						"MENU PRINCIPAL", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}
	
	public int mostraMenuFilme() {
		String aux = JOptionPane
				.showInputDialog(
						null,
						"1-Adicionar novo filme\n2-Pesquisar filme\n\n10-Menu Principal\n\nDigite o numero correspondente a uma das opções:",
						"Filme", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}
	
	public int mostraMenuGenero() {
		String aux = JOptionPane
				.showInputDialog(
						null,
						"1-Atribuir genero ao filme atual\n2-Pesquisar filmes por genero\n\n10-Menu Principal\n\nDigite o numero correspondente a uma das opções:",
						"Genero", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}
	
}
