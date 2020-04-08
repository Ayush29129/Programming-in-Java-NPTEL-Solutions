import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
//Write your code here to count the number of vowels in the string "s1"
String s2=s1.toLowerCase();
for(int i=0;i<s2.length();i++){
  	
  	char ch=s2.charAt(i);
	if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
      c++;
  }
	


        System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
}  
