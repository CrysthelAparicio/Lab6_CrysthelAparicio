
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Inventario {

    private ArrayList<Productos> producto = new ArrayList();
    private File direccion_archvo;

    public Inventario() {
    }

    public Inventario(File direccion_archvo) {
        this.direccion_archvo = direccion_archvo;
    }

    public ArrayList<Productos> getProducto() {
        return producto;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.producto = producto;
    }

    public File getDireccion_archvo() {
        return direccion_archvo;
    }

    public void setDireccion_archvo(File direccion_archvo) {
        this.direccion_archvo = direccion_archvo;
    }

    public void EscribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(direccion_archvo, false);
            bw = new BufferedWriter(fw);
            for (Productos p : producto) {
                if (p instanceof Comidas) {
                    Comidas c = (Comidas) p;
                    bw.write("Comida" + ",");
                    bw.write(c.getNombre() + ",");
                    bw.write(c.getTipo_comida() + ",");
                    bw.write(c.getPrecio_costo() + ",");
                    bw.write(c.getPrecio_venta() + ",");
                } else if (p instanceof Bebidas) {
                    Bebidas b = (Bebidas) p;
                    bw.write("Bebida" + ",");
                    bw.write(b.getNombre() + ",");
                    bw.write(b.getPrecio_costo()+",");
                    bw.write(b.getPrecio_venta() + ",");
                    bw.write(b.getEstado() + ",");
                    bw.write(b.getTamaño() + ",");
                    bw.write(b.getTipo() + ",");
                }
            }
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void CargarArchivo() {
        Scanner sc = null;
        producto = new ArrayList();
        if (direccion_archvo.exists()) {
            try {
                sc = new Scanner(direccion_archvo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    if (sc.next().equals("Comida")) {
                        String n = sc.next();
                        String tp = sc.next();
                        double pv = sc.nextDouble();
                        double pc = sc.nextDouble();
                        producto.add(new Comidas(tp, pc, pv, n));
                    } else if (sc.next().equals("Bebida")) {
                        String n = sc.next();
                        double pv = sc.nextDouble();
                        double pc = sc.nextDouble();
                        String estado = sc.next();
                        String tam = sc.next();
                        String tipo = sc.next();
                        producto.add(new Bebidas(estado, tam, tipo, pc, pv, n));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }
    
    

    @Override
    public String toString() {
        return "Inventario{" + "productos=" + producto + ", direccion_archvo=" + direccion_archvo + '}';
    }
    
     public void guardar(String texto, JFrame jf) throws IOException{
          File archivo=null;
           FileWriter fw=null;
           BufferedWriter bw=null;
           try {
            archivo=new File("./inventario.txt");
            fw=new FileWriter(archivo,false);
            bw =new BufferedWriter(fw);
          
            bw.write(texto);
            bw.write("\n");
          
            bw.flush();
        } catch (Exception e) {
        }
           bw.close();
           fw.close();
     }
    }

