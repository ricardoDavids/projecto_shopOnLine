package services;

public abstract class VideoJogos implements Tecnologia {
	
	private int anoLancamento;

	public VideoJogos(int anoLancamento) {
		super();
		this.anoLancamento = anoLancamento;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
}
