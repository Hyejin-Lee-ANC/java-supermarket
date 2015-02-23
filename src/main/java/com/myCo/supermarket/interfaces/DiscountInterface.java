/**
 * Defines helper methods and contracts for discounts to applied to products.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public interface DiscountInterface {
  /**
   * Calculate the total cost of a quantity of this product.
   * Discounts should be applied in this method.
   *
   * @param numberOfProducts The number of products purchased.
   * @param pricePerProduct The current price per product.
   * @return int The total price for the numberOfProducts purchased.
   */
  public int apply(int numberOfProducts, int pricePerProduct);
}
