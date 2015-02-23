package com.myCo.supermarket;

public class ProductC extends AbstractProduct { 
  public static String INPUT_MATCH = "C";

  public ProductC() {
    this.setPrice(30);
  }

  public ProductC(int price) {
    this.setPrice(price);
  }

  public int getTotalPrice(int numberOfProducts) {
    return this.getPrice() * numberOfProducts;
  }
}
