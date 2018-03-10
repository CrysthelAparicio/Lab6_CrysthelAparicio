
public class Comidas extends Productos {

    private String tipo_comida;

    public Comidas() {
    }

    public Comidas(String tipo_comida, double precio_costo, double precio_venta, String nombre) {
        super(precio_costo, precio_venta, nombre);
        this.tipo_comida = tipo_comida;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    @Override
    public String toString() {
        return tipo_comida;
    }

}
