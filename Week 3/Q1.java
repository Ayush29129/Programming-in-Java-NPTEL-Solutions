import java.util.Scanner; //This package for reading input
public class Fibonacci { 
    
    public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
 static int fib(int n) {

//complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
int a=0,b=1,sum=0;
if(n>2){
	for(int i=0;i<n-2;i++)
    {
      sum=a+b;
      a=b;
      b=sum;
    }
  return sum;
  
}
else
{
  if(n==1)
    return 0;
  else
    return 1;
}
}  
}
