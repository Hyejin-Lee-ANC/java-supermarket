package com.myCo.supermarket;

import static org.junit.Assert.*;
import org.junit.*;

public class BulkDiscountTest {
  @Test public void test2For1() {
    BulkDiscount d = new BulkDiscount(2, 1);
    assertEquals(1, d.apply(2, 1));
  }

  @Test public void test5For3() {
    BulkDiscount d = new BulkDiscount(5, 2);
    assertEquals(2, d.apply(5, 1));
  }
}
