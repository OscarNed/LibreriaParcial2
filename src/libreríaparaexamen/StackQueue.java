package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class StackQueue <T> {
    private NodeD first;
    private NodeD last;
    private int size;
    
    public StackQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public Object getFirst(){
        return first.getData();
    }
    
    public Object getLast(){
        return last.getData();
    }
    
    public int getSize(){
        return size;
    }
    
    public void setFirst(NodeD first){
        this.first = first;
    }
    
    public void setLast(NodeD last){
        this.last = last;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    public void insertFirst(T data){
        NodeD node  = new NodeD (data);
        if (isEmpty()) {
            this.first = node;
            this.last = node;
            ++ size;
        } else {
            node.setNext(first);
            first.setPrev(node);
            first = node;
            ++ size;
        }
    }
    
    public void insertLast(T data){
        NodeD node = new NodeD (data);
        if (isEmpty()){
            this.first = node;
            this.last = node;
            ++ size;
        } else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
            ++ size;
        }
    }
    
    public void showList(){
        if (!isEmpty()){
            NodeD aux;
            aux = first;
            System.out.println("⇒");
            while (aux != null){
                System.out.println("[" + aux.getData() + "]⇒");
                aux = aux.getNext();
            }
            System.out.println("");
        } else {
            System.out.println("La lista está vacía.");
        }
    }
    
    public void eraseFirst(){
        first = first.getNext();
        first.setPrev(null);
        -- size;
    }
    
    public void eraseLast(){
        last = last.getPrev();
        last.setNext(null);
        -- size;
    }
    
    public void eraseList(){
        first = null;
        last = null;
        size = 0;
    }
    
    public boolean isEmpty(){
            return first == null && last  == null && size == 0;
    }
}
