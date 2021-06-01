package entities;

public class Client extends Person {

	private String loguin;
	private String password;
	
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

	@Override
	public void registerUser(String password) {
		
		 this.password= "aeiou12";
		 if(password == "aeiou12") {
			 System.out.println("User registed");
		 }
		 else {
			 System.out.println("Try again");
		 }
		
	}

	@Override
	public String toString() {
		return "Client [loguin=" + loguin + ", password=" + password + ", getLoguin()=" + getLoguin()
				+ ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
