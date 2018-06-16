package generarfactura.models;

import java.util.*;

public class Factura {

    private Date fechaFactura;
    private int nroFactura;
    private boolean estadoFactura;
    private static int nroF = 1;

    public Factura(Date fechaFactura, boolean estadoFactura) {
        this.fechaFactura = fechaFactura;
        this.nroFactura = nroF;
        this.estadoFactura = estadoFactura;
        nroF++;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public boolean isEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(boolean estadoFactura) {
        this.estadoFactura = estadoFactura;
    }
}
