
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Facturas {
    private ArrayList<Productos> productos=new ArrayList();
    private String correo;
    private String nombre_cliente;
    private String RTN;
    private String CAI;
    private String fecha;

    public Facturas(String correo, String nombre_cliente, String RTN, String CAI, String fecha) {
        this.correo = correo;
        this.nombre_cliente = nombre_cliente;
        this.RTN = RTN;
        this.CAI = CAI;
        this.fecha = fecha;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getCAI() {
        return CAI;
    }

    public void setCAI(String CAI) {
        this.CAI = CAI;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "productos=" + productos + ", correo=" + correo + ", nombre_cliente=" + nombre_cliente + ", RTN=" + RTN + ", CAI=" + CAI + ", fecha=" + fecha + '}';
    }

    public Facturas() {
    }
    public String facturinga(String Productos,double subtotal,double impuestos, double total){
        String fact="Factura \n"
                  + "Dunkin Donuts\n"
                  + "CAI:"+CAI+"\n"
                  + "RTN:"+RTN+"\n"
                  + "Fecha:"+fecha+"\n"
                  +"Correo:"+correo+"\n"
                  +"Cliente:"+nombre_cliente+"\n"
                  +"Productos\n"+Productos+"\n"
                  +"Sub total:"+subtotal+"\n"
                   + "Impuesto:"+impuestos+"\n"
                           + "total:"+total;
        return fact;
    } 
}