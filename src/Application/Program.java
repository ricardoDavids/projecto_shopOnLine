package Application;

import java.util.Scanner;

import entities.Client;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		
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
		
		//Person ps= new Client();  Neste caso não iria instanciar assim?
		
		System.out.println("Password:");
		 cl.setPassword("aeiou12");
		
		
		cl.registerUser("aeiou12");
		
		
		
		
		
		System.out.println(cl);

	}

}
