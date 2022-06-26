package projeto_livro;

public class Ebook extends Livro{

	private String marcaDagua;
	public void aplicarDesconto() {
		valor = valor - (valor * 0.20);
	}
	
	public String getMarcaDagua() {
		return marcaDagua;
	}
	public void setMarcaDagua(String marcaDagua) {
		this.marcaDagua = marcaDagua;
	}
}
