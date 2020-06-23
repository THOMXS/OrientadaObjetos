package Controle;
import java.util.ArrayList;

import Apresentacao.PessoaApresentacao;
import Modelo.Pessoa;
import Modelo.Ator;
import Modelo.Direcao;

public class PessoaControle {
	
	public PessoaApresentacao pessoaApresentacao = new PessoaApresentacao();
	public ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

	public void adicionaPessoa(Pessoa pessoa) {

		if(pessoa instanceof Ator) {
			pessoaApresentacao.cadastraAtor(pessoa);
		}
		
		if(pessoa instanceof Direcao) {
			pessoaApresentacao.cadastraDirecao(pessoa);
		}
		
		listaPessoa.add(pessoa);
		
	}
	
	public void adicionaAtor() {
		Ator ator = new Ator();
		adicionaPessoa(ator);
	}
	
	public void adcionaDirecao() {
		Direcao direcao = new Direcao();
		adicionaPessoa(direcao);
	}
	
	public Pessoa selecionaPessoa() {
		int id = 0;

		String[] aux = new String[listaPessoa.size()];

		for (int i = 0; i < listaPessoa.size(); i++) {

			if(listaPessoa.get(i) instanceof Ator) {
				aux[i] = listaPessoa.get(i).getNomePessoa();
			}
			
			if(listaPessoa.get(i) instanceof Direcao) {
				aux[i] = listaPessoa.get(i).getNomePessoa();
			}
			
		}
		
		 id = pessoaApresentacao.selecionaPessoa(aux);
		return listaPessoa.get(id);
	}
}

