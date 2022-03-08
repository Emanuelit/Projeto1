package ProjetoMaster;

import java.util.Scanner;

public class Interface {
	
	void interface1() {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		String sobreNome;
		String cpf;
		String email;
		String telefone;
		String cep;
		
		
		System.out.println("-------------------------");
		System.out.println("      C     A     T      ");
		System.out.println("-------------------------");
		System.out.println();
		System.out.print("Nome: ");
		nome = leia.next();
		System.out.print("Sobrenome: ");
		sobreNome = leia.next();
		System.out.println("-------------------------");
		System.out.print("Idade: ");
		idade = leia.nextInt();
		System.out.println("-------------------------");
		System.out.print("CPF ou RG: ");
		cpf = leia.next();
		System.out.println("-------------------------");
		System.out.print("Email: ");
		email = leia.next();
		System.out.println("-------------------------");
		System.out.print("Telefone: ");
		telefone = leia.next();
		System.out.println("-------------------------");
		System.out.print("CEP: ");
		cep = leia.next();
		System.out.println("-------------------------");
		
		leia.close();
	}
	
}
