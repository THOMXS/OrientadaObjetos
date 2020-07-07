package Modelo;


public class Filme extends Midia { //Filme centraliza tudo
	private String nomeFilme;
	private int ano;

	Genero genero;
	Direcao direcao;
	Estudio estudio;
	Ator ator;
	Streaming streaming;
	
//	public Filme(String name, Genero genero, Direcao direcao, int anoFilme) {
//		nomeFilme = name;
//		ano = anoFilme;
//		this.genero = genero;
//		this.direcao = direcao;
//	}

	public Filme(String name) {
		nomeFilme = name;
	}

	public Filme()
	{
		
	}
	// SET 
	public void setNomeGenero(Genero genero) {
		this.genero = genero;
	}

	public void setNomeDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
	public void setAno(int anoFilme) {
		ano = anoFilme;
	}

	public void setNomeFilme(String name) {
		nomeFilme = name;
	}
	
	public void setNomEstudio(Estudio estudio) {
		this.estudio = estudio;
	}

	public void setNomeAtor(Ator ator) {
		this.ator = ator;
	}
	
	public void setNomeStreaming(Streaming streaming) {
		this.streaming = streaming;
	}
	
	// GET
	public String getNomeFilme() {
		return nomeFilme;
	}

	public Genero getNomeGenero() {
		return genero;
	}

	public Direcao getNomeDirecao() {
		return direcao;
	}

	public int getAno() {
		return ano;
	}
	
	public Ator getNomeAtor() {
		return ator;
	}

	public Estudio getNomeEstudio() {
		return estudio;
	}

	public Streaming getNomeStreaming() {
		return streaming;
	}

	@Override
	public void mudarMidia(String midia) {
		// TODO Auto-generated method stub
		
	}
}