/**
 * Defines helper methods and contracts for products carried in the Supermarket.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public abstract class AbstractProduct {
  /**
   * The price of 1 unit of this product.
   */
  private int price; 
  
  /**
   * Get the price of 1 unit of this product.
   *
   * @return int the price
   */
  public int getPrice() {
    return this.price;
  }

  /**
   * Set the price of 1 unit of this product.
   *
   * @param newPrice The new price of this product
   */
  public void setPrice(int newPrice) {
    this.price = newPrice;
  }
  
  /**
   * Calculate the total cost of a quantity of this product.
   * Discounts should be applied in this method.
   *
   * @param numberOfProducts The number of products purchased.
   * @return int The total price for the numberOfProducts purchased.
   */
  abstract int getTotalPrice(int numberOfProducts);
}
