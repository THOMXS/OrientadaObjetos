package Controle;
import java.util.ArrayList;
import Modelo.Serie;
import Apresentacao.SerieApresentacao;

public class SerieControle {
	public ArrayList<Serie> listaSerie = new ArrayList<Serie>();

	private SerieApresentacao serieApresentacao = new SerieApresentacao();

	public void adicionaSerie(){
		Serie serie = new Serie();
		serieApresentacao.cadastraSerie(serie);
		listaSerie.add(serie);
	}

	public Serie selecionaSerie(){
		int id = 0;
		String[] aux = new String[listaSerie.size()];

		for (int i = 0; i < listaSerie.size(); i++) {

			aux[i] = listaSerie.get(i).getTipoSerie();
		}

		id = serieApresentacao.selecionaSerie(aux);
		return listaSerie.get(id);
	}
}