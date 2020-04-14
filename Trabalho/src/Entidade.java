public class Entidade {
	private String Cpf;
	private String Email;
	private String NomeCompleto;
	private String Telefone;

	public Entidade(String name) {
		NomeCompleto = name;

	}

	public void setNomeCompleto(String name) {
		NomeCompleto = name;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEmail() {
		return Email;
	}
}