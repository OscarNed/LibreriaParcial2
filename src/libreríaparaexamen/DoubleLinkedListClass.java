package libreríaparaexamen;

import listaencadenadadoble.NodeD;

/**
 *
 * @author OscarNedzelsky   A00513376
 */

public class DoubleLinkedListClass <T> {
    //Atributos
    private NodeD first;
    private NodeD last;
    
    //Métodos
    
    //Constructor
    public DoubleLinkedListClass () {
    
    }
    
    public void insertFirst(T data) {
        NodeD node = new NodeD(data);
        if (isEmpty()){
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first.setPrev(node);
            first = node;
        }
    }
    
    public void insertLast(T data){
        NodeD node = new NodeD(data);
        if (isEmpty()){
            first = node;
            last = node;
        } else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
    }
    
    private NodeD searchNode (T data){
        NodeD aux;
        if (isEmpty()){
            return null;
        } else {
            aux = first;
            while (aux.getData() != data && aux != null){
                aux = aux.getNext();
                if (aux.getData() == data) {
                    return aux;
                }
            }
            return null;
        }
    }
    
    public boolean eraseNode (T data){
        NodeD aux = searchNode(data);
        if (aux == null) {
            System.out.println("El nodo con el dato '" + data + "' no fue encontrado.");
            return false;
        } else if (aux == first) {
            eraseFirstNode();
        } else if (aux == last) {
            eraseLastNode();
        } else {
            aux.getNext().setPrev(aux.getPrev());
            aux.getPrev().setNext(aux.getNext());
        }
        return true;
    }
    
    public void eraseFirstNode () {
        first = first.getNext();
        first.setPrev(null);
    }
    
    public void eraseLastNode(){
        last = last.getPrev();
        last.setNext(null);
    }
    
    public boolean isEmpty(){
        return (first == null && last == null);
    }
    
    public void showList(){
        if (isEmpty()){
            System.out.println("La lista está vacía CHAN CHAN CHAN ☠☠☠☠☠☠");
        } else {
            NodeD aux = first;
            while (aux != null){
                System.out.print("[" + aux.getData() + "]⇒");
                aux = aux.getNext();
            }
        }
        System.out.println("\n");
    }
    
    public void showListReverse(){
        if (isEmpty()){
            System.out.println("La lista está vacía CHAN CHAN CHAN ☠☠☠☠☠☠");
        } else {
            NodeD aux = last;
            while (aux != null){
                System.out.print("⇐[" + aux.getData() + "]");
                aux = aux.getPrev();
            }
        }
        System.out.println("\n");
    }
}