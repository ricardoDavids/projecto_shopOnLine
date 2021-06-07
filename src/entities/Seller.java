package entities;

public class Seller extends Person {

	
	private String loguin;
	private String password;
	private String jobId;
	
	
	public Seller() {
		
	}
	
	public Seller(String name, Integer age, Integer id, String loguin, String password, String jobId) {
		super(name, age, id);
		this.loguin = loguin;
		this.password = password;
		this.jobId = jobId;
		
		
		
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
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
	
	/*
	@Override
	public void registerUser(String string) {
		
	}
	*/
}
