/**
 * The default supermarket containing all 3 products.
 *
 * @author Andrew Ettinger
 */

package com.myCo.supermarket;

import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class Supermarket implements SupermarketInterface { 
  /**
   * Map our product classes to their inputs
   */
  private static final Map<String, AbstractProduct> PRODUCT_MAP;
  static {
    PRODUCT_MAP = new HashMap<String, AbstractProduct>();
    PRODUCT_MAP.put(ProductA.INPUT_MATCH, new ProductA());
    PRODUCT_MAP.put(ProductB.INPUT_MATCH, new ProductB());
    PRODUCT_MAP.put(ProductC.INPUT_MATCH, new ProductC());
  }

  /**
   * Checkout with a string of items, using the product map to build the purchase. 
   *
   * @param items String of character codes for items purchased, for example "AABBCAB"
   * @return int The total cost of the string.
   */
  public int checkout(String items) {
    int total = 0;
    for (Map.Entry<String, AbstractProduct> entry : PRODUCT_MAP.entrySet()) {
      // count the number of times a product matches in the input string:
      int count = StringUtils.countMatches(items, entry.getKey());
      total += entry.getValue().getTotalPrice(count);
    }
    return total;
  }
}
