class Question65 extends Thread{  
  public void run(){  
    System.out.println("Thread is running.");  
  }  
 public static void main(String args[]){  
    Question65 t=new Question65();  
    System.out.println("Name of thread 't':"+ t.getName());  

// Write the necessary code below...
t.setPriority(10);
t.setName("Thread-0");
t.setPriority(5);
t.setName("NPTEL");

t.start();
   System.out.println("New name of thread 't':"+ t.getName());  
 }  
}

