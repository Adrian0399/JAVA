package main.java.org.adrian.poointerface.dominio;

public abstract class Producto implements IProducto{

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

}
