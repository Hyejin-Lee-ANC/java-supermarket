/**
 * ProductA
 * A decent product, always available at a great price.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class ProductA extends AbstractProduct { 
  /**
   * Used to match the input for checkout.
   */
  public static String INPUT_MATCH = "A";

  /**
   * Creates a new ProductA with the default cost of 20
   */
  public ProductA() {
    this.setPrice(20);
  }

  /**
   * Creates a new Product with a new cost
   *
   * @param price Sets new cost of this product to int
   */
  public ProductA(int price) {
    this.setPrice(price);
  }

  /**
   * Gets the total purchase cost for a quantity of products.
   *
   * @param numberOfProducts The number of products purchased.
   * @return int The total cost with discounts.
   */
  public int getTotalPrice(int numberOfProducts) {
    return this.getPrice() * numberOfProducts;
  }
}
