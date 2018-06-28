package phase3;

import java.util.Scanner;

public class system {
	public static DBgame d=new DBgame();
	public static DBuser u=new DBuser();
	public static Scanner in =new Scanner(System.in);
	public static account a=new account();
	public static  studentaccount s=new studentaccount();
	public static  teacherstudent t=new teacherstudent();
	public static void main(String[] args) {
		int type;
	  while(true){	
		System.out.println("if you need to login enter 1 or registre enter 2 , enter 0");
		type=in.nextInt();
		if(type==1){
		  System.out.println("as teacher enter 1 or as student enter 2");
		  int typeuser=in.nextInt();
			
			a.login();
			
			if(u.validation(a, typeuser)==false){
				System.out.println("your info not found please try again");
			}else{
				System.out.println("welcome "+a.name);
				break;
			}
		}else if(type==2){
			System.out.println("as teacher enter 4 or as student enter 3");
			int typereg=in.nextInt();
			if(typereg==3){
				studentaccount s=new studentaccount();
				s.registration();
			
				if(u.validation(s, typereg)==false){
					System.out.println("your info not found please try again");
				}else{
					System.out.println("welcome "+s.name);
					break;
				}
			}else if(typereg==4){
				
				t.registration();
			
				if(d.validation(t, typereg)==false){
					System.out.println("your info not found please try again");
				}else{
					System.out.println("check your mail to verity your account");
					break;
				}
			}
		}else{
			break;
		}

	}
	  if(type==1)
	  {
		  System.out.println("you want to create game enter 1 ");
		  int need=in.nextInt();
		  if(need==1){
		       System.out.println("there are category 1 mul choose and category 2 true or fulse");
		       System.out.println("1=mulchoose   , 2-true or fulse");
		       need=in.nextInt();
		       if(need==1){
		    	   categ1 c=new categ1();
		    	   c.creategame(d,t);
		       }else if(need==2){
		    	   categ2 c=new categ2();
		    	   c.creategame(d,t);
		       }else{
		    	   System.out.println("your input is wrong");
		       }
		  }
			  
		  }else if(type==2){
			  System.out.println("need to play enter 1");
			  int need=in.nextInt();
			  if(need==1){
				  System.out.println("there are category 1 mul choose and category 2 true or fulse");
			       System.out.println("1=mulchoose   , 2-true or fulse");
			       int tr=in.nextInt();
			       if(tr==1){
			    	   categ1 g=new categ1();
				       int score= g.playgame(d);
				       s.score+=score;
			       }else if(tr==2){
			    	   categ2 p=new categ2();
				       int score= p.playgame(d);
				       s.score+=score;
			       }
			        
				  
			  }else{
				  System.out.println("go from here");
			  }
		  
	  }
	}

}
