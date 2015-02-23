package com.myCo.supermarket;

import static org.junit.Assert.*;
import org.junit.*;

public class ProductATest {
  @Test public void testDefaultPrice() {
    ProductA p = new ProductA();
    assertEquals(p.getPrice(), 20);
  }

  @Test public void testChangingDefaultPrice() {
    ProductA p = new ProductA(100);
    assertEquals(p.getPrice(), 100);
  }

  @Test public void testGetTotalPrice() {
    ProductA p = new ProductA();
    assertEquals(p.getTotalPrice(10), 200);
  }
}
