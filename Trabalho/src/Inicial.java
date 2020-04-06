public class Inicial {

	public static void main (String[] args) {
		
		Conta c1 = new Conta ("Básico");
		Conta c2 = new Conta ("Padrão");
		Conta c3 = new Conta ("Premiun");
		Conta c4 = new Conta ("Da galera");		
		
		Genero g1 = new Genero("Terror");// instancia
		Genero g2 = new Genero("Suspense");//
		Genero g3 = new Genero("Animacao");//
		Genero g4 = new Genero("Comedia");//
		Genero g5 = new Genero("Romance");//
		Genero g6 = new Genero("Acao");//
		Genero g7 = new Genero("Drama");//
		
		Filme f1 = new Filme ("A casa de cera");
		Filme f2 = new Filme ("Ivocacao do mal");
		Filme f3 = new Filme ("Eli");
		Filme f4 = new Filme ("Garota Exemplar");
		Filme f5 = new Filme ("Seven - Os sete crimes capitais");
		Filme f6 = new Filme ("Um Contratempo");
		Filme f7 = new Filme ("Os Incriveis");
		Filme f8 = new Filme ("Divertidamente");
		Filme f9 = new Filme ("UP Altas Aventuras");		
		Filme f10 = new Filme ("Se Beber Não se Case");
		Filme f11 = new Filme ("A Proposta");
		Filme f12 = new Filme ("O Maskara");		
		Filme f13 = new Filme ("Como eu Era antes de Voce");
		Filme f14 = new Filme ("Esposa de Mentirinha");
		Filme f15 = new Filme ("Um Homem de Sorte");		
		Filme f16 = new Filme ("No olho do Tornado");
		Filme f17 = new Filme ("Constantine");
		Filme f18 = new Filme ("O Regresso");		
		Filme f19 = new Filme ("Historia de Casamento");
		Filme f20 = new Filme ("Castelo de Areia");
		Filme f21 = new Filme ("Dois Papas");		
		Direcao d1 = new Direcao ("Jaume Collet-Serra"); 
		Direcao d2 = new Direcao ("James Wan");
		Direcao d3 = new Direcao ("Ciaran Foy");
		Direcao d4 = new Direcao ("David Fincher");
		Direcao d5 = new Direcao ("David Fincher");
		Direcao d6 = new Direcao ("Oriol Paulo");
		Direcao d7 = new Direcao ("Brad Bird");
		Direcao d8 = new Direcao ("Pete Docter");
		Direcao d9 = new Direcao ("Pete Docter");
		Direcao d10 = new Direcao ("Todd Phillips");
		Direcao d11 = new Direcao ("Anne Fletcher");
		Direcao d12 = new Direcao ("Chuck Russell");
		Direcao d13 = new Direcao ("Thea Sharrock");
		Direcao d14 = new Direcao ("Dennis Dugan");
		Direcao d15 = new Direcao ("Robert Scott Hicks");
		Direcao d16 = new Direcao ("Steven Quale");
		Direcao d17 = new Direcao ("Francis Lawrence");
		Direcao d18 = new Direcao ("Alejandro González Iñárritu");
		Direcao d19 = new Direcao ("Noah Baumbach");
		Direcao d20 = new Direcao ("Fernando Coimbra");
		Direcao d21 = new Direcao ("Fernando Meirelles");		
		f1.setGenero(g1);
		f2.setGenero(g1);
		f3.setGenero(g1);
		f4.setGenero(g2);
		f5.setGenero(g2);
		f6.setGenero(g2);
		f7.setGenero(g3);
		f8.setGenero(g3);
		f9.setGenero(g3);
		f10.setGenero(g4);
		f11.setGenero(g4);
		f12.setGenero(g4);
		f13.setGenero(g5);
		f14.setGenero(g5);
		f15.setGenero(g5);
		f16.setGenero(g6);
		f17.setGenero(g6);
		f18.setGenero(g6);
		f19.setGenero(g7);
		f20.setGenero(g7);
		f21.setGenero(g7);
		
		f1.setDirecao(d1);
		f2.setDirecao(d2);
		f3.setDirecao(d3);
		f4.setDirecao(d4);
		f5.setDirecao(d5);
		f6.setDirecao(d6);
		f7.setDirecao(d7);
		f8.setDirecao(d8);
		f9.setDirecao(d9);
		f10.setDirecao(d10);
		f11.setDirecao(d11);
		f12.setDirecao(d12);
		f13.setDirecao(d13);
		f14.setDirecao(d14);
		f15.setDirecao(d15);
		f16.setDirecao(d16);
		f17.setDirecao(d17);
		f18.setDirecao(d18);
		f19.setDirecao(d19);
		f20.setDirecao(d20);
		f21.setDirecao(d21);

		// PRINT
		System.out.printf("Filme %s\n", f1.getnomefilme());
		System.out.printf("Genero %s\n", f1.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f1.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f2.getnomefilme());
		System.out.printf("Genero %s\n", f2.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f2.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f3.getnomefilme());
		System.out.printf("Genero %s\n", f3.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f3.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f4.getnomefilme());
		System.out.printf("Genero %s\n", f4.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f4.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f5.getnomefilme());
		System.out.printf("Genero %s\n", f5.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f5.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f6.getnomefilme());
		System.out.printf("Genero %s\n", f6.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f6.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f7.getnomefilme());
		System.out.printf("Genero %s\n", f7.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f7.getDirecao().getnomedirecao());
		System.out.printf("Filme %s\n", f8.getnomefilme());
		System.out.printf("Genero %s\n", f8.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f8.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f9.getnomefilme());
		System.out.printf("Genero %s\n", f9.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f9.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f10.getnomefilme());
		System.out.printf("Genero %s\n", f10.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f10.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f11.getnomefilme());
		System.out.printf("Genero %s\n", f11.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f11.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f12.getnomefilme());
		System.out.printf("Genero %s\n", f12.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f12.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f13.getnomefilme());
		System.out.printf("Genero %s\n", f13.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f13.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f14.getnomefilme());
		System.out.printf("Genero %s\n", f14.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f14.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f15.getnomefilme());
		System.out.printf("Genero %s\n", f15.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f15.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f16.getnomefilme());
		System.out.printf("Genero %s\n", f16.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f16.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f16.getnomefilme());
		System.out.printf("Genero %s\n", f16.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f16.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f17.getnomefilme());
		System.out.printf("Genero %s\n", f17.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f17.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f18.getnomefilme());
		System.out.printf("Genero %s\n", f18.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f18.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f19.getnomefilme());
		System.out.printf("Genero %s\n", f19.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f19.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f20.getnomefilme());
		System.out.printf("Genero %s\n", f20.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f20.getDirecao().getnomedirecao());
		
		System.out.printf("Filme %s\n", f21.getnomefilme());
		System.out.printf("Genero %s\n", f21.getGenero().getnomegenero());
		System.out.printf("Direcao %s\n\n", f21.getDirecao().getnomedirecao());
		
		
		
		
		
		
	}
	
	
}
