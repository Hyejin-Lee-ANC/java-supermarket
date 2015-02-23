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

  @Test public void testNoDiscount() {
    ProductB p = new ProductB(new BulkDiscount(5, 2));
    assertEquals(p.getTotalPrice(4), 50*4); // 0 free
  }

  @Test public void testDiscount2() {
    ProductB p = new ProductB(new BulkDiscount(5, 2));
    assertEquals(p.getTotalPrice(8), 50*3 + 50*3); // 2 free
  }

  @Test public void testDiscount4() {
    ProductB p = new ProductB(new BulkDiscount(5, 2));
    assertEquals(p.getTotalPrice(10), 50*6); // 4 free
    assertEquals(p.getTotalPrice(12), 50*6 + 50*2); // 4 free
  }

  @Test public void testDiscount8() {
    ProductB p = new ProductB(new BulkDiscount(5, 2));
    assertEquals(p.getTotalPrice(20), 50*12); // 8 free
  }
}
