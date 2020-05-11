package Modelo;

public class Estudio { // quem produziu o filme
	private String nomeEstudio;

	public Estudio(String name) {
		nomeEstudio = name;
	}

	public void setNomeEstudio(String name) {
		nomeEstudio = name;
	}

	public String getNomeEstudio() {
		return nomeEstudio;
	}
}
