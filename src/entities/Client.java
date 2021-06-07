package entities;

import dto.CartDTO;

public class Client extends Person {

	private String loguin;
	private String password;
	private Double balance;//saldo em carteira
	
	

	private CartDTO cart = new CartDTO(); //Aqui tenho uma dependencia de CartDTO
	
	public Client() {
		
	}

	public Client(String name, Integer age, Integer id, String loguin, String password) {
		super(name, age, id);
		this.loguin = loguin;
		this.password = password;
	}

	public String getLoguin() {
		return loguin;
	}

	public void setLoguin(String loguin) {
		this.loguin = loguin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public CartDTO getCart() {
		return cart;
	}

	public void setCart(CartDTO cart) {
		this.cart = cart;
	}
	
	
	//Perguntar porque não poderia fazer aqui este metodo abaixo, é que estava a dar me erro no programa main
	
	
	public Client registerUser() {
		Client cl= new Client();
		cl.setLoguin("@Pereira");
		cl.setName("David_Pereira");
		cl.setAge(35);
		//cl.setPassword("aeiou12");
		this.password= "aeiou12";
		 if(password == "aeiou12") {
			 System.out.println("User registed");
		 }
		 else {
			 System.out.println("Error: Insert again correct password ");
		 }
		return cl;
	}

	
	@Override
	public String toString() { 
		return "Client [loguin=" + loguin + ", password=" + password + " Name:" + registerUser().getName() + " Age:" + registerUser().getAge() ;
	}
	
}
