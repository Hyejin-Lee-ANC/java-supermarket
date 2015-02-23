package com.myCo.supermarket;

import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class Supermarket implements SupermarketInterface { 
  // map our product classes to their inputs:
  private static final Map<String, AbstractProduct> PRODUCT_MAP;
  static {
    PRODUCT_MAP = new HashMap<String, AbstractProduct>();
    PRODUCT_MAP.put(ProductA.INPUT_MATCH, new ProductA());
    PRODUCT_MAP.put(ProductB.INPUT_MATCH, new ProductB());
    PRODUCT_MAP.put(ProductC.INPUT_MATCH, new ProductC());
  }

  public int checkout(String items) {
    int total = 0;
    for (Map.Entry<String, AbstractProduct> entry : PRODUCT_MAP.entrySet()) {
      // int count = StringUtils.countMatches((CharSequence) items, entry.getKey().charAt(0));
      int count = StringUtils.countMatches(items, entry.getKey());
      total += entry.getValue().getTotalPrice(count);
    }
    return total;
  }
}
