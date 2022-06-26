package projeto_livro;

public class LivroFisico extends Livro{

	public double getTaxaImpressao(double valor) {
		return valor * 1.10;
	}
}
