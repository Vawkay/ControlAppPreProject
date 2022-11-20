package screens;

public class Usuario {
	String email;
	String senha;
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean verificaUsuario() {
		boolean verificador = null != null;
		//'felipe' foi usado como exemplo para o método funcionar
		// Em produção normal haveria um método consultando DB
		if (email.equals("felipe")) { 
			if (senha.equals("123")) {
				System.out.println("\nLogin Realizado com sucesso!");
				verificador = true;
			} else {
				System.out.println("**Senha incorreta**");
			}
		} else {
			System.out.println("Usuário não localizado");
			verificador = false;
		}
		return verificador;
	}

}
