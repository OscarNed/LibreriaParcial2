package libreríaparaexamen;

import java.util.Arrays;

/**
 *
 * @author OscarNL
 */
public class Stack2 {
    //Atributos
    String [] stack;
    private int size = 0;
    
    //Métodos
    
    //Constructor
    public Stack2(int n){
        stack = new String[n];
    }
    
    public void showStack(){
        for (int i = stack.length - 1; i >= 0; i--){
            System.out.println("[" + stack[i] + "]");
        }
        System.out.println("\n");
    }
    
    public void push(String data){
        stack[size] = data;
        ++size;
    }
    
    public void pop(){
        stack[size - 1] = null;
        -- size;
    }
    
    public int getSize(){
        return size;
    }
    
    public String getTop(){
        return stack[size - 1];
    }
    
    public void eraseStack(){
        Arrays.fill(stack, null);
    }
}
