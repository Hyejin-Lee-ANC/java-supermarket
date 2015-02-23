package com.myCo.supermarket;

public abstract class AbstractProduct {
  private int price; 
  
  public int getPrice() {
    return this.price;
  }

  public void setPrice(int newPrice) {
    this.price = newPrice;
  }
  
  abstract int getTotalPrice(int numberOfProducts);
}
