package projeto_livro;

import projeto_livro.Ebook;

public class mainEbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ebook eb = new Ebook();
		
		eb.setAutor("Racionais Mc's");
		
		eb.setCategoria("Música");
		
		eb.setMarcaDagua("Companhia das Letras");
		
		eb.setTitulo("Sobrevivendo no inferno");
		
		eb.setValor(24);
		
		eb.aplicarDesconto();
		
		System.out.println("Valor com desconto aplicado: "+ eb.getValor());
	}

}
