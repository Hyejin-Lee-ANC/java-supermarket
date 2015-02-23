package com.myCo.supermarket;

import static org.junit.Assert.*;
import org.junit.*;

public class ProductCTest {
  @Test public void testDefaultPrice() {
    ProductC p = new ProductC();
    assertEquals(p.getPrice(), 30);
  }

  @Test public void testChangingDefaultPrice() {
    ProductC p = new ProductC(100);
    assertEquals(p.getPrice(), 100);
  }

  @Test public void testGetTotalPrice() {
    ProductC p = new ProductC();
    assertEquals(30*4, p.getTotalPrice(4));
  }
}
