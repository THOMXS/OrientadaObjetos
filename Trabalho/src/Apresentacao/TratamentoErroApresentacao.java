package Apresentacao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TratamentoErroApresentacao {

	public void TenteDeNovo() {
		JOptionPane.showMessageDialog(null, "Escolha uma op��o ou digite 10 para sair.", "Aten��o", 1);

	}

	public void fechar() {
		int n = JOptionPane.showOptionDialog(new JFrame(),
				"Deseja fechar a aplica��o?",  "Aten��o",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] {"Sim", "N�o"}, JOptionPane.YES_OPTION);

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
