package generarfactura.controllers;

import generarfactura.models.Pedido;
import generarfactura.models.Pizza;
import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {
    
    public static GestorPedidos current;
    
    private List<Pedido> listaPedidos;
    
    public GestorPedidos() {
        current = this;
        rellenarListas();
    }
    
    private void rellenarListas() {
        listaPedidos = new ArrayList<>();
        
        Pedido pedido1 = new Pedido("Juanito López");
        pedido1.getDetallePedido().add(new Pizza("Hawaiana", "Horno", "Dulce", 12));
        pedido1.getDetallePedido().add(new Pizza("Eleazar", "Parrilla", "Especial", 12));
        
        Pedido pedido2 = new Pedido("Tony Stark");
        pedido2.getDetallePedido().add(new Pizza("De la casa", "Parrilla", "Especial", 8));
        
        Pedido pedido3 = new Pedido("Clark Kent");
        pedido3.getDetallePedido().add(new Pizza("Muzzarella", "Parilla", "Muzzarella", 4));
        
        Pedido pedido4 = new Pedido("Yatogami");
        pedido4.getDetallePedido().add(new Pizza("Muzzarella", "Horno", "Muzzarella", 2));
        
        Pedido pedido5 = new Pedido("Hatsune Miku");
        pedido5.getDetallePedido().add(new Pizza("Francesa", "Piedra", "Pollo y Champignones", 12));
        pedido5.getDetallePedido().add(new Pizza("De la casa", "Parrilla", "Especial", 12));
        
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}
