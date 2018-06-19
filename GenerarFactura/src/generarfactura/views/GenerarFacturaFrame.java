package generarfactura.views;

import generarfactura.assets.CustomFont;
import generarfactura.controllers.GestorPedidos;
import generarfactura.models.Pedido;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class GenerarFacturaFrame extends javax.swing.JFrame {

    private final GestorPedidos gestorPedidos;
    private final List<Pedido> listaPedidos;

    public GenerarFacturaFrame() {
        initComponents();

        gestorPedidos = GestorPedidos.current;
        listaPedidos = gestorPedidos.getListaPedidos();

        // DISEÑO TABLAS
        JTableHeader encabezado = tabla_clientes.getTableHeader();
        encabezado.setForeground(new Color(193, 39, 45));
        encabezado.setBackground(Color.white);
        JTableHeader encabezado2 = tabla_pedidos.getTableHeader();
        encabezado2.setForeground(new Color(193, 39, 45));
        encabezado2.setBackground(Color.white);

        // FUENTES
        CustomFont cf = new CustomFont();
        tfmontototal.setFont(cf.Chunkfive(Font.PLAIN, 26f));
        jLabel6.setFont(cf.Chunkfive(Font.PLAIN, 27));
        tabla_pedidos.setFont(cf.Antonio(Font.PLAIN, 13));
        encabezado2.setFont(cf.Antonio(Font.BOLD, 15));
        encabezado.setFont(cf.Antonio(Font.BOLD, 15));
        jLabel5.setFont(cf.Chunkfive(Font.PLAIN, 27));
        tabla_clientes.setFont(cf.Antonio(Font.PLAIN, 13));
        jLabel4.setFont(cf.Chunkfive(Font.PLAIN, 27));
        jLabel2.setFont(cf.Antonio(Font.BOLD, 45));

        rellenarTablaClientes();

        btncerrar.addActionListener((ActionEvent ae) -> {
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        });

        tabla_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                rellenarTablaPedidos();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuevopedido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btncancelar = new javax.swing.JButton();
        btnconfirmar = new javax.swing.JButton();
        tfmontototal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_pedidos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnuevopedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_on.png"))); // NOI18N
        btnnuevopedido.setBorder(null);
        btnnuevopedido.setBorderPainted(false);
        btnnuevopedido.setContentAreaFilled(false);
        btnnuevopedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevopedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_off.png"))); // NOI18N
        getContentPane().add(btnnuevopedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 598, 685, 1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_off.png"))); // NOI18N
        btncancelar.setBorder(null);
        btncancelar.setBorderPainted(false);
        btncancelar.setContentAreaFilled(false);
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_on.png"))); // NOI18N
        btncancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_on.png"))); // NOI18N
        btncancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_on.png"))); // NOI18N
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        btnconfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_confirmar_off.png"))); // NOI18N
        btnconfirmar.setBorder(null);
        btnconfirmar.setBorderPainted(false);
        btnconfirmar.setContentAreaFilled(false);
        btnconfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirmar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_confirmar_on.png"))); // NOI18N
        btnconfirmar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_confirmar_on.png"))); // NOI18N
        btnconfirmar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_confirmar_on.png"))); // NOI18N
        getContentPane().add(btnconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        tfmontototal.setFont(new java.awt.Font("ChunkFive Roman", 0, 26)); // NOI18N
        tfmontototal.setForeground(new java.awt.Color(255, 210, 19));
        tfmontototal.setBorder(null);
        tfmontototal.setOpaque(false);
        getContentPane().add(tfmontototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 472, 90, -1));

        jLabel6.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 210, 19));
        jLabel6.setText("MONTO TOTAL:");
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        tabla_pedidos.setFont(new java.awt.Font("Antonio", 0, 13)); // NOI18N
        tabla_pedidos.setForeground(new java.awt.Color(102, 102, 102));
        tabla_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "TIPO", "VARIEDAD", "TAMAÑO", "PRECIO"
            }
        ));
        tabla_pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_pedidos.setGridColor(new java.awt.Color(102, 102, 102));
        tabla_pedidos.setRowHeight(20);
        tabla_pedidos.setSelectionBackground(new java.awt.Color(255, 201, 19));
        tabla_pedidos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabla_pedidos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 345, 690, 110));

        jLabel5.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 210, 19));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_detalle_pedido.png"))); // NOI18N
        jLabel5.setText("DETALLE DEL PEDIDO:");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 310, -1, -1));

        tabla_clientes.setFont(new java.awt.Font("Antonio", 0, 13)); // NOI18N
        tabla_clientes.setForeground(new java.awt.Color(102, 102, 102));
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NÚMERO", "HORA", "FECHA", "CLIENTE"
            }
        ));
        tabla_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_clientes.setGridColor(new java.awt.Color(102, 102, 102));
        tabla_clientes.setRowHeight(20);
        tabla_clientes.setSelectionBackground(new java.awt.Color(255, 201, 19));
        tabla_clientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_clientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 180, 380, 110));

        jLabel4.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 210, 19));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_user_amarillo.png"))); // NOI18N
        jLabel4.setText("SELECCIONE UN PEDIDO:");
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Antonio", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_generar_factura.png"))); // NOI18N
        jLabel2.setText("GENERAR FACTURA ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 97, 344, 1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/logo_m.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_off.png"))); // NOI18N
        btncerrar.setToolTipText("");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/UIgenerarFactura_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rellenarTablaClientes() {
        String unaMatriz[][] = new String[listaPedidos.size()][4];
        for (int i = 0; i < listaPedidos.size(); i++) {
            unaMatriz[i][0] = Integer.toString(listaPedidos.get(i).getNroPedido());
            unaMatriz[i][1] = horaToString(listaPedidos.get(i).getFechaCreacion());
            unaMatriz[i][2] = fechaToString(listaPedidos.get(i).getFechaCreacion());
            unaMatriz[i][3] = listaPedidos.get(i).getNombreCliente();
        }

        tabla_clientes.setModel(new DefaultTableModel(
                unaMatriz,
                new String[]{
                    "NUMERO", "HORA", "FECHA", "CLIENTE"
                }
        ) {
            Class[] types = new Class[]{
                String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    private void rellenarTablaPedidos() {
        int index = tabla_clientes.getSelectedRow();

        if (index == -1) {
            return; // Cuando no está seleccionado ninguna fila, la función devuelve un -1
        }
        Pedido pedidoSeleccionado = null;

        for (Pedido pedido : listaPedidos) {
            if (Integer.toString(pedido.getNroPedido()).equals((String) tabla_clientes.getValueAt(index, 0))) {
                pedidoSeleccionado = pedido;
                break;
            }
        }

        if (pedidoSeleccionado != null) {
            String unaMatriz[][] = new String[pedidoSeleccionado.getDetallePedido().size()][5];
            for (int i = 0; i < pedidoSeleccionado.getDetallePedido().size(); i++) {
                unaMatriz[i][0] = pedidoSeleccionado.getDetallePedido().get(i).getNombre();
                unaMatriz[i][1] = pedidoSeleccionado.getDetallePedido().get(i).getTipo();
                unaMatriz[i][2] = pedidoSeleccionado.getDetallePedido().get(i).getVariedad();
                unaMatriz[i][3] = Integer.toString(pedidoSeleccionado.getDetallePedido().get(i).getTamanio());
                unaMatriz[i][4] = Double.toString(pedidoSeleccionado.getDetallePedido().get(i).getPrecioUnitario());
            }

            tabla_pedidos.setModel(new DefaultTableModel(
                    unaMatriz,
                    new String[]{
                        "NOMBRE", "TIPO", "VARIEDAD", "TAMAÑO", "PRECIO"
                    }
            ) {
                Class[] types = new Class[]{
                    String.class, String.class, String.class, String.class, String.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
        } else {
            // Mostrar un bello cartel de error
        }
    }

    private String horaToString(LocalDateTime localDateTime) {
        return new StringBuilder()
                .append(localDateTime.format(DateTimeFormatter.ofPattern("HH:mm")))
                .toString();
    }

    private String fechaToString(LocalDateTime localDateTime) {
        return new StringBuilder()
                .append(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnconfirmar;
    private javax.swing.JButton btnnuevopedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTable tabla_pedidos;
    private javax.swing.JTextField tfmontototal;
    // End of variables declaration//GEN-END:variables
}
