public class Filme {
	public String nomefilme;// private
	Genero genero;
	Direcao direcao;
	
	void exibirfilmes () {
		
	}
	public Filme(String name, Genero genero, Direcao direcao) {
		nomefilme = name;
		this.genero = genero;
		this.direcao = direcao;
	}
	public Filme(String name) {
		nomefilme = name;		
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}	
	public void setnomefilme(String name) {
		nomefilme = name;
	}
	public String getnomefilme() {
		return nomefilme;
	}	
	
	public Genero getGenero() {
		return genero;		
	}
	public Direcao getDirecao() {
		return direcao;		
	}
	
}
