package lista3.ex2;

import java.util.Scanner;

import lista3.ex1.Pessoa;

public class PessoaMainB {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		Pessoa[] pessoas = new Pessoa[3];
		Pessoa pessoa=null;
		String Cpf;
		
		for (int i = 0; i < pessoas.length; i++) {
			
			pessoa = new Pessoa();
			
			System.out.println("Insira o nome da pessoa " + i + " : ");
			pessoa.nome = leitura.nextLine();
			
			System.out.println("Insira a data de nascimento da pessoa " + i + " : ");
			pessoa.nascimento = leitura.nextLine();
			
			System.out.println("Insira o CPF da pessoa " + i + " : ");
			Cpf = leitura.nextLine();
			pessoa.cpf = Long.valueOf(Cpf);	
			
			pessoas[i] = pessoa;
			
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			
			System.out.println(pessoas[i].nome + " " + pessoas[i].nascimento + " " + pessoas[i].cpf );
			
		}
		
		

	}

}
