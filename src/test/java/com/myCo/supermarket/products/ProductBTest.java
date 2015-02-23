package com.myCo.supermarket;

import static org.junit.Assert.*;
import org.junit.*;

public class ProductBTest {
  @Test public void testDefaultPrice() {
    ProductB p = new ProductB();
    assertEquals(p.getPrice(), 50);
  }

  @Test public void testChangingDefaultPrice() {
    ProductB p = new ProductB(100);
    assertEquals(p.getPrice(), 100);
  }

  @Test public void testGetTotalPrice() {
    ProductB p = new ProductB();
    assertEquals(p.getTotalPrice(4), 50*4); // 0 free
    assertEquals(p.getTotalPrice(8), 50*3 + 50*3); // 2 free
    assertEquals(p.getTotalPrice(9), 50*3 + 50*4); // 2 free
    assertEquals(p.getTotalPrice(10), 50*6); // 4 free
    assertEquals(p.getTotalPrice(12), 50*6 + 50*2); // 4 free
  }
}
