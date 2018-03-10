public class Bebidas extends Productos {

    private String estado;
    private String tamaño;
    private String tipo;

    public Bebidas() {
    }

    public Bebidas(String estado, String tamaño, String tipo, double precio_costo, double precio_venta, String nombre) {
        super(precio_costo, precio_venta, nombre);
        this.estado = estado;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
