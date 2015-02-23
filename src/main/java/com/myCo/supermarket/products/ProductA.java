/**
 * ProductA
 * A decent product, always available at a great price.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class ProductA extends Product { 
  /**
   * Used to match the input for checkout.
   */
  public static String INPUT_MATCH = "A";

  /**
   * Creates a new ProductA with the default cost of 20
   */
  public ProductA() {
    super(20);
  }

  /**
   * Creates a new ProductA with a different cost
   * @param newCost The new cost to apply
   */
  public ProductA(int newCost) {
    super(newCost);
  }

  /**
   * Creates a new ProductA with just one discount applied
   * @param discounts The list of discounts to apply
   */
  public ProductA(DiscountInterface discount) {
    super(20);
    this.addDiscount(discount);
  }
}
