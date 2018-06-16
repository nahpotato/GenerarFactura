package generarfactura;

import generarfactura.controllers.GestorPedidos;
import generarfactura.views.GenerarFacturaFrame;

public class GenerarFactura {

    public static void main(String[] args) {
        GestorPedidos gestorPedidos = new GestorPedidos();
        
        GenerarFacturaFrame generarFacturaFrame = new GenerarFacturaFrame();
        generarFacturaFrame.setVisible(true);
    }
}
