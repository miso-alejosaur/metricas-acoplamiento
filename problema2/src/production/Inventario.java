package production;


// import hashmap
import java.util.HashMap;
import java.util.List;

public class Inventario {
    private HashMap<String, Producto> productos;

    private static Inventario instance = null;

    public static Inventario getInventario() {
        if(instance == null){
            instance = new Inventario();
        }

        return instance;
    }

    private Inventario(){
        this.productos = new HashMap<String, Producto>();
    }

    public void actualizarInventario(List<Producto> productos) {
        for (Producto producto : productos) {
            this.productos.remove(producto.nombre);
        }
    }

    public void addProduct(Producto producto) {
        this.productos.put(producto.nombre, producto);
    }
}
