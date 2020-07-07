package Controle;
import java.util.ArrayList;
import Modelo.Categoria;
import Apresentacao.CategoriaApresentacao;

public class CategoriaControle {
	
	public ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();
	
	private CategoriaApresentacao categoriaApresentacao = new CategoriaApresentacao();
	
	//n recadastrar opcoes de categoria
	public void adicionaCategoria() {
		Categoria categoria = new Categoria();
		categoriaApresentacao.cadastraCategoria(categoria);
		listaCategoria.add(categoria);
	}
	
	public Categoria selecionaCategoria() {
		int id = 0;
		String[] aux = new String[listaCategoria.size()];
		
		for (int i = 0; i < listaCategoria.size(); i++) {
			
			aux[i] = listaCategoria.get(i).getTipoCategoria();
		}
		
		id = categoriaApresentacao.selecionaCategoria(aux);
		return listaCategoria.get(id);
	}
}