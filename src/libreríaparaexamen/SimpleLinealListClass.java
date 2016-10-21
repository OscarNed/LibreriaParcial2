package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class SimpleLinealListClass <T> {
    //Atributos
    NodeClass first;
    NodeClass last;
    
    //Métodos
    
    //Constructor
    public SimpleLinealListClass(){
        
    }
    
    public void insertFirst(T n){
        NodeClass node = new NodeClass(n);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            //node.next = first;
            first = node;
        }
    }
    
    public void insertLast(T n) {
        NodeClass node = new NodeClass(n);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            //last.next = node;
            last = node;
        }
    }
    
    public void eraseLast() {
        if(isEmpty()){
            System.out.println("La lista está vacía.");
        }
        if(first == last) {
            first = null;
            last = null;
        } else {
            NodeClass aux = first;
            while (aux.getNext() != last){
                aux = aux.getNext();
            }
            aux.setNext(null);
            last = aux;
        }
    }
    
    public void eraseFirst () {
        if(isEmpty()){
            System.out.println("La lista está vacía.");
        }
        if (first == last){
                first = null;
                last = null;
            } else {
                NodeClass aux = first;
                first = aux.getNext();
            }
    }
    
    public void eraseNode(T data) {
        NodeClass aux;
        if (isEmpty()){
            System.out.println("La lista está vacía.\n");
        } else {
            if (first.data == data){
                eraseFirst();
            } else {
                aux = first;
                while (aux.getNext() != null && aux.getNext().getData() != data){
                    aux = aux.getNext();
                }
                if (aux.getNext() != null && aux.getNext().getData() == data){
                    aux.setNext(aux.getNext().getNext());
                    System.out.println("El nodo con el dato '" + data + "' se ha eliminado.\n");
                } else {
                    System.out.println("El nodo con el dato '" + data + "' no se ha encontrado.\n");
                }
            }
            
        }
    }
    
    public void showList(){
        if (isEmpty() == false){
            NodeClass aux = first;
            while (aux != null){
                System.out.print("[" + aux.data + "] ");
                aux = aux.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("La lista está vacía.\n");
        }
    }
    
    private boolean isEmpty() {
        return (first == null && last == null);
    }
}
