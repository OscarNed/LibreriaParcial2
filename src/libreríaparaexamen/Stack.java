package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky
 */
public class Stack <T> {
    //Atributos
    private pila.NodeClass top;
    private int size;
    
    //Métodos
    
    //Constructor
    public Stack(){
        this.top =  null;
        this.size = 0;
    }
    
    public pila.NodeClass getTop(){
        return top;
    }
    
    public int getSize(){
        return size;
    }
    
    public void pust (T data){
        pila.NodeClass node = new pila.NodeClass(data);
        if (isEmpty()){
            top = node;
        }
        ++size;
    }
    
    public void pop(){
        if (!isEmpty()){
            top = top.getNext();
            --size;
        } else {
            System.out.println("La lista está vacía.");
        }
    }
    
    public void eraseStack(){
        top = null;
        size = 0;
    }
    
    public void showStack(){
        pila.NodeClass aux = top;
        if (isEmpty()){
            System.out.println("La lista está vacía.");
        } else {
            while (aux.getNext() != null){
                System.out.println("[" + aux.getData() + "]\n");
                aux = aux.getNext();
            }
            System.out.println("La lista está vacía.");
        }
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    
}
