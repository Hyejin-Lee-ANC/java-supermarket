/**
 * BulkDiscount
 * Discount a product based on the number purchased.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public class BulkDiscount implements DiscountInterface { 
  /**
   * The number of products at which this discount applies
   */
  private int limit;

  /**
   * The number of products which are discounted for hitting the limit
   */
  private int discount;

  /**
   * Creates a new bulk discount
   *
   * @param limit The number of products at which this discount applies
   * @param discount The number of products which are discounted for hitting the limit
   */
  public BulkDiscount(int limit, int discount) {
    this.limit = limit;
    this.discount = discount;
  }

  /**
   * Gets the total discounted for a quantity of products @ price
   *
   * @param numberOfProducts The number of products purchased.
   * @return int The total discounted cost.
   */
  public int apply(int numberOfProducts, int price) {
    if (numberOfProducts < this.limit) {
      return 0;
    } else {
      // discount quantities based on the limit
      return (price * (int)Math.floor((numberOfProducts / this.limit * this.discount)));
    }
  }
}
