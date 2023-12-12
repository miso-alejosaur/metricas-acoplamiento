package production;

public class Cajero {

    public Cajero() {
    }

    public static void procesarTransaccion(Carrito carrito) {
        double precio = carrito.darPrecio();
        System.out.println("El precio total es: " + precio);
        Inventario.getInventario().actualizarInventario(carrito.getProductos());
    }

    public static void main(String[] args) {
        Inventario inventario = Inventario.getInventario();

        Producto producto1 = new Producto("Producto 1", 1000);
        Producto producto2 = new Producto("Producto 2", 2000);
        Producto producto3 = new Producto("Producto 3", 3000);

        inventario.addProduct(producto1);
        inventario.addProduct(producto2);
        inventario.addProduct(producto3);

        Carrito carrito = new Carrito();

        carrito.addProduct(producto1);
        carrito.addProduct(producto2);

        procesarTransaccion(carrito);
    }
}
