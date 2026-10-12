package com.order.model;

public class Order {
    private String product;
    private int qty;
    
    public Order(){}
    
    public String getProduct(){return product;}
    public void setProduct(String p){this.product=p;}
    public int getQty(){return qty;}
    public void setQty(int q){this.qty=q;}
    
    public String toString(){return product+" x "+qty;}
}