import java.util.Scanner;
public class Question5_5{
	public static void main (String   args[ ] ) {
           Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
	    int j;  
// Put the following code under try-catch block to handle exceptions
      switch (i) {
	    case 0 : 
        try{
		int zero = 0; 
		j = 92/ zero;
        }catch(ArithmeticException ae){
        System.out.println("java.lang.ArithmeticException: / by zero");
        }
		break;
            case 1 : 
        try{
		int b[ ] = null; 
		j = b[0] ;
        }catch(NullPointerException e){
         System.out.println("java.lang.NullPointerException");
        }
		break;
      	    default:
	       System.out.println("No exception");
	 }
 }
}
