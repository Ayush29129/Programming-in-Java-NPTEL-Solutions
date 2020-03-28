import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Test3{
   public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

//Called the method sum() to find the sum of two numbers.
QuestionScope qc = new QuestionScope();
int s = qc.sum(n1,n2);
System.out.println(s);
int m = QuestionScope.multiply(n1,n2);
System.out.print(m);
//Called the method multiply() to find the product of two numbers.

}  
}
