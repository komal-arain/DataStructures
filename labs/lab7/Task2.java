package labs.lab7;
class Task2{
   


    public static void forward( char arr[],int index)
    {
       if (index==arr.length)
       {
        return;
       }
       else 
       {
        System.out.println(arr[index]);
        forward(arr,index+1);
       }
    }





    public static void reverse( char arr1[],int index)
    {
       if (index<0)
       {
        return;
       }
       else 
       {
        
        reverse(arr1,index-1);
        System.out.println(arr1[index]);
       }
    }


    public static void main(String[] args) {
        char []array={'a','f','b','c','e','d'};
    
         
        System.out.println("forward array");
        forward(array,0);
        System.out.println("reverse array");
        reverse(array,array.length-1);
        
    }

}