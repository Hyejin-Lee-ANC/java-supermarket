/**
 * PercentageDiscount
 * Discount the total by a percentage. An example of how to extend the discount system.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class PercentageDiscount implements DiscountInterface { 
  /**
   * The total discount percentage
   */
  private int percent;

  /**
   * Creates a new percentage discount
   *
   * @param percent Amount to discount
   */
  public PercentageDiscount(int percent) {
    this.percent = percent;
  }

  /**
   * Gets the total discounted for a quantity of products @ price
   *
   * @param numberOfProducts The number of products purchased.
   * @return int The total discounted cost.
   */
  public int apply(int numberOfProducts, int price) {
    return numberOfProducts * price * percent / 100;
  }
}
