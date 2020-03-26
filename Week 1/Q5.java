import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it of integer type.
      int[] arr = new int[s];   
      
	 for(i=0;i<arr.length;i++)
	  {
        	arr[i]=input.nextInt();
	  } 
 //Initialize maximum element as first element of the array.  
   //Traverse array elements to get the current max.
	int z = arr[0],sum=0;
	for(int j=0;j<arr.length;j++)
    {
      sum=sum+arr[j];
      if(arr[j]>z)
        z = arr[j];
    }
	result = z;
	System.out.println(result);
	mark_avg = sum/s;
	System.out.print(mark_avg);
	
   //Store the highest mark in the variable result.
   //Store average mark in avgMarks.
 }
}
