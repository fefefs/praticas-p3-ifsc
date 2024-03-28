package aula1poo;

public class Main {

	public static void main(String[] args) {
		//instanciar a classe :
		Pessoa anne = new Pessoa();
		anne.primeiroNome = "Anne";
		anne.sobrenome = "junkes";
		anne.cpf = "1234";
		
		Pessoa mari = new Pessoa();
		mari.primeiroNome = "Mariana";
		mari.sobrenome = "Azevedo";
		mari.cpf = "2345";
		
		Pessoa jaque = new Pessoa();
		jaque.primeiroNome = "Jaqueline";
		jaque.sobrenome = "Brandao";
		jaque.cpf = "3456";
		
		Pessoa fer = new Pessoa();
		fer.primeiroNome = "Fernanda";
		fer.sobrenome = "Cardoso";
		fer.cpf = "4567";
		
		
		System.out.println(anne.primeiroNome + " " + anne.sobrenome + " " + anne.cpf);
		System.out.println(mari.primeiroNome + " " + mari.sobrenome + " " + mari.cpf);
		System.out.println(jaque.primeiroNome + " " + jaque.sobrenome + " " + jaque.cpf);
		System.out.println(fer.primeiroNome + " " + fer.sobrenome + " " + fer.cpf);
		
		
		
		
	}

}
