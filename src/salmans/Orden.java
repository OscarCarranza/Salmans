
package salmans;

import java.util.ArrayList;

public class Orden {
    
    protected String client;
    protected boolean isVisited;
    protected int num_orden;
    protected ArrayList <Product> productos;
    protected ArrayList <Integer> cantidades;
    protected double total;
    protected int cooks;

    public Orden(String client, int num_orden, ArrayList<Product> productos, ArrayList<Integer> cantidades, double total, int cooks) {
        this.client = client;
        this.num_orden = num_orden;
        this.productos = productos;
        this.cantidades = cantidades;
        this.total = total;
        this.cooks = cooks;
        this.isVisited = false;
    }

    public Orden(){
        
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }
    
    public Orden(String centro){
        client = centro;
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
    
    public String toString(){
        return client;
    }
    
}
