package Apresentacao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TratamentoErroApresentacao {

	public void TenteDeNovo() {
		JOptionPane.showMessageDialog(null, "Escolha uma opção ou digite 10 para sair.", "Atenção", 1);

	}

	public void fechar() {
		int n = JOptionPane.showOptionDialog(new JFrame(),
				"Deseja fechar a aplicação?",  "Atenção",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] {"Sim", "Não"}, JOptionPane.YES_OPTION);

				if (n == JOptionPane.YES_OPTION) {
						System.out.println("Deu sim e fechou a tela");
						System.exit(0);
				}else if (n == JOptionPane.NO_OPTION) {
					System.out.println("Retornou ao programa");
				
				}else if (n == JOptionPane.CLOSED_OPTION) {
					System.out.println("Fechou no X");
					System.exit(0);
				}
	}
}
