package lista3.ex1;

public class PessoaMainA {

	public static void main(String[] args) {
		
				Pessoa Remus = new Pessoa();
				Remus.nome = "Remus";
				Remus.nascimento = "10/03/1960";
				Remus.cpf = 123456789;
				
				Pessoa Sirius = new Pessoa();
				Sirius.nome = "Sirius";
				Sirius.nascimento = "03/11/1960";
				Sirius.cpf = 987654321;
				
				Pessoa James = new Pessoa();
				James.nome = "James";
				James.nascimento = "27/03/1960";
				James.cpf = 234567890;
				
		
			
				
				System.out.println( Remus.nome + "  " + Remus.nascimento + "  " + Remus.cpf);
				System.out.println( Sirius.nome + "  " + Sirius.nascimento + "  " + Sirius.cpf);
				System.out.println( James.nome + "  " + James.nascimento + "  " + James.cpf);

	}

}
