package phase3;

import java.util.ArrayList;
import java.util.Scanner;

public class categ2 implements game {
	String name;
	String usrnameofeditor;
	
	ArrayList<categ2collect> onegame=new ArrayList<categ2collect>();
	public categ2(){
		name="";
	 usrnameofeditor="";
		
	}
	public void creategame(DBgame d,teacherstudent t) {
		
		categ2 s=new categ2();
		s.usrnameofeditor=t.name;
		Scanner input=new Scanner(System.in);
		System.out.println("enter name of game");
		s.name=input.nextLine();
		System.out.println("enter number of qusetion");
		int num=input.nextInt();
		int n=0;
		
		while(n<num){
			
			categ2collect c=new categ2collect();
			while(true){
			System.out.println("enter Question");
			c.Question=input.nextLine();
			System.out.println("entr answer if true==1 or false==0");
			int an=input.nextInt();
			if(an==1){
				c.answer=true;
			}else{
				c.answer=false;
			}
			if(d.validation(c, 2))
				break;
			else
				System.out.println("Error please enter Question again : ");
			}
			n++;
			s.onegame.add(c);
			
			}
		d.addcat2(s);
		
	}

	@Override
	public int playgame(DBgame d) {
		int score=0;
		Scanner c=new Scanner(System.in);
		d.getallgamescateg2();
		System.out.println("enter number of game you need");
		int index=c.nextInt();
		categ2 e=d.getgamebyindexcateg2(index);
		int n=0;
		System.out.println("play game "+e.name);
		Scanner input=new Scanner(System.in);
		while(e.onegame.size()>n){
			categ2collect x=e.onegame.get(n);
			System.out.println("answer this question "+x.Question);
			System.out.print("enter t or f");
			String g=input.nextLine();
			if(g.equals("t")&&x.answer==true){
				System.out.println("correct anwser");
				score++;
			}else if(g.equals("f")&&x.answer==false){
				System.out.println("correct anwser");
				score++;
			}else{
				System.out.println("wrong anwser ,coorect answer "+x.answer);
				System.out.println("this game editor by "+e.usrnameofeditor);
			}
			n++;
		}
		System.out.println("end of game your score is "+score);
		
		return score;
		
	}
	
}
class categ2collect{
	String name;
	String Question;
    boolean answer;	    
    public categ2collect() {
 	   Question="";
       name="";
         answer=false; 
    }

}

