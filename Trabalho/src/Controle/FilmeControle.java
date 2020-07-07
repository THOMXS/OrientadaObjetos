package Controle;
import java.util.ArrayList;
import Modelo.Filme;
import Apresentacao.FilmeApresentacao;

public class FilmeControle {
	
	public FilmeApresentacao filmeApresentacao = new FilmeApresentacao();
	public ArrayList<Filme> listaFilme = new ArrayList<Filme>();
	
	//ajustar para n�o recadastrar filme
	public void adicionaFilme(Filme filme) {
		if(!listaFilme.contains(filme) || listaFilme.size() < 100) {
			listaFilme.add(filme);
		//return "Filme Adicionado!";
		}else {
			filmeApresentacao.listaVazia();
			//return "Filme J� Adicionado!";
		}
	}
	
	public void pesquisaFilme() {
		String nomeListaFilmes = "";
		for (int i = 0; i < listaFilme.size(); i++) {
			nomeListaFilmes = String.format(nomeListaFilmes
			+ "%s\n", listaFilme.get(i).getNomeFilme());
		}

		if (listaFilme.isEmpty() == false) {
			filmeApresentacao
					.mostraPesquisaFilme(nomeListaFilmes);
		} else {
			filmeApresentacao.listaVazia();
		}
	}

}
