package Apresentacao;

import javax.swing.JOptionPane;

import Modelo.Filme;

public class FilmeApresentacao {
	
	public void cadastraFilme(Filme filme) {
		String nome = JOptionPane.showInputDialog(null,
				"Digite o nome do filme:", "Filme", -1);
		try {
			
			if(!((nome.startsWith(" ") == true || nome.endsWith(" ") == true
				|| nome.isEmpty() == true))) {
			nome = nome.toUpperCase();
			filme.setNomeFilme(nome);
			
		} else {
			JOptionPane.showMessageDialog(null, "Nome inserido não é válido!",
					"Filme", 1);
			

		}
		}catch(Exception e){
			//error 
		}
	}
	
		public void mostraPesquisaFilme(String mensagem) {
			if (mensagem.isEmpty() == false) {
				JOptionPane.showMessageDialog(null, mensagem, "Filme", 1);
			}
		}

		public void listaCheia() {
			JOptionPane.showMessageDialog(null, "Limite de filmes excedido!",
					"Filme", 1);
		}

		public void listaVazia() {
			JOptionPane.showMessageDialog(null, "Filmes não cadastrados!",
					"Filme", 1);
		}
	
	}

