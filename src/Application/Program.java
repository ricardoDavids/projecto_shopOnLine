package Application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Person;
import entities.Seller;

public class Program {

	private static final List<Seller> LIST_SELLER_CREATED =Arrays.asList(new Seller().createSeller()); 
	private static final List<Client> LIST_CLIENT_REGISTERUSER =Arrays.asList(new Client());
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Person ps= new Client();
		
		System.out.println(" - Are you a Seller or Client? -");
		System.out.println(" - 1. Client                   -");
		System.out.println(" - 2. Seller                   -");
		Integer answer = sc.nextInt();
		switch(answer) {
		
		case 1:
			//
			
			
			for(Client c:LIST_CLIENT_REGISTERUSER) {
				System.out.println("Digit your loguin!!");
				String loguinn = sc.next();
				System.out.println("Digit your Password!!");
				c.setPassword("aeiou12");
				
				c.registerUser();
				System.out.println("I am a client! :)");
				System.out.println(c);
				System.out.println();
				
				
				
				//Client Menu
				System.out.println("-----------'CLIENT MENU'--------------");
				System.out.println("Personal data:");
				System.out.println(c.toString());
			}
			break;
			
		case 2:
			for (Seller s:LIST_SELLER_CREATED) {
				System.out.println("Digit your loguin!!");
				String loguin = sc.next();
				System.out.println("Digit your Password!!");
				String password= sc.next();
				if( s.getLoguin().equals(loguin) && s.getPassword().equals(password))  {
					System.out.println("You are created! :)");
					
					//Seller Menu
					System.out.println("-----------'SELLER MENU'--------------");
					System.out.println("Personal data:");
						
					System.out.println("JobId: " + s.getJobId());
					System.out.println("Name: " + s.getName());
					System.out.println("Age: " + s.getAge());
					
					}
					else {
						System.out.println("----ERROR----");
						System.out.println("Your LOGUIN or PASSWORD is not correct!!"  + 
						" Try again!");
					}
				break;
				}
			}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner sc= new Scanner(System.in);
		
		Client cl = new Client();
		
		System.out.println("Enter date of the user(Client) register:");
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Age:");
		Integer age= sc.nextInt();
		
		System.out.println();
		
		System.out.print("Id");
		Integer id = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Loguin");
		String loguin= sc.next();
		
		
		
		System.out.println("Status of Client:");
		 cl.setPassword("aeiou12");
		
		Person ps= new Client(name,age, id, loguin, "aeiou12");  
		 
		cl.registerUser("aeiou12");
		
		System.out.println(ps);
		//System.out.println(cl);
		
	*/
	}
	}
	



/*private static final List<Seller> LIST_SELLER_CREATED =Arrays.asList(new Seller().createSeller()); 
 
 1- O metodo estatico em cima quer dizer que iremos criar os vendedores de forma automatica quando formos rodar o programa.  
   */
