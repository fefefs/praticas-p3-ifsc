package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Produto bolsa = new Produto();
		bolsa.setNome("birking");
		bolsa.setCodBarras((long) 1234);
		bolsa.setFornecedor("Hermes");
		bolsa.setPreco(25.000);
		
		produtos.add(bolsa);
		
		Produto sapato = new Produto();
		sapato.setNome("Scarpin");
		sapato.setCodBarras((long) 4321);
		sapato.setFornecedor("Louboutin");
		sapato.setPreco(5.400);
		
		produtos.add(sapato);
		
		Produto vestido = new Produto();
		vestido.setNome(" Dioriviera");
		vestido.setCodBarras((long) 2143);
		vestido.setFornecedor("Dior");
		vestido.setPreco(10.000);
		
		produtos.add(vestido);
		
		for (Produto produto : produtos) {
			
			System.out.println("******Produtos********\n");
			
			System.out.println(" nome : " + produto.getNome());
			System.out.println(" fornecedor : " + produto.getFornecedor());
			System.out.println(" preco : " + produto.getPreco());
			System.out.println(" Codigos de Barras : " + produto.getCodBarras());
			
			System.out.println("**********************\n");
			
			
		}
		
		

	}

}
