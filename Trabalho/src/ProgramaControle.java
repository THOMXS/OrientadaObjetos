import javax.swing.JOptionPane;

public class ProgramaControle {

	public static void main(String[] args) {

		Plano c1 = new Plano("Básico");
		Plano c2 = new Plano("Padrão");
		Plano c3 = new Plano("Premiun");
		Plano c4 = new Plano("Family");

		boolean flagTerror = false;
		boolean flagSuspense = false;
		boolean flagRomance = false;

		String filmeTerror = "A casa de cera";
		String filmeSuspense = "Ivocacao do mal";
		String filmeRomance = "Como se fosse a primeira vez";

		int anoFilme = 1996;
		
		
		Direcao direcao = new Direcao(null);
		Filme filme = new Filme(null);

		// JOptionPane -- Genero
		String generoTipo;
		String optionsGenero[] = { "Terror", "Suspense", "Romance" };
		int generoInt = JOptionPane.showOptionDialog(null, "Escolha o Gênero:", "Gênero", 0, -1, null, optionsGenero,
				null);

		if (generoInt == 0) {
			generoTipo = "Terror";

			filme.setNomeFilme(filmeTerror);
			filme.setAno(anoFilme);
			

			flagTerror = true;
		} else if (generoInt == 1) {
			generoTipo = "Suspense";

			filme.setNomeFilme(filmeSuspense);
			filme.setAno(anoFilme);
			

			flagSuspense = true;
		} else {
			generoTipo = "Romance";

			filme.setNomeFilme(filmeRomance);
			filme.setAno(anoFilme);
			

			flagRomance = true;
		}
		if (generoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		Genero genero = new Genero(generoTipo);
		filme.setNomeGenero(genero);
		
		
		String mensagemResumoGenero = String.format(
				"\t\tEste é o gênero : \n\nNOME : %s, \n\nFILME : %s, \n\nANO : %s",
				genero.getNomeGenero(), filme.getNomeFilme(), filme.getAno());
		JOptionPane.showMessageDialog(null, mensagemResumoGenero);

	}

}
