
package salmans;

import java.util.ArrayList;

public class Orden {
    
    protected String client;
    protected int num_orden;
    protected ArrayList <Product> productos;
    protected double total;
    protected int cooks;

    public Orden(String client, int num_orden, ArrayList<Product> productos, double total, int cooks) {
        this.client = client;
        this.num_orden = num_orden;
        this.productos = productos;
        this.total = total;
        this.cooks = cooks;
    }

    public int getCooks() {
        return cooks;
    }

    public void setCooks(int cooks) {
        this.cooks = cooks;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

    public ArrayList<Product> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Product> productos) {
        this.productos = productos;
    }
    
    
    
}
