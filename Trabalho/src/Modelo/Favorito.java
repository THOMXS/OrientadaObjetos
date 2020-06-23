package Modelo;

public class Favorito {
	private String listaFavorito;

	Conta conta;
	Streaming entidade;
	Filme filme;
	
	public void Favorito(Conta conta, Streaming entidade, String favorito) {

		this.conta = conta;
		this.entidade = entidade;
		listaFavorito = favorito;
	}

	public void setListaFavorito(String name) {
		listaFavorito = name;
	}

	public String getListaFavorito() {
		return listaFavorito;
	}

}
