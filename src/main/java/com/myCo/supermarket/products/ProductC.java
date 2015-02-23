/**
 * ProductC
 * A staff favorite.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class ProductC extends Product {
  /**
   * Used to match the input for checkout.
   */
  public static String INPUT_MATCH = "C";

  /**
   * Creates a new ProductC with the default cost of 30
   */
  public ProductC() {
    super(30);
  }

  /**
   * Creates a new ProductC with a new cost
   * @param newCost The new cost to apply
   */
  public ProductC(int newCost) {
    super(newCost);
  }

  /**
   * Creates a new ProductA with just one discount applied
   * @param discounts The list of discounts to apply
   */
  public ProductC(DiscountInterface discount) {
    super(50);
    this.addDiscount(discount);
  }
}
