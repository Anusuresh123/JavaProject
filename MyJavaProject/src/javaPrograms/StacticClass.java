package javaPrograms;



public class StacticClass {

//static variable gets memory only once
	int rollno;
	String name;
	static String college ="MIST";
	String collegeG;
	
	StacticClass(int r, String n,String u)
	{
		rollno=r;
		name=n;
		collegeG=u;
	}
	StacticClass(int r, String n)
	{
		rollno=r;
		name=n;
		
	}
	void display() {
		
		System.out.println(name+" "+rollno+" "+college);
		
		
	}
	
void display1() {
		
		System.out.println(name+" "+rollno+" "+collegeG);
		
		
	}
	
	
	public static void main(String[] args) {

		StacticClass p=new StacticClass(111, "Anu");
		StacticClass pp=new StacticClass(1211, "Anu P Suresh");
		
		p.display();
		pp.display1();

		
	}

}
