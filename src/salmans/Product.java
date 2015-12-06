/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Product {
    
    protected String name;
    protected ArrayList <Ingrediente> ingredients;
    protected double price;
    protected int time;

    public Product(String name, ArrayList<Ingrediente> ingredients, double price, int time) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ingrediente> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingrediente> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
