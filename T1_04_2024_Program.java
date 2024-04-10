package TechM;

public class T1_04_2024_Program {
	public static void main(String args[])
	{
		
//Task 1: 
		
float data=2.5f/2;// 1.25
System.out.println("Output: "+data);
float data1=2.5f%2;// 0.5
System.out.println("Output: "+data1);
	
//Task_2: Sum of digits 

int d1=23%10;
int d2=23/10;
System.out.println("23 Sum of two digits: "+(d1+d2));
int num1= 54%10;
int num11=54/10;
System.out.println("54 Sum of two digits: "+(num1+num11));
int num2=33%10;
int num22=33/10;
System.out.println("33 Sum of two digits: "+(num2+num22));
int num3= 11%10;
int num33=11/10;
System.out.println("11 Sum of two digits: "+(num3+num33));

//Task_3

int c=7;
int e=12;
c%=2; e/=2;
System.out.println("Remiander of 7: "+c);// Remainder
System.out.println("Quotient of 12: "+e);// Quotient

//task 4: Logical Operators
int n1=5, n2=20, n3=7;
 if((n1<10) && (n2>9)||n3==7)
{
	System.out.println(n1);
}else
{
	System.out.println("other Numbers: "+n1);
}


	}
}
