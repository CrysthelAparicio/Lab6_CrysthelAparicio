public class Productos {

    private double precio_costo;
    private double precio_venta;//IVS
    private String nombre;

    public Productos() {
    }

    public Productos(double precio_costo, double precio_venta, String nombre) {
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.nombre = nombre;
    }

    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public double IVS(double venta){
         double impuesto=0, subtotal=0;
         subtotal=venta*1.15;
         
         
        return subtotal;
    }
    public double impuesto(double subtotal){
        double imp=subtotal*0.15;
        return imp;
    }

    @Override
    public String toString() {
        return "Productos{" + "precio_costo=" + precio_costo + ", precio_venta=" + precio_venta + ", nombre=" + nombre + '}';
    }

}
