package phase3;

import java.util.Scanner;

public class studentaccount extends account{
	int score;
	Scanner input =new Scanner(System.in);
	public void registration(){
		System.out.print("enter name :- ");
		name=input.nextLine();
		System.out.print("enter username :- ");
		user_name=input.nextLine();
		System.out.print("enter mail :- ");
		mail=input.nextLine();
		System.out.print("enter password:- ");
		password=input.nextLine();
		System.out.print("enter gender :- ");
		gender=input.nextLine();
		System.out.print("enter age :- ");
		age=input.nextInt();
		score=0;
		
		
	}
	

}
