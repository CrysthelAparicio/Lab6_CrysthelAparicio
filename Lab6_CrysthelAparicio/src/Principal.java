
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    JFileChooser jfc = new JFileChooser();
    ArrayList<Productos> producto = new ArrayList();
    //ArrayList<Ventas> ventas = new ArrayList();
    Inventario inve = new Inventario();
    Ingresos ingre = new Ingresos();
    Inventario inv = new Inventario(new File("./inventario.txt"));
    PrintWriter Arch;
    ArrayList arreglo = new ArrayList();
    Facturas fact = new Facturas();
    String factura;
    String fecha_factura;
    double total_final;

    public Principal() {
        initComponents();
        initComponents();
        tfCodClienteFact.requestFocus();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("T I E N D A   D E   D O N A S");

        setIconImage(new ImageIcon(getClass().getResource("/imagenes/rosquilla.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/rosa.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_cliente = new javax.swing.JDialog();
        tfCodigoProducto = new javax.swing.JTextField();
        btCrearP1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salida1 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        tfCliente = new javax.swing.JTextField();
        btVer = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btCerrar = new javax.swing.JButton();
        btBuscarP1 = new javax.swing.JButton();
        tfCodigoCliente = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btVerP1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btCrear = new javax.swing.JButton();
        btCerrarP1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btGuardarP1 = new javax.swing.JButton();
        tfProducto = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida2 = new javax.swing.JTextArea();
        jd_factura = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        salida3 = new javax.swing.JTextArea();
        btGrabarFac = new javax.swing.JButton();
        tfPrecioFac = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tfClFac = new javax.swing.JTextField();
        btCerrarFac = new javax.swing.JButton();
        tfProdFac = new javax.swing.JTextField();
        btOtraFac = new javax.swing.JButton();
        btVerFac = new javax.swing.JButton();
        ver_factura = new javax.swing.JButton();
        tfCantidadFac = new javax.swing.JTextField();
        btBuscarFac = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfParcialFac = new javax.swing.JTextField();
        tfCodProductoFac = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfNumFactura = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        tfFac = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tfCodClienteFact = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        productos_comida = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb_donas = new javax.swing.JRadioButton();
        rb_sandwich = new javax.swing.JRadioButton();
        rb_semitas = new javax.swing.JRadioButton();
        tf_nombre = new javax.swing.JTextField();
        tf_venta = new javax.swing.JTextField();
        tf_costo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_comidas = new javax.swing.JList<>();
        agregar_comida = new javax.swing.JButton();
        modificar_comida = new javax.swing.JButton();
        eliminar_comida = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        productos_bebida = new javax.swing.JDialog();
        rb_te = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombre2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rb_caliente = new javax.swing.JRadioButton();
        eliminarbebidas = new javax.swing.JButton();
        rb_helado = new javax.swing.JRadioButton();
        modificar_bebidas = new javax.swing.JButton();
        tf_tamaño2 = new javax.swing.JTextField();
        agregar_bebidas = new javax.swing.JButton();
        tf_venta2 = new javax.swing.JTextField();
        tf_costo2 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_bebidas = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rb_jug = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        rb_cafe = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jd_crearFactura = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        cargar_arreglo = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_escoger = new javax.swing.JList<>();
        jd_venta = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        jl_escoger1 = new javax.swing.JList<>();
        cargar_arreglo1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jd_inventario = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        taDatos = new javax.swing.JTable();
        btAgregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        entradaCliente = new javax.swing.JMenuItem();
        Producto = new javax.swing.JMenu();
        jmiComidas = new javax.swing.JMenuItem();
        jmiBebidas = new javax.swing.JMenuItem();
        entradaFacturacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiGuardar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        btCrearP1.setText("Crear");
        btCrearP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearP1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio");

        jLabel19.setText("Prod");

        salida1.setColumns(20);
        salida1.setRows(5);
        salida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salida1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salida1);

        jLabel20.setText("Cod");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btVer.setText("Ver");
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });

        jLabel21.setText("Cliente");

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        btBuscarP1.setText("Buscar");
        btBuscarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarP1ActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btVerP1.setText("Ver");
        btVerP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerP1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Cod");

        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        btCerrarP1.setText("Cerrar");
        btCerrarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarP1ActionPerformed(evt);
            }
        });

        jLabel1.setText("CLIENTES");

        jLabel23.setText("PRODUCTOS");

        btGuardarP1.setText("Guardar");
        btGuardarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarP1ActionPerformed(evt);
            }
        });

        salida2.setColumns(20);
        salida2.setRows(5);
        jScrollPane2.setViewportView(salida2);

        javax.swing.GroupLayout jd_clienteLayout = new javax.swing.GroupLayout(jd_cliente.getContentPane());
        jd_cliente.getContentPane().setLayout(jd_clienteLayout);
        jd_clienteLayout.setHorizontalGroup(
            jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_clienteLayout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(31, 31, 31)
                            .addComponent(tfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_clienteLayout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_clienteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btCrear)
                        .addGap(18, 18, 18)
                        .addComponent(btGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btCerrar))
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_clienteLayout.createSequentialGroup()
                                .addComponent(btVer)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                                .addComponent(btVerP1)
                                .addGap(45, 45, 45)
                                .addComponent(btBuscarP1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteLayout.createSequentialGroup()
                                .addComponent(btCrearP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btGuardarP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCerrarP1)))
                        .addGap(96, 96, 96))))
        );
        jd_clienteLayout.setVerticalGroup(
            jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_clienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel23))
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addGap(6, 6, 6)
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCrear)
                            .addComponent(btGuardar)
                            .addComponent(btCerrar))
                        .addGap(18, 18, 18)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBuscar)
                            .addComponent(btVer)))
                    .addGroup(jd_clienteLayout.createSequentialGroup()
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCrearP1)
                            .addComponent(btGuardarP1)
                            .addComponent(btCerrarP1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVerP1)
                            .addComponent(btBuscarP1))))
                .addGap(18, 18, 18)
                .addGroup(jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        salida3.setColumns(20);
        salida3.setRows(5);
        jScrollPane3.setViewportView(salida3);

        btGrabarFac.setText("Grabar");
        btGrabarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGrabarFacActionPerformed(evt);
            }
        });

        jLabel24.setText("Precio");

        jLabel25.setText("Cantidad");

        btCerrarFac.setText("Cerrar");
        btCerrarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarFacActionPerformed(evt);
            }
        });

        btOtraFac.setText("Otra factura");
        btOtraFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOtraFacActionPerformed(evt);
            }
        });

        btVerFac.setText("Ver");
        btVerFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerFacActionPerformed(evt);
            }
        });

        ver_factura.setText("ver FACTURA");
        ver_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_facturaActionPerformed(evt);
            }
        });

        tfCantidadFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadFacActionPerformed(evt);
            }
        });

        btBuscarFac.setText("Buscar");
        btBuscarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarFacActionPerformed(evt);
            }
        });

        jLabel26.setText("Parcial");

        jLabel27.setText("Cod. Producto");

        tfParcialFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParcialFacActionPerformed(evt);
            }
        });

        tfCodProductoFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodProductoFacActionPerformed(evt);
            }
        });

        jLabel28.setText("Nro. Factura");

        tfNumFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumFacturaActionPerformed(evt);
            }
        });

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        tfFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFacActionPerformed(evt);
            }
        });

        jLabel29.setText("Cod. cliente");

        tfCodClienteFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodClienteFactActionPerformed(evt);
            }
        });

        jLabel30.setText("Facturacion");

        javax.swing.GroupLayout jd_facturaLayout = new javax.swing.GroupLayout(jd_factura.getContentPane());
        jd_factura.getContentPane().setLayout(jd_facturaLayout);
        jd_facturaLayout.setHorizontalGroup(
            jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_facturaLayout.createSequentialGroup()
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_facturaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btGrabarFac))
                    .addGroup(jd_facturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30)))
                .addGap(26, 26, 26)
                .addComponent(btOtraFac)
                .addGap(18, 18, 18)
                .addComponent(btCerrarFac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVerFac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_facturaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_facturaLayout.createSequentialGroup()
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(80, 80, 80)
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCodProductoFac)
                            .addComponent(tfCodClienteFact)
                            .addComponent(tfCantidadFac, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfClFac, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Crear))
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_facturaLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btBuscarFac)
                                    .addComponent(jLabel24)))
                            .addGroup(jd_facturaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ver_factura)
                                    .addComponent(tfPrecioFac, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jd_facturaLayout.createSequentialGroup()
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))
                        .addGap(89, 89, 89)
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfParcialFac, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(tfNumFactura))
                        .addGap(46, 46, 46)
                        .addComponent(tfFac, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jd_facturaLayout.setVerticalGroup(
            jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_facturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(3, 3, 3)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear)
                    .addComponent(btBuscarFac))
                .addGap(5, 5, 5)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tfNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_facturaLayout.createSequentialGroup()
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfClFac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCodClienteFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfCodProductoFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPrecioFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel24))
                .addGap(27, 27, 27)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfCantidadFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfParcialFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(ver_factura)
                .addGap(9, 9, 9)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGrabarFac)
                    .addComponent(btOtraFac)
                    .addComponent(btCerrarFac)
                    .addComponent(btVerFac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productos_comida.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Dunkin Donut's -> Seccion Comidas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Precio costo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Precio venta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tipo de comida");

        rb_donas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_donas.setSelected(true);
        rb_donas.setText("Donas");
        rb_donas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_donasActionPerformed(evt);
            }
        });

        rb_sandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_sandwich.setText("Sandwich");

        rb_semitas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_semitas.setText("Semitas");

        tf_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tf_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tf_costo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jl_comidas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_comidas.setModel(new DefaultListModel()
        );
        jScrollPane4.setViewportView(jl_comidas);

        agregar_comida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregar_comida.setText("Agregar");
        agregar_comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_comidaMouseClicked(evt);
            }
        });

        modificar_comida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modificar_comida.setText("Modificar");
        modificar_comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_comidaMouseClicked(evt);
            }
        });

        eliminar_comida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminar_comida.setText("Eliminar");
        eliminar_comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_comidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout productos_comidaLayout = new javax.swing.GroupLayout(productos_comida.getContentPane());
        productos_comida.getContentPane().setLayout(productos_comidaLayout);
        productos_comidaLayout.setHorizontalGroup(
            productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productos_comidaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productos_comidaLayout.createSequentialGroup()
                        .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_comidaLayout.createSequentialGroup()
                        .addComponent(agregar_comida)
                        .addGap(29, 29, 29)
                        .addComponent(modificar_comida)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_comida)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_comidaLayout.createSequentialGroup()
                        .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_comidaLayout.createSequentialGroup()
                                .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_semitas)
                                    .addComponent(rb_sandwich)
                                    .addComponent(rb_donas))
                                .addGap(9, 9, 9)))
                        .addGap(148, 148, 148))))
            .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productos_comidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(productos_comidaLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(211, 211, 211)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(productos_comidaLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jLabel3)
                            .addGap(55, 55, 55)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        productos_comidaLayout.setVerticalGroup(
            productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_comidaLayout.createSequentialGroup()
                .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(productos_comidaLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productos_comidaLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(rb_donas)
                        .addGap(18, 18, 18)
                        .addComponent(rb_sandwich)
                        .addGap(18, 18, 18)
                        .addComponent(rb_semitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar_comida)
                            .addComponent(modificar_comida)
                            .addComponent(eliminar_comida))))
                .addGap(34, 34, 34))
            .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productos_comidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(productos_comidaLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(5, 5, 5)
                    .addGroup(productos_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(productos_comidaLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3)))
                    .addGap(0, 382, Short.MAX_VALUE)))
        );

        productos_bebida.setBackground(new java.awt.Color(204, 255, 255));

        rb_te.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_te.setText("té verde");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Precio de costo");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Tipo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Dunkin Donut´s -> Seccion Bebidas");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Tamaño");

        rb_caliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_caliente.setText("caliente");

        eliminarbebidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminarbebidas.setText("eliminar");
        eliminarbebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarbebidasMouseClicked(evt);
            }
        });

        rb_helado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_helado.setSelected(true);
        rb_helado.setText("helado");

        modificar_bebidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modificar_bebidas.setText("modificar");
        modificar_bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_bebidasMouseClicked(evt);
            }
        });

        agregar_bebidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregar_bebidas.setText("Agregar");
        agregar_bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_bebidasMouseClicked(evt);
            }
        });

        jl_bebidas.setModel(new DefaultListModel()
        );
        jScrollPane6.setViewportView(jl_bebidas);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Estado");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Nombre");

        rb_jug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_jug.setText("Jugo");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Precio de venta");

        rb_cafe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_cafe.setSelected(true);
        rb_cafe.setText("Cafe");

        javax.swing.GroupLayout productos_bebidaLayout = new javax.swing.GroupLayout(productos_bebida.getContentPane());
        productos_bebida.getContentPane().setLayout(productos_bebidaLayout);
        productos_bebidaLayout.setHorizontalGroup(
            productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productos_bebidaLayout.createSequentialGroup()
                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productos_bebidaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productos_bebidaLayout.createSequentialGroup()
                                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_costo2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productos_bebidaLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_tamaño2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_bebidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productos_bebidaLayout.createSequentialGroup()
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(rb_helado))
                            .addComponent(rb_caliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_venta2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_jug)
                                .addComponent(rb_cafe)
                                .addComponent(rb_te))
                            .addGroup(productos_bebidaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(37, 37, 37))))
                    .addGroup(productos_bebidaLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarbebidas)
                            .addComponent(modificar_bebidas)
                            .addComponent(agregar_bebidas))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_bebidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(71, 71, 71))
        );
        productos_bebidaLayout.setVerticalGroup(
            productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productos_bebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(tf_costo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_venta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productos_bebidaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tf_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(productos_bebidaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_helado)
                            .addComponent(rb_cafe))))
                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productos_bebidaLayout.createSequentialGroup()
                        .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productos_bebidaLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(tf_tamaño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(productos_bebidaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(productos_bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_jug)
                                    .addComponent(rb_caliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_te)))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productos_bebidaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregar_bebidas)
                        .addGap(18, 18, 18)
                        .addComponent(modificar_bebidas)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarbebidas)
                        .addGap(92, 92, 92))))
        );

        jScrollPane5.setViewportView(jEditorPane1);

        jButton1.setText("Crear Factura");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        cargar_arreglo.setText("Añadir Factura");
        cargar_arreglo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargar_arregloMouseClicked(evt);
            }
        });

        jl_escoger.setModel(new DefaultListModel()
        );
        jScrollPane7.setViewportView(jl_escoger);

        javax.swing.GroupLayout jd_crearFacturaLayout = new javax.swing.GroupLayout(jd_crearFactura.getContentPane());
        jd_crearFactura.getContentPane().setLayout(jd_crearFacturaLayout);
        jd_crearFacturaLayout.setHorizontalGroup(
            jd_crearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearFacturaLayout.createSequentialGroup()
                .addGroup(jd_crearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearFacturaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearFacturaLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cargar_arreglo)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jd_crearFacturaLayout.setVerticalGroup(
            jd_crearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearFacturaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_crearFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cargar_arreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jl_escoger1.setModel(new DefaultListModel()
        );
        jScrollPane8.setViewportView(jl_escoger1);

        cargar_arreglo1.setText("Añadir Factura");
        cargar_arreglo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargar_arreglo1MouseClicked(evt);
            }
        });

        jButton2.setText("Crear Factura");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventaLayout = new javax.swing.GroupLayout(jd_venta.getContentPane());
        jd_venta.getContentPane().setLayout(jd_ventaLayout);
        jd_ventaLayout.setHorizontalGroup(
            jd_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventaLayout.createSequentialGroup()
                .addGroup(jd_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventaLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cargar_arreglo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_ventaLayout.setVerticalGroup(
            jd_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cargar_arreglo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Producto", "Sabor", "Año", "Precio"
            }
        ));
        jScrollPane9.setViewportView(taDatos);

        btAgregar.setText("Agregar");
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_inventarioLayout = new javax.swing.GroupLayout(jd_inventario.getContentPane());
        jd_inventario.getContentPane().setLayout(jd_inventarioLayout);
        jd_inventarioLayout.setHorizontalGroup(
            jd_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_inventarioLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(btAgregar)
                .addGap(163, 163, 163))
            .addGroup(jd_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_inventarioLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
        jd_inventarioLayout.setVerticalGroup(
            jd_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_inventarioLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(btAgregar)
                .addGap(30, 30, 30))
            .addGroup(jd_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_inventarioLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(87, 87, 87)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Administrador");

        entradaCliente.setText("Cliente");
        entradaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(entradaCliente);

        Producto.setText("Producto");

        jmiComidas.setText("Comidas");
        jmiComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComidasActionPerformed(evt);
            }
        });
        Producto.add(jmiComidas);

        jmiBebidas.setText("Bebidas");
        jmiBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBebidasActionPerformed(evt);
            }
        });
        Producto.add(jmiBebidas);

        jMenu1.add(Producto);

        entradaFacturacion.setText("Facturacion_arch");
        entradaFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFacturacionActionPerformed(evt);
            }
        });
        jMenu1.add(entradaFacturacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Facturas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jmiGuardar.setText("Guardar");
        jmiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGuardarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiGuardar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inventario");

        jMenuItem2.setText("guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem5.setText("Abrir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ventas");

        jMenuItem3.setText("Registrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Guardar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComidasActionPerformed
        productos_comida.setModal(true);
        productos_comida.pack();
        productos_comida.setLocationRelativeTo(this);
        productos_comida.setVisible(true);
    }//GEN-LAST:event_jmiComidasActionPerformed

    private void jmiBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBebidasActionPerformed
        productos_bebida.setModal(true);
        productos_bebida.pack();
        productos_bebida.setLocationRelativeTo(this);
        productos_bebida.setVisible(true);
    }//GEN-LAST:event_jmiBebidasActionPerformed

    private void btCrearP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearP1ActionPerformed
        try {
            FileWriter fw = new FileWriter("Productos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Arch = new PrintWriter(bw);

            JOptionPane.showMessageDialog(null, "El archivo Productos fue creado ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btCrearP1ActionPerformed

    private void salida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salida1MouseClicked

    }//GEN-LAST:event_salida1MouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String salida = "Codigo\tNombre\n========\t=========\n";
        String codigo = "";
        String nombre = "";
        String anho = "";
        int edad;
        String codigobuscar = this.tfCodigoCliente.getText();
        try {
            String linea;
            FileReader fr = new FileReader("Clientes.txt");
            BufferedReader EntArch = new BufferedReader(fr);
            linea = EntArch.readLine();
            while (linea != null) {
                codigo = linea.substring(0, 2);
                nombre = linea.substring(8, linea.length());
                anho = linea.substring(3, 7);
                edad = 2013 - Integer.parseInt(anho);
                if (codigo.equals(codigobuscar)) {
                    salida += codigo + "\t" + nombre + "\n";
                }
                linea = EntArch.readLine();
            }
            EntArch.close();
        } catch (Exception e) {
        }
        this.salida1.setText(salida);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        String salida = "Codigo\tNombre\n========\t=========\n";
        String codigo = "";
        String nombre = "";
        String anho = "";
        int edad;
        try {
            String linea;
            FileReader fr = new FileReader("Clientes.txt");
            BufferedReader EntArch = new BufferedReader(fr);
            linea = EntArch.readLine();
            while (linea != null) {
                codigo = linea.substring(0, 2);
                nombre = linea.substring(3, linea.length());
                salida += codigo + "\t" + nombre + "\n";
                linea = EntArch.readLine();
            }
            EntArch.close();
        } catch (Exception e) {
        }
        this.salida1.setText(salida);
    }//GEN-LAST:event_btVerActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        Arch.close();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btBuscarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarP1ActionPerformed
        String salida = "Codigo\tProducto\tPrecio\n======\t======\t====\n";
        String codigo = "";
        String producto = "";
        String precio = "";
        String codigobuscar = this.tfCodigoProducto.getText();
        try {
            String linea;
            FileReader fr = new FileReader("Productos.txt");
            BufferedReader EntArch = new BufferedReader(fr);
            linea = EntArch.readLine();

            while (linea != null) {
                codigo = linea.substring(0, 2);
                producto = linea.substring(3, 10);
                precio = linea.substring(10, linea.length());
                if (codigo.equals(codigobuscar)) {
                    salida += codigo + "\t" + producto + "\t" + precio + "\n";
                }
                linea = EntArch.readLine();
            }
            EntArch.close();
        } catch (Exception e) {
        }
        this.salida2.setText(salida);
    }//GEN-LAST:event_btBuscarP1ActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        String codigo = this.tfCodigoCliente.getText(), cliente = this.tfCliente.getText();
        Arch.println(codigo + " " + cliente);
        this.tfCodigoCliente.setText("");
        this.tfCliente.setText("");
        this.tfCodigoCliente.requestFocus();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btVerP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerP1ActionPerformed
        String salida = "Codigo\tproducto\tprecio\n======\t======\t====\n";
        String codigo = "";
        String producto = "";
        String precio = "";
        try {
            String linea;
            FileReader fr = new FileReader("Productos.txt");
            BufferedReader EntArch = new BufferedReader(fr);
            linea = EntArch.readLine();

            while (linea != null) {
                codigo = linea.substring(0, 2);
                producto = linea.substring(3, 9);
                precio = linea.substring(10, linea.length());
                salida += codigo + "\t" + producto + "\t" + precio + "\n";
                linea = EntArch.readLine();
            }
            EntArch.close();

        } catch (Exception e) {
        }
        this.salida2.setText(salida);
    }//GEN-LAST:event_btVerP1ActionPerformed

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        try {
            FileWriter fw = new FileWriter("Clientes.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Arch = new PrintWriter(bw);
            JOptionPane.showMessageDialog(null, "El archivo Clientes fue creado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btCrearActionPerformed

    private void btCerrarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarP1ActionPerformed
        Arch.close();
    }//GEN-LAST:event_btCerrarP1ActionPerformed

    private void btGuardarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarP1ActionPerformed
        String codigo1 = this.tfCodigoProducto.getText(), producto = this.tfProducto.getText(), precio = this.tfPrecio.getText();
        Arch.println(codigo1 + " " + producto + " " + precio);
        this.tfPrecio.setText("");
        this.tfCodigoProducto.setText("");
        this.tfProducto.setText("");
        this.tfCodigoProducto.requestFocus();
    }//GEN-LAST:event_btGuardarP1ActionPerformed

    private void btGrabarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGrabarFacActionPerformed
        String fecha = this.tfFac.getText();
        String codcli = this.tfCodClienteFact.getText();
        String codpro = this.tfCodProductoFac.getText();
        String cantidad = this.tfCantidadFac.getText();
        String precio = this.tfPrecioFac.getText();
        String parcial = this.tfParcialFac.getText();
        Arch.println(tfNumFactura + " " + fecha + " " + codcli + " " + codpro + " " + cantidad);
        this.tfCodProductoFac.setText("");
        this.tfCantidadFac.setText("");
        this.tfPrecioFac.setText("");
        this.tfProdFac.setText("");
        this.tfParcialFac.setText("");
        this.tfCodProductoFac.requestFocus();
    }//GEN-LAST:event_btGrabarFacActionPerformed

    private void btCerrarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarFacActionPerformed
        Arch.close();
    }//GEN-LAST:event_btCerrarFacActionPerformed

    private void btOtraFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOtraFacActionPerformed
        int tfNumFactura = 0;
        tfNumFactura = tfNumFactura + 1;
        this.tfNumFactura.setText("" + tfNumFactura);
    }//GEN-LAST:event_btOtraFacActionPerformed

    private void btVerFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerFacActionPerformed
        String salida = "tfNumFactura\tFecha\tCodCli\tNombre\tCodP\tProducto\tPU\tCantidad\tParcial\n";
        salida += "==\t=====\t======\t======\t====\t========\t==\t========\t=======\n";
        String nf = "";
        String fecha = "";
        String codigoC = "";
        String nomC = "";
        String codigoP = "";
        String nomP = "";
        String pu = "";
        String cantidad = "";
        int parcial;
        int ppu, pcan, ppar;
        try {
            String linea;
            FileReader fr = new FileReader("Facturas.txt");
            BufferedReader EntArch = new BufferedReader(fr);
            linea = EntArch.readLine();
            while (linea != null) {
                nf = linea.substring(0, 1);
                fecha = linea.substring(9, 12) + "/" + linea.substring(25, 30);
                codigoC = linea.substring(31, 33);
                codigoP = linea.substring(34, 36);
                cantidad = linea.substring(37, linea.length());
                salida += nf + "\t" + fecha + "\t" + codigoC;
                try {
                    String codigobuscar = codigoC;
                    String lin;
                    FileReader fr1 = new FileReader("Clientes.txt");
                    BufferedReader EntArch1 = new BufferedReader(fr1);
                    lin = EntArch1.readLine();
                    String codcli, nombre;
                    while (lin != null) {
                        codcli = lin.substring(0, 2);
                        nombre = lin.substring(3, lin.length());
                        if (codcli.equals(codigobuscar)) {
                            nomC = nombre;
                            break;
                        }
                        lin = EntArch1.readLine();
                    }
                    EntArch1.close();
                } catch (Exception e) {
                }
                salida += "\t" + nomC + "\t" + codigoP;
                try {
                    String codigobuscar = codigoP;
                    String lin;
                    FileReader fr1 = new FileReader("Productos.txt");
                    BufferedReader EntArch1 = new BufferedReader(fr1);
                    lin = EntArch1.readLine();
                    String cod, nombre, preU;
                    while (lin != null) {
                        cod = lin.substring(0, 2);
                        nombre = lin.substring(3, 9);
                        preU = lin.substring(10, lin.length());
                        if (cod.equals(codigobuscar)) {
                            nomP = nombre;
                            pu = preU;
                            break;
                        }
                        lin = EntArch1.readLine();
                    }
                    EntArch1.close();
                } catch (IOException e) {
                }
                parcial = Integer.parseInt(cantidad) * Integer.parseInt(pu);
                salida += "\t" + nomP + "\t" + pu + "\t" + cantidad + "\t" + parcial + "\n";
                linea = EntArch.readLine();
            }
            EntArch.close();
        } catch (IOException e) {
        }
        this.salida3.setText(salida);
    }//GEN-LAST:event_btVerFacActionPerformed

    private void ver_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_facturaActionPerformed
        String numFact = tfNumFactura.getText();
        int sw = 0;
        String salida = "";
        int total = 0;
        String nf = "";
        String fecha = "";
        String codigoC = "";
        String nomC = "";
        String codigoP = "";
        String nomP = "";
        String pu = "";
        String cantidad = "";
        int parcial;
        int ppu, pcan, ppar;
        try {
            String linea;
            FileReader fr = new FileReader("Facturas.txt");
            BufferedReader EntArch = new BufferedReader(fr);
            linea = EntArch.readLine();
            while (linea != null) {
                nf = linea.substring(0, 1);
                fecha = linea.substring(9, 12) + "/" + linea.substring(25, 30);
                codigoC = linea.substring(31, 33);
                codigoP = linea.substring(34, 36);
                cantidad = linea.substring(37, linea.length());
                if (numFact.equals(nf)) {
                    try {
                        String codigobuscar = codigoC;
                        String lin;
                        FileReader fr1 = new FileReader("Clientes.txt");
                        BufferedReader EntArch1 = new BufferedReader(fr1);
                        lin = EntArch1.readLine();
                        String codcli, nombre;
                        while (lin != null) {
                            codcli = lin.substring(0, 2);
                            nombre = lin.substring(3, lin.length());
                            if (codcli.equals(codigobuscar)) {
                                nomC = nombre;
                                break;
                            }
                            lin = EntArch1.readLine();
                        }
                        EntArch1.close();
                    } catch (IOException e) {
                    }
                    if (sw == 0) {
                        salida = "Factura: " + nf + "\t\t\t Fecha:" + fecha + "\n"
                                + "CodCli: " + codigoC + "\n"
                                + "Nombre: " + nomC + "\n\n";
                        salida += "---------------------------------------------------------------------------------------------------\n";
                        salida += "CodP\tProducto\tPU\tCantidad\tParcial\n";
                        salida += "====\t========\t==\t========\t=======\n";
                        sw = 1;
                    }
                    try {
                        String codigobuscar = codigoP;
                        String lin;
                        FileReader fr1 = new FileReader("Productos.txt");
                        BufferedReader EntArch1 = new BufferedReader(fr1);
                        lin = EntArch1.readLine();
                        String cod, nombre, preU;
                        while (lin != null) {
                            cod = lin.substring(0, 2);
                            nombre = lin.substring(3, 9);
                            preU = lin.substring(10, lin.length());
                            if (cod.equals(codigobuscar)) {

                                nomP = nombre;
                                pu = preU;
                                break;
                            }
                            lin = EntArch1.readLine();
                        }
                        EntArch1.close();
                    } catch (IOException e) {
                    }
                    parcial = Integer.parseInt(cantidad) * Integer.parseInt(pu);
                    salida += codigoP + "\t" + nomP + "\t" + pu + "\t" + cantidad + "\t" + parcial + "\n";
                    total += parcial;
                }
                linea = EntArch.readLine();
            }
            salida += "---------------------------------------------------------------------------------------------------\n";
            salida += "\t\t\tsubTotal:\t" + total / 1.18 + "\n";
            salida += "\t\t\tIGV(18%):\t" + (total - (total / 1.18)) + "\n";
            salida += "\t\t\t\t======\n";
            salida += "\t\t\tTotal:\t" + total;
            EntArch.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.salida3.setText(salida);
    }//GEN-LAST:event_ver_facturaActionPerformed

    private void tfCantidadFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadFacActionPerformed

    }//GEN-LAST:event_tfCantidadFacActionPerformed

    private void btBuscarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarFacActionPerformed

    }//GEN-LAST:event_btBuscarFacActionPerformed

    private void tfParcialFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfParcialFacActionPerformed

    }//GEN-LAST:event_tfParcialFacActionPerformed

    private void tfCodProductoFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodProductoFacActionPerformed

    }//GEN-LAST:event_tfCodProductoFacActionPerformed

    private void tfNumFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumFacturaActionPerformed

    }//GEN-LAST:event_tfNumFacturaActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        int tfNumFactura = 0;
        tfNumFactura = 1;
        this.tfNumFactura.setText("" + tfNumFactura);
        Date hoy = new Date();
        tfFac.setText(hoy.toString());
        try {
            FileWriter fw = new FileWriter("Facturas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Arch = new PrintWriter(bw);
            JOptionPane.showMessageDialog(null, "El archivo *Facturas* fue creado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void tfFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFacActionPerformed
        int tfNumFactura = 0;
        tfNumFactura = tfNumFactura + 1;
        this.tfNumFactura.setText("" + tfNumFactura);
    }//GEN-LAST:event_tfFacActionPerformed

    private void tfCodClienteFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodClienteFactActionPerformed

    }//GEN-LAST:event_tfCodClienteFactActionPerformed

    private void entradaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaClienteActionPerformed
        jd_cliente.setModal(true);
        jd_cliente.pack();
        jd_cliente.setLocationRelativeTo(this);
        jd_cliente.setVisible(true);
    }//GEN-LAST:event_entradaClienteActionPerformed

    private void rb_donasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_donasActionPerformed

    }//GEN-LAST:event_rb_donasActionPerformed

    private void agregar_comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_comidaMouseClicked
        inve.setProductos(producto);
        double precio_costo;
        double precio_venta;
        String nombre;
        String tipo;
        try {
            precio_costo = Double.parseDouble(tf_costo.getText());
            precio_venta = Double.parseDouble(tf_venta.getText());
            nombre = tf_nombre.getText();
            if (rb_donas.isSelected()) {
                tipo = "Dona";
            } else {
                if (rb_sandwich.isSelected()) {
                    tipo = "Sandwich o Emparedado";

                } else {
                    tipo = "Cemita de Chocolate";
                }
            }
            producto.add(new Comidas(tipo, precio_costo, precio_venta, nombre));
            inve.setProductos(producto);
            System.out.println(inve);
            JOptionPane.showMessageDialog(productos_comida, "Ha comprado la Comida Exitosamente");
            DefaultListModel modelo = (DefaultListModel) jl_comidas.getModel();
            modelo.addElement(new Comidas(tipo, precio_costo, precio_venta, nombre));
            jl_comidas.setModel(modelo);
            tf_costo.setText("");
            tf_venta.setText("");
            tf_nombre.setText("");
            inve.setProductos(producto);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(productos_comida, "Ocurrió un Error");
        }
    }//GEN-LAST:event_agregar_comidaMouseClicked

    private void modificar_comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_comidaMouseClicked
        int d = jl_comidas.getSelectedIndex();
        if (d >= 0) {
            double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Otro nuevo precio de venta"));
            double precio_costo = Double.parseDouble(JOptionPane.showInputDialog("Otro nuevo precio de costo"));
            String nombre = JOptionPane.showInputDialog("Otro nuevo nombre");
            String tipo;
            inve.setProductos(producto);
            int t = Integer.parseInt(JOptionPane.showInputDialog("Otro nuevo tipo:\n"
                    + "1.Dona\n"
                    + "2.Sandwich o Emparedado\n"
                    + "3.Cemita de Chocolate"));
            if (t == 1) {
                tipo = "Dona";
            } else {
                if (t == 2) {
                    tipo = "Sandwich o Emparedado";
                } else {
                    tipo = "Cemita de Chocolate";
                }
            }
            inve.setProductos(producto);
            DefaultListModel modelo = (DefaultListModel) jl_comidas.getModel();
            ((Comidas) modelo.get(d)).setTipo_comida(tipo);
            jl_comidas.setModel(modelo);
            producto.get(d).setPrecio_venta(precio_venta);
            producto.get(d).setPrecio_costo(precio_costo);
            producto.get(d).setNombre(nombre);
            ((Comidas) producto.get(d)).setTipo_comida(tipo);
        } else {
            JOptionPane.showMessageDialog(productos_comida, "fila no seleccionada");
        }
    }//GEN-LAST:event_modificar_comidaMouseClicked

    private void eliminar_comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_comidaMouseClicked
        inve.setProductos(producto);
        DefaultListModel modelo = (DefaultListModel) jl_comidas.getModel();
        int i = jl_comidas.getSelectedIndex();
        modelo.remove(i);
        Producto.remove(i);
    }//GEN-LAST:event_eliminar_comidaMouseClicked

    private void eliminarbebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarbebidasMouseClicked
        inve.setProductos(producto);
        DefaultListModel modelo = (DefaultListModel) jl_bebidas.getModel();
        int i = jl_bebidas.getSelectedIndex();
        modelo.remove(i);
        producto.remove(i);
    }//GEN-LAST:event_eliminarbebidasMouseClicked

    private void modificar_bebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_bebidasMouseClicked
        int d = jl_bebidas.getSelectedIndex();
        if (d >= 0) {
            double precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Otro nuevo precio de venta"));
            double precio_costo = Double.parseDouble(JOptionPane.showInputDialog("Otro nuevo precio de costo"));
            String nombre = JOptionPane.showInputDialog("Otro nuevo Nombre");
            String tamaño = JOptionPane.showInputDialog("Otro nuevo Tamaño");
            String tipo;
            int t = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Tipo:\n"
                    + "1.Cafe\n"
                    + "2.Jugo\n"
                    + "3.Té Verde"));
            if (t == 1) {
                tipo = "Cafezaso";

            } else {
                if (t == 2) {
                    tipo = "Juguito";
                } else {
                    tipo = "Té Verde";
                }
            }
            String estado;
            int x = Integer.parseInt(JOptionPane.showInputDialog("Escoga otra manera de tomar la Bebida:\n"
                    + "1.Caliente\n"
                    + "2.Helada"));
            if (x == 1) {
                estado = "Caliente";
            } else {
                estado = "Helada";
            }
            inve.setProductos(producto);
            DefaultListModel modelo = (DefaultListModel) jl_bebidas.getModel();
            ((Bebidas) modelo.get(d)).setTipo(tipo);
            jl_bebidas.setModel(modelo);
            producto.get(d).setPrecio_venta(precio_venta);
            producto.get(d).setPrecio_costo(precio_costo);
            producto.get(d).setNombre(nombre);
            ((Bebidas) producto.get(d)).setTamaño(tamaño);
            ((Bebidas) producto.get(d)).setEstado(estado);
            ((Bebidas) producto.get(d)).setTipo(tipo);
        } else {
            JOptionPane.showMessageDialog(productos_comida, "fila No Seleccionada!!!");
        }
    }//GEN-LAST:event_modificar_bebidasMouseClicked

    private void agregar_bebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_bebidasMouseClicked
        double precio_costo;
        double precio_venta;
        String nombre;
        String tamaño;
        String estado;
        String tipo;
        try {
            precio_costo = Double.parseDouble(tf_costo2.getText());
            precio_venta = Double.parseDouble(tf_venta2.getText());
            nombre = tf_nombre2.getText();
            tamaño = tf_tamaño2.getText();
            if (rb_caliente.isSelected()) {
                estado = "Caliente";
            } else {
                estado = "Helada";
            }
            if (rb_cafe.isSelected()) {
                tipo = "Cafezaso";
            } else {
                if (rb_jug.isSelected()) {
                    tipo = "Juguito";
                } else {
                    tipo = "Té Verde";
                }
            }
            producto.add(new Bebidas(estado, tamaño, tipo, precio_costo, precio_venta, nombre));
            inve.setProductos(producto);
            System.out.println(inve);
            JOptionPane.showMessageDialog(productos_bebida, "Ha Comprado la Bebida");
            DefaultListModel modelo = (DefaultListModel) jl_bebidas.getModel();
            modelo.addElement(new Bebidas(estado, tamaño, tipo, precio_costo, precio_venta, nombre));
            jl_comidas.setModel(modelo);
            tf_costo2.setText("");
            tf_venta2.setText("");
            tf_nombre2.setText("");
            tf_tamaño2.setText("");
            inve.setProductos(producto);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(productos_comida, "Ocurrió un Error");
        }
    }//GEN-LAST:event_agregar_bebidasMouseClicked

    private void entradaFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFacturacionActionPerformed
        jd_factura.setModal(true);
        jd_factura.pack();
        jd_factura.setLocationRelativeTo(this);
        jd_factura.setVisible(true);
    }//GEN-LAST:event_entradaFacturacionActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {
                    fichero = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(factura);
                bw.flush();

                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        Productos produc = new Productos();
        double total = 0;
        String muestra_produc = "";
        System.out.println(inve.getProducto().size());
        for (int i = 0; i < inve.getProducto().size(); i++) {
            total += inve.getProducto().get(i).getPrecio_venta();
            muestra_produc += inve.getProducto().get(i).getNombre() + "   " + inve.getProducto().get(i).getPrecio_venta() + "\n";
        }
        double subtotal = produc.IVS(total);
        double impuestos = produc.impuesto(subtotal);
        double x = subtotal + impuestos;//total
        String CAI = JOptionPane.showInputDialog("ingrese CAI:");
        String RTN = JOptionPane.showInputDialog("ingrese RTN:");
        String fecha = JOptionPane.showInputDialog("ingrese fecha");
        String correo = JOptionPane.showInputDialog("ingrese correo");
        String nombre_cliente = JOptionPane.showInputDialog("ingrese nombre de cliente");
        fact.setNombre_cliente(nombre_cliente);
        fact.setCAI(CAI);
        fact.setCorreo(correo);
        fact.setRTN(RTN);
        fact.setCAI(CAI);
        fact.setFecha(fecha);
        factura = fact.facturinga(muestra_produc, subtotal, impuestos, x);
        JOptionPane.showMessageDialog(jd_crearFactura, "factura creada exitosamente" + " \n"
                + factura);
        System.out.println(factura);
    }//GEN-LAST:event_jButton1MouseClicked

    private void cargar_arregloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_arregloMouseClicked
        int d = jl_escoger.getSelectedIndex();
        if (d >= 0) {
            fact.getProductos().add(inve.getProducto().get(d));
            JOptionPane.showMessageDialog(jd_crearFactura, "se agregó al carrito");
        } else {
            JOptionPane.showMessageDialog(jd_crearFactura, "fila no selecionada");
        }
    }//GEN-LAST:event_cargar_arregloMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_crearFactura.setModal(true);
        jd_crearFactura.pack();
        jd_crearFactura.setLocationRelativeTo(this);
        jd_crearFactura.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGuardarActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {
                    fichero = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(factura);
                bw.flush();
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jmiGuardarActionPerformed

    private void cargar_arreglo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_arreglo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cargar_arreglo1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String muestra_produc = "";
        for (int i = 0; i < inve.getProducto().size(); i++) {
            muestra_produc += inve.getProducto().get(i);
        }
        try {
            inve.guardar(muestra_produc, this);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ingre.setVentas(new Venta(total_final, fecha_factura));
        JOptionPane.showMessageDialog(this, "Se registro la venta exitosamente"
                + "");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String muestra_produc = "";
        for (int i = 0; i < ingre.getVenta().size(); i++) {
            muestra_produc += ingre.getVenta().get(i);
        }
        try {
            inve.guardar(muestra_produc, this);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jd_inventario.setModal(true);
        jd_inventario.pack();
        jd_inventario.setLocationRelativeTo(this);
        jd_inventario.setVisible(true);
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc = null;
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter("Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2
                    = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                sc = new Scanner(fichero);
                DefaultTableModel modelotabla = (DefaultTableModel) taDatos.getModel();
                modelotabla.getDataVector().removeAllElements();
                revalidate();

                while (sc.hasNextLine()) {
                    Object[] newrow = {sc.next(), sc.next(), sc.next(), sc.next()};
                    modelotabla.addRow(newrow);
                }
                taDatos.setModel(modelotabla);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        try {
            br.close();
            fr.close();
            sc.close();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        String nombre;
        double precio;
        String tamaño;
        Inventario clases = new Inventario();           
        try {
            nombre = tf_nombre2.getText();
            precio = Double.parseDouble(tfPrecio.getText());
            tamaño = tf_tamaño2.getText();
            //Inventario.add(new Inventario(nombre, tamaño, precio));

            Object[] newrow = new Object[5];
            newrow[0] = nombre;
            newrow[1] = tfPrecio.getText();
            newrow[2] = tf_tamaño2.getText();
            newrow[3] = tfPrecio.getText();
            this.modelo.addRow(newrow);

            JOptionPane.showMessageDialog(this, "Agregado Exitosamente");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un Error");
        }
    }//GEN-LAST:event_btAgregarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.JMenu Producto;
    private javax.swing.JButton agregar_bebidas;
    private javax.swing.JButton agregar_comida;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btBuscarFac;
    private javax.swing.JButton btBuscarP1;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btCerrarFac;
    private javax.swing.JButton btCerrarP1;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btCrearP1;
    private javax.swing.JButton btGrabarFac;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btGuardarP1;
    private javax.swing.JButton btOtraFac;
    private javax.swing.JButton btVer;
    private javax.swing.JButton btVerFac;
    private javax.swing.JButton btVerP1;
    private javax.swing.JButton cargar_arreglo;
    private javax.swing.JButton cargar_arreglo1;
    private javax.swing.JButton eliminar_comida;
    private javax.swing.JButton eliminarbebidas;
    private javax.swing.JMenuItem entradaCliente;
    private javax.swing.JMenuItem entradaFacturacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JDialog jd_cliente;
    private javax.swing.JDialog jd_crearFactura;
    private javax.swing.JDialog jd_factura;
    private javax.swing.JDialog jd_inventario;
    private javax.swing.JDialog jd_venta;
    private javax.swing.JList<String> jl_bebidas;
    private javax.swing.JList<String> jl_comidas;
    private javax.swing.JList<String> jl_escoger;
    private javax.swing.JList<String> jl_escoger1;
    private javax.swing.JMenuItem jmiBebidas;
    private javax.swing.JMenuItem jmiComidas;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JButton modificar_bebidas;
    private javax.swing.JButton modificar_comida;
    private javax.swing.JDialog productos_bebida;
    private javax.swing.JDialog productos_comida;
    private javax.swing.JRadioButton rb_cafe;
    private javax.swing.JRadioButton rb_caliente;
    private javax.swing.JRadioButton rb_donas;
    private javax.swing.JRadioButton rb_helado;
    private javax.swing.JRadioButton rb_jug;
    private javax.swing.JRadioButton rb_sandwich;
    private javax.swing.JRadioButton rb_semitas;
    private javax.swing.JRadioButton rb_te;
    private javax.swing.JTextArea salida1;
    private javax.swing.JTextArea salida2;
    private javax.swing.JTextArea salida3;
    private javax.swing.JTable taDatos;
    private javax.swing.JTextField tfCantidadFac;
    private javax.swing.JTextField tfClFac;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfCodClienteFact;
    private javax.swing.JTextField tfCodProductoFac;
    private javax.swing.JTextField tfCodigoCliente;
    private javax.swing.JTextField tfCodigoProducto;
    private javax.swing.JTextField tfFac;
    private javax.swing.JTextField tfNumFactura;
    private javax.swing.JTextField tfParcialFac;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfPrecioFac;
    private javax.swing.JTextField tfProdFac;
    private javax.swing.JTextField tfProducto;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_costo2;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre2;
    private javax.swing.JTextField tf_tamaño2;
    private javax.swing.JTextField tf_venta;
    private javax.swing.JTextField tf_venta2;
    private javax.swing.JButton ver_factura;
    // End of variables declaration//GEN-END:variables

    private static class Venta extends ArrayList<Ventas> {

        public Venta(double total_final, String fecha_factura) {
        }
    }
}
