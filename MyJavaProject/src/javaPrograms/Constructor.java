package javaPrograms;

public class Constructor {
	//Initialize variables before main method
	//pass arguments to construction including data type

	 String name;
		int id;
        String college;        
        
        //constructor
		public Constructor(String n,int i,String c) {
			name=n;
			id=i;
			college=c;
		}
		
		
		
void display() {
	System.out.println(id+" "+name+" "+college);
	
}
	public static void main(String[] args) {

	
		Constructor c1=new Constructor("Anu",4,"MIST");
		Constructor c2=new Constructor("Anu P Suresh",40,"AAMR");

		
c1.display();	
c2.display();		

	
	}

}
