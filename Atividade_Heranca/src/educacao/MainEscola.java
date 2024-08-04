package educacao;



public class MainEscola {

	public static void main(String[] args) {
		
		AbstractMenbro professor  = new Professor("Bruna");
		AbstractMenbro aluno  = new Aluno("Anne");
		AbstractMenbro funcionario  = new Funcionario("Dona jô");
		
		professor.falar();
		aluno.falar();
		funcionario.falar();

	}

}
