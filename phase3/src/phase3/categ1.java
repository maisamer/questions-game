package phase3;

import java.util.ArrayList;
import java.util.Scanner;

public class categ1 implements game{
	String name;
	String usrnameofeditor;
	ArrayList<categ1collect > onegame=new ArrayList<categ1collect >();
	categ1(){
		name="";
		 usrnameofeditor="";
		
	}
	@Override
	public void creategame(DBgame d,teacherstudent t) {
		categ1 s=new categ1();
		s.usrnameofeditor=t.name;
		Scanner input=new Scanner(System.in);
		System.out.println("enter name of game");
		s.name=input.nextLine();
		System.out.println("enter number of qusetion");
		int num=input.nextInt();
		int n=0;
		while(n<num){
			categ1collect a=new categ1collect();
			while(true){
			System.out.println("enter Question");
			a.Question=input.nextLine();
			System.out.println("enter ch1");
			a.ch1=input.nextLine();
			System.out.println("enter ch2");
			a.ch2=input.nextLine();
			System.out.println("enter ch3");
			a.ch3=input.nextLine();
			System.out.println("enter ch4");
			a.ch4=input.nextLine();
			System.out.println("enter answer");
			a.answer=input.nextLine();
			if(d.validation(a, 1))
				break;
			else
				System.out.println("Error please enter Question again : ");
			}
			n++;
			s.onegame.add(a);
			}
		  d.addcat1(s);
		
			
		}
		
	

	@Override
	public int playgame(DBgame d) {
		Scanner c=new Scanner(System.in);
		d.getallgamescateg1();
		System.out.println("enter number of game you need");
		int index=c.nextInt();
		categ1 e=d.getgamebyindexcateg1(index);
		System.out.println("this game editor by "+e.usrnameofeditor);
		int n=0,score=0;
		while(e.onegame.size()>n){
			categ1collect x=e.onegame.get(n);
			System.out.println("answer this question "+x.Question);
			System.out.println("1"+x.ch1);
			System.out.println("2"+x.ch2);
			System.out.println("3"+x.ch3);
			System.out.println("4"+x.ch4);
			System.out.println("enter your anwser  ");
			String an=c.nextLine();
			if(an.equals(x.answer)){
				System.out.println("correct anwser");
				score++;
			}else{
				System.out.println("wrong anwser ,coorect answer "+x.answer);
			
			}
			n++;
		}
		System.out.println("end of game your score is "+score);
		
		return score;
		
	}
		
		
	


}
class categ1collect{
	
	String Question;
    String ch1;
    String ch2;
    String ch3;
    String ch4;
    String answer;
    int numofquestion;
    
    public categ1collect() {
    	 
 	   Question="";
        ch1="";
         ch2="";
         ch3="";
         ch4="";
         answer=""; 
    }
}
