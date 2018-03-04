package languagefundaments;

public class Flat {
	String owner;
	double rent;
	int members;
	
	public void addMember(){
		members = members+1;
	}
	
	public void deleteMember(){
		members = members - 1;
	}
	
	public void cleanFlat(){
		System.out.println("Flat is cleaned for "+owner);
	}
	
	public static void main(String[] args) {
		Flat f1 = new Flat();
		f1.owner = "Rahim";
		f1.rent = 32523;
		f1.members = 4;
		
		Flat f2 = new Flat();
		f2.owner = "San";
		f2.rent = 5123523;
		f2.members = 6;
		
		
		f1.addMember();
		
		f2.cleanFlat();
		
		System.out.println(f2.members);
		System.out.println(f1.members);
		
		int x  = 20;
		int y = 45;
		
		f1.addNumbers(x, y);
		
		
	}
	
	
	public int addNumbers(int a, int b){
		return a+b;
	}
}
