package com.kodilla.good.patterns.challenges.food2door;

public class OrderConfirmation {
    private FoodVendor foodVendor;
    private int quantity;
    private Product product;
    private boolean isOrdered;

    public OrderConfirmation(FoodVendor foodVendor, int quantity, Product product, boolean isOrdered) {
        this.foodVendor = foodVendor;
        this.quantity = quantity;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public FoodVendor getFoodVendor() {
        return foodVendor;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
