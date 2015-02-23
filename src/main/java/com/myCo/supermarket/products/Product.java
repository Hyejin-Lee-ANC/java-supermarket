/**
 * Defines methods for products carried in the Supermarket.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class Product {
  /**
   * The price of 1 unit of this product.
   */
  private int price; 

  /**
   * A set of discounts to apply at checkout
   */
  private List<DiscountInterface> discounts = new ArrayList<DiscountInterface>();

  /**
   * Creates a new Product with a new cost 'price'
   *
   * @param price Sets new cost of this product to int
   */
  public Product(int price) {
    this.setPrice(price);
  }

  /**
   * Creates a new Product with a new cost 'price' and discounts
   *
   * @param price Sets new cost of this product to int
   */
  public Product(int price, List<DiscountInterface> discounts) {
    this.setPrice(price);
    this.discounts = discounts;
  }

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
   * Add a discount.
   *
   * @param discount A discount implementing the DiscountInterface to be applied at checkout.
   */
  public void addDiscount(DiscountInterface discount) {
    this.discounts.add(discount);
  }

  /**
    * Gets the total purchase cost for a quantity of products.
    *
    * @param numberOfProducts The number of products purchased.
    * @return int The total cost with discounts.
    */
  public int getTotalPrice(int numberOfProducts) {
    int total = numberOfProducts * this.getPrice();

    // apply discounts:
    for (DiscountInterface discount : this.discounts) {
      total -= discount.apply(numberOfProducts, this.getPrice());
    }
    
    return total;
  }
}
