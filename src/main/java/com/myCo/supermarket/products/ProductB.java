package com.myCo.supermarket;

public class ProductB extends AbstractProduct { 
  public static String INPUT_MATCH = "B";

  public ProductB() {
    this.setPrice(50);
  }

  public ProductB(int price) {
    this.setPrice(price);
  }

  public int getTotalPrice(int numberOfProducts) {
    if (numberOfProducts < 5) {
      return this.getPrice() * numberOfProducts;
    } else {
      return (this.getPrice() * (numberOfProducts - numberOfProducts / 5 * 2)) + (this.getPrice() * numberOfProducts % 5);
    }
  }
}
