public class GenerosFilmes {
	Genero genero;
	Filme filme;

	public GenerosFilmes(Genero genero, Filme filme) {
		this.genero = genero;
		this.filme = filme;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;

	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Genero getGenero() {
		return genero;
	}

	public Filme getFilme() {
		return filme;
	}


}
