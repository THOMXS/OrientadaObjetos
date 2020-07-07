package Controle;

import Apresentacao.ConsoleApresentacao;
import Apresentacao.ProgramaApresentacao;
import Modelo.ControleRemoto;
import Modelo.Midia;
import Apresentacao.TratamentoErroApresentacao;


public class ConsoleControle {
	
	ProgramaApresentacao programaApresentacao = new ProgramaApresentacao();
	ConsoleApresentacao consoleApresentacao= new ConsoleApresentacao();
	ProgramaControle programaControle = new ProgramaControle();
	
	public ConsoleControle() {
		int op = 0;
		TratamentoErroApresentacao tratamento = new TratamentoErroApresentacao();
		while (op != -1) {
			try {
			op = consoleApresentacao.mostraMenuInicial();
			switch (op) {
			case 1:
				menuAssistir();
				break;
			case 2:
				programaControle.menuFilme();
				break;
			case 3:
				//programaControle.menuSerie();
				break;
			case 4:
				//Série
				programaControle.menuGenero();
				break;
			case 5:
				//Meusfavoritos
				break;
			case 6:
				//minha lista
				break;
			case 7:
				//perfil
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
	
	public void menuAssistir() {
		programaControle.pesquisaFilme();

		int tempo = 0;
		ControleRemoto controle = new Midia();
		int op = 0;
		while (op != -1) {
			
			op = consoleApresentacao.mostraControleRemoto();
			switch (op) {
			case 1:
				controle.voltarTempo(tempo);
				break;
			case 2:
				controle.pausarMidia();
				break;
			case 3:
				controle.passarTempo(tempo);
				break;
			}
		
		}
		
	}
	
}

