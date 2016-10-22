package libreríaparaexamen;

import java.util.Random;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class SimpleLinealListClass <T> {
    //Atributos
    listaencadenadalineal.NodeClass first;
    listaencadenadalineal.NodeClass last;
    
    //Métodos
    
    //Constructor
    public SimpleLinealListClass(){
        
    }
    
    public void insertFirst(T n){
        listaencadenadalineal.NodeClass node = new listaencadenadalineal.NodeClass(n);
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
        listaencadenadalineal.NodeClass node = new listaencadenadalineal.NodeClass(n);
        double rnd = 5.00 + (double)(Math.random() * 40.00);
        if (isEmpty()) {
            first = node;
            last = node;
            node.setPrecio(rnd);
        } else {
            last.setNext(node);
            //last.next = node;
            last = node;
            node.setPrecio(rnd);
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
            listaencadenadalineal.NodeClass aux = first;
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
                listaencadenadalineal.NodeClass aux = first;
                first = aux.getNext();
            }
    }
    
    public void eraseNode(T data) {
        listaencadenadalineal.NodeClass aux;
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
            listaencadenadalineal.NodeClass aux = first;
            while (aux != null){
                System.out.println("[Producto " + aux.data + " , $" + aux.precio + "]");
                aux = aux.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("La lista está vacía.\n");
        }
    }
    
    public double searchPrice(T data){
        listaencadenadalineal.NodeClass aux = first;
        while (aux.getData() != data && aux != null){
                aux = aux.getNext();
                if (aux.getData() == data) {
                    return aux.getPrecio();
                }
            }
        return 0;
    }
    
    private boolean isEmpty() {
        return (first == null && last == null);
    }
}
