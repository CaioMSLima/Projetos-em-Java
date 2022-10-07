package Loja.entidades;


import Loja.entidades.EstatusPedido;
import Loja.entidades.PedidosItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy + HH:mm:ss");

    private Date momento;
    private EstatusPedido estatus;

    private Cliente cliente ;

    private List<PedidosItem>  pedidos = new ArrayList<>();

    public Pedidos() {
    }

    public Pedidos(Date momento, EstatusPedido estatus,Cliente cliente) {
        this.momento = momento;
        this.estatus = estatus;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public EstatusPedido getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusPedido estatus) {
        this.estatus = estatus;
    }

    public List<PedidosItem> getPedidos() {
        return pedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void removerItem(PedidosItem pedidos){
        this.pedidos.remove(pedidos);

    }

    public void adicionarItem(PedidosItem pedidos){
        this.pedidos.add(pedidos);
    }

    public Double total(){
        Double total = 0.0;
        for (PedidosItem p : pedidos){
            total += p.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n Resumo do pedido: \n");
        sb.append(("Momento do pedido "+ sdf.format(momento) + "\n"));
        sb.append("Estatus do pedido " + estatus + "\n");
        sb.append("Cliente: "+ cliente.getNome()+" ("+ cliente.getDataNacimento()+")\n");
        sb.append("Prosutos pedidos:\n");
        for ( PedidosItem pedido: pedidos) {
            sb.append(pedido + "\n");
        }
        sb.append("Total price: $" + total() );
        return sb.toString();
    }
}
