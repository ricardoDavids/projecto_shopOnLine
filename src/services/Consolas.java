package services;

public class Consolas extends VideoJogos {
	
	private String name;
	private Integer qt;
	private Double price;
	
	

	public Consolas(int anoLancamento, String name, Integer qt, Double price) {
		super(anoLancamento);
		this.name = name;
		this.qt = qt;
		this.price = price;
	}
	
	
	//Metodos Get and Set
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getQt() {
		return qt;
	}


	public void setQt(Integer qt) {
		this.qt = qt;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}



	//Metodos Especiais


	@Override
	public double comprar() {
		
		return qt * price;
	}

}
