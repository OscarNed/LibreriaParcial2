package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class NodeD <T> {
    //Atributos
    private T data;
    private NodeD next;
    private NodeD prev;
    
    //Métodos
    
    //Constructor
    public NodeD (T data){
        this.data = data;
        this.next = null;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public void setNext(NodeD next){
        this.next = next;
    }
    
    public void setPrev(NodeD prev){
        this.prev = prev;
    }
    
    public T getData(){
        return data;
    }
    
    public NodeD getNext(){
        return next;
    }
    
    public NodeD getPrev(){
        return prev;
    }
}
