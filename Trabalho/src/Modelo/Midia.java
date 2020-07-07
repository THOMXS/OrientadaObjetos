package Modelo;

public class Midia implements ControleRemoto{
		//hygo
	private String tipoMidia;
	
	public Midia() {
		//tipoMidia = nome;
	}
	
	public Midia(String nome) {
			tipoMidia = nome;
	}
	
	public void setNomeMidia(String nome) {
			tipoMidia = nome;
	}
	
	public String getTipoMidia() {
		return tipoMidia;
	}
	//hygo

	
	
	 public void mudarMidia(String midia) { 
		 
	  
	  }
	 

	@Override
	public void passarTempo(int tempo) {
		tempo += 10;
		
	}

	@Override
	public void voltarTempo(int tempo) {
		tempo -=10;
	}

	@Override
	public void pausarMidia() {
		
		
	}

	

	
}