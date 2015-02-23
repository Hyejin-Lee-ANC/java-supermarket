/**
 * ProductB
 * Hasn't been selling as well, offering a discount.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class ProductB extends AbstractProduct { 
  /**
   * Used to match the input for checkout.
   */
  public static String INPUT_MATCH = "B";

  /**
   * Creates a new ProductB with the default cost of 50
   */
  public ProductB() {
    this.setPrice(50);
  }

  /**
   * Creates a new Product with a new cost
   *
   * @param price Sets new cost of this product to int
   */
  public ProductB(int price) {
    this.setPrice(price);
  }

  /**
    * Gets the total purchase cost for a quantity of products.
    * Currently offering ProductB at 5 for the cost of 3.
    *
    * @param numberOfProducts The number of products purchased.
    * @return int The total cost with discounts.
    */
  public int getTotalPrice(int numberOfProducts) {
    if (numberOfProducts < 5) {
      return this.getPrice() * numberOfProducts;
    } else {
      // discount quantities of 5, then add in the remainder at full price
      return (this.getPrice() * (numberOfProducts - numberOfProducts / 5 * 2)) + (this.getPrice() * numberOfProducts % 5);
    }
  }
}
