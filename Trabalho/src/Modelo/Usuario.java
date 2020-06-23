package Modelo;

public class Usuario {
	 Favorito favorito;
	 Plano Conta;
	 public String nomeUsuario;
	public Usuario(String name) {
		nomeUsuario = name;
		
	}

	public Usuario() {
		
	} 
	
	public Favorito setListaFavorito() {
		return favorito;
	}
	
	public Favorito getListaFavorito() {
		return favorito;
	}
	
	public void setNomeUsuario(String name) {
		nomeUsuario = name;
	}

	public String getNomeUsuario () {
		return nomeUsuario;
	}

}
