package screens;

import java.util.Scanner;

import utilities.UtilFunc;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem Vindo ao app Control\n");
		System.out.println("Insira seu email e senha pra continuar\n");
		System.out.printf("Email: ");
		String email = sc.nextLine();
		System.out.printf("Senha: ");
		String senha = sc.nextLine();
		
		Usuario usuario1 = new Usuario(email, senha);
		
		while (usuario1.verificaUsuario() == false) {
				System.out.println("Tente novamente ");
				System.out.printf("Email: ");
				usuario1.setEmail(sc.nextLine()); 
				System.out.printf("Senha: ");
				usuario1.setSenha(sc.nextLine());
		}
		//Menu principal
		boolean principal = true;
		while (principal == true) {
		System.out.println("");
		System.out.println("1. Cadastrar novo");
		System.out.println("2. Visualizar saldo");
		System.out.println("3. Finalizar");
		int menu = sc.nextInt();
		
		//Visualizar saldo
		if (menu == 2) {
			System.out.printf("%nO saldo atual é de: " + "R$%.2f%n", Financa.calculaSaldo());
	
		}
		
		//Finalizar
		if (menu == 3) {
			System.out.println("O programa foi encerrado!");
			System.out.println("Obrigado por testar");
			principal = false;
		}
		//Menu de cadastros
		if (menu == 1) {
			while (menu == 1) {
				System.out.println("");
				System.out.println("1. Cadastrar Receita");
				System.out.println("2. Cadastrar Despesa");
				System.out.println("3. Cadastrar Cliente");
				System.out.println("4. Voltar");
				int menuCadastro = sc.nextInt();
				sc.nextLine();
				
				//Cadastrar despesa
				if (menuCadastro == 2) {
					boolean recadastroDespesa = true;
					while (recadastroDespesa == true) {
						System.out.print("\nValor: ");
						double valor = sc.nextDouble();
						valor *= -1;
						sc.nextLine();
						System.out.print("Tipo: ");
						String tipo = sc.nextLine();
						System.out.print("Observação: ");
						String obs = sc.nextLine();
						Financa receita = new Financa(valor, tipo, obs);
						Financa.addlista(receita);
						System.out.print("\nDeseja cadastrar uma nova entrada? (s/n)");
						String resposta = sc.nextLine();
						boolean valido = UtilFunc.validadorSN(resposta);
						//Verifica se o usuario digitou 's' ou 'n' 
						while (valido == false) {
							System.out.println("Caractere inválido, tente novamente");
							System.out.print("Deseja cadastrar uma nova entrada? (s/n)\n");
							resposta = sc.nextLine();
							valido = UtilFunc.validadorSN(resposta);
							}
						if (resposta.equals("n")) {
							recadastroDespesa = false;
						}
					}
				}
				
				//Cadastrar receita
				if (menuCadastro == 1) {
					boolean recadastroReceita = true;
					while (recadastroReceita == true) {
						System.out.print("\nValor: ");
						double valor = sc.nextDouble();
						sc.nextLine();
						System.out.print("Tipo: ");
						String tipo = sc.nextLine();
						System.out.print("Observação: ");
						String obs = sc.nextLine();
						Financa receita = new Financa(valor, tipo, obs);
						Financa.addlista(receita);
						System.out.print("\nDeseja cadastrar uma nova entrada? (s/n)");
						String resposta = sc.nextLine();
						boolean valido = UtilFunc.validadorSN(resposta);
						//Verifica se o usuario digitou 's' ou 'n' 
						while (valido == false) {
							System.out.println("Caractere inválido, tente novamente");
							System.out.print("Deseja cadastrar uma nova entrada? (s/n)\n");
							resposta = sc.nextLine();
							valido = UtilFunc.validadorSN(resposta);
							}
						if (resposta.equals("n")) {
							recadastroReceita = false;
						}
					}
				}
				
				//Voltar ao menu anterior
				if (menuCadastro == 4) {
					menu = 0;
				}
				//Menu de cadastro de clientes
				if (menuCadastro == 3) {
					boolean recadastroCliente = true;
					while (recadastroCliente == true) {
						
						System.out.print("Nome: ");
						String nomeCliente = sc.nextLine();
						System.out.print("Endereço: ");
						String enderecoCliente = sc.nextLine();
						System.out.print("Telefone: ");
						String telefoneCliente = sc.nextLine();
						Cliente cliente1 = new Cliente(nomeCliente, enderecoCliente, telefoneCliente);
						System.out.println("Cliente " + cliente1.getNome() + " cadastrado com sucesso!");
						System.out.print("\nDeseja cadastrar um novo cliente? (s/n)");
						String resposta = sc.nextLine();
						
						
						boolean valido = UtilFunc.validadorSN(resposta);
						//Verifica se o usuario digitou 's' ou 'n' 
						while (valido == false) {
							System.out.println("Caractere inválido, tente novamente");
							System.out.print("Deseja cadastrar um novo cliente? (s/n)\n");
							
							resposta = sc.nextLine();
							valido = UtilFunc.validadorSN(resposta);
							}
						if (resposta.equals("n")) {
							recadastroCliente = false;
						}
					}
				} 
				
			}
		}
		}
		sc.close();
	}
}
