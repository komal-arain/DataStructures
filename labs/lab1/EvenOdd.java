
import java.util.Arrays;

class EvenOdd{

public static void main (String args[])
{

    int[]array_num ={2,3,4,5,6,7,8,9};

    
  {System.out.println( "before sorting "+Arrays.toString(array_num));
  }
 int i=0;

  for(int j=0 ;j<array_num.length;j++)
  {
    if(array_num[j]%2!=0)
    {

int temp=0;
      temp =array_num[i];
      array_num[i]=array_num[j];
      array_num[j]=temp;
     i++;
    }
  }

  System.out.println("new array" + Arrays.toString(array_num));
}


}