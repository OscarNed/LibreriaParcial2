package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class CircularLinkedList <T> {
    //Atributos
    private listaencadenadacircular.NodeClass pivot;
    
    //Métodos
    
    //Constructor
    public CircularLinkedList (){
        pivot = null;
    }
    
    protected void insert(T n){
        listaencadenadacircular.NodeClass node = new listaencadenadacircular.NodeClass(n);
        if (!isEmpty()) {
            node.setNext(pivot);
            findLast().setNext(node);
            pivot = node;
        } else {
            pivot = node;
            node.setNext(pivot);
        }
    }
    
    private listaencadenadacircular.NodeClass findLast(){
        listaencadenadacircular.NodeClass aux = pivot;
        while (aux.getNext() != pivot){
            aux = aux.getNext();
        }
        return aux;
    }
    
    protected boolean eraseNode (T n){
        if (isEmpty()) {
            System.out.println("La lista está vacía.\n");
            return false;
        } else if (findLast().getNext().getData() == n) {
            listaencadenadacircular.NodeClass aux = findLast();
            aux.setNext(aux.getNext().getNext());
            pivot = aux.getNext();
            System.out.println("El nodo ha sido eliminado.\n");
        } else {
            listaencadenadacircular.NodeClass aux = pivot;
            while (aux.getNext().getData() != n && aux.getNext() != pivot){
                aux = aux.getNext();
            }
            if (aux.getNext().getData() == n){
                aux.setNext(aux.getNext().getNext());
                System.out.println("El nodo ha sido eliminado.\n");
            } else {
                System.out.println("El nodo no ha sido encontrado.\n");
                return false;
            }
        }
        return true;
    }
    
    protected listaencadenadacircular.NodeClass searchNode(T n){
        listaencadenadacircular.NodeClass aux = pivot;
        do {
            if (aux.getData() == n){
                return aux;
            } else {
                aux = aux.getNext();
            }
        } while (aux != pivot || aux.getData() != n);
        return null;
    }
    
    protected void showList(){
        if (isEmpty()){
            System.out.println("La lista está vacía.\n");
        } else {
            listaencadenadacircular.NodeClass aux = pivot;
            System.out.print("[" + aux.getData() + "] ");
            while (aux.getNext() != pivot) {
                System.out.print("[" + aux.getNext().getData() + "] ");
                aux = aux.getNext();
            }
            System.out.println("\n");
        }
    }
    
    private boolean isEmpty(){
        return pivot == null;
    }
}
