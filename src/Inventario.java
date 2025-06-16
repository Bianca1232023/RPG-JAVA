
import java.util.ArrayList;

public class Inventario{
    private ArrayList<String> inventario = new ArrayList<String>();

    public Inventario(){

    }

    public Inventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<String> getinventario() {
        return inventario;
    }

    public void setinventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

    public void additem(String item) {
        inventario.add(item);
    }

    public Boolean removeritem(String item) {
        return inventario.remove(item);
    }

}
