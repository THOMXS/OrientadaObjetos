package Apresentacao;
import javax.swing.JOptionPane;


import Modelo.Pessoa;
public class PessoaApresentacao {

//	public void cadastraUsuario(Pessoa pessoa) {
//		pessoa.setNomePessoa(JOptionPane.showInputDialog(null,
//				"Usuário:", "USUARIO", -1));
//	}
//	
	public void cadastraAtor(Pessoa pessoa) {
			pessoa.setNomePessoa(JOptionPane.showInputDialog(null,
				"Ator:", "ATOR", -1));
	}
	public void cadastraDirecao(Pessoa pessoa) {
		pessoa.setNomePessoa(JOptionPane.showInputDialog(null,
				"Direcao:", "DIRECAO", -1));
}

	public int selecionaPessoa(String aux[]) {
		return JOptionPane.showOptionDialog(null,
				"Selecione:", "CADASTRO", 1, -1, null, aux,
				null);
	}

	public void listaCheia() {
		JOptionPane.showMessageDialog(null,
				"Limite de cadastro ultrapassados!", "CADASTRO", 1);
	}

	public void listaVazia() {
		JOptionPane.showMessageDialog(null,
				"Nenhum cadastro encontrado!", "CADASTRO", 1);
	}
}
