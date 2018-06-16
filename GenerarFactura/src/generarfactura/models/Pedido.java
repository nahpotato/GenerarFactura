package generarfactura.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {

    private static int nroPedidoAnterior = 0;
    
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaEntrega;
    private String nombreCliente;
    private int nroPedido;
    private Factura miFactura;
    private boolean estadoFactura; //esta cobrada?

    private ArrayList<Pizza> detallePedido;

    public Pedido(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        fechaCreacion = LocalDateTime.now();
        nroPedido = nroPedidoAnterior++;
        detallePedido = new ArrayList<>();
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public Factura getMiFactura() {
        return miFactura;
    }

    public void setMiFactura(Factura miFactura) {
        this.miFactura = miFactura;
    }

    public boolean isEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(boolean estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public ArrayList<Pizza> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<Pizza> detallePedido) {
        this.detallePedido = detallePedido;
    }
}
