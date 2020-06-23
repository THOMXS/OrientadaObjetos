 package Controle;
import Modelo.Filme;
import Modelo.Genero;
import Apresentacao.ProgramaApresentacao;

public class ProgramaControle {

	ProgramaApresentacao programaApresentacao = new ProgramaApresentacao();
	FilmeControle filmeControle = new FilmeControle();
	GeneroControle generoControle = new GeneroControle();
		
	public ProgramaControle() {
		int op = 0;
		while (op != 10) {
			op = programaApresentacao.mostraMenuPrincipal();
			switch (op) {
			case 1:
				menuFilme();
				break;
			case 2: 
				menuGenero();
				break;
//			case 3:
//				menuStreaming();
//				break;
			}
		
		}
	
	}
	
	public void menuFilme() {
		int op = 0;
		while (op != 10) {
			op = programaApresentacao.mostraMenuFilme();
			switch (op) {
			case 1:
				adicionaFilme();
				break;
			case 2:
				pesquisaFilme();
				break;
			}
		}
	}
	
	public void menuGenero() {
		int op = 0;
		while (op != 10) {
			op = programaApresentacao.mostraMenuGenero();
			switch (op) {
			case 1:
				adicionaGenero();
				break;
			
			}
		}
}
	
	public void adicionaFilme() {
		Filme filme = new Filme();
		
		filmeControle.filmeApresentacao.cadastraFilme(filme);
		generoControle.adicionaGenero();
		
		Genero genero = generoControle.selecionaGenero();
		filme.setNomeGenero(genero);
		filmeControle.adicionaFilme(filme);
		 
	}
	
	public void pesquisaFilme() {
		filmeControle.pesquisaFilme();
	}
	
	public void adicionaGenero() {
		generoControle.adicionaGenero();
		
	}
	
}
