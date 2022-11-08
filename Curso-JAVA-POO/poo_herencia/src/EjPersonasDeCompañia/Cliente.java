package EjPersonasDeCompañia;

public class Cliente extends Persona {
    private int clienteId;

    public Cliente(int clienteId, String numeroFiscal, String nombre, String apellido, String direccion) {
        super(numeroFiscal, nombre, apellido, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "clienteId=" + clienteId + ", " + super.toString();
    }
}
