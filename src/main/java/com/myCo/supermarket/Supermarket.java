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
  private static final Map<String, Product> PRODUCT_MAP;
  static {
    PRODUCT_MAP = new HashMap<String, Product>();
    PRODUCT_MAP.put(ProductA.INPUT_MATCH, new ProductA());

    // apply discounts for ProductB:
    List discountList = new ArrayList<DiscountInterface>();
    discountList.add(new BulkDiscount(5, 2));
    Product productB = new ProductB(discountList);
    PRODUCT_MAP.put(ProductB.INPUT_MATCH, productB);

    PRODUCT_MAP.put(ProductC.INPUT_MATCH, new ProductC());
  }

  /**
   * Checkout with a string of items, using the product map to build the purchase. 
   * Anything that does not match is ignored without warning.
   *
   * @param items String of character codes for items purchased, for example "AABBCAB"
   * @return int The total cost of the string.
   */
  public int checkout(String items) {
    int total = 0;
    
    // ensure we have uppercase to match our map:
    String uppercaseItems = items.toUpperCase();

    for (Map.Entry<String, Product> entry : PRODUCT_MAP.entrySet()) {
      // count the number of times a product matches in the input string:
      int count = StringUtils.countMatches(uppercaseItems, entry.getKey());

      Product product = entry.getValue();
      total += product.getTotalPrice(count);
    }
    return total;
  }
}
