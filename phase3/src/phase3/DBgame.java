package phase3;

import java.util.ArrayList;

public class DBuser  implements DB{
	//1 as teacher login
	//2 as student login
	//3 as student reg
	//4 as teachher reg
	ArrayList<account> regasstudent=new ArrayList<>();
	ArrayList<account> regasteacher=new ArrayList<>();
	ArrayList<account> reginsystem=new ArrayList<>();

	@Override
	public boolean validation(Object g, int type) {
		account a=(account)g;
		if(type==1){
			for(int i=0;i<regasstudent.size();i++){
				account j=regasstudent.get(i);
				if(a.user_name.equals(j.user_name)&&a.password.equals(j.password)){
					return true;
				}
			}
			return false;
			
		}
		else if(type==2){
			for(int i=0;i<regasteacher.size();i++){
				account j=regasteacher.get(i);
				if(a.user_name.equals(j.user_name)&&a.password.equals(j.password)){
					return true;
				}
			}
			return false;
			
		}
		else {
			for(int i=0;i<reginsystem.size();i++){
				account j=reginsystem.get(i);
				if(a.user_name.equals(j.user_name)&&a.mail.equals(j.mail)){
					return false;
			}
			
			
		}
			if(type==3){
				regasstudent.add(a);
				reginsystem.add(a);
				
			}else if(type==4){
				regasteacher.add(a);
				reginsystem.add(a);
				
			}
			return true;
		}
		}
	

}