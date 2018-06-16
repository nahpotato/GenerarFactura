package generarfactura.views;

public class UIfactura extends javax.swing.JFrame {

    public UIfactura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        tfmontototal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tadetallefactura = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfhora = new javax.swing.JTextField();
        tffecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfnombrecliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfnumerofactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Antonio", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(178, 178, 178));
        jLabel10.setText("PIZZA - Pizzas de Fabricación Propia | Av. Vélez Sarsfield 1234 - Córdoba | (0351) 0303456 | Redes: @Pizza_cba");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Antonio", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(178, 178, 178));
        jLabel9.setText("¡Gracias por su compra!");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(178, 178, 178));
        jSeparator2.setForeground(new java.awt.Color(178, 178, 178));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 100, 1));

        jLabel15.setFont(new java.awt.Font("ChunkFive Roman", 0, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(178, 178, 178));
        jLabel15.setText("MONTO TOTAL:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        tfmontototal.setFont(new java.awt.Font("ChunkFive Roman", 0, 26)); // NOI18N
        tfmontototal.setForeground(new java.awt.Color(178, 178, 178));
        tfmontototal.setText("$657");
        tfmontototal.setBorder(null);
        tfmontototal.setFocusable(false);
        tfmontototal.setOpaque(false);
        getContentPane().add(tfmontototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        tadetallefactura.setColumns(20);
        tadetallefactura.setFont(new java.awt.Font("Antonio", 0, 15)); // NOI18N
        tadetallefactura.setForeground(new java.awt.Color(178, 178, 178));
        tadetallefactura.setLineWrap(true);
        tadetallefactura.setRows(5);
        tadetallefactura.setText("3 MUZARRELA CON MORRÓN $600\n1 ESPECIAL $100\n2 FUGAZETTA $300");
        tadetallefactura.setAutoscrolls(false);
        tadetallefactura.setBorder(null);
        tadetallefactura.setFocusable(false);
        jScrollPane1.setViewportView(tadetallefactura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 700, 120));

        jLabel8.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(178, 178, 178));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_detalle_pedido_gris.png"))); // NOI18N
        jLabel8.setText("DETALLE DEL PEDIDO:");
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_hora_gris.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 172, -1, -1));

        tfhora.setFont(new java.awt.Font("Antonio", 0, 21)); // NOI18N
        tfhora.setForeground(new java.awt.Color(178, 178, 178));
        tfhora.setText("22:30");
        tfhora.setBorder(null);
        tfhora.setFocusable(false);
        tfhora.setOpaque(false);
        getContentPane().add(tfhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 175, -1, 20));

        tffecha.setFont(new java.awt.Font("Antonio", 0, 21)); // NOI18N
        tffecha.setForeground(new java.awt.Color(178, 178, 178));
        tffecha.setText("5/06/2018");
        tffecha.setBorder(null);
        tffecha.setFocusable(false);
        tffecha.setOpaque(false);
        getContentPane().add(tffecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 145, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_fecha_gris.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 141, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_user_gris.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 110, -1, -1));

        tfnombrecliente.setFont(new java.awt.Font("Antonio", 0, 21)); // NOI18N
        tfnombrecliente.setForeground(new java.awt.Color(178, 178, 178));
        tfnombrecliente.setText("María José");
        tfnombrecliente.setBorder(null);
        tfnombrecliente.setFocusable(false);
        tfnombrecliente.setOpaque(false);
        getContentPane().add(tfnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 115, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/logo_gris.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Antonio", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 178, 178));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_factura_gris.png"))); // NOI18N
        jLabel2.setText("FACTURA N°");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 60));

        jSeparator1.setBackground(new java.awt.Color(178, 178, 178));
        jSeparator1.setForeground(new java.awt.Color(178, 178, 178));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 97, 423, 1));

        tfnumerofactura.setFont(new java.awt.Font("Antonio", 1, 45)); // NOI18N
        tfnumerofactura.setForeground(new java.awt.Color(178, 178, 178));
        tfnumerofactura.setText("000456123");
        tfnumerofactura.setBorder(null);
        tfnumerofactura.setFocusable(false);
        tfnumerofactura.setOpaque(false);
        getContentPane().add(tfnumerofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/UIfactura_bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea tadetallefactura;
    private javax.swing.JTextField tffecha;
    private javax.swing.JTextField tfhora;
    private javax.swing.JTextField tfmontototal;
    private javax.swing.JTextField tfnombrecliente;
    private javax.swing.JTextField tfnumerofactura;
    // End of variables declaration//GEN-END:variables
}
