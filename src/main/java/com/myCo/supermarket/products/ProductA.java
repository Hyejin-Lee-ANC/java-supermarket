package com.myCo.supermarket;

public class ProductA extends AbstractProduct { 
  public static String INPUT_MATCH = "A";

  public ProductA() {
    this.setPrice(20);
  }

  public ProductA(int price) {
    this.setPrice(price);
  }

  public int getTotalPrice(int numberOfProducts) {
    return this.getPrice() * numberOfProducts;
  }
}
