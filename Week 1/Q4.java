import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
int r=0,sum=0,temp=n;
while(temp != 0)
{
  r=temp%10;
  sum = sum +(r*r*r);
  temp=temp/10;
}
if(sum==n)
{
  result = 1;
  System.out.print(result);
}
else
{
  result=0;
  System.out.print(result);
}
 }
}
