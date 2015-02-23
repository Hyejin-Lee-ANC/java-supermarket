/**
 * ProductC
 * A staff favorite.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class ProductC extends AbstractProduct {
  /**
   * Used to match the input for checkout.
   */
  public static String INPUT_MATCH = "C";

  /**
   * Creates a new ProductC with the default cost of 30
   */
  public ProductC() {
    this.setPrice(30);
  }

  /**
   * Creates a new Product with a new cost
   *
   * @param price Sets new cost of this product to int
   */
  public ProductC(int price) {
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
