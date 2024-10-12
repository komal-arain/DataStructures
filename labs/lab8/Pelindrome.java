package labs.lab8;

public class Pelindrome {
 
    public static boolean isPelindrome(String str)
    {
     if(str.length()<=1)
     {
        return true;
     }
     if (str.charAt(0)!=str. charAt(str.length()-1))
     {
        return false;
     }
     return isPelindrome(str.substring(1, str.length()-1));
  

    } 

    public static void main(String[] args) {
        
      String str="racecar";
   
      boolean Pelindrome =isPelindrome(str);
      System.out.println("is "+str +" is pelindrome \n"+Pelindrome);


    }

   
    

}
