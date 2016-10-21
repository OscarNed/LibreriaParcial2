package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class Queue <T> {
    //Atributos
    private fila.NodeClass first;
    private fila.NodeClass last;
    private int size;
    
    //Métodos
    
    //Constructor
    public Queue(){
        this.first = null;
        this.last = null;
        size = 0;
    }
    
    public Queue(T data){
        insertLast(data);
    }
    
    public void insertLast(T data){
        fila.NodeClass node = new fila.NodeClass(data);
        if (isEmpty()){
            this.first = node;
            this.last = node;
        } else {
            node.setNext(last);
            last = node;
        }
        ++size;
    }
    
    public void eraseFirst(){
        fila.NodeClass aux;
        if (isEmpty()){
            aux = last;
            while (aux.getNext() != first){
                aux = aux.getNext();
            }
            aux.setNext(null);
            first = aux;
            --size;
        }
    }
    
    public void eraseQueue(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public fila.NodeClass getFirst(){
        return first;
    }
    
    public fila.NodeClass getLast(){
        return last;
    }
    
    public int getSize(){
        return size;
    }
    
    public void setFirst(fila.NodeClass first){
        this.first = first;
    }
    
    public void setLast(fila.NodeClass last){
        this.last = last;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    public boolean isEmpty(){
        return this.first == null;
    }
}
