package projeto_livro;

import projeto_livro.LivroFisico;

public class mainLivroFisico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LivroFisico lf = new LivroFisico();
		
		lf.setAutor("Racionais Mc's");
		
		lf.setCategoria("M�sica");
		
		System.out.println("Valor da taxa de impress�o: "+lf.getTaxaImpressao(800));
	}

}
