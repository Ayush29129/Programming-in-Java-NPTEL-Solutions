import java.util.Scanner;
  
  public class Question5_3 {
  public static void main(String[] args) { 
      int a, b;
      Scanner input = new Scanner(System.in);

//Read any two values for a and b.
 //Get the result of a/b;
 a=input.nextInt();
 b=input.nextInt();

try{
	System.out.println(a/b);
}
catch(Exception e){
System.out.println("Exception caught: Division by zero.");
}


 }
}
