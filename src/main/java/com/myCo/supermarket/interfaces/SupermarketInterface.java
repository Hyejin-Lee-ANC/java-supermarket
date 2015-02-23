/**
 * Defines the contracts needed for a Supermarket.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

public interface SupermarketInterface { 
  /**
   * Contract for checking out with a number of products at once.
   *
   * @param items String of character codes for items purchased, for example "AABBCAB"
   * @return int The total cost of the string.
   */
  public int checkout(String items); 
}
