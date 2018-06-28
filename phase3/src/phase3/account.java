package phase3;

import java.util.Scanner;

public class account {
	String user_name;
	String name;
	String mail;
	String password;
	String gender;
	int age;
	Scanner input =new Scanner(System.in);
	public account(){
	    user_name="";
	    mail="";
	    age=0;
	    gender="";
	    password="";
	    name="";
	    
	}
	public void login(){		
		System.out.print("enter user name :- ");
		user_name=input.nextLine();
		System.out.print("enter your password :- ");
	    password=input.nextLine();
		 
		
	}
	
	

}
