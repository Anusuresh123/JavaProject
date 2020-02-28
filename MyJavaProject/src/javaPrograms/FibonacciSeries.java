package javaPrograms;

public class FibonacciSeries {
//In fibonacci, next number is the sum of previous two numbers(0,1,1,2,3,5,8,13), first 2 numbers are 0,1
	
	
	public static void main(String[] args) {
int n1=0,n2=1,sum,i,count=10;

System.out.println(n1+" "+n2);

for(i=1;i<=count;i++);
{
sum=n1+n2;
n1=n2;
n2=sum;
System.out.println("" +sum );



}
		
	}

}
