public class Inicial {

	public static void main(String[] args) {

		Plano c1 = new Plano("Básico");
		Plano c2 = new Plano("Padrão");
		Plano c3 = new Plano("Premiun");
		Plano c4 = new Plano("Family");

		Genero g1 = new Genero("Terror");// instancia
		Genero g2 = new Genero("Suspense");//

		Filme f1 = new Filme("A casa de cera");
		Filme f2 = new Filme("Ivocacao do mal");
		Filme f3 = new Filme("Eli");
		Filme f4 = new Filme("Garota Exemplar");

		Direcao d1 = new Direcao("Jaume Collet-Serra");
		Direcao d2 = new Direcao("James Wan");
		Direcao d3 = new Direcao("Ciaran Foy");
		Direcao d4 = new Direcao("David Fincher");

		//atribui genero to filme
		f1.setGenero(g1);
		f2.setGenero(g1);
		f3.setGenero(g1);
		f4.setGenero(g2);

		//atribui direção to filme
		f1.setDirecao(d1);
		f2.setDirecao(d2);
		f3.setDirecao(d3);
		f4.setDirecao(d4);

		//atribui ano to filme
		f1.setAno(1999);
		f2.setAno(1989);
		f3.setAno(1979);
		f4.setAno(1969);
		
		
		System.out.printf("Filme %s\n", f1.getNomeFilme());
		System.out.printf("Genero %s\n", f1.getGenero().getNomeGenero());
		System.out.printf("Direcao %s\n", f1.getDirecao().getNomeDirecao());
		System.out.printf("Ano: %s\n\n", f1.getAno());
		
		System.out.printf("Filme %s\n", f2.getNomeFilme());
		System.out.printf("Genero %s\n", f2.getGenero().getNomeGenero());
		System.out.printf("Direcao %s\n", f2.getDirecao().getNomeDirecao());
		System.out.printf("Ano: %s\n\n", f2.getAno());
		
		System.out.printf("Filme %s\n", f3.getNomeFilme());
		System.out.printf("Genero %s\n", f3.getGenero().getNomeGenero());
		System.out.printf("Direcao %s\n", f3.getDirecao().getNomeDirecao());
		System.out.printf("Ano: %s\n\n",f3.getAno());
		
		System.out.printf("Filme %s\n", f4.getNomeFilme());
		System.out.printf("Genero %s\n", f4.getGenero().getNomeGenero());
		System.out.printf("Direcao %s\n", f4.getDirecao().getNomeDirecao());
		System.out.printf("Ano: %s\n\n", f4.getAno());
	}

}
