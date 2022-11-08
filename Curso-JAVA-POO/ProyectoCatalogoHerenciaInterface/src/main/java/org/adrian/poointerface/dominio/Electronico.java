package main.java.org.adrian.poointerface.dominio;

abstract public class Electronico extends Producto implements IElectronico {

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
