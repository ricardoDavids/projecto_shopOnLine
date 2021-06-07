package entities;

import java.util.UUID;

public abstract class Person { // nao vou criar Person porque ele já está extendido de 2 classes
	
	private String name;
	private Integer age;
	private Integer id;
	
	public Person() {
		
	}

	public Person(String name, Integer age, Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	//public abstract void registerUser(String string);
	
	
	//Criar um vendedor
	// No metodo abaixo haveria alguma hipotese de colocar o protected e porquê?
	public Seller createSeller() {
		Seller seller = new Seller();
		seller.setLoguin("Ricardo");
		seller.setPassword("123");
		seller.setAge(22);
		seller.setName("Ricardo Pereira");
		seller.setJobId(UUID.randomUUID().toString());
		return seller;
	}

}
