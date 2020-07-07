package Apresentacao;

import javax.swing.JOptionPane;

public class ConsoleApresentacao {
		
		public int mostraMenuInicial() {
			String aux = JOptionPane
					.showInputDialog(
							null,
							"1-Catálogo\n2-Filmes\n3-Séries\n4-Gêneros\n10-Sair\n\nDigite o numero correspondente a uma das opções:",
							"MENU", -1);
			int opcao = Integer.parseInt(aux);
			return opcao;
		}
		
		public int mostraControleRemoto() {
			String aux = JOptionPane
					.showInputDialog(
							null,
							"1-Voltar\n2-Pausar\n3-Passar\n10-Sair\n\nDigite o numero correspondente a uma das opções:",
							"", -1);
			int opcao = Integer.parseInt(aux);
			return opcao;
		}
		
}


