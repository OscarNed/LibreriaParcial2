package libreríaparaexamen;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class NodeClass <T> {
    //Atributos
    T data;
    double precio;
    int cantidad;
    NodeClass next;
    
    //Métodos
    
    //Constructor
    public NodeClass (T data){
        this.data = data;
        this.precio = precio;
        this.cantidad = cantidad;
        this.next = null;
    }
    
    public T getData (){
        return data;
    }
    
    public double getPrecio (){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public NodeClass getNext (){
        return next;
    }
    
    public void setData (T data){
        this.data = data;
    }
    
    public void setPrecio (double precio){
        this.precio = precio;
    }
    
    public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }
    
    public void setNext (NodeClass next){
        this.next = next;
    }
}
