package Controle;
import java.util.ArrayList;
import Modelo.Midia;
import Apresentacao.MidiaApresentacao;

public class MidiaControle {
	
	public ArrayList<Midia> listaMidia = new ArrayList<Midia>();
	
	private MidiaApresentacao midiaApresentacao = new MidiaApresentacao();
	
	//interfaces tornar a classe abstrata e impossibilita criar um nova instância
	//public void adicionaMidia() {
		//Midia midia = new Midia();
		//midiaApresentacao.cadastraMidia(midia);
		//listaMidia.add(midia);
	//}
	
	public Midia selecionaMidia() {
		int id = 0;
		String[] aux = new String[listaMidia.size()];
		
		for (int i = 0; i < listaMidia.size(); i++) {
			
			aux[i] = listaMidia.get(i).getTipoMidia();
		}
		
		id = midiaApresentacao.selecionaMidia(aux);
		return listaMidia.get(id);
	}
}
