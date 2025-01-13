package check;
import java.util.Scanner;
public class HelloWorld
{
	public static void main(String[] prabhas) 
	{
		//primitive 8:-
		/*
		  byte:-
		  short:-
		  int:-
		  long:- l
		  
		  float
		  double
		  
		  boolean:- True False
		  
		  char:- Ascii
		  
		  
		  byte,short,int,char   :-int
		  
		  ()-.conversions
		  1)implicit
		  2)explicit
		  3)error
		  //
		   if,if else, nested if else, if else ladder, switch
		   while,do,for,foreach 
		   
		   
		   number is perfecrt square or not
		   
		 */
		System.out.println("enter a numbaer");
		int a,c=0,f=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
//		System.out.println((a*(a-1))/2);
		/*
		 * if(a<0) { System.out.println("negative"); a+=10; if(a>0) {
		 * System.out.println("Positive-4"); } } else if(a>0)
		 * System.out.println("positive"); else System.out.println("zero");
		 * System.out.println(a);
		 */
		switch(a) {
		case 1: System.out.println("monday");
				break;
		case 2: System.out.println("tuesday");
				break;
		default : System.out.println("no day ");
		}
	}
}
