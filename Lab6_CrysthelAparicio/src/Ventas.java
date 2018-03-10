
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Ventas {

    private double total_venta;
    private String fecha;

    public Ventas() {
    }

    public Ventas(double total_venta, String fecha) {
        this.total_venta = total_venta;
        this.fecha = fecha;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void guardar(String texto, JFrame jf) throws IOException{
           File archivo=null;
           FileWriter fw=null;
           BufferedWriter bw=null;
           try {
            archivo=new File("./ventas.txt");
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
    
    public void guardararchivo(String texto, JFrame jf){
        JFileChooser jfc=new JFileChooser();
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion=jfc.showSaveDialog(jf);
        FileWriter fw=null;
        BufferedWriter bw=null;
        if(seleccion==JFileChooser.APPROVE_OPTION){
            try {
               File fichero=null;
               if(jfc.getFileFilter().getDescription().equals("Archivos de Texto")){
                   fichero=new File(jfc.getSelectedFile().getPath()+".txt");
                   
               }else{
                   fichero=jfc.getSelectedFile();
               }
               fw=new FileWriter(fichero);
               bw=new BufferedWriter(fw);
               bw.write(texto);
               bw.flush();
               JOptionPane.showMessageDialog(jf, "Archivo guardado exitosamente");
               
            } catch (Exception e) {
                 e.printStackTrace();
            }
        }
    }
    
    @Override
    public String toString() {
        return "Venta{" + "total_venta=" + total_venta + ", fecha=" + fecha + '}';
    }

}
