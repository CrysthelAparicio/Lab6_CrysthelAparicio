
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ingresos {

    private ArrayList<Ventas> venta = new ArrayList();
    private File direccion_archivo;

    public Ingresos(File direccion_archivo) {
        this.direccion_archivo = direccion_archivo;
    }

    public Ingresos() {
    }

    public ArrayList<Ventas> getVenta() {
        return venta;
    }

    public void setVentas(ArrayList<Ventas> venta) {
        this.venta = venta;
    }

    public File getDireccion_archivo() {
        return direccion_archivo;
    }

    public void setDireccion_archivo(File direccion_archivo) {
        this.direccion_archivo = direccion_archivo;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "ventas=" + venta + ", direccion_archivo=" + direccion_archivo + '}';
    }
    
    public void guardar(String texto, JFrame jf){
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
}