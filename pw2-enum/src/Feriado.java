
public class Feriado {

	private String descricao;
	private String data;
	private TipoFeriadoEnum tipoFeriado;

	public TipoFeriadoEnum getTipoFeriado() {
		return tipoFeriado;
	}

	public void setTipoFeriado(TipoFeriadoEnum tipoFeriado) {
		this.tipoFeriado = tipoFeriado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
