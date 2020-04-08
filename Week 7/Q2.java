import java.io.*;  
public class Question2{  
public static void main(String args[]){  
 //Use appropriate Try..catch block to complete the code  
boolean result=false;int x=0;
  InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r);  
try{
   String number=br.readLine();  
   x = Integer.parseInt(number);
   result=true;
}
catch(Exception e){
	System.out.print("Please enter valid data");
}
if(result)
   System.out.print(x*x);
   
 }  
} 
