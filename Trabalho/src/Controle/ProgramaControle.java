 package Controle;
 
import Modelo.Filme;
import Modelo.Genero;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Apresentacao.ProgramaApresentacao;
import Apresentacao.TratamentoErroApresentacao;
public class ProgramaControle {

	ProgramaApresentacao programaApresentacao = new ProgramaApresentacao();
	FilmeControle filmeControle = new FilmeControle();
	GeneroControle generoControle = new GeneroControle();
	TratamentoErroApresentacao tratamento = new TratamentoErroApresentacao();
//	ConsoleControle consoleControle = new ConsoleControle();
	public void ProgramaControle() {
		int op = 0;
		while (op != -1) {
			try {
			op = programaApresentacao.mostraMenuPrincipal();
			switch (op) {
			case 1:
				menuFilme();
				break;
			case 2: 
				menuGenero();
				break;
			case 9:
				//consoleControle.consoleApresentacao.mostraMenuInicial();
				break;
			case 10:
				tratamento.fechar();
				break;
			default: 
				
				tratamento.TenteDeNovo();
			}
		
		}catch(NumberFormatException ex){
			
			System.out.println("Não é um número...");
			System.out.printf("Exception: %s%n", ex);
			tratamento.TenteDeNovo();
			
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
