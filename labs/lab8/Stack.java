package labs.lab8;
import java.util.LinkedList;
import java.util.Scanner;
 
 class UndoRedoStack{
      
    private LinkedList<String>stack;
    private LinkedList<String> redoStack;

     UndoRedoStack()
     {
        stack= new LinkedList<>();
        redoStack= new LinkedList<>();
     }

     public void insert(String text)
     {
        stack.push(text);
        redoStack.clear();
     }

     public boolean undo(){
        if(!stack.isEmpty()){
            String lastAction =stack.pop();
            redoStack.push(lastAction);
            return true;
            
        }
        return false;


     }

     public  boolean redo()
     {
        if(!redoStack.isEmpty())
        {
            String LastUndone = redoStack.pop();
            stack.push(LastUndone);
            return true ;

        }
        return false;
     }

     
  
    }
 

    

public class Stack{
    public static void main(String[] args) {
   
        
    }

}
