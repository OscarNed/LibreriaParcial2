package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class NodeClass <T> {
    //Atributos
    T data;
    NodeClass next;
    
    //Métodos
    
    //Constructor
    public NodeClass (T data){
        this.data = data;
        this.next = null;
    }
    
    public T getData (){
        return data;
    }
    
    public NodeClass getNext (){
        return next;
    }
    
    public void setData (T data){
        this.data = data;
    }
    
    public void setNext (NodeClass next){
        this.next = next;
    }
}
