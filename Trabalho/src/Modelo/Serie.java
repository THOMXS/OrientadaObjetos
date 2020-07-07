package Modelo;

public class Serie{ 
	private String tipoSerie;
	public Serie(){
		//tipoSerie = nome;
}
	
	public Serie(String nome) {
		tipoSerie = nome;
}

	public void setNomeSerie(String nome) {
			tipoSerie = nome;
}

public String getTipoSerie(){
	return tipoSerie;
	}
}
