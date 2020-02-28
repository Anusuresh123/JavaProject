package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {
//Get the number, store in a temp variable, reverse it, compare temp variable with number
		
		int r,sum=0,temp,n=454;
		temp=n;
		while(n>0) {
			
			r=n%10;
			
			sum=sum*10+r;    //(454%10=4, sum=0+4=4)
			
			n=n/10; 		
		}
		if (temp==sum) {
			
			System.out.println("palindrome number");
		}
		else {
		System.out.println("not palindrome number");

		}
		}
	}


