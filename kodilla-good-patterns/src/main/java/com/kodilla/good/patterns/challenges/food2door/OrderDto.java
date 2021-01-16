package com.kodilla.good.patterns.challenges.food2door;



public class OrderDto {
    private String vendorName;
    private boolean isOrdered;
    private int quantity;
    private Product product;

    public OrderDto(String vendorName, boolean isOrdered, int quantity, Product product) {
        this.vendorName = vendorName;
        this.isOrdered = isOrdered;
        this.quantity = quantity;
        this.product = product;
    }

    public String getVendorName() {
        return vendorName;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}