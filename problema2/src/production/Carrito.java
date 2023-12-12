package production;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<Producto>();
    }

    public void addProduct(Producto producto) {
        this.productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double darPrecio() {
        double precio = 0;
        for (Producto producto : this.productos) {
            precio += producto.precio;
        }
        return precio;
    }

    
}
