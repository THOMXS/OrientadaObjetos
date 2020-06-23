package Controle;
import java.util.ArrayList;
import Modelo.Genero;
import Apresentacao.GeneroApresentacao;


public class GeneroControle {
	
	public ArrayList<Genero> listaGenero = new ArrayList<Genero>();
	
	private GeneroApresentacao generoApresentacao = new GeneroApresentacao();

	//ajustar para não recadastrar genero
	public void adicionaGenero() {
		Genero genero = new Genero();
		generoApresentacao.cadastraGenero(genero);
		listaGenero.add(genero);
		
	}

	public Genero selecionaGenero() {
		int id = 0;

		String[] aux = new String[listaGenero.size()];

		for (int i = 0; i < listaGenero.size(); i++) {

			aux[i] = listaGenero.get(i).getNomeGenero();
		}
		
		 id = generoApresentacao.selecionaGenero(aux);
		return listaGenero.get(id);

	}
}
