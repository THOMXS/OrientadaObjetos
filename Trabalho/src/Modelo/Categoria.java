package Modelo;

public class Categoria{
	private String tipoCategoria;
	public Categoria() {
		//tipoCategoria = nome;
}
	
	public Categoria(String nome) {
			tipoCategoria = nome;
	}
	
	public void setNomeCategoria(String nome) {
			tipoCategoria = nome;
	}
	
	public String getTipoCategoria() {
		return tipoCategoria;
	}
}