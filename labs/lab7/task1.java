package labs.lab7;
import java.util.Scanner;
class task1{
 
  public static void recursion( int n )
  {
    if(n<=0)
    {
        return;
    }
    System.out.print(n+" ");
    System.out.println();
     recursion(n-1);
    
     System.out.print(n+" ");
  

  }
 
  

public static void main(String[] args) {
    Scanner s=new  Scanner(System.in);
    System.out.println("give a no ");
    int n=s.nextInt();
    recursion(n);
   
   
}
   


}