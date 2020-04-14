public class Filme { //Filme centraliza tudo
	private String nomeFilme;
	private int ano;

	Genero genero;
	Direcao direcao;
	// Entidade entidade;

	public Filme(String name, Genero genero, Direcao direcao, int anoFilme) {
		nomeFilme = name;
		ano = anoFilme;
		this.genero = genero;
		this.direcao = direcao;
	}

	public Filme(String name) {
		nomeFilme = name;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
	public void setAno(int anoFilme) {
		ano = anoFilme;
	}

	public void setNomeFilme(String name) {
		nomeFilme = name;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public Genero getGenero() {
		return genero;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public int getAno() {
		return ano;
	}
}