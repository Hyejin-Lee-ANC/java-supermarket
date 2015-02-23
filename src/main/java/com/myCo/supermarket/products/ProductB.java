/**
 * ProductB
 * Hasn't been selling as well, offering a discount.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

import java.util.*;

public class ProductB extends Product { 
  /**
   * Used to match the input for checkout.
   */
  public static String INPUT_MATCH = "B";

  /**
   * Creates a new ProductB with the default cost of 50
   */
  public ProductB() {
    super(50);
  }

  /**
   * Creates a new ProductB with discounts applied
   * @param discounts The list of discounts to apply
   */
  public ProductB(List<DiscountInterface> discounts) {
    super(50, discounts);
  }

  /**
   * Creates a new ProductB with just one discount applied
   * @param discounts The list of discounts to apply
   */
  public ProductB(DiscountInterface discount) {
    super(50);
    this.addDiscount(discount);
  }

  /**
   * Creates a new ProductB with a different cost
   * @param newCost The new cost to apply
   */
  public ProductB(int newCost) {
    super(newCost);
  }
}
